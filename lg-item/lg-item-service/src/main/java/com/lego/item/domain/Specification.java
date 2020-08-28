package com.lego.item.domain;

import com.baomidou.mybatisplus.annotation.IdType;
import com.baomidou.mybatisplus.annotation.TableId;
import com.baomidou.mybatisplus.annotation.TableName;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import lombok.Data;
import lombok.EqualsAndHashCode;
import lombok.experimental.Accessors;

/**
 * @Auther: chenjingui
 * @Date: 2020/8/20 10:08
 * @Description:
 */
@Data
@EqualsAndHashCode(callSuper = false)
@Accessors(chain = true)
@TableName("tb_specification")
@ApiModel(value="Specification对象", description="商品规格参数模板，json格式")
public class Specification {
    @ApiModelProperty(value = "主键")
    @TableId(value = "category_id", type = IdType.AUTO)
    private Long categoryId;
    private String specifications;

}
