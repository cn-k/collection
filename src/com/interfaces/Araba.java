package com.interfaces;

/**
 * Created by cenk.akdeniz on 05.10.2016.
 */
public class Araba extends Arac implements TamirEdilebilinir  {
    @Override
    public void tamir_edil() {
        System.out.println("Araba tamir edildi");
    }
}
