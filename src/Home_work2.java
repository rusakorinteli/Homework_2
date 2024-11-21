import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;

public class Home_work2 {

    static void myMethod1(){
        for (int i = 0; i <= 30; i++){
            if (i % 2 != 0) {
                System.out.println(i);
            }
        }
    }


    static void myMethod2(){
        for(int i = 0; i < 100; i++) {
            int randomNum = (int) (Math.random() * 100);
            System.out.println(randomNum);
        }
    }


    static void myMethod3(){
        double[] numbers = {1.5, 2.3, 3.7, 1.2345};
        double sum = 0;
        for (int i = 0; i < numbers.length; i++){
            sum += numbers[i];
        }

        double avg = sum/numbers.length;
        System.out.println(avg);

    }


    static void myMethod4(){
        int[] numbers = {367, 7, 103, 32, 4, 92};
        int min = numbers[0];
        for (int i = 0; i < numbers.length; i++) {
            if (numbers[i] < min) {
                min = numbers[i];
            }
        }

        System.out.println("მასივში მინიმალური ელემენტი არის" + " " + min);
    }

    static void myMethod5(){
        ArrayList<Integer> Nums = new ArrayList<Integer>();
        Nums.add(367);
        Nums.add(7);
        Nums.add(103);
        Nums.add(32);
        Nums.add(4);
        Nums.add(92);

        Collections.sort(Nums);

        int min = Nums.get(0);

        System.out.println("ლისტის მინიმალური ელემენტი არის" + " " +min);


    }

    public static void main(String[] args){
       // 1. დაბეჭდეთ კენტი რიცხვები 0 დან 30 ის ჩათვლით//

        myMethod1();


       /* 2. დაბეჭდეთ რენდომ რიცხვები 0 დან 100მდე, სავალდებულო არ არის
        რომ მთელი რიცხვები იყოს */

        myMethod2();


       /* 3. შექმენით double ტიპის მასივი და დაითვალეთ მასივის საშუალო
        არითმეტიკული(საშუალო არითმეტიკული = ელემეტების ჯამი/ელემენტების რაოდენობასთან) */

        myMethod3();


        /* 4. დაწერეთ ინტეჯერების მასივი(ჩვეულებრივი array) და იპოვეთ ამ მასივში მინიმალური
        ელემენტი, არ გამოიყენოთ სორტირება; ასევე გააკეთეთ ეს დავალება ArrayList ის
        გამოყენებით გამოიყენეთ colleciot.sort; */

        myMethod4();
        myMethod5();

    }
}
