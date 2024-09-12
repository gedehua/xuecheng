package com.gedehua.content.service;

import com.gedehua.base.model.PageParams;
import com.gedehua.base.model.PageResult;
import com.gedehua.content.model.dto.AddCourseDto;
import com.gedehua.content.model.dto.CourseBaseInfoDto;
import com.gedehua.content.model.dto.QueryCourseParamsDto;
import com.gedehua.content.model.po.CourseBase;

/**
 * @description 课程管理service
 * @author Mr.M
 * @date 2022/10/8 9:44
 * @version 1.0
 */
public interface CourseBaseInfoService  {


 /**
  * @description 课程查询
  * @param params 分页参数
  * @param queryCourseParamsDto 查询条件
  * @return com.xuecheng.base.model.PageResult<com.xuecheng.content.model.po.CourseBase>
  * @author Mr.M
  * @date 2022/10/8 9:46
 */
  public PageResult<CourseBase> queryCourseBaseList(PageParams params, QueryCourseParamsDto queryCourseParamsDto);

 /**
  * @description 添加课程基本信息
  * @param companyId  教学机构id
  * @param addCourseDto  课程基本信息
  * @return com.xuecheng.content.model.dto.CourseBaseInfoDto
  * @author Mr.M
  * @date 2022/9/7 17:51
  */
 CourseBaseInfoDto createCourseBase(Long companyId, AddCourseDto addCourseDto);
}
