import java.util.Scanner;
public class StackWithArray {
    int arr[];
    int top;
    //->to initialize this we use constructor..
    public StackWithArray()
    {
        arr=new int[5];
        top=-1;
    }
    //->push
    public void push(int val)
    {
        if(isFullStack())
        {
            System.out.println("stack overflow error");
        }
        else
        {
            arr[top+1]=val;
            top++;
            System.out.println("successfully inserted");
        }

    }
    //->pop
    public void pop()
    {
        if(isEmptyStack())
        {
            System.out.println("Stack underflow error");
        }
        else
        {
            System.out.println(arr[top]);
            top--;
        }

    }
    //->peek
    public void peek()
    {
        if(isEmptyStack())
        {
            System.out.println("Stack is empty");
        }
        else
        {
            System.out.println(arr[top]);
        }

    }
    //->Stack delete
    public void Delete()
    {
        arr=null;
        System.out.println("stack deleted");
    }
    public boolean isFullStack()
    {
        if(top==arr.length-1)
        {
            System.out.println("stack is full");
            return true;
        }
        else
        {
            return false;
        }

    }
    public boolean isEmptyStack()
    {
        if(top==-1)
        {
            return true;
        }
        else
        {
            return false;
        }
    }
    public void display()
    {
        for (int i = top; i>=0 ; i--) {
            System.out.println(arr[i]);
        }
    }
}
class test
{
    public static void main(String[] args) {
        Scanner readme=new Scanner(System.in);
        StackWithArray obj=new StackWithArray();
        while(true) {
            int n = readme.nextInt();
            switch (n) {
                case 1:
                    obj.push(readme.nextInt());
                    break;
                case 2:
                    obj.pop();
                    break;
                case 3:
                    obj.peek();
                    break;
                case 4:
                    obj.Delete();
                    break;
                case 5:
                    obj.isFullStack();
                    break;
                case 6:
                    obj.isEmptyStack();
                    break;
                case 7:
                    obj.display();
                    break;
                    case 8:
                    System.exit(0);
                    break;
            }
        }

    }
}
