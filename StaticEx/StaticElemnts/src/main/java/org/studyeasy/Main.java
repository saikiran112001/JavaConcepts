package org.studyeasy;

public class Main {
    public static void main(String[] args){

        TestStatic obj01=new TestStatic();
        System.out.println("obj1 staticVar = "+obj01.getStaticVar());
        obj01.setStaticVar(25);
        System.out.println("obj1 staticVar = "+obj01.getStaticVar());


        TestStatic obj02=new TestStatic();
        System.out.println("obj2 staticVar = "+obj02.getStaticVar());
        obj02.setStaticVar(35);
        System.out.println("obj2 staticVar = "+obj02.getStaticVar());
    }
}
