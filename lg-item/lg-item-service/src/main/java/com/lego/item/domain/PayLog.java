package com.lego.item.domain;

import com.baomidou.mybatisplus.annotation.TableName;
import com.baomidou.mybatisplus.annotation.IdType;
import com.baomidou.mybatisplus.extension.activerecord.Model;
import java.time.LocalDateTime;
import com.baomidou.mybatisplus.annotation.TableId;
import java.io.Serializable;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import lombok.Data;
import lombok.EqualsAndHashCode;
import lombok.experimental.Accessors;

/**
 * <p>
 * 
 * </p>
 *
 * @author sam
 * @since 2020-07-29
 */
@Data
@EqualsAndHashCode(callSuper = false)
@Accessors(chain = true)
@TableName("tb_pay_log")
@ApiModel(value="PayLog对象", description="")
public class PayLog extends Model<PayLog> {

    private static final long serialVersionUID = 1L;

    @ApiModelProperty(value = "订单号")
    @TableId(value = "order_id", type = IdType.AUTO)
    private Long orderId;

    @ApiModelProperty(value = "支付金额（分）")
    private Long totalFee;

    @ApiModelProperty(value = "用户ID")
    private Long userId;

    @ApiModelProperty(value = "微信交易号码")
    private String transactionId;

    @ApiModelProperty(value = "交易状态，1 未支付, 2已支付, 3 已退款, 4 支付错误, 5 已关闭")
    private Boolean status;

    @ApiModelProperty(value = "支付方式，1 微信支付, 2 货到付款")
    private Boolean payType;

    @ApiModelProperty(value = "银行类型")
    private String bankType;

    @ApiModelProperty(value = "创建时间")
    private LocalDateTime createTime;

    @ApiModelProperty(value = "支付时间")
    private LocalDateTime payTime;

    @ApiModelProperty(value = "关闭时间")
    private LocalDateTime closedTime;

    @ApiModelProperty(value = "退款时间")
    private LocalDateTime refundTime;


    @Override
    protected Serializable pkVal() {
        return this.orderId;
    }

}
