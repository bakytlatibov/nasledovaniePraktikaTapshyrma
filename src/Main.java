public class Main {
    public static void main(String[] args) {
        CourseID courseID=new CourseID("Meder","Bakyt");

        EnglishCourse englishCourse=new EnglishCourse(courseID.getNameTeacher(), courseID.getNameStudent());
        System.out.println(englishCourse.toString());


        System.out.println(">>>>>>>>>>>>>>>>>>>>>>");


        ItCourse itCourse=new ItCourse(courseID.getNameTeacher(), courseID.getNameStudent());
        System.out.println(itCourse.toString());
    }

}