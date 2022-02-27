package StackImplementation;
import nodes.Node;
import java.util.InputMismatchException;
import java.util.Scanner;
public class StackByLinkedList {
    Node top;
    public StackByLinkedList()
    {
        top=null;
    }
    public boolean isEmpty()
    {
        return top==null;
    }
    // overloading
    public void push(Node newNode)
    {

    }
    public void push(int data)
    {
        Node newNode=new Node(data);
        if(isEmpty())
        {
            top=newNode;
        }
        else
        {
            newNode.setNext(top);
            top=newNode;
        }
    }
    public int pop()
    {
        if(isEmpty())
        {
            System.out.println("empty");
            return 0;
        }
        else
        {
            int ans=top.getData();
            top=top.getNext();
            return ans;
        }
    }
    public int peek()
    {
        return top.getData();
    }
    public void display()
    {
        Node temp=top;
        while(temp.getNext()!=null)
        {
            System.out.print(temp.getData()+"->");
            temp=temp.getNext();
        }
        System.out.println("NULL");
    }


}
