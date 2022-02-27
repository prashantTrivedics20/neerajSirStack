package StackImplementation;
import myexception.DuplicateValueException;

import java.util.HashSet;
import java.util.Scanner;
import java.util.*;
public class TestLinkedList {
    public static void main(String[] args) {
        StackByLinkedList obj=new StackByLinkedList();
        Scanner readme=new Scanner(System.in);
        Set<Integer> s=new HashSet<>();
        for (int i = 0; i < 5; i++) {
            int n=readme.nextInt();
            try {
                if(s.add(n)==false)
                {
                    throw new DuplicateValueException("duplicate value exception");
                }
                else
                {
                    obj.push(n);
                }
            }
            catch(DuplicateValueException e)
            {
                e.printStackTrace();
            }
        }
        obj.display();
        System.out.println("Top of the stack-> " +obj.peek());// it will return the top of the stack

    }
}