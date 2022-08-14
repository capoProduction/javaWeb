package service;

import model.student;
import mapper.delete;
import org.apache.ibatis.session.SqlSession;
import org.apache.ibatis.session.SqlSessionFactory;
import tools.sqlsessionFactory;

import java.util.List;

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
