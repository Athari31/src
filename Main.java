import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

// Press Shift twice to open the Search Everywhere dialog and type `show whitespaces`,
// then press Enter. You can now see whitespace characters in your code.
public class Main {
    public static void main(String[] args) {


        Student A = new Student();
        A.name = "Athari";
        Student B = new Student();
        B.name = "bayan";
        Student C = new Student();
        C.name = "sara";

        Courses k = new Courses();
        k.cName = "Arabic";
        k.doctorName = "Ahmad";
        k.code = "56789";
        k.hours = 2;

        Courses E = new Courses();
        E.cName = "English";
        E.doctorName = "Hamed";
        E.code = "67676";
        E.hours = 4;

        Courses M = new Courses();
        M.cName = "Math";
        M.doctorName = "mohameed";
        M.code = "7543";
        M.hours = 5;
        List<Courses>coursesList=new ArrayList<>();
        coursesList.add (k);
        coursesList.add (E);
        coursesList.add (M);

        Scanner read = new Scanner(System.in);
        System.out.println("Enter your name");
        Student student = new Student();
        student.name= read.nextLine();

        System.out.println("Enter 1 ( course list )"+  "2 ( choose your course)"+  "3(Exit)");
        int x = read.nextInt();
        if (x==1){
            System.out.println(coursesList.addAll ("coursesList.add (k)"+" coursesList.add (E)" + "coursesList.add (M)");
        }}


        Courses courses = new Courses();
        for (int i =0 ; i<3; i++) {
            System.out.println(coursesList);
//            List  cl = new ArrayList<>();
//           cl.add ("Arabic");
//           cl.add ("Arabic");
//            cl.add ("Arabic");
              System.out.println("choose your course");
              String Cname= read.next();

        }






    }}

class Student {
    String name;

}
class Courses extends Student{
    String cName;
    String doctorName;
    String code;
    int hours;
}