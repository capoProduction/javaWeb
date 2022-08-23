package com.mapper;

import model.student;
import org.apache.ibatis.annotations.Insert;
import org.apache.ibatis.annotations.Param;
import org.apache.ibatis.annotations.Select;
import org.apache.ibatis.annotations.Update;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;


public interface UserDao {
    @Select("select count(*) from student")
    int selectCount();

    @Select("select * from student limit #{i},#{n}")
    List<student> selectAll(@Param("i") int i, @Param("n") int n);

    List<student> selectBy(@Param("stu") student stu,@Param("i")int i,@Param("n")int n,@Param("f")boolean f);

    @Select("select * from student where id = #{id}")
    student selectByid(@Param("id") int id);

    @Update("update student set grade=#{stu.grade},institute=#{stu.institute},specialty=#{stu.specialty},name=#{stu.name},sex=#{stu.sex},classes=#{stu.classes},matched=#{stu.matched} where id = #{stu.id}")
    int up(@Param("stu")student stu);

    @Insert("insert into student(id, grade, institute, specialty, name, sex, classes, matched) " +
            "values(#{stu.id},#{stu.grade},#{stu.institute},#{stu.specialty},#{stu.name},#{stu.sex},#{stu.classes},#{stu.matched})")
    int in(@Param("stu")student stu);

    int de(@Param("stu")int[] stu);
}
