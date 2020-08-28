package com.lego.item.vo;

import lombok.Data;

import java.util.List;

/**
 * @Auther: chenjingui
 * @Date: 2020/8/20 10:23
 * @Description:
 */
@Data
public class Param {
    private String k;//param名
    private Boolean searchable;//可否搜索
    private Boolean global;//是否通用属性参数
    private Boolean numerical;//是否是数字类型参数
    private String unit;//数字类型参数的单位，非数字类型可以为空
    private String v;//param值，后面用到

    private List<String> options;//待选项集合
}
