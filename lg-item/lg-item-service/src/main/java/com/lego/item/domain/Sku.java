package com.lego.item.domain;

import com.baomidou.mybatisplus.annotation.TableName;
import com.baomidou.mybatisplus.annotation.IdType;
import com.baomidou.mybatisplus.extension.activerecord.Model;
import com.baomidou.mybatisplus.annotation.TableId;
import java.time.LocalDateTime;
import java.io.Serializable;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import lombok.Data;
import lombok.EqualsAndHashCode;
import lombok.experimental.Accessors;

/**
 * <p>
 * sku表,该表表示具体的商品实体,如黑色的 64g的iphone 8
 * </p>
 *
 * @author sam
 * @since 2020-07-29
 */
@Data
@EqualsAndHashCode(callSuper = false)
@Accessors(chain = true)
@TableName("tb_sku")
@ApiModel(value="Sku对象", description="sku表,该表表示具体的商品实体,如黑色的 64g的iphone 8")
public class Sku extends Model<Sku> {

    private static final long serialVersionUID = 1L;

    @ApiModelProperty(value = "sku id")
    @TableId(value = "id", type = IdType.AUTO)
    private Long id;

    @ApiModelProperty(value = "spu id")
    private Long spuId;

    @ApiModelProperty(value = "商品标题")
    private String title;

    @ApiModelProperty(value = "商品的图片，多个图片以‘,’分割")
    private String images;

    @ApiModelProperty(value = "销售价格，单位为分")
    private Long price;

    @ApiModelProperty(value = "特有规格属性在spu属性模板中的对应下标组合")
    private String indexes;

    @ApiModelProperty(value = "sku的特有规格参数键值对，json格式，反序列化时请使用linkedHashMap，保证有序")
    private String ownSpec;

    @ApiModelProperty(value = "是否有效，0无效，1有效")
    private Boolean enable;

    @ApiModelProperty(value = "添加时间")
    private LocalDateTime createTime;

    @ApiModelProperty(value = "最后修改时间")
    private LocalDateTime lastUpdateTime;


    @Override
    protected Serializable pkVal() {
        return this.id;
    }

}
