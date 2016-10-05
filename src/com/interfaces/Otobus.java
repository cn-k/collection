package com.interfaces;

/**
 * Created by cenk.akdeniz on 05.10.2016.
 */
public class Otobus extends Arac implements TamirEdilebilinir{

    @Override
    public void tamir_edil() {

        System.out.println("Otobüs tamir edildi");
    }
}
