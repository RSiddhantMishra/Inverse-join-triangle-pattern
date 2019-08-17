//'main' method must be in a class 'Rextester'.
//Compiler version 1.8.0_111

import java.util.*;
import java.lang.*;

class TriangleInversePattern
{  
    public static void main(String args[])
    {
        Scanner s=new Scanner(System.in);
        int n=s.nextInt();
        int a=0;
        for(int i=0;i<n;i++)
        {
            a=1+i;
            for(int k=0;k<=i;k++)
            {
                System.out.print(" ");
            }
            for(int j=n;j>i;j--)
            {
                System.out.print(a+" ");
                a++;
            }
            
            System.out.println();
        }
        a--;
        for(int i=n-1;i>0;i--)
        {
            for(int k=i;k>0;k--)
            {
                System.out.print(" ");
            }
            int b=a-1;
            for(int j=0;j<=(n-i);j++)
            {
                System.out.print(b+" ");
                b++;
            }
            a--;
            System.out.println();
        }
    }
}
/*Input:(any number)eg:7
Output:
1 2 3 4 5 6 7 
  2 3 4 5 6 7 
   3 4 5 6 7 
    4 5 6 7 
     5 6 7 
      6 7 
       7 
      6 7 
     5 6 7 
    4 5 6 7 
   3 4 5 6 7 
  2 3 4 5 6 7 
 1 2 3 4 5 6 7 
*/