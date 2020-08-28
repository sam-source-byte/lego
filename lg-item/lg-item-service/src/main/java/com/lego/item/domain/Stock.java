package com.lego.item.domain;

import com.baomidou.mybatisplus.annotation.TableName;
import com.baomidou.mybatisplus.annotation.IdType;
import com.baomidou.mybatisplus.extension.activerecord.Model;
import com.baomidou.mybatisplus.annotation.TableId;
import java.io.Serializable;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import lombok.Data;
import lombok.EqualsAndHashCode;
import lombok.experimental.Accessors;

/**
 * <p>
 * 库存表，代表库存，秒杀库存等信息
 * </p>
 *
 * @author sam
 * @since 2020-07-29
 */
@Data
@EqualsAndHashCode(callSuper = false)
@Accessors(chain = true)
@TableName("tb_stock")
@ApiModel(value="Stock对象", description="库存表，代表库存，秒杀库存等信息")
public class Stock extends Model<Stock> {

    private static final long serialVersionUID = 1L;

    @ApiModelProperty(value = "库存对应的商品sku id")
    @TableId(value = "sku_id", type = IdType.AUTO)
    private Long skuId;

    @ApiModelProperty(value = "可秒杀库存")
    private Integer seckillStock;

    @ApiModelProperty(value = "秒杀总数量")
    private Integer seckillTotal;

    @ApiModelProperty(value = "库存数量")
    private Integer stock;


    @Override
    protected Serializable pkVal() {
        return this.skuId;
    }

}
