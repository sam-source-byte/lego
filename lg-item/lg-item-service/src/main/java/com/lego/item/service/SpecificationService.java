package com.lego.item.service;

import com.lego.item.domain.Specification;

/**
 * @Auther: chenjingui
 * @Date: 2020/8/20 10:40
 * @Description:
 */
public interface SpecificationService {
    /**
     * 根据category id查询规格参数模板
     * @param id
     * @return
     */
    Specification queryById(Long id);

    /**
     * 添加规格参数模板
     * @param specification
     */
    void saveSpecification(Specification specification);

    /**
     * 修改规格参数模板
     * @param specification
     */
    void updateSpecification(Specification specification);

    /**
     * 删除规格参数模板
     * @param specification
     */
    void deleteSpecification(Specification specification);
}
