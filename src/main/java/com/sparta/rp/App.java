package com.sparta.rp;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.Collections;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args ) {

       ArrayList<Spartan> spartans = new ArrayList<>(Arrays.asList(
               new Spartan("Roshni", LocalDate.now()),
               new Spartan("Sunil", LocalDate.now()),
               new Spartan("Leanne", LocalDate.now()),
               new Spartan("Jimmy", LocalDate.now()),
               new Spartan("Georgiana", LocalDate.now())
       ));
       ArrayList<String> turtles = new ArrayList<>(Arrays.asList(
               "Leonardo",
               "Donatello",
               "Michelangelo",
               "Raphael"
       ));
        Collections.sort(turtles);
        System.out.println(turtles);
        Spartan spartan = new Spartan("Roshni", LocalDate.MAX);
        Spartan.SpartanComparator spartanComparator =  spartan.new SpartanComparator();// non-static inner class
        //Spartan.SpartanComparator spartanComparator =  new Spartan.SpartanComparator();// static inner class



        Collections.sort(spartans, spartanComparator);
        System.out.println(spartans);
            MathOperation mathObject = new MathOperation() {
                @Override
                public int add(int number1, int number2) {
                    return number1 + number2;
                }
            };
        System.out.println(mathObject.getClass());

    }
}
