import java.io.*;
import java.util.*;

public class HelpMePlay {

  public static void main(String as[]) throws Exception {

	 BufferedReader bf=new BufferedReader(new InputStreamReader(System.in));

      int testCases = Integer.parseInt(bf.readLine());

        for(int x=0; x<testCases; x++) {

        	String s = bf.readLine();

          if(s.indexOf('p')>=0 && s.indexOf('m')>=0 && s.indexOf('b')>=0) {
           	if(s.indexOf('k')!=s.lastIndexOf('k')) {
            	System.out.println("Yes");
            } else {
            	System.out.println("No");
            }
          } else {
            System.out.println("No");           
          }
 
        }
   	}
}
