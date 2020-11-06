import java.util.*;
public class SumOfLargestThreeDigits{
    public static void main(String args[]){
    int a[]={23792,37221,10270,73391,12005};
    int sum=0;
    int arr[]=new int[5];
    for(int i=0;i<5;i++)
    {
        String s=Integer.toString(a[i]);
        String s1="";
        int b[]=new int[5];
        for(int j=0;j<s.length();j++)
        {
            b[j]=s.charAt(j)-'0';
        }
        Arrays.sort(b);
        for(int k=b.length-1;k>1;k--)
        {
            s1=s1+Integer.toString(b[k]);
        }
        arr[i]=Integer.parseInt(s1);
    }
    for(int i=0;i<5;i++)
    {
        sum=sum+arr[i];
    }
    System.out.println(sum);
}
}