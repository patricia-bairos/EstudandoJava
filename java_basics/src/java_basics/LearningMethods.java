package java_basics;

import java.sql.SQLOutput;

public class LearningMethods {
    public static void main(String[] args){

 //       System.out.println("x");
          System.out.println(MyUtils.printSomeJunk("TEST"));

          int var2 = MyUtils.sum2Numbers(10, 20);
          System.out.println(var2);

        /*
        É possível invocar métodos em outros objetos e outras classes
        */

          int myvar = MyUtils.add10(9);
          System.out.println(myvar);


    }
}
