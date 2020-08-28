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
 * 规格参数组下的参数名
 * </p>
 *
 * @author sam
 * @since 2020-07-29
 */
@Data
@EqualsAndHashCode(callSuper = false)
@Accessors(chain = true)
@TableName("tb_spec_param")
@ApiModel(value="SpecParam对象", description="规格参数组下的参数名")
public class SpecParam extends Model<SpecParam> {

    private static final long serialVersionUID = 1L;

    @ApiModelProperty(value = "主键")
    @TableId(value = "id", type = IdType.AUTO)
    private Long id;

    @ApiModelProperty(value = "商品分类id")
    private Long cid;

    private Long groupId;

    @ApiModelProperty(value = "参数名")
    private String name;

    @ApiModelProperty(value = "是否是数字类型参数，true或false")
    private Boolean numeric;

    @ApiModelProperty(value = "数字类型参数的单位，非数字类型可以为空")
    private String unit;

    @ApiModelProperty(value = "是否是sku通用属性，true或false")
    private Boolean generic;

    @ApiModelProperty(value = "是否用于搜索过滤，true或false")
    private Boolean searching;

    @ApiModelProperty(value = "数值类型参数，如果需要搜索，则添加分段间隔值，如CPU频率间隔：0.5-1.0")
    private String segments;


    @Override
    protected Serializable pkVal() {
        return this.id;
    }

}
