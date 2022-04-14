package com.company;

public class Main {

    public static void main(String[] args) {
    func (3, 4);

    }

    public static void func(int a,int b) {
        int result = 1;
        for (int i = 0; i < b; i++)
            result *= a;
            System.out.println(result);
    }
}
