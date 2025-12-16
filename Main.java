import java.util.Scanner;
public class Main{
    public static void main(String[] args){
        Teacher tea1 = new Teacher("Dimash", "01");
        Teacher tea2 = new Teacher("Zhassulan", "02");
        Teacher tea3 = new Teacher("Vladislav", "03");
        Student st1 = new Student("Milana", "001");
        Student st2 = new Student("Stas", "002");
        Student st3 = new Student("Nikita", "003");
        Scanner sc = new Scanner(System.in);
        System.out.println("Hello, please write password.");
        int pass = sc.nextInt();
        if (pass != 228){
            System.out.println("Incorrect, try again.");
                    return;
        }
        System.out.println("What do you want today?");
        System.out.println("Check Teachers = 1");
        System.out.println("Check Students = 2");
        int search = sc.nextInt();
        if (search == 1){
            tea1.printId();
            tea1.printName();
            tea2.printId();
            tea2.printName();
            tea3.printId();
            tea3.printName();
        }
        else{if(search == 2){
            st1.printId();
            st1.printName();
            st2.printId();
            st2.printName();
            st3.printId();
            st3.printName();
        }}
    }
}