package com.lego.item.vo;

import lombok.Data;

import java.util.List;

/**
 * @Auther: chenjingui
 * @Date: 2020/7/31 16:39
 * @Description:
 */
@Data
public class PageResult<T> {
    private Long total;// 总条数
    private Long totalPage;// 总页数
    private List<T> items;// 当前页数据
}
