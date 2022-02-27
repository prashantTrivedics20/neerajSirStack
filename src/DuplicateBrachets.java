import java.util.Scanner;
import java.util.*;
public class DuplicateBrachets {
    public static void main(String[] args) {
        Scanner readme=new Scanner(System.in);
        String s=readme.nextLine();
        Stack<Character>st=new Stack<>();
        for (int i = 0; i <s.length() ; i++) {
            char ch=s.charAt(i);
            if(ch==')')
            {
                if(st.peek()=='(')
                {
                    System.out.println("duplicate found");
                    return;
                }
                else
                {
                    while(st.peek()!='(')
                    {
                        st.pop();
                    }
                    st.pop();

                }

            }
            else
            {
                st.push(ch);
            }
        }
        System.out.println("not found");
    }
}
