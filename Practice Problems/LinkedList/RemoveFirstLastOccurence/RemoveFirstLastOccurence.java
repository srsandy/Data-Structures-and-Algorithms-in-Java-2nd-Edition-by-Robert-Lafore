import java.util.*;
import java.io.*;

public class RemoveFirstLastOccurence
{
    public static void main(String[] args)
    {
        LinkedList<String> linkedList = new LinkedList<String>();
 
        linkedList.add("Alaska");
        linkedList.add("California");
        linkedList.add("Texas");
        linkedList.add("New York");
        linkedList.add("Texas");
        linkedList.add("Alaska");
        linkedList.add("Florida");
        linkedList.add("California");
        linkedList.add("Arizona");
        linkedList.add("Texas");
        linkedList.add("Alaska");
        linkedList.add("Arizona");
        linkedList.add("California");
        linkedList.add("Florida");
        linkedList.add("Texas");
        linkedList.add("Washington");
        linkedList.add("New York");
        linkedList.add("Washington");

        Scanner input = new Scanner(System.in);
        
        System.out.println("Which element's first and last occurence do you want to remove?");

        String element = input.nextLine();

        System.out.println("Original Linked List: ");
 
        System.out.println(linkedList);      
        
        System.out.println("After removing first occurence of " + element + " : ");    

        linkedList.removeFirstOccurrence(element);
 
        System.out.println(linkedList);      
 
        System.out.println("After removing last occurence of " + element + " : ");    

        linkedList.removeLastOccurrence(element);

        System.out.println(linkedList);      
    }
}