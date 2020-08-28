package com.lego.item.mapper;

import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import com.lego.item.domain.Stock;
import org.apache.ibatis.annotations.Mapper;

/**
 * <p>
 * 库存表，代表库存，秒杀库存等信息 Mapper 接口
 * </p>
 *
 * @author sam
 * @since 2020-07-29
 */
public interface StockMapper extends BaseMapper<Stock> {

}
