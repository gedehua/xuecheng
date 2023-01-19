package com.gedehua.content.service.impl;

import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import com.gedehua.content.mapper.CourseCategoryMapper;
import com.gedehua.content.model.dto.CourseCategoryTreeDto;
import com.gedehua.content.model.po.CourseCategory;
import com.gedehua.content.service.CourseCategoryService;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * <p>
 * 课程分类 服务实现类
 * </p>
 *
 * @author gedehua
 */
@Slf4j
@Service
public class CourseCategoryServiceImpl implements CourseCategoryService {

    @Autowired
    CourseCategoryMapper courseCategoryMapper;
    @Override
    public List<CourseCategoryTreeDto> queryTreeNodes() {
        return courseCategoryMapper.selectTreeNodes();
    }
}
