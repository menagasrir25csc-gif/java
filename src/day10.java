/*import java.util.ArrayList;

public class day10 {
    static void main() {
        ArrayList<String> studentlist = new ArrayList();
        studentlist.add("abi");
        studentlist.add("ram");
        studentlist.add("sanjai");
        studentlist.add("anu");
        studentlist.add("kalai");
        for (String s : studentlist) {
            System.out.println(s);
        }
        studentlist.remove("ram");
        System.out.println();
        for (String s : studentlist) {
            System.out.println(s);
        }
    }
}*/


/*import java.util.LinkedList;

public class day10 {
    static void main() {
        LinkedList<String> queue = new LinkedList<String>();
        queue.add("ram");
        queue.add("anu");
        queue.add("abi");
        queue.add("kalai");
        queue.add("priya");
        while(queue.size()>1) {
            process(queue);
        }
    }
    static void process(LinkedList<String> queue){
        String removed=queue.removeFirst();
        System.out.println("Removed:"+removed);
    }
}*/

import java.util.LinkedList;

public class day10 {

    static class Student {
        String name;
        int regNo;
        int marks;

        Student(String name, int regNo, int marks) {
            this.name = name;
            this.regNo = regNo;
            this.marks = marks;
        }
    }
    static void removeStudent(LinkedList<Student> students) {
        System.out.println("Removed : " + students.removeFirst().name);
    }

    static void updateStudent(LinkedList<Student> students) {
        for (Student s : students) {
            if (s.name.equals("Deepa")) {
                s.marks = 95;
            }
        }
    }
    public static void main(String[] args) {

        LinkedList<Student> students = new LinkedList<>();
        students.add(new Student("Arun", 101, 80));
        students.add(new Student("Bala", 102, 75));
        students.add(new Student("Charan", 103, 90));
        students.add(new Student("Deepa", 104, 85));
        students.add(new Student("Esha", 105, 88));
        removeStudent(students);
        updateStudent(students);
        System.out.println("\nStudent Details");
        for (Student s : students) {
            System.out.println(s.name + " " + s.regNo + " " + s.marks);
        }
    }
}