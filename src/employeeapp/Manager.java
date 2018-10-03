/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package employeeapp;

/**
 *
 * @author x17114357
 */
public class Manager extends Employee {
    private double salary;
    private double wPay;

    public double getwPay() {
        return wPay;
    }
    

    public Manager(double salary, String name, String id, String dob) {
        super(name, id, dob);
        this.salary = salary;
    }
    public Manager(){
        super();
        salary=0.0;
        wPay=0.0;
        
        
    }

    public void setSalary(double salary) {
        this.salary = salary;
    }

    public double getSalary() {
        return salary;
    }
    @Override
    public String printDetails(){
        return super.printDetails()+","+salary;
        
    }
    @Override
    public void computeWPay(){
        wPay=salary/52;
        
    }

}
