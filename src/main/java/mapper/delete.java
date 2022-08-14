package mapper;

import model.student;
import org.apache.ibatis.annotations.Delete;
import org.apache.ibatis.annotations.Param;

import java.util.List;

public interface delete {

    int de(@Param("stu")int[] stu);
}
