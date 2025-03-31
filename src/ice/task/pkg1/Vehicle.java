/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ice.task.pkg1;

/**
 *
 * @author RC_Student_lab
 */
public class Vehicle {
    public void drive() {
        System.out.println("Driving a vehicle");
    }
}

// Subclass Car method
class Car extends Vehicle {
    // Overriding the drive() method
    @Override
    public void drive() {
        System.out.println("Repairing a car");
    }
    
}
