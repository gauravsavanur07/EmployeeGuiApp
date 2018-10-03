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
public class FloorStaff extends Employee {
    private double rate;
    private double hours;
    private double wpay;
    
    

    public FloorStaff(Double rate,Double hours,String name, String id, String dob) {
        super(name, id, dob);
        this.rate=rate;
    }
    public FloorStaff(){
        super();
        hours=0.0;
        rate=0.0;
        wpay=0.0;
    }
    public void setHours(double hours) {
        this.hours = hours;
    }

    public void setWpay(double wpay) {
        this.wpay = wpay;
    }

    public double getRate() {
        return rate;
    }

    public void setRate(double rate) {
        this.rate = rate;
    }
    @Override
    public void computeWPay(){
        wpay=rate*hours;
    }

    public double getHours() {
        return hours;
    }

    public double getWpay() {
        return wpay;
    }
    
    
}
