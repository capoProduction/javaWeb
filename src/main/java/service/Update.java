package service;

import mapper.update;
import model.student;
import org.apache.ibatis.session.SqlSession;
import org.apache.ibatis.session.SqlSessionFactory;
import tools.sqlsessionFactory;

public class Update {
    public static int up(student stu) {
        SqlSessionFactory factory = sqlsessionFactory.getFactory();
        SqlSession session = factory.openSession();
        update mapper = session.getMapper(update.class);
        int res = mapper.up(stu);
        session.commit();
        return res;
    }
}
