/*import java.util.HashSet;
import java.util.Set;

public class day11 {
    public static void main(String[] args){
        Set<String> set=new HashSet<>();
        set.add("student 1");
        set.add("student 2");
        set.add("student 3");
        set.add("student 1");
        set.add("student 2");
        System.out.println("set :");
        for(String s:set){
            System.out.println(s);
        }
    }
}*/


import java.util.HashMap;
import java.util.Map;

public class day11 {
    public static void main(String[] args){
        Map<String, Integer>Mark = new HashMap<>();
        Mark.put("ram",89);
        Mark.put("john",78);
        Mark.put("ravi",98);
        Mark.put("ramesh",100);
        System.out.println(Mark.get("ravi"));
        Mark.entrySet().forEach(entry ->{
            System.out.println(entry.getKey() + " :    " + entry.getValue());
        });
    }
}