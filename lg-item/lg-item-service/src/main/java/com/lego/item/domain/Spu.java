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
 * spu表，该表描述的是一个抽象性的商品，比如 iphone8
 * </p>
 *
 * @author sam
 * @since 2020-07-29
 */
@Data
@EqualsAndHashCode(callSuper = false)
@Accessors(chain = true)
@TableName("tb_spu")
@ApiModel(value="Spu对象", description="spu表，该表描述的是一个抽象性的商品，比如 iphone8")
public class Spu extends Model<Spu> {

    private static final long serialVersionUID = 1L;

    @ApiModelProperty(value = "spu id")
    @TableId(value = "id", type = IdType.AUTO)
    private Long id;

    @ApiModelProperty(value = "标题")
    private String title;

    @ApiModelProperty(value = "子标题")
    private String subTitle;

    @ApiModelProperty(value = "1级类目id")
    private Long cid1;

    @ApiModelProperty(value = "2级类目id")
    private Long cid2;

    @ApiModelProperty(value = "3级类目id")
    private Long cid3;

    @ApiModelProperty(value = "商品所属品牌id")
    private Long brandId;

    @ApiModelProperty(value = "是否上架，0下架，1上架")
    private Boolean saleable;

    @ApiModelProperty(value = "是否有效，0已删除，1有效")
    private Boolean valid;

    @ApiModelProperty(value = "添加时间")
    private LocalDateTime createTime;

    @ApiModelProperty(value = "最后修改时间")
    private LocalDateTime lastUpdateTime;


    @Override
    protected Serializable pkVal() {
        return this.id;
    }

}
