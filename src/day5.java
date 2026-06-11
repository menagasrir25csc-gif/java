/*void main(){
    String name = "vetias";
    System.out.println(name.toUpperCase());
}*/

void main() {
    System.out.println("Enter the name:");
    Scanner sc = new Scanner(System.in);
    String name = sc.nextLine();
    System.out.println("Enter your department:");
    String department = sc.nextLine();
    System.out.println("Enter your age:");
    int age = sc.nextInt();
    sc.nextLine();
    System.out.println("name:" + name);
    System.out.println("department:" + department);
    System.out.println("age:" + age);
    sc.close();
}
