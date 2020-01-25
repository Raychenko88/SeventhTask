package com.company;

public class A {
    public static int show (int one, int two) throws MyException{
        if (one == 0 || two == 0){
            throw new MyException("Something went wrong");
        }
        return one/two;

    }
}
