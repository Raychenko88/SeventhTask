package com.company;

public class A {
    public int show (int one, int two){
        int numberOne = one;
        int numberTwu = two;
        if (numberOne  == 0){
            throw new MyException("Something went wrong");
        }else if (numberTwu == 0) {
            throw new MyException("Something went wrong");
        }
        return numberOne/numberTwu;
    }
}
