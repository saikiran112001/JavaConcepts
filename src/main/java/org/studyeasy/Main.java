package org.studyeasy;

public class Main {
    public static void main(String[] args){
        Person person=new John();
        person.eat();
        person.speak();

//        Person person=new pooja();
//        person.eat();
//        person.speak();

        Person p2=new Person() {
            @Override
            public void eat() {
                System.out.println("Eat food");
            }
        };
        p2.speak();
        p2.eat();
    }
}
