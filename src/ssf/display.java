/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ssf;

/**
 *
 * @author PC
 */
public class display {
    public static void main(String[] args) {
        Employee e1 =new Employee("Sahand","Ari",70000);
           
     Employee e2=new Employee("mohammed ","ali",900);
     Employee e3 =new Employee("aland","bakhtyar",1500);
      System.out.println("Name\t \t Yearly Salary");
        System.out.println("****\t \t **************");
        System.out.println(e1.getname()+" "+e1.getlname()+"\t $"+e1.getYsalary());
    System.out.println(e2.getname()+" "+e2.getlname()+"\t $"+e2.getYsalary());
    System.out.println(e3.getname()+" "+e3.getlname()+"\t $"+e3.getYsalary());
        
    System.out.println("\n");
    
       e1.setraise(20);
       e2.setraise(20);
       e3.setraise(20);
       
        System.out.println("20 percent salary raised");
        System.out.println("Name\t \t Yearly Salary");
        System.out.println("****\t \t **************");
       System.out.println(e1.getname()+" "+e1.getlname()+"\t $"+e1.getYsalary());
    System.out.println(e2.getname()+" "+e2.getlname()+"\t $"+e2.getYsalary());
    System.out.println(e3.getname()+" "+e3.getlname()+"\t $"+e3.getYsalary());

    
    
    }
}
