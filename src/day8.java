public class day8 {
    record CourseRecord(String name,String department){
    }
    static void main(){
        CourseRecord CourseRecord=new CourseRecord("java","computer science");
        System.out.println(CourseRecord.name());
        System.out.println(CourseRecord.department());
    }
}
