package com.mapper;

import org.apache.ibatis.annotations.Param;

public interface delete {

    int de(@Param("stu")int[] stu);
}
