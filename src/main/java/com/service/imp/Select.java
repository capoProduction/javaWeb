package com.service.imp;

import com.mapper.select;
import model.student;
import org.apache.ibatis.session.SqlSession;
import org.apache.ibatis.session.SqlSessionFactory;
import com.tools.sqlsessionFactory;

import java.util.List;

public class Select {
    public static int selectCount(){
        SqlSessionFactory factory = sqlsessionFactory.getFactory();
        SqlSession session = factory.openSession();
        select mapper = session.getMapper(select.class);
        int res = mapper.selectCount();
        session.close();
        return res;
    }
    public static List<student> selectAll(int i, int n){
        SqlSessionFactory factory = sqlsessionFactory.getFactory();
        SqlSession session = factory.openSession();
        select mapper = session.getMapper(select.class);
        List<student> student = (List<model.student>) mapper.selectAll(i,n);
        session.close();
        return student;
    }
    public static List<student> selectBy(student stu,int i,int n,boolean f){
        SqlSessionFactory factory = sqlsessionFactory.getFactory();
        SqlSession session = factory.openSession();
        select mapper = session.getMapper(select.class);
        List<student> student = (List<model.student>) mapper.selectBy(stu,i,n,f);
        session.close();
        return student;
    }
    public static student selectByid(int id){
        SqlSessionFactory factory = sqlsessionFactory.getFactory();
        SqlSession session = factory.openSession();
        select mapper = session.getMapper(select.class);
        student student = mapper.selectByid(id);
        session.close();
        return student;
    }
}
