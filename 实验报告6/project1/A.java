package project1;

import java.util.Arrays;
import java.util.Random;

public class A {
    private int date = 0;
    private String str = null;
    A(){}
    A(int date,String str){
        this.date = date;
        this.str = str;
    }

    public int getDate() {
        return date;
    }

    public String getStr() {
        return str;
    }

    public void setDate(int date) {
        this.date = date;
    }

    public void setStr(String str) {
        this.str = str;
    }

    public A add(int k, String s){
        this.date += k;
        this.str += s;
        return null;
    }
    public A clear(){
        this.date = 0;
        this.str = null;
        return null;
    }
    public String toString(int a){
        a = 2;
        String[] arr = new String[a];
        arr[0] = Integer.toString(date);
        arr[1] = str;
        return Arrays.toString(arr);
    }
}
