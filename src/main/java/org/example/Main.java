package org.example;

import com.google.common.collect.Range;

public class Main {
    public static void main(String[] args) {

        Range<Integer> uzdaras = Range.closed(1,100);
        Range<Integer> semiUzdaras = Range.openClosed(-10,10);

        System.out.println(uzdaras.contains(15));
        System.out.println(semiUzdaras.contains(15));
        System.out.println(uzdaras.intersection(semiUzdaras));
        System.out.println(uzdaras.span(semiUzdaras));

    }
}