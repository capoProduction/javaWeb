package com.mapper;

import model.student;
import org.apache.ibatis.annotations.Param;
import org.apache.ibatis.annotations.Update;

public interface update {
    @Update("update student set grade=#{stu.grade},institute=#{stu.institute},specialty=#{stu.specialty},name=#{stu.name},sex=#{stu.sex},classes=#{stu.classes},matched=#{stu.matched} where id = #{stu.id}")
    int up(@Param("stu")student stu);
}
