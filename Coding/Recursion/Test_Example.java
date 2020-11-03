import java.time.format.DateTimeFormatter;
import java.util.*;
import java.text.SimpleDateFormat;
import java.time.*;
public class Test_Example {

    public static void main(String[] args)
    {
        //long a = fact_recursive(10);
        //fibonnaci(10);
        //int sum = fibonnaci_recr(5);
        System.out.println(reverseNumber(3214,0));
        //System.out.println(sum);
    }

    public static int reverseNumber(int n,int ans)
    {
        if(n < 10)
            return (ans * 10) + n;

        int a = n%10;
        return  reverseNumber(n/10, (ans * 10) + a);
    }


    /* public static String reverseNumber(int n,String ans)
    {
        if(n < 10)
            return ans + String.valueOf(n);

        String a = String.valueOf(n%10);
        return  reverseNumber(n/10, ans + a);
    }
*/
    public static void fibonnaci(int n)
    {
        System.out.print("0 1 ");
        int prev_prev = 0;
        int prev = 1;
        int i = 2;
        int total = 0;
        //0, 1, 1, 2, 3, 5, 8, 13, 21
        while(i <= n)
        {
            i++;
            total = prev + prev_prev;
            System.out.print(total + " ");
            prev_prev = prev;
            prev = total;
        }
    }

    public static int fibonnaci_recr(int n)
    {
         if(n <=1)
             return n;
        //System.out.println(n-1);
        //System.out.println(n-2);
         return fibonnaci_recr(n-1) + fibonnaci_recr(n-2);

    }

    public static long fact_recursive(int a)
    {
        System.out.println("a " + a);
        if(a ==1)
            return 1;
        else {
            System.out.println("before return in else " + a);
            return fact_recursive(a - 1) * a;
        }
    }

    public static long factorial(int a)
    {
       long ans =  1;
       while(a >=1)
       {
           ans = ans * a;
           a--;
       }
       return ans;
    }
}
