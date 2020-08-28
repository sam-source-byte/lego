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
 * 
 * </p>
 *
 * @author sam
 * @since 2020-07-29
 */
@Data
@EqualsAndHashCode(callSuper = false)
@Accessors(chain = true)
@TableName("tb_spu_detail")
@ApiModel(value="SpuDetail对象", description="")
public class SpuDetail extends Model<SpuDetail> {

    private static final long serialVersionUID = 1L;

    @TableId(value = "spu_id", type = IdType.AUTO)
    private Long spuId;

    @ApiModelProperty(value = "商品描述信息")
    private String description;

    @ApiModelProperty(value = "通用规格参数数据")
    private String genericSpec;

    @ApiModelProperty(value = "特有规格参数及可选值信息，json格式")
    private String specialSpec;

    @ApiModelProperty(value = "包装清单")
    private String packingList;

    @ApiModelProperty(value = "售后服务")
    private String afterService;


    @Override
    protected Serializable pkVal() {
        return this.spuId;
    }

}
