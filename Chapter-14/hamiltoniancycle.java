import java.util.Scanner;

public class hamiltoniancycle
{
    public static int[]graph[],path;
    public static int n,cycle_count=0;

	public static void readAndInit()
	{
	Scanner sc= new Scanner(System.in);
	graph= new int[n][n];
	for(int i=0;i<n;i++)
	{
  	  for(int j=0;j<n;j++)
	     graph[i][j]=sc.nextInt();
      System.out.println("\t");
	}

	path = new int[n];
	for(int i=0;i<n;i++)
  	  path[i]=-1;
	path[0]=0;

	}

	public static int nextvalue(int pos,int v)
	{
	if(graph[path[pos-1]][v]==0) 					//checks adjacency
    	return 0;
	for(int i=0;i<pos;i++)							
      if(path[i]==v)								//checks if prev's node is visited
        return 0;
	return 1;
	}

	public static int hamiltonian(int pos)
	{
	if(pos==n)
	{
      if(graph[path[pos-1]][0]==1)
      {
	    cycle_count++;																	//checking for last vertex adjacent to 1
        System.out.println("\nCycle"+cycle_count+":");
 	    for(int i=0;i<n;i++)
	       System.out.print((path[i]+1)+"->");
        System.out.print("1");
    	return 1;
      }
      else 
        return 0;
    }

	for(int v=1;v<n;v++)
	{
   		if(nextvalue(pos,v)==1)
   		{
    	path[pos]=v;
    	if(hamiltonian(pos+1)==1)
    	  continue;
		}
        path[pos]=-1;
	}

	if(cycle_count==0)
	  return 0;
	else
	  return 1;
	}

	public static void main(String[]args)
	{
	Scanner sc=new Scanner(System.in);
	System.out.print("\nEnter:\nNumber of vertices:");
	n=sc.nextInt();
	System.out.println("("+n+"x"+n+")"+"Adjacency matrix:\n\t");
	readAndInit();
	if(hamiltonian(1)==0)
	  System.out.println("\nPath not present");

	}
}