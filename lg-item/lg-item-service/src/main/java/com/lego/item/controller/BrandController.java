package com.lego.item.controller;

import com.baomidou.mybatisplus.core.metadata.IPage;
import com.lego.item.domain.Brand;
import com.lego.item.service.BrandService;
import com.lego.item.vo.PageResult;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.util.StringUtils;
import org.springframework.web.bind.annotation.*;

import java.util.List;

/**
 * @Auther: chenjingui
 * @Date: 2020/7/30 14:30
 * @Description:
 * /item/category/bid/
 */
@RestController
@RequestMapping("/brand")
public class BrandController {
    @Autowired
    private BrandService brandService;

    @GetMapping("/page")
    public ResponseEntity<PageResult<Brand>> queryBrandByPage(
            @RequestParam(value = "page", defaultValue = "1") Integer page,
            @RequestParam(value = "rows", defaultValue = "20") Integer rows,
            @RequestParam(value = "sortBy", required = false) String sortBy,
            @RequestParam(value = "desc", defaultValue = "false") Boolean desc,
            @RequestParam(value = "key", required = false) String key) {
        PageResult<Brand> pageResult = brandService.queryBrandByPageAndSort(page, rows, sortBy, desc, key);
        if (pageResult == null || pageResult.getItems().size()== 0) {
            return new ResponseEntity<>(HttpStatus.NOT_FOUND);
        }
        return ResponseEntity.ok(pageResult);
    }
    /**
     * 保存品牌
     * @param brand
     * @return
     */
    @PostMapping("/saveBrand")
    public ResponseEntity<Void> saveBrand(Brand brand, @RequestParam("cids") List<Long> cids) {
        this.brandService.saveBrand(brand, cids);
        return new ResponseEntity<>(HttpStatus.OK);
    }
    /**
     * 获取品牌详情
     * @param id
     * @return
     */
    @GetMapping ("/bid/{id}")
    public ResponseEntity<Brand> getBrandDetails(@PathVariable("id") long id) {
        Brand bandInfo = this.brandService.getBandInfo(id);
        if(!StringUtils.isEmpty(bandInfo)){
            return new ResponseEntity(bandInfo,HttpStatus.OK);
        }
        return new ResponseEntity(null);
    }
}
