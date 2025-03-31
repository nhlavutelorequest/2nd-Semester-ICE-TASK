/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ice.task.pkg1;

/**
 *
 * @author RC_Student_lab
 */
public class Employee {
     private double salary;

    public Employee(double salary) {
        this.salary = salary;
    }

    public void work() {
        System.out.println("The Employee is working");
    }

    public double getSalary() {
        return salary;
    }
    
}

class HRManager extends Employee {
    public HRManager(double salary) {
        super(salary);
    }

    @Override
    public void work() {
        System.out.println("HR Manager is managing employees");
    }

    public void addEmployee() {
        System.out.println("HR Manager is adding a new employee");
    }
}
