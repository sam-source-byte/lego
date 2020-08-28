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
 * 商品分类和品牌的中间表，两者是多对多关系
 * </p>
 *
 * @author sam
 * @since 2020-07-29
 */
@Data
@EqualsAndHashCode(callSuper = false)
@Accessors(chain = true)
@TableName("tb_category_brand")
@ApiModel(value="CategoryBrand对象", description="商品分类和品牌的中间表，两者是多对多关系")
public class CategoryBrand extends Model<CategoryBrand> {

    private static final long serialVersionUID = 1L;

    @ApiModelProperty(value = "商品类目id")
    @TableId(value = "category_id", type = IdType.AUTO)
    private Long categoryId;

    @ApiModelProperty(value = "品牌id")
    private Long brandId;


    @Override
    protected Serializable pkVal() {
        return this.categoryId;
    }

}
