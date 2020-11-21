import java.util.*;
public class Sample
{
  /*static void swap(int a,int b)
  {
    int temp = a;
    a=b;
    b=temp;
  }*/
  /*static void solve(int n,int[] arr)
  {


  }

    static int bs(int x,int[] arr,int l,int h)
    {
      if(l>h)return -1;

      int m = (l+h)/2;

      if(arr[m]==x)return m;
      
      else if(arr[m]>x)
        return bs(x,arr,l,m-1);
      
      return bs(x,arr,m+1,h);


    //  return -1;
    }

    static boolean checkbit(int n,int i)
    {
      if(((n>>i)&1)==1)
      return true;

      return false;
    }*/

   /* static boolean isPrime(int n)
    {
      if(n==1 || n==2)return true;

      if(n%2==0) return false;

      for(int i=3;i<=Math.sqrt(n);i++)
      {
        if(n%i==0)
        {
          return false;
        }
      }
      return true;
    }*/
/*insertion sort
    static int[] insert(int[] arr,int n)
    {
      for(int i=1;i<n;i++)
      {
        int key = arr[i];
        int j = i-1;
        while(j>=0 && arr[j]>key)
        {
          arr[j+1]=arr[j];
          j=j-1;
        }
        arr[j+1]=key;
      }
      return arr;
    }*/

    /*selection sort
    static int[] select(int[] arr,int n)
    {
      for(int i=0;i<n;i++)
      {
        int mn_idx = i;
        for(int j = i+1;j<n;j++)
        {
          if(arr[j]<arr[mn_idx])
          {
            mn_idx = j;
          }
        }

        int temp = arr[mn_idx];
        arr[mn_idx] = arr[i];
        arr[i] = temp;
      }
      return arr;
    }*/
  public static void main(String args[])
  {
    Scanner sc = new Scanner(System.in);
    int n = sc.nextInt();
    int[] arr = new int[n];

    for(int i=0;i<n;i++)
      arr[i]=sc.nextInt();

    arr = select(arr,n);

    System.out.println(Arrays.toString(arr));
    }
    
  }