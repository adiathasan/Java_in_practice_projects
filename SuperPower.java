import java.util.*;
public class SuperPower {
     public static void main(String[] args) {
          Scanner input = new Scanner(System.in);
          while (true){
               System.out.println("What is your class roll number");
               int check = input.nextInt();
               if ((check > 10 && check < 20) ||(check <10)){
                    if (check <10){
                         good();
                    } else {
                         avg();
                    }
               }
               else {
                    bad();
                    System.out.println("bokChd");
                    loop();
               }
          }

     }

     private static void loop() {
          System.out.println("DipJol:");
          for (int i = 10; i > 0; i--) {
               System.out.println("printing " + "\n" + (i) + "th time");
               if (i == 5){
                    System.out.println("You are half way to the end");
                    break;
               }

          }
     }

     static void avg(){
          System.out.println("Not good not bad");
     }

     static void bad(){
          System.out.println("bad result");
     }

     static void good(){
          System.out.println("Great result");
     }

     static void star(){
          for (int i=0; i < 8; i++){
               for (int j = 0; j < i; j++) {
                    System.out.print("*");
               }
               System.out.println();
          }
          loop();
     }
}

