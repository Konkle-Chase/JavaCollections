/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package cit360javacollections;

/**
 *
 * @author Konkles
 */
import java.util.*;
import static cit360javacollections.HelperFunctions.*;

/**
 *
 * @author Konkles
 */
public class CIT360JavaCollections {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        //36,20,25,10,31,52,43,20,10
//This section demonstrates the collection type List.
        Collection c = new ArrayList<>();
        c.add(36);
        c.add(20);
        c.add(25);
        c.add(10);
        c.add(31);
        c.add(52);
        c.add(43);
        c.add(20);
        c.add(10);
        List numList = new ArrayList(c); 
        System.out.println("This is an example of a ArrayList: " + numList + "\nIn an ArrayList accessing specific elements is fast, however, adding and removing elements can be slow especially when done so in the middle of the ArrayList.");
        
        LinkedList chain = new LinkedList(numList);
        System.out.println("\nThis is an example of a LinkedList: " + chain + "\nIn a LinkedLists adding and removing elements is fast, however, accessing specific elements is slow.");
        
        System.out.println("The major difference between these two Lists is the method by which elements are access, ArrayLists use a random dynamic access method while LinkedLists use a sequentual access method.");
        
        pressAnyKeyToContinue();
        
//This section demonstrates the collection type Set.
        Set set = new HashSet(numList);
        System.out.println("Now this list is stored in a Set: " + set);
        System.out.println("\nEach element of a Set must be unique, therefore all duplicate numbers were discarded.");
        System.out.println("\nTry adding unique and then duplicate positive integers to the Set; or enter \"next\" to continue the demonstration.");
        set = (Set) addToSet(set);

//This section demonstrates the collection type Tree.        
        TreeSet tree = new TreeSet(set);
        System.out.println("\nNow this Set is stored in a TreeSet:");
        System.out.println("\t" + tree);
        System.out.println("\nTrees sort data in asending order. Try adding integers to this TreeSet or enter \"next\" to continue the demonstration.");
        addToSet(tree);        
        
//This section demonstrates the collection type Map.                
        List students = new ArrayList();
        students.add("Curly");
        students.add("Piper");
        students.add("Gidget");
        students.add("Axel");
        students.add("Penny");
        students.add("Tulip");
        System.out.println("\nThis is a collection of students:");
        System.out.println("\t" + students);
        int[] grades = {85,100,70,85,90,60};
        System.out.println("This is a collection of grades:");
        System.out.println("\t" + Arrays.toString(grades));
        System.out.println("These students and their grades are now stored in a Map");
        System.out.println("Elements within a Map hold a data pair: a key, which must be unique, and a value. In this example the student's name is the key and their grade is the value.");
        System.out.println("\nEnter a name from the list of students to see his or her grade, or enter \"next\" to continue the demonstration.");
        Map match = matchMaker(students, grades);
        lookupByKey(match);
        Map treeMatch = new TreeMap(match);
        System.out.println("Storing a Map as a TreeMap will display the data set in alphabetical order or from lowest value to highest value.");
        System.out.println("\tTreeMap: " + treeMatch);
        
//This section deminstrates the collection type Queue.
        Queue line;
        line = fillQueue(students);
        System.out.println("This collection of names has now been entered into a queue in this order: " + students.toString() + "\nA Queue is an ordered list and is governed by FIFO principles.");
        System.out.println("Now the names will be removed from the queue one at a time.");        
        emptyQueue(line);
        System.out.println("In a PriorityQueue the objects in the queue are ordered so that the the lowest value will be at the front of the Queue.");
        line = fillQueue(students);
        Queue priorityLine = new PriorityQueue(line);
        System.out.println("The first name in the PriorityQueue: " + priorityLine.element());
        System.out.println("Now the names will be removed from the queue one at a time.");               
        emptyQueue(priorityLine);       
    }
}
