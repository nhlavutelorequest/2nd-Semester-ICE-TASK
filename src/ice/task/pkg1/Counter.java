/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ice.task.pkg1;

/**
 *
 * @author RC_Student_lab
 */
public class Counter {
    //Track the counter
    public static int count = 0;
            //constructor
    public Counter(){
        //count every time the object is created
        count++;
        
    }  
    
    public static int getCount(){
     return count++;
    }
    
}
