package com.Inheritance2;

/**
 * Created by cenk.akdeniz on 05.10.2016.
 */
public class Apple implements Eatable, Squeezable{

    @Override
    public void howToEat() {
    System.out.println("beni yıka ve ye");
    }

    @Override
    public void howToSqueeze() {
        System.out.println("makinaya koy ve sık");
    }
}
