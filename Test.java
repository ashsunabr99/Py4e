import java.util.*;
public class Test {
    public static void main(String args[])
    {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[][] arr1 = new int[n][n];
        int[][] arr2 = new int[n][n];
        int[][] arr = new int[n][n];
        for(int i=0;i<n;i++)
        {
            for(int j=0;j<n;j++)
            {
            arr1[i][j]=sc.nextInt();
            }
        }

        for(int i=0;i<n;i++)
        {
            for(int j=0;j<n;j++)
            {
            arr2[i][j]=sc.nextInt();
            }
        }
       

        for(int i=0;i<n;i++)
        {
            for(int j=0;j<n;j++)
            {
                for(int k=0;k<n;k++)
                {
                arr[i][j]+=arr1[i][k]*arr2[k][j];
                //System.out.print(arr1[i][j]+" ");
                }
            }
            //System.out.println();
        }

        for (int i = 0; i < n; i++) { 
            for (int j = 0; j < n; j++) 
                System.out.print(arr[i][j] + " "); 
  
            System.out.println(); 
        } 
    }
}