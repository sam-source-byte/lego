package com.lego.item.service;

import com.lego.item.domain.Category;
import com.lego.item.mapper.CategoryMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.util.StringUtils;

import javax.annotation.Resource;
import java.util.List;

/**
 * @Auther: chenjingui
 * @Date: 2020/7/29 11:29
 * @Description:
 */
@Service
public class CategoryService {
    @Resource
    private CategoryMapper categoryMapper;
    /**
     * 根据parentId查询子类目
     * @param pid
     * @return
     */
    public List<Category> queryCategoryListByParentId(long pid) {
        if (!StringUtils.isEmpty(pid)) {
            return  categoryMapper.queryByParentId(pid);
        }
        return null;
    }

}
