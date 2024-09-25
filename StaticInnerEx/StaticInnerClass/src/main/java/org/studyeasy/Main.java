package org.studyeasy;

public class Main {
    public static void main(String[] args){

        Outer outer = new Outer();
        Outer.Inner.staticMessage();
        System.out.println(Outer.Inner.x);
    }
}
