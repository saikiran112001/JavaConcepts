package org.studyeasy;
import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

public class Main {
    public static void main(String[] args){
        LinkedList<String> list1=new LinkedList<>();
        list1.add("kiran");
        list1.add("reddy");
        list1.add("bandi");

        ArrayList<String> list2=new ArrayList<>();
        list2.add("StudyEasy");
        list2.add("organization");
        list2.add("team");
        new Main().printList(list2);
    }
    void printList(List<String> list){
        for(String name:list){
            System.out.println(name);
        }
    }
}
