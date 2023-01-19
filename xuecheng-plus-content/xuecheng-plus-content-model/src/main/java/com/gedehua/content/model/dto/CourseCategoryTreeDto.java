package com.gedehua.content.model.dto;

import com.gedehua.content.model.po.CourseCategory;
import lombok.Data;
import lombok.ToString;

import java.io.Serializable;
import java.util.List;

/**
 * @description 课程分类树型结点dto
 * @author Mr.M
 * @date 2022/9/7 15:16
 * @version 1.0
 */
@Data
public class CourseCategoryTreeDto extends CourseCategory implements Serializable {

  List<CourseCategory> childrenTreeNodes;

  @Override
  public String toString() {
    return "CourseCategoryTreeDto{" +
            "childrenTreeNodes=" + childrenTreeNodes + super.toString() +
            '}';
  }
}
