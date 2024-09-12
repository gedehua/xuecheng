package com.gedehua.content;

import com.gedehua.content.mapper.CourseCategoryMapper;
import com.gedehua.content.model.dto.CourseCategoryTreeDto;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import java.util.List;

@SpringBootTest
public class ContentServiceTest {
    @Autowired
    CourseCategoryMapper courseCategoryMapper;


    @Test
    void testCourseCategoryMapper() {
        List<CourseCategoryTreeDto> courseCategoryTreeDtos = courseCategoryMapper.selectTreeNodes();
        System.out.println(courseCategoryTreeDtos);
    }

}
