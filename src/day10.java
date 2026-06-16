import java.util.ArrayList;

public class day10 {
    static void main() {
        String[] name = {"abi", "ram", "sanjai", "anu", "kalai"};
        ArrayList<String> list = new ArrayList();
        list.add("abi");
        list.add("ram");
        list.add("sanjai");
        list.add("anu");
        list.add("kalai");
        for (String s : list) {
            System.out.println(s);
        }
        list.remove("ram");
        System.out.println();
        for (String s : list) {
            System.out.println(s);
        }
    }
}
