package org.studyeasy;

public class Main {
    public static void main(String[] args){
        Door door=new Door();
        System.out.println(door.isLocked("query"));
        if (door.isLocked(args[0])){
            System.out.println("Door is locked");
        }
        else{
            System.out.println("Door is unlocked");
        }
    }
}
