/*
You are given an string.Load the string into stack and perform reverse operation using that stack.

Input Format

Input the String

Constraints

1

Output Format

Print the reverse string

Sample Input 0

abcd
Sample Output 0

dcba
 */

import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class Solution {

    int top;
    char arr[];
    public Solution(int size)
    {
        top=-1;
        arr=new char[size];
    }

    public void push(char ch)
    {
        top++;
        arr[top]= ch;
    }
    public void display()
    {
        for(int i=top;i>=0;i--)
        {
            System.out.print(arr[i]);
        }
    }
    public static void main(String[] args) {
        /* Enter your code here. Read input from STDIN. Print output to STDOUT. Your class should be named Solution. */
        Scanner readme=new Scanner(System.in);
        String s=readme.nextLine();
        Solution obj1=new Solution(s.length());
        for(int i=0;i<s.length();i++)
        {
            obj1.push(s.charAt(i));
        }
        obj1.display();
    }
}