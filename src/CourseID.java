public class CourseID {
    private String nameTeacher;
    private String nameStudent;

    public CourseID(String nameTeacher, String nameStudent) {
        this.nameTeacher = nameTeacher;
        this.nameStudent = nameStudent;
    }
     public CourseID(){

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
