package com.gedehua.content.service;

import com.baomidou.mybatisplus.extension.service.IService;
import com.gedehua.content.model.dto.CourseCategoryTreeDto;
import com.gedehua.content.model.po.CourseCategory;

import java.util.List;

/**
 * <p>
 * 课程分类 服务类
 * </p>
 *
 * @author gedehua
 * @since 2023-01-19
 */
public interface CourseCategoryService  {
    public List<CourseCategoryTreeDto> queryTreeNodes();
}
