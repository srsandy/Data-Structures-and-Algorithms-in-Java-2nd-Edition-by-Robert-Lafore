import java.io.*;
import java.util.*;
public class helpMePlay
{
    public static void main(String as[]) throws Exception {
	     BufferedReader z=new BufferedReader(new InputStreamReader(System.in));
          int t=Integer.parseInt(z.readLine());
          for(int x=0;x<t;x++)
          {
          	String s=z.readLine();
               if(s.indexOf('p')>=0 && s.indexOf('m')>=0 && s.indexOf('b')>=0)
               {
               	if(s.indexOf('k')!=s.lastIndexOf('k')) 
                    {
                      	System.out.println("Yes");
     
                  	}  
                  	else 
                    	System.out.println("No");
               }
               else
               System.out.println("No");
         	}
     
   	}
}
