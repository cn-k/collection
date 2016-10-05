package com.interfaces;

/**
 * Created by cenk.akdeniz on 05.10.2016.
 */
public class Tamirci {
    public void tamirEt(TamirEdilebilinir... tamiredilebilinir){

        for (TamirEdilebilinir tm: tamiredilebilinir)
        tm.tamir_edil();
    }
}
