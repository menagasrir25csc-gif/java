/*public class day8 {
    record CourseRecord(int course,int dept){
    }
    static void main(){
        CourseRecord CourseRecord=new CourseRecord(112,24);
        System.out.println(CourseRecord.course());
        System.out.println(CourseRecord.dept());
    }
}*/

public class day8 {
    enum LANGUAGE{
        EN("English"),
        GR("German"),
        JP("Japanese"),
        TA("Tamil");
        String description;

        LANGUAGE(String description){
            this.description = description;
        }
    }

    static void main() {
        System.out.println(LANGUAGE.JP.description);
    }
}

