import java.util.*;
public class Sum_divisionofarray {
    public static void main(String args[])
    {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int a[]=new int[n];
        for(int i=0;i<n;i++)
         a[i]=sc.nextInt();
        int s=0;
        for(int i=0;i<a.length;i++)
        {
            s+=a[i];
            int r=s/(i+1);
            a[i]=r;
        }
        System.out.println(Arrays.toString(a));
    }
    
}
