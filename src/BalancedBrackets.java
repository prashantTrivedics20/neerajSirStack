import java.util.Scanner;
import java.util.Stack;

public class BalancedBrackets {
    public static void main(String[] args) {
        Scanner readme=new Scanner(System.in);
        String s=readme.nextLine();
        Stack<Character>st=new Stack<>();
        for (int i = 0; i < s.length(); i++) {
            char ch=s.charAt(i);
            if(ch=='['||ch=='{'||ch=='(')
            {
                st.push(ch);
            }
            else if(ch==')')
            {
                if(st.size()==0)
                {
                    System.out.println("not balanced");
                    return;
                }
                else if(st.peek()!='(')
                {
                    System.out.println("not balanced");
                    return;
                }
                else
                {
                    st.pop();
                    //return;
                }
            }
            else if(ch=='}')
            {
                if(st.size()==0)
                {
                    System.out.println("not balanced");
                    return;
                }
                else if(st.peek()!='{')
                {
                    System.out.println("not balanced");
                    return;
                }
                else
                {
                    st.pop();
                    //return;
                }
            }
            else if(ch==']')
            {
                if(st.size()==0)
                {
                    System.out.println("not balanced");
                    return;
                }
                else if(st.peek()!='[')
                {
                    System.out.println("not balanced");
                    return;
                }
                else
                {
                    st.pop();
                    //System.out.println("balanced");
                    //return;
                }
            }
        }
       // System.out.println(st.size());
        if(st.size()==0)
        {
            System.out.println("balanced");
        }
        else
        {
            System.out.println("not balanced");
        }
    }
}
