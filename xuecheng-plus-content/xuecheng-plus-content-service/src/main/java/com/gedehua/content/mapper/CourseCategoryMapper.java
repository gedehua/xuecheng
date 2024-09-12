package com.gedehua.content.mapper;

import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import com.gedehua.content.model.dto.CourseCategoryTreeDto;
import com.gedehua.content.model.po.CourseCategory;
import org.apache.ibatis.annotations.Mapper;

import java.util.List;

/**
 * <p>
 * 课程分类 Mapper 接口
 * </p>
 *
 * @author gedehua
 */
@Mapper
public interface CourseCategoryMapper extends BaseMapper<CourseCategory> {
    List<CourseCategoryTreeDto> selectTreeNodes();
}
