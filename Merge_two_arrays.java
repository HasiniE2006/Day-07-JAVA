import java.util.*;
public class Merge_two_arrays {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int arr1[]=new int[n];
        int arr2[]=new int[n];
        for(int i=0;i<n;i++)
        {
            arr1[i]=sc.nextInt();
            arr2[i]=sc.nextInt();
        }
        Arrays.sort(arr1);
        Arrays.sort(arr2);
            int k=0;
            int temp[]=new int[arr1.length+arr2.length];
            for(int i=0;i<arr1.length;i++)
            {
                temp[k]=arr1[i];
                k++;
            }
            for(int i=0;i<arr2.length;i++)
            {
                temp[k]=arr2[i];
                k++;
            }
            System.out.println(Arrays.toString(temp));


        }
    }
    

