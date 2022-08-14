package model;

/**
 * 学生信息模型
 */
public class student {
    private  Integer id;
    private  Integer grade;
    private  String institute;
    private  String  specialty;
    private  String  name;
    private  Integer sex;//1 男 0 女
    private  Integer classes;
    private  Integer matched;//1 已组队 0 未组队

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    @Override
    public String toString() {
        return "student{" +
                "id=" + id +
                ", grade=" + grade +
                ", institute='" + institute + '\'' +
                ", specialty='" + specialty + '\'' +
                ", name='" + name + '\'' +
                ", sex=" + sex +
                ", classes=" + classes +
                ", matched=" + matched +
                '}';
    }

    public Integer getGrade() {
        return grade;
    }

    public void setGrade(Integer grade) {
        this.grade = grade;
    }

    public Integer getMatched() {
        return matched;
    }

    public void setMatched(Integer matched) {
        this.matched = matched;
    }

    public Integer getClasses() {
        return classes;
    }

    public void setClasses(Integer classes) {
        this.classes = classes;
    }

    public Integer getSex() {
        return sex;
    }

    public void setSex(Integer sex) {
        this.sex = sex;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getSpecialty() {
        return specialty;
    }

    public void setSpecialty(String specialty) {
        this.specialty = specialty;
    }

    public String getInstitute() {
        return institute;
    }

    public void setInstitute(String institute) {
        this.institute = institute;
    }
}
