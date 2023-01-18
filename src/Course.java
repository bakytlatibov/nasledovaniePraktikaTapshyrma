public class Course {
    public int Id;
    private String nameTeacher;
    private String nameStudent;

    public Course(String nameTeacher, String nameStudent) {
        this.nameTeacher = nameTeacher;
        this.nameStudent = nameStudent;
    }
     public Course(){

     }

    public int getId() {
        return Id;
    }

    public void setId(int id) {
        Id = id;
    }

    public String getNameTeacher() {
        return nameTeacher;
    }

    public void setNameTeacher(String nameTeacher) {
        this.nameTeacher = nameTeacher;
    }

    public String getNameStudent() {
        return nameStudent;
    }

    public void setNameStudent(String nameStudent) {
        this.nameStudent = nameStudent;
    }

    public String toString(){
        return "Teacher name: "+getNameTeacher()+","+" Student name:  "+getNameStudent();
    }
}
