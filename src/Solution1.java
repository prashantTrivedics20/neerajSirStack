/*
Paul has to write a code to check balanced brackets in an expression using stack. Help him write the code.

The expression contains such characters: '{', '}', '[',']', '(',')'.

An input expression is valid if:

Open brackets must be closed by the same type of brackets.

Open brackets must be closed in the correct order.

Example –

i) {[]}) – Invalid

ii) {()}[] – Valid

Input Format

input will be in the form of brackets.

Constraints

your code must be memory effecient.

Output Format

Print "Balanced" if the expression is valid. Print "Not balanced" if the expression is not valid.

Sample Input 0

{(())}
Sample Output 0

Balanced
Sample Input 1

{(})
Sample Output 1

Not balanced
 */


import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class Solution1 {

    int top;
    char arr[];
    public Solution1(int size)
    {
        top=-1;
        arr=new char[size];
    }

    public void push(char ch)
    {
        top++;
        arr[top]= ch;

    }
    public void check()
    {
        int f=0;
        for(int i=top;i>=0;i--)
        {

            if(arr[i]=='{'||arr[i]=='('||arr[i]=='[')
            {
                System.out.println("Not balanced");
                break;
            }
            else if((arr[i]=='}'&&arr[i-1]=='{')||(arr[i]==')'&&arr[i-1]=='(')||(arr[i]==']'&&arr[i-1]=='[')&&arr.length%2==0)
            {
                break;
            }
        }



    }

    public static void main(String[] args) {// '{', '}', '[',']', '(',')'.
        /* Enter your code here. Read input from STDIN. Print output to STDOUT. Your class should be named Solution. */
        Scanner readme=new Scanner(System.in);
        String s=readme.nextLine();//{(())}

        Solution1 obj1=new Solution1(s.length());
        for(int i=0;i<s.length();i++)
        {
            obj1.push(s.charAt(i));
        }
        obj1.check();

    }
}