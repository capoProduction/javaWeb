package mapper;

import model.student;
import org.apache.ibatis.annotations.Insert;
import org.apache.ibatis.annotations.Param;

public interface insert {
    @Insert("insert into student(id, grade, institute, specialty, name, sex, classes, matched) " +
            "values(#{stu.id},#{stu.grade},#{stu.institute},#{stu.specialty},#{stu.name},#{stu.sex},#{stu.classes},#{stu.matched})")
    int in(@Param("stu")student stu);
}
