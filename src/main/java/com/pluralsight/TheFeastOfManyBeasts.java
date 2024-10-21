package com.pluralsight;

public class TheFeastOfManyBeasts {

   /* The Feast of Many Beasts

   - Beasts are coming for dinner,
    and they are each bringing a dish - But there is a rule about what dish each beast can bring

        - See if you can solve it */


    /* All of the animals are having a feast!
    Each animal is bringing one dish. There is just one rule:
    the dish must start and end with the same letters as the animal's name.
    For example, the great blue heron is bringing garlic naan and the chickadee is bringing chocolate cake.
    Write a function feast that takes the animal's name and dish as arguments and returns true or false to
    indicate whether the beast is allowed to bring the dish to the feast.

    Assume that beast and dish are always lowercase strings, and that each has at least two letters.
    beast and dish may contain hyphens and spaces, but these will not appear at the beginning or end of the string. They will not contain numerals.*/

    // the link

   /* Complete this Kata for additional Java practice
    - https://www.codewars.com/kata/5aa736a455f906981800360d/java
    */

    public static boolean feast(String beast, String dish) {

        boolean x = false;

        char beastNameFirstLetter = beast.charAt(0);
        char beastNameLastLetter = beast.charAt(beast.length()-1);

        char dishNameFirstLetter = dish.charAt(0);
        char dishNameLastLetter = dish.charAt(dish.length()-1);


        if (beastNameFirstLetter == dishNameFirstLetter && beastNameLastLetter == dishNameLastLetter){
            x=true;
        }

        return x;
    }

    public static void main(String[] args) {
        System.out.println(feast("great blue heron", "garlic nann"));
    }


}
