/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package ice.task.pkg1;

/**
 *
 * @author RC_Student_lab
 */
public class IceTAsk1 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
         // Created  Employee and call work() and getSalary()
        Employee employee = new Employee(10000);
        employee.work();
        System.out.println("The Employee salary: " + employee.getSalary());
        
        Counter obj1 = new Counter();
        Counter obj2 = new Counter();
        Counter obj3 = new Counter();
        Counter obj4 = new Counter();
        Counter obj5 = new Counter();
        Counter obj6 = new Counter();
        Counter obj7 = new Counter();
        
        //PRINT THE VALUE OF THE COUNTER//
        System.out.println("The Number of object count:"+ Counter.getCount());
        
        // Create an instance of Car
        Vehicle myCar = new Car();
        
        // overridden method
        myCar.drive();
        
        // calling the static add method of MathUtility class
        int sum = MathUtility.add(8, 12);

        // Print the result
        System.out.println("The sum of 8 and 12 is: " + sum);
    }
       
    
}
