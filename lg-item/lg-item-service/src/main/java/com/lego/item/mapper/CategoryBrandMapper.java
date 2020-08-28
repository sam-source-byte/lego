package com.lego.item.mapper;

import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import com.lego.item.domain.CategoryBrand;
import org.apache.ibatis.annotations.Mapper;

/**
 * <p>
 * 商品分类和品牌的中间表，两者是多对多关系 Mapper 接口
 * </p>
 *
 * @author sam
 * @since 2020-07-29
 */
public interface CategoryBrandMapper extends BaseMapper<CategoryBrand> {

}
