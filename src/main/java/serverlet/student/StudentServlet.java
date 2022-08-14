package serverlet.student;

import com.alibaba.fastjson.JSON;
import model.student;
import model.pageBean;
import serverlet.BaseServlet;
import service.Delete;
import service.Insert;
import service.Select;
import service.Update;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.annotation.*;
import java.io.BufferedReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

@WebServlet("/student/*")
public class StudentServlet extends BaseServlet {
    public void selectAll(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException{
        int page = Integer.parseInt(req.getParameter("page"));
        int pagesize = Integer.parseInt(req.getParameter("pagesize"));
        pageBean bean = new pageBean();
        bean.setPages(service.Select.selectAll((page-1)*pagesize,pagesize));
        bean.setCount(service.Select.selectCount());
        String s = JSON.toJSONString(bean);
        resp.setContentType("text/json;charset=utf-8");
        resp.getWriter().write(s);
    }
    public void selectBy(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException{
        int page = Integer.parseInt(req.getParameter("page"));
        int pagesize = Integer.parseInt(req.getParameter("pagesize"));
        String s1 = req.getReader().readLine();
        student student = JSON.parseObject(s1, student.class);
        pageBean bean = new pageBean();
        bean.setPages(service.Select.selectBy(student,(page-1)*pagesize,pagesize,true));
        bean.setCount(service.Select.selectBy(student,0,0,false).size());
        String s = JSON.toJSONString(bean);
        resp.setContentType("text/json;charset=utf-8");
        resp.getWriter().write(s);
    }
    public void selectByexist(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException{
        BufferedReader reader = req.getReader();
        String s1 = reader.readLine();
        student stu = JSON.parseObject(s1, student.class);
        student studentList = Select.selectByid(stu.getId());
        if(studentList == null){
            resp.getWriter().write("no exist");
        }else{
            resp.getWriter().write("exist");
        }
    }
    public void insert(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException{
        BufferedReader reader = req.getReader();
        String read = reader.readLine();
        student student = JSON.parseObject(read, student.class);
        int in = Insert.in(student);
        if(in == 0) {
            resp.getWriter().write("wrong");
        }else{
            resp.getWriter().write("ok");
        }
    }
    public void update(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException{
        String s = req.getReader().readLine();
        student student = JSON.parseObject(s, student.class);
        int res = Update.up(student);
        if(res == 0){
            resp.getWriter().write("wrong");
        }else{
            resp.getWriter().write("ok");
        }
    }
    public void delete(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException{
        String s = req.getReader().readLine();
        int[] student = JSON.parseObject(s, int[].class);
        int res = Delete.de(student);
        if(res == 0){
            resp.getWriter().write("wrong");
        }else{
            resp.getWriter().write("ok");
        }
    }
}
