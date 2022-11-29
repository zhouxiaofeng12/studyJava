package com.junitdemo.com;
import org.junit.Test;

public class Demo {

    private static int result;

    public int  add(int n,int b) {
        result = n+b;
        return result;
    }

    public void divide(int n) {
        result = result / n;
    }

    public int clear() {
        return result;
    }

    public int getResult() {
        return result;
    }


}
