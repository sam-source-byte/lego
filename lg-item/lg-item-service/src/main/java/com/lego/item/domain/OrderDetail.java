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
 * 订单详情表
 * </p>
 *
 * @author sam
 * @since 2020-07-29
 */
@Data
@EqualsAndHashCode(callSuper = false)
@Accessors(chain = true)
@TableName("tb_order_detail")
@ApiModel(value="OrderDetail对象", description="订单详情表")
public class OrderDetail extends Model<OrderDetail> {

    private static final long serialVersionUID = 1L;

    @ApiModelProperty(value = "订单详情id ")
    @TableId(value = "id", type = IdType.AUTO)
    private Long id;

    @ApiModelProperty(value = "订单id")
    private Long orderId;

    @ApiModelProperty(value = "sku商品id")
    private Long skuId;

    @ApiModelProperty(value = "购买数量")
    private Integer num;

    @ApiModelProperty(value = "商品标题")
    private String title;

    @ApiModelProperty(value = "商品动态属性键值集")
    private String ownSpec;

    @ApiModelProperty(value = "价格,单位：分")
    private Long price;

    @ApiModelProperty(value = "商品图片")
    private String image;


    @Override
    protected Serializable pkVal() {
        return this.id;
    }

}
