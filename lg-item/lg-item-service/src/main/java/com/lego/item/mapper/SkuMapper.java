package com.lego.item.mapper;

import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import com.lego.item.domain.Sku;
import org.apache.ibatis.annotations.Mapper;

/**
 * <p>
 * sku表,该表表示具体的商品实体,如黑色的 64g的iphone 8 Mapper 接口
 * </p>
 *
 * @author sam
 * @since 2020-07-29
 */
public interface SkuMapper extends BaseMapper<Sku> {

}
