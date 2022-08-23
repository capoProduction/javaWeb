package com.service;

import model.student;

import java.util.List;

public interface UserService {

    int selectCount();
    List<student> selectAll(int i,int n);
    List<student> selectBy(student stu,int i,int n,boolean f);
    student selectByid(int id);
    int in(student stu);
    int up(student stu);
    int de(int[] stu);
}
