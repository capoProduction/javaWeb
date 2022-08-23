package com.service.imp;

import com.mapper.insert;
import model.student;
import org.apache.ibatis.session.SqlSession;
import org.apache.ibatis.session.SqlSessionFactory;
import com.tools.sqlsessionFactory;

public class Insert {
    public static int in(student stu){
        SqlSessionFactory factory = sqlsessionFactory.getFactory();
        SqlSession session = factory.openSession();
        insert in= session.getMapper(insert.class);
        int in1 = in.in(stu);
        if(in1 != 0)
            session.commit();
        session.close();
        return in1;
    }
}
