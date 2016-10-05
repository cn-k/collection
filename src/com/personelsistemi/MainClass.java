package com.personelsistemi;

/**
 * Created by cenk.akdeniz on 03.10.2016.
 */
public class MainClass {

    public static void main (String[] arg){

    Mudur mudur = new Mudur();

        Personel isci = new Isci();
        Personel ogretmen = new Ogretmen();

        mudur.iseAl(isci);
        mudur.iseAl(ogretmen);
    }
}
