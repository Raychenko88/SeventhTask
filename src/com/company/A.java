package com.company;

public class A {
    public int show (int one, int two){
        if (one == 0 || two == 0){
            throw new MyException("Something went wrong");
        }
        return one/two;

    }
}
