public class day10_ex {
    static void main() {
        String name = "college";
        try {
            System.out.println(name.charAt(4));
            System.out.println(45/0);

        } catch (ArithmeticException e) {
            System.out.println("Arithmetic Exception");
        } catch (Exception e) {
            System.out.println("Exception");
        } finally {
            System.out.println("This will always execute");
            name = "college";
        }
        System.out.println("Still running");
        System.out.println("Name :"+name);

    }
}