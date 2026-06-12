//void main() {
    /*int[][] marks = new int[5][3];
    int[][] studentmarks = {
            {78, 90, 34},
            {89, 65, 89},
            {12, 34, 56},
            {66, 12, 89},
            {33, 77, 88}
    };
    for (int row = 0;row<studentmarks.length; row++) {

        for (int col = 0;col<studentmarks[row].length; col++) {

            System.out.print(studentmarks[row][col] + " ");
        }
        System.out.println();
    }*/


   /* int[][] attendence = new int[5][3];
    int[][] studentattendence = {
            {0, 1, 0},
            {1, 0, 0},
            {1, 1, 1},
            {1, 0, 1},
            {0, 0, 0}
    };
    for(int row=0;row< studentattendence.length;row++){
        System.out.println("student " + (row+1)+":");
        for(int col=0;col<studentattendence[row].length;col++){
            if(studentattendence[row][col] == 1) {
                System.out.println("class "+ (col+1)+ " : " + "present");
            }else{
                System.out.println("class "+ (col+1)+ " : " + "absent");
            }
        }
        System.out.println();
    }*/

    /*
    int a=10;
    int b=5;


    int sum = a + b;
    System.out.println("addition=" +sum);
    int diff = a - b;
    System.out.println("subtraction=" +diff);
    int product = a * b;
    System.out.println("multiplication=" + product);
    int div = a / b;
    System.out.println("division=" +div);*/
//}


    public int add ( int a, int b){
        return a + b;
    }
    public int sub ( int a, int b){
        return a - b;
    }
    public int mul ( int a, int b){
        return a * b;
    }
    public int div ( int a, int b){
        return a / b;
    }
    void main() {
        int a = 8;
        int b = 4;
        System.out.println("addition = "+add(a, b));
        System.out.println("difference = "+sub(a, b));
        System.out.println("product = "+mul(a, b));
        System.out.println("division = "+div(a, b));
    }


