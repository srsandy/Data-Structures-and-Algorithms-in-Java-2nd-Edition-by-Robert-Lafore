import java.util.Scanner;

class kanpsack{
public static int max(int a,int b)
{ 
    if(a>b)
    return a;
    else return b;
}
public static void main(String ar[]) {
  int test;
  Scanner sc = new Scanner(System.in);
  System.out.println("Enter number of test cases");
  test =  sc.nextInt();
  while(test-->0)
  {
      int n,w;
        System.out.println("Enter number n and w(wait)");
      n = sc.nextInt();
      w = sc.nextInt();
      int[] arr = new int[n];
      for(int i=0;i<n;i++)
    	  arr[i]=sc.nextInt();
          
      int[][] array = new int[n+1][w+1];
      for(int i=0;i<=n;i++)
          array[i][0]=0;
      for(int i=0;i<=w;i++)
          array[0][i]=0;
      int ch=0;
      for(int i=1;i<=n;i++)
      {
        for(int j=1;j<=w;j++)
        {
          if(arr[i-1]>j)
              array[i][j]=array[i-1][j];
           else{
              array[i][j]=max((arr[i-1]+array[i][j-arr[i-1]]),array[i-1][j]);
          }

        }
      }
      if(ch==0)
      System.out.println(array[n][w]);
  }      
}
}
