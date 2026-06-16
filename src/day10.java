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


import java.util.LinkedList;

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
}