package serverlet.student;

import com.alibaba.fastjson.JSON;
import com.service.UserService;
import model.student;
import model.pageBean;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;
import java.util.List;

@Controller
@ResponseBody
@RequestMapping("/students")
public class StudentServlet{
    @Autowired
    private UserService service;

    @GetMapping("/selectCount")
    public int selectCount(){
        int res = service.selectCount();
        return res;
    }

    @GetMapping("/{i}/{n}")
    public pageBean<student> selectAll(@PathVariable int i,@PathVariable int n){
        pageBean<student>  res = new pageBean<student> ();
        res.setPages(service.selectAll((i-1)*n,n));
        res.setCount(service.selectCount());
        return res;
    }

    @PostMapping("/{i}/{n}/{f}")
    public pageBean<student> selectBy(@RequestBody student stu,@PathVariable int i,@PathVariable int n,@PathVariable boolean f){
        pageBean<student> res = new pageBean<student>();
        List<student> students = service.selectBy(stu,(i-1)*n,n,false);
        res.setPages(service.selectBy(stu,(i-1)*n,n,f));
        res.setCount(students.size());
        return res;
    }

    @GetMapping("/{id}")
    public String selectByid(@PathVariable  int id){
        String resp = "1";
        student res = service.selectByid(id);
        if(res != null)
            resp = "exist";
        return resp;
    }

    @PutMapping
    public String in(@RequestBody student stu){
        int res = service.in(stu);
        String resp = "1";
        if(res != 0)
            resp = "ok";
        else
            resp = "wrong";
        return resp;
    }

    @PostMapping
    public String up(@RequestBody student stu){
        int res = service.up(stu);
        String resp = "error";
        if(res != 0)
            resp = "ok";
        return resp;
    }

    @DeleteMapping
    public String delete(@RequestBody int[] stu){
        int res = service.de(stu);
        String resp = "error";
        if(res != 0)
            resp = "ok";
        else
            resp = "no";
        return resp;
    }
}
