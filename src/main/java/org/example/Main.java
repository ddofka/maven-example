package org.example;

import com.google.common.collect.Range;
import com.google.common.primitives.Ints;

public class Main {
    public static void main(String[] args) {

        Range<Integer> uzdaras = Range.closed(1,100);
        Range<Integer> semiUzdaras = Range.openClosed(-10,10);

        System.out.println(uzdaras.contains(15));
        System.out.println(semiUzdaras.contains(15));
        System.out.println(uzdaras.intersection(semiUzdaras));
        System.out.println(uzdaras.span(semiUzdaras));

        int[] skaiciai = {1,2,3,45,15123,123,125,555,-10};

        System.out.println(Ints.min(skaiciai));
        System.out.println(Ints.max(skaiciai));
        System.out.println(Ints.contains(skaiciai,3));
        System.out.println(Ints.contains(skaiciai,5));
        System.out.println(Ints.asList(skaiciai).toArray());

    }
}