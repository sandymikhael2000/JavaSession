package day8;

import java.sql.Array;
import java.util.*;

public class Collections {

    public static void main(String[] args) {
        setDemo();
        ListDemo();
        queueDemo();
        mapDemo();
    }
    public  static void setDemo(){
        // error because it's interface
        //Set fruit =new Set();
        /**
         * Set
         *  implementing class (HashSet-LinkedHashSet-TreeSet)
         */
        Set<String> fruit= new HashSet();
        fruit.add("Apple");
        fruit.add("Banana");
        fruit.add("Pear");
        fruit.add("Orange");
        fruit.add("Apple"); //ignore duplication
        fruit.remove("Pear");
        System.out.println(fruit.size());
       // System.out.println(fruit); // Tostring
        System.out.println("-------------------------");

        // First way to loop
        //Iterator:
       var i= fruit.iterator();
       //hasNext return ---> boolen
        // .next --> get each elemant
       while (i.hasNext())
       {
    System.out.println(i.next());
       }

        System.out.println("*************************");

       //Second way  enhancement for loop
        for (String f:fruit)
        {
            System.out.println(f);
        }
        System.out.println("*************************");
      // Third wayy to loop foreach by using landa expression
        fruit.forEach(x-> System.out.println(x));
        //or by using scope operator
        fruit.forEach(System.out::println);
    }
    public  static void ListDemo()
    {
        /**
         * List
         *  implementing class (ArrayList-LinkedLit-Stack-Vector)
         */

        List fruit=new ArrayList();
        fruit.add("Mandarin");
        fruit.add("Grapes");
        fruit.add("Cucumber");
        fruit.add("Grapes");
        fruit.add("Mandarin");

       //Another way to add element But it gives error of any remove or add (not changeable)+ plus un modifiable
        Set c =Set.of("Sandy","Mikhael");
        System.out.println(c);

        System.out.println(fruit.size());
        System.out.println(fruit);
        fruit.remove(1);
     //    fruit.set(0,"ss");
    //    fruit.addFirst("pp");
       System.out.println(fruit);
        System.out.println("_____________-");
    }


public static void queueDemo()
{
    /**
     * Queue
     *  implementing class (LinkedList -PriorityQueue)
     */
    Queue fruit=new LinkedList();
    fruit.add("Mandarin");
    fruit.add ("Grapes");
    fruit.add("Cucumber");
    fruit.add("Grapes");
    fruit.add ("Mandarin");
    System.out.println(fruit.size());
     fruit.remove();
    System.out.println(fruit);
    System.out.println(fruit.element());
    System.out.println("--------------------");
}

public static void mapDemo()
{
    /**
     * Map
     * implementing class(HashMap-LinkedHashMap-TreeMap)
     */
    Map<String,Integer> fruitsCalories=new HashMap();
    fruitsCalories.put("Apple",100);
    fruitsCalories.put("Apple",99);
    fruitsCalories.put("Orange",100);
    fruitsCalories.put("Lemon",10);
    fruitsCalories.putIfAbsent("Apple",80);
    System.out.println(fruitsCalories.size());
    System.out.println(fruitsCalories);

    // How to loop on map:
    // first way
    // entrySet --> transfer map to set of map entries plus entry is
    // inner interface inside map interface
       // for (var f :fruitsCalories.entrySet())
    //Or Another way:
        for (Map.Entry<String,Integer>f:fruitsCalories.entrySet())
    {
        System.out.println("The fruit "+ f.getKey() + " has " +f.getValue()+ " calories");
    }
    System.out.println("---------------------------");
    // second way
    fruitsCalories.forEach((x, y) -> System.out.println("The fruit " + x + " has " + y + " calories"));
}
}
