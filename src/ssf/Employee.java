/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ssf;

/**
 *
 * @author PC
 */
public class Employee {
    private String Fname;
    private String Lname;
    private double Msalary;
    
    
   
    
    public Employee (String fname, String lname,double msalary){
        Fname=fname;
        Lname=lname;
        Msalary=msalary;
    }
    public void setname(String Fname){
    this.Fname=Fname;
    
    }
    public void setLname(String lname){
    lname=Lname;}
    public void setSalary(double Salary){
        if (Msalary>0){
    Salary=Msalary;}
        else {System.out.println("salary should be higher than 0");}}
    
    
    public String getname(){
    return Fname;}
   
    public String getlname (){
    return Lname;}
    
    public double getsalary(){
    return Msalary;}
    public double getYsalary(){
    return Msalary*12;}
    
    public void setraise(double percentage){
    if(percentage>0&&percentage<100)
        Msalary+=Msalary*(percentage/100);
    else{System.out.println("error percentage range 0-100");}}
}
