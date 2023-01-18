public class Main {
    public static void main(String[] args) {
        EnglishCourse englishCourse=new EnglishCourse();
        englishCourse.setId(123234);
        System.out.println(englishCourse.getId());
        englishCourse.English();

        System.out.println(">>>>>>>>>>>>>>>>>>>>>>");

        ItCourse itCourse=new ItCourse();
        itCourse.setId(23234);
        System.out.println(itCourse.getId());
        itCourse.It();

    }

}