package com.lego.item.domain;

import com.baomidou.mybatisplus.annotation.TableField;
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
 * 商品类目表，类目和商品(spu)是一对多关系，类目与品牌是多对多关系
 * </p>
 *
 * @author sam
 * @since 2020-07-29
 */
@Data
@EqualsAndHashCode(callSuper = false)
@Accessors(chain = true)
@TableName("tb_category")
@ApiModel(value="Category对象", description="商品类目表，类目和商品(spu)是一对多关系，类目与品牌是多对多关系")
public class Category extends Model<Category> {

    private static final long serialVersionUID = 1L;

    @ApiModelProperty(value = "类目id")
    @TableId(value = "id", type = IdType.AUTO)
    private Long id;

    @ApiModelProperty(value = "类目名称")
    private String name;

    @ApiModelProperty(value = "父类目id,顶级类目填0")
    private Long parentId;

    @ApiModelProperty(value = "是否为父节点，0为否，1为是")
    @TableField("is_parent")
    private Boolean parent;

    @ApiModelProperty(value = "排序指数，越小越靠前")
    private Integer sort;


    @Override
    protected Serializable pkVal() {
        return this.id;
    }

}
