public class Main {
    public static void main(String[] args) {

        // Задача 1.1
        System.out.println(" Задача 1.1 ");

        int [] fruits = new int[]{1,2,3};

        // Задача 1.2
        System.out.println(" Задача 1.2 ");

        double [] weight = {1.57,7.654,9.986};

        // Задача 1.3
        System.out.println(" Задача 1.3 ");

        int [] apples = new int [3];
        apples [0] = 5;
        int redApples = apples [0];
        System.out.println(redApples);
        apples [1] = 7;
        int greenApples = apples [1];
        System.out.println(greenApples);
        apples [2] = 2;
        int yellowApples = apples [2];
        System.out.println(yellowApples);

        // Задача 2
        System.out.println(" Задача 2 ");

        for (int i = 0; i<fruits.length; i++){
            if (i==fruits.length-1){
                System.out.println(fruits[i]);
                break;
            }
            System.out.print(fruits[i] + ", ");
        }
        System.out.println();

        for (int a = 0; a<weight.length; a++) {
            if (a==weight.length-1){
                System.out.println(weight[a]);
                break;
            }
            System.out.print(weight[a] + ", ");
        }
        System.out.println();

        for (int i = 0; i < apples.length; i++) {
            if (i==apples.length-1) {
                System.out.println(apples[i]);
                break;
            }
            System.out.print(apples[i]+", ");
        }
        System.out.println();

        // Задача 3
        System.out.println(" Задача 3 ");

        for (int i = 2; i>=0; i--){
            if (i==0) {
                System.out.println(fruits[i]);
                break;
            }
            System.out.print(fruits[i]+", ");
        }

        System.out.println();
        for (int a = 2; a>=0; a--) {
            if (a==0) {
                System.out.println(weight[a]);
                break;
            }
            System.out.print(weight[a]+", ");
        }
        System.out.println();

        for (int i = 2; i >=0; i--) {
            if (i==0) {
                System.out.println(apples[i]);
                break;
            }
            System.out.print(apples[i]+", ");
        }
        System.out.println();

        // Задача 4
        System.out.println(" Задача 4 ");

        int i = 0;
        for (; i<fruits.length; i++){
            if (fruits[i] % 2 !=0) {
                fruits[i]= fruits[i] + 1;
            }
            if (i==fruits.length-1){
                System.out.println(fruits[i]);
                break;
            }
            System.out.print(fruits[i] + ", ");
        }
        System.out.println();




    }
}