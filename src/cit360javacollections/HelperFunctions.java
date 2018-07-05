/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package cit360javacollections;

import java.io.IOException;
import java.util.*;


/**
 *
 * @author Konkles
 */
public class HelperFunctions {
    
    //This function assists in demonstrating the behaviors of Queues.    
    public static Queue fillQueue(List names){
        Queue line = new LinkedList();
        names.forEach((name) -> {
            line.add(name);
        });
        return line;
    }

//This function assists in demonstrating the behaviors of Queues.
    public static void emptyQueue(Queue line){
        while(line.peek() != null){
            System.out.println("Next name up: " + line.poll());
        }
        System.out.println("The queue is empty.");
    }
    
//This function is used to break up the execution of this program so the user can execute one section at a time. 
    public static void pressAnyKeyToContinue()
    { 
        System.out.println("\nPress the Enter key to continue");
        try{
            System.in.read();
        }  
        catch(IOException e){}  
    }

    public static Collection addToList (Collection c){
        boolean next = false;
        while(next == false) {            
            Scanner reader = new Scanner(System.in);
            String input = reader.nextLine();
            try{
                if(input.equalsIgnoreCase("next")){
                    next = true;
                } else {               
                        c.add(Integer.parseInt(input));
                        System.out.println("\tCollection Values: " + c);
                        System.out.println("\nEnter an integer or enter \"next\" to continue the demonstration:");
                }
            }
            catch(IllegalArgumentException e){                
                System.out.println("\nInvalid Entry.");
                System.out.println("Try again or enter \"next\" to continue the demonstration:");
                
            }                     
        } 
        return c;
    }  
    
//This function assits in demonstrating the behaviors of Trees and Sets.    
    public static Collection addToSet (Collection c){
        boolean next = false;
        while(next == false) {            
            Scanner reader = new Scanner(System.in);
            String input = reader.nextLine();
            try{
                if(input.equalsIgnoreCase("next")){
                    next = true;
                } else if(c.contains(Integer.parseInt(input))){     
                    c.add(Integer.parseInt(input));                    
                    System.out.println("\tCollection Values: " + c);
                    System.out.println("Since " + input + " is already in the collection it is automatically thrown out.");
                    System.out.println("\nEnter an integer or enter \"next\" to continue the demonstration:");
                } else{
                    
                    c.add(Integer.parseInt(input));
                    System.out.println("\tCollection Values: " + c);
                    System.out.println("\nEnter an integer or enter \"next\" to continue the demonstration:");
                }
            }
            catch(IllegalArgumentException e){
                System.out.println("\nInvalid Entry.");
                System.out.println("Try again or enter \"next\" to continue the demonstration:");
            }
        } 
        return c;
    }
    
    public static Map matchMaker(Collection keys, int []numVals ){
        Map match = new HashMap();
        Iterator rerun = keys.iterator();
        int i = 0;
        while(rerun.hasNext()){
            Object key = rerun.next();
            match.put(key, numVals[i]);
            i++;
        }
        return match;
    }
    
    public static void lookupByKey(Map elements){
        boolean next = false;
        while(next == false) {            
            Scanner reader = new Scanner(System.in);
            String input = reader.nextLine();
            if(input.equalsIgnoreCase("next")){
                next = true;
            } else {
                Object uInput = (Object)input;
                if (elements.containsKey(uInput)){
                    Object grade = elements.get(uInput);
                    System.out.println(uInput + "'s grade is: " + grade);
                    System.out.println("\nEnter another student to check his or her grade or enter \"next\" to continue the demonstration:");
                } else {
                    System.out.println("\nSorry there is no student by that name.\nEnter another student to check his or her grade or enter \"next\" to continue the demonstration:");
                }
            }    
        }
    }
}