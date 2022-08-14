package mapper;


import model.student;
import org.apache.ibatis.annotations.Param;
import org.apache.ibatis.annotations.Select;

import java.util.List;

public interface select {
    @Select("select count(*) from student")
    int selectCount();

    @Select("select * from student limit #{i},#{n}")
    List<student> selectAll(@Param("i") int i, @Param("n") int n);

    List<student> selectBy(@Param("stu") student stu,@Param("i")int i,@Param("n")int n,@Param("f")boolean f);

    @Select("select * from student where id = #{id}")
    student selectByid(@Param("id") int id);
}
