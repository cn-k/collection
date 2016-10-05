package com.interfaces;

/**
 * Created by cenk.akdeniz on 05.10.2016.
 */
public class MainClassInterface {
    public static void main (String [] args){

        Tamirci aliUsta = new Tamirci();
        Araba subaru = new Araba();
        Otobus mercedes = new Otobus();

        Kamyon deutche = new Kamyon();

        aliUsta.tamirEt(subaru , mercedes , deutche);

        System.out.println("\n");

        aliUsta.tamirEt(subaru);
        aliUsta.tamirEt(mercedes );
        aliUsta.tamirEt(deutche);
    }
}
