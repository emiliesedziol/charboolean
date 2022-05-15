package com.company;

import java.sql.SQLOutput;

public class Main {

    public static void main(String[] args) {


        char charValue =  'D';

        System.out.println(" char " + charValue);

        char charUnicode = '\u0045';
        System.out.println("unicode char " + charUnicode);
        /*
         char D
unicode char E


        unicode-table.com
         */

        boolean boolValueTrue = true;
        boolean boolValueFalse = false;

        System.out.println("true  " + boolValueTrue);
        System.out.println("false " + boolValueFalse);

    }
}
