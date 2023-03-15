package Collection_Map_Interface.TreeSet;

import java.util.TreeSet;

public class Main {
    public static void main(String[] args) {
        TreeSet<Student> students = new TreeSet<>(new OrderNoteComparable());

        students.add(new Student("Mustafa", 20));
        students.add(new Student("Ahmet", 100));
        students.add(new Student("Behlul", 45));
        students.add(new Student("Damla", 60));
        students.add(new Student("Umut", 20));

        for (Student stu : students){
            System.out.println(stu.getName());
        }
    }
}
