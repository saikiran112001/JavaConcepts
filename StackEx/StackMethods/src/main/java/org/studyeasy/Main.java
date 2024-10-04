package org.studyeasy;
import java.util.Stack;

public class Main {
    public static void main(String[] args){
        Stack<Integer> numbers = new Stack<>();
        numbers.push(25);
        numbers.push(50);
        numbers.push(75);
        numbers.push(100);
        numbers.push(125);

        System.out.println(numbers);

        System.out.println(numbers.search(25));

        System.out.println(numbers.pop());
        System.out.println(numbers);
    }
}
