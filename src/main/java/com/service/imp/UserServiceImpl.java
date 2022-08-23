package com.service.imp;

import com.mapper.UserDao;
import model.student;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import com.service.UserService;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

@Component
@Transactional
public class UserServiceImpl implements UserService {
    @Autowired
    private UserDao userDao;

    @Override
    public int up(student stu) {
        int res = userDao.up(stu);
        return res;
    }

    @Override
    public int selectCount() {
        int res = userDao.selectCount();
        return res;
    }

    @Override
    public List<student> selectAll(int i, int n) {
        List<student> res = userDao.selectAll(i,n);
        return res;
    }

    @Override
    public List<student> selectBy(student stu, int i, int n, boolean f) {
        List<student> res = userDao.selectBy(stu,i,n,f);
        return res;
    }

    @Override
    public student selectByid(int id) {
        student res = userDao.selectByid(id);
        return res;
    }

    @Override
    public int in(student stu) {
       int res = userDao.in(stu);
       return res;
    }

    @Override
    public int de(int[] stu) {
        int res = userDao.de(stu);
        return res;
    }
}
