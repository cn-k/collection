package com.Inheritance2;

/**
 * Created by cenk.akdeniz on 05.10.2016.
 */
public class GreenApple extends Apple{
    @Override
    public void howToEat() {
        System.out.print("isirarak ye");
    }

    @Override
    public void howToSqueeze() {
        System.out.println("sıkmadan ye");
    }
}
