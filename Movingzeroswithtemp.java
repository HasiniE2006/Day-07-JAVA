
import java.util.*;
public class Movingzeroswithtemp {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int arr[]=new int[n];
        for(int i=0;i<n;i++)
         arr[i]=sc.nextInt();
        int temp[]=new int[n];
        int p=0;
        for(int i=0;i<n;i++)
        {
            if(arr[i]!=0)
            {
                temp[p]=arr[i];
                p++;
            }
        }
        System.arraycopy(temp,0,arr,0,n);
        System.out.println(Arrays.toString(arr));
    
}
}
