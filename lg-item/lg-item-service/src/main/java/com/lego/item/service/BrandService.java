package com.lego.item.service;

import com.baomidou.mybatisplus.core.conditions.query.QueryWrapper;
import com.baomidou.mybatisplus.core.metadata.IPage;
import com.baomidou.mybatisplus.extension.plugins.pagination.Page;
import com.lego.item.domain.Brand;
import com.lego.item.mapper.BrandMapper;
import com.lego.item.vo.PageResult;
import org.apache.commons.lang3.StringUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import javax.annotation.Resource;
import java.util.List;


/**
 * @Auther: chenjingui
 * @Date: 2020/7/30 14:31
 * @Description:
 */
@Service
public class BrandService {
    @Resource
    private BrandMapper brandMapper;

    public PageResult<Brand> queryBrandByPageAndSort(
            Integer page, Integer rows, String sortBy, Boolean desc, String key) {
        // 开始分页
        IPage<Brand> currentPage = new Page<Brand>(page, rows);
        QueryWrapper<Brand> couponWrapper = new QueryWrapper<Brand>();
     if (StringUtils.isNotBlank(key)) {
            couponWrapper.lambda().like(Brand::getName,key).or().eq(Brand::getLetter,key.toUpperCase());
        }

/*    if (StringUtils.isNotBlank(sortBy)) {
        String orderByClause = sortBy + (desc ? " DESC" : " ASC");
        couponWrapper.select().orderBy(sortBy)
     }*/
        // 查询
        IPage<Brand> brandIPage = brandMapper.selectPage(currentPage, couponWrapper);
        // 返回结果
        PageResult<Brand> pageResult= new PageResult<>();
        pageResult.setTotal(brandIPage.getTotal());
        pageResult.setTotalPage(brandIPage.getPages());
        pageResult.setItems(brandIPage.getRecords());
        return pageResult;
    }

    /**
     *
     * @param brand   品牌信息
     * @param cids  商品分类id集合
     */
    @Transactional
    public void saveBrand(Brand brand, List<Long> cids) {
        // 新增品牌信息
        this.brandMapper.insert(brand);
        // 新增品牌和分类中间表
        for (Long cid : cids) {
            this.brandMapper.insertCategoryBrand(cid, brand.getId());
        }
    }
    public Brand getBandInfo(long id){
        return  brandMapper.selectById(id);
    }
}
