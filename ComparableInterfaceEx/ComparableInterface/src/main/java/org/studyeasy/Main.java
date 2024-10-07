package org.studyeasy;

import java.util.LinkedList;
import java.util.List;

class Name implements Comparable<Name>{
    private String name;

    public Name(String name) {
        this.name = name;
    }

    @Override
    public String toString() {
        return name;
    }

    @Override
    public int compareTo(Name obj) {
        if(name.length()== obj.name.length()){
            return 0;
        }else if(name.length()>obj.name.length()){
            return -1;
        }else{
            return 1;
        }
    }
}
public class Main {
    public static void main(String[] args){
        List names=new LinkedList<>();
        names.add(new Name("sai"));
        names.add(new Name("kiran"));
        names.add(new Name("reddy"));
        names.add(new Name("bandi"));
        names.add(new Name("kumar"));

        System.out.println(names);
        names.sort(null);
        System.out.println(names);

    }
}
