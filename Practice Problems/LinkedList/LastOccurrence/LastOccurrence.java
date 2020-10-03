import java.util.*;


public class LastOccurrence
{
    public static void main(String[] args)
    {
        LinkedList<String> linkedList = new LinkedList<String>();
 
        linkedList.add("Apple");
        linkedList.add("Banana");
        linkedList.add("Strawberry");
        linkedList.add("Guava");
        linkedList.add("Strawberry");
        linkedList.add("Mango");
        linkedList.add("Banana");
        linkedList.add("Papaya");
        linkedList.add("Strawberry");
        linkedList.add("Kiwi");
        linkedList.add("Apple");
 
        System.out.println("Enter the element who's last index is to be returned");
        Scanner input = new Scanner(System.in);
        String element = input.nextLine();


        System.out.println("The linked list: " + linkedList);       
 
        System.out.println("Last index of " + element + " " + linkedList.lastIndexOf(element));    
    }
}