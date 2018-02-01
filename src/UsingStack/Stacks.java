package UsingStack;

import java.util.Stack;
import java.util.EmptyStackException;
/**
 * Created by mia on 27/01/2018.
 */
public class Stacks {

    public static void main(String[] args) {

        Stack s = new Stack();
        s.empty();
        try {
            s.peek();
        }catch(EmptyStackException ex){
            System.out.println("Empty");
        }
        Object o = s.push(1);
        s.push("String");
        s.push(22);
        Object p = s.pop();
        Object pe = s.peek();
        s.size();
        System.out.println("--------");
        for (Object i: s){
            System.out.println(i);
        }
        System.out.println("--------");
        System.out.println(s.size());
        System.out.println(p);
        System.out.println(pe);
        System.out.println(o);

    }

}
