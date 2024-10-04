package org.studyeasy;
import java.util.LinkedList;

public class Main {
    public static void main(String[] args){
        LinkedList<String> names = new LinkedList<>();
        names.add("kumar");
        names.add("sai");
        names.add("kiran");
        names.add("reddy");
        names.add("bandi");
        System.out.println(names);

        names.add("ram");
        System.out.println(names);

        names.add(0,"ram");
        System.out.println(names);

        names.set(0,"mike");
        System.out.println(names);

        names.remove(6);
        System.out.println(names);

    }
}
