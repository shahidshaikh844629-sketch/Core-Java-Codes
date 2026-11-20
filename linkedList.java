import java.util.*;

public class linkedList
{

public static void main (String [] args)
{
	LinkedList<String> ob = new LinkedList<>();
     ob.add("Red");
     ob.add("Blue");
     ob.add("Yellow");
     ob.add("Orange");

     System.out.println(ob);

     
     ListIterator ir = ob.listIterator();

     while(ir.hasNext())
     {
     	System.out.println(ir.next());

     }

     System.out.println("_______________________________________");


    while(ir.hasPrevious())
    {
    System.out.println(ir.previous());

    }

     System.out.println("_______________________________________");


    int s = ob.indexOf("Blue");
    System.out.println("Position : " + s);


	LinkedList<String> ob2 = new LinkedList<>();
ob2.add("Pink");
ob2.add("Green");

ob.addAll(s + 1, ob2);

System.out.println(ob);
}	
}
 
