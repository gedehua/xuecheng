package com.gedehua.content.service.impl;

import com.gedehua.content.model.po.CourseCategory;
import com.gedehua.content.mapper.CourseCategoryMapper;
import com.gedehua.content.service.CourseCategoryService;
import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;
import org.springframework.beans.factory.annotation.Autowired;

/**
 * <p>
 * 课程分类 服务实现类
 * </p>
 *
 * @author gedehua
 */
@Slf4j
@Service
public class CourseCategoryServiceImpl extends ServiceImpl<CourseCategoryMapper, CourseCategory> implements CourseCategoryService {

}
