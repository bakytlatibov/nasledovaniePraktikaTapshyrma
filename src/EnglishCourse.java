public class EnglishCourse extends Course {
    public EnglishCourse(String nameTeacher, String nameStudent) {
        super(nameTeacher, nameStudent);
    }public EnglishCourse(){

    }
    public void English(){
        Course course=new Course("Meder","Bakyt");
        System.out.println(course);
    }




}