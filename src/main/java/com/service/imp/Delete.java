package com.service.imp;

import com.mapper.delete;
import org.apache.ibatis.session.SqlSession;
import org.apache.ibatis.session.SqlSessionFactory;
import com.tools.sqlsessionFactory;

public class Delete {
    public static int de(int[] stu){
        SqlSessionFactory factory = sqlsessionFactory.getFactory();
        SqlSession session = factory.openSession();
        delete mapper = session.getMapper(delete.class);
        int res = mapper.de(stu);
        session.commit();
        session.close();
        return res;
    }
}
