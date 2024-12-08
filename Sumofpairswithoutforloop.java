import java.util.*;
public class Sumofpairswithoutforloop {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int arr[]=new int[n];
        for(int i=0;i<n;i++)
         arr[i]=sc.nextInt();
         int k=sc.nextInt();
        int l=0;
        int r=arr.length-1;
        boolean g=false;
        while(l<=r)
        {
            int sum=arr[l]+arr[r];
            if(sum==k)
            {
                g=true;
                break;
            }else if(sum<k)
                l++;
            else
            r--;
        }
    System.out.println(g);
        }
    }
        