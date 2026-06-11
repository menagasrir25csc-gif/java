/*public class day6 {
static class Car {
    String Brand;
    String Color;
    int Speed;
    int Fuel;

    Car() {
        System.out.println("constructer called");
    }

    Car(String Brand, String Color, int Speed, int Fuel) {
        this.Brand = Brand;
        this.Color = Color;
        this.Speed = Speed;
        this.Fuel = Fuel;
    }

    void accelarate(int speed) {
        this.Speed += speed;
        //this.Speed=Speed;
    }

    void declarate(int speed) {
        this.Speed -= speed;
    }

    void refill(int fuel) {
        this.Fuel += fuel;
    }

    void showFuel() {
        System.out.println("Your Fuel is : " + Fuel);
    }

    void printDetails() {
        System.out.println("Brand" + Brand);
        System.out.println("Color" + Color);
        System.out.println("Speed" + Speed);
        System.out.println("Fuel" + Fuel);
    }
}
public static void main(String[] args) {
    Car car = new Car("Mahendra", "Black", 500, 90);
    // car.Speed(500);
    car.printDetails();
    car.accelarate(500);
    car.declarate(40);
    car.refill(20);
    car.printDetails();
}
}*/

public class day6 {
    static class Students{
        String name;
        int regNo;
        String department;
        int mathsMarks;
        int physicsMarks;
        int chemistryMarks;
        Students(String name,int regNo,String department,int mathsMarks,int physicsMarks,int chemistryMarks){
            this.name=name;
            this.regNo=regNo;
            this.department=department;
            this.mathsMarks=mathsMarks;
            this.physicsMarks=physicsMarks;
            this.chemistryMarks=chemistryMarks;
        }
        void printDetails(){
            System.out.println("name:"+name);
            System.out.println("regNo:"+regNo);
            System.out.println("department:"+department);
            System.out.println("mathsMarks:"+mathsMarks);
            System.out.println("physicsMarks:"+physicsMarks);
            System.out.println("chemistryMarks:"+chemistryMarks);
        }
    }
    public static void main(String[] args){
        Students Students=new Students("menaga",27,"computer science",76,87,88);
        Students.printDetails();
    }
}



