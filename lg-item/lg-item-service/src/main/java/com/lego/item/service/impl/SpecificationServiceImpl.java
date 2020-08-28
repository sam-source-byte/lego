package com.lego.item.service.impl;

import com.lego.item.domain.Specification;
import com.lego.item.mapper.SpecificationMapper;
import com.lego.item.service.SpecificationService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 * @Auther: chenjingui
 * @Date: 2020/8/20 10:42
 * @Description:
 */
@Service
public class SpecificationServiceImpl implements SpecificationService {
    @Autowired
    private SpecificationMapper specificationMapper;
    @Override
    public Specification queryById(Long id) {
        return specificationMapper.selectById(id);
    }

    @Override
    public void saveSpecification(Specification specification) {

    }

    @Override
    public void updateSpecification(Specification specification) {

    }

    @Override
    public void deleteSpecification(Specification specification) {

    }
}
