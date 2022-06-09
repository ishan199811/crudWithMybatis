package com.springbootMybatis.mapper;

import com.springbootMybatis.model.Teacher;
import com.springbootMybatis.model.TeacherExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;
import org.apache.ibatis.session.RowBounds;

public interface TeacherMapper {
    long countByExample(TeacherExample example);

    int deleteByExample(TeacherExample example);

    int insert(Teacher row);

    int insertSelective(Teacher row);

    List<Teacher> selectByExampleWithRowbounds(TeacherExample example, RowBounds rowBounds);

    List<Teacher> selectByExample(TeacherExample example);

    int updateByExampleSelective(@Param("row") Teacher row, @Param("example") TeacherExample example);

    int updateByExample(@Param("row") Teacher row, @Param("example") TeacherExample example);
}