package org.studyeasy;

public class Main {
    public static void main (String[] args){

        if(new Lock().getCode()== "123456"){
            System.out.println("the door is open now");
        }
        else{
            System.out.println("the door is close");
        }
    }
}

