package com.lego.item.mapper;

import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import com.lego.item.domain.SpecGroup;
import org.apache.ibatis.annotations.Mapper;

/**
 * <p>
 * 规格参数的分组表，每个商品分类下有多个规格参数组 Mapper 接口
 * </p>
 *
 * @author sam
 * @since 2020-07-29
 */
public interface SpecGroupMapper extends BaseMapper<SpecGroup> {

}
