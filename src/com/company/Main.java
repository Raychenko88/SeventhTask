package com.company;

public class Main {

    public static void main(String[] args)  {
       try {
           A.show(3,0);
       }catch (MyException a){
           System.out.println("тут идет деление на 0");
       }
    }
}
