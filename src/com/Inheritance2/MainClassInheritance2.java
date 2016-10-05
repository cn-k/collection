package com.Inheritance2;

/**
 * Created by cenk.akdeniz on 05.10.2016.
 */
public class MainClassInheritance2 {
    public static  void  main(String [] args){

        Apple greenApple = new GreenApple();
        Eatable chicken = new Chicken();

        Apple appl = new Apple();

        Object lion = new Lion();

        Object [] obj = new Object[]{greenApple , chicken , appl , lion};

        for(Object objs : obj){

            if(objs instanceof Eatable) {
                ((Eatable) objs).howToEat();
            }
            else if(objs instanceof Squeezable) {
                ((Squeezable) objs).howToSqueeze();
            }
            else{
                System.out.println("Eatable yada Squeezable değil" );
            }
        }
    }
}
