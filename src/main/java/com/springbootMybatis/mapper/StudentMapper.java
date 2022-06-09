package com.springbootMybatis.mapper;

import com.springbootMybatis.model.Student;
import com.springbootMybatis.model.StudentExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;
import org.apache.ibatis.session.RowBounds;

public interface StudentMapper {
    long countByExample(StudentExample example);

    int deleteByExample(StudentExample example);

    int insert(Student row);

    int insertSelective(Student row);

    List<Student> selectByExampleWithRowbounds(StudentExample example, RowBounds rowBounds);

    List<Student> selectByExample(StudentExample example);

    int updateByExampleSelective(@Param("row") Student row, @Param("example") StudentExample example);

    int updateByExample(@Param("row") Student row, @Param("example") StudentExample example);
}