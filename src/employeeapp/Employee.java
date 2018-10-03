package employeeapp;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author x17114357
 */
public abstract class Employee {
    protected String name;
    protected String id;
    protected String dob;

    public Employee(){
        name = " ";
        id = " ";
        dob = " ";
            
    }
    public Employee(String name, String id, String dob) {
        this.name = name;
        this.id = id;
        this.dob = dob;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setId(String id) {
        this.id = id;
    }

    public void setDob(String dob) {
        this.dob = dob;
    }

    public String getName() {
        return name;
    }

    public String getId() {
        return id;
    }

    public String getDob() {
        return dob;
    }
    public String printDetails(){
        return "Employee Details "+id+","+name+","+dob;
    }
    public abstract void computeWPay();
    
    
    
}
