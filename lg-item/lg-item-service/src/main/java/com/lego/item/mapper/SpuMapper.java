package com.lego.item.mapper;

import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import com.lego.item.domain.Spu;
import org.apache.ibatis.annotations.Mapper;

/**
 * <p>
 * spu表，该表描述的是一个抽象性的商品，比如 iphone8 Mapper 接口
 * </p>
 *
 * @author sam
 * @since 2020-07-29
 */
public interface SpuMapper extends BaseMapper<Spu> {

}
