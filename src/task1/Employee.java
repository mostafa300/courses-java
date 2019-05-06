/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package task1;

/**
 *
 * @author mahmoud
 */
import java.io.IOException;
import java.io.Serializable;
import java.util.ArrayList;
import java.util.logging.Level;
import java.util.logging.Logger;

public class Employee extends Persone implements Serializable {
    
    

    private final String EmpFileName = "Employee.bin";
    private double salary=0.0;
    private String type="null";
    private String dept="null";

    public static ArrayList<Employee> Employees;

    public Employee() {
    }

    public Employee(int id,String user, String pass, String fname, String lname,int age,String phone1,String phone2,String adress,String type,  double salary , String dept) {
       super(id ,user ,pass ,fname,lname, age, phone1,phone2,adress);
        this.salary=salary;
        this.type=type;
        this.dept=dept;
    }

    public double getSalary() {
        return salary;
    }

    public void setSalary(double salary) {
        this.salary = salary;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public String getDept() {
        return dept;
    }

    public void setDept(String dept) {
        this.dept = dept;
    }
    
 
    

    public boolean addEmp() throws IOException {
        loadFromFile();
        Employees.add(this);
        return commitToFile("Employee.bin");
    }

    public boolean commitToFile(String path) throws IOException {
        
          return FManger.write( path, Employees);
       
    }

    public void loadFromFile() {
        Employees = (ArrayList<Employee>) FManger.read(EmpFileName);
         if ( Employees == null) 
         {
        Employees = new ArrayList<Employee>();
         }
        
    }

    private int getEmpIndex(int id) {
        for (int i = 0; i < Employees.size(); i++) {
            if (Employees.get(i).getId()== id) {
                return i;
            }
        }

        return -1;
    }

    public Employee searchEmpById(int id) {
        Employee temp = new Employee();
        loadFromFile();
        int index = getEmpIndex(id);
        if (index != -1) {
            return Employees.get(index);
        } else {
            return temp;
        }
    }

    public ArrayList<Employee> listEmployees() {
        loadFromFile();
        return Employees;
    }

    public boolean updateEmp() throws IOException {
        loadFromFile();
        int index = getEmpIndex(getId());

        if (index != -1) {
            Employees.set(index, this);

            return commitToFile("Employee.bin");
        }

        return false;
    }

    public boolean deleteEmp(int id) throws IOException {
        loadFromFile();
        int index = getEmpIndex(id);

        if (index != -1) {
            Employees.remove(index);

            return commitToFile("Employee.bin");
        }

        return false;
    }

    @Override
    public String toString() {
        return "\nI'm Student Affairs Emp : " + getFname() + " " + getLname() + "\n" + "ID : " + getId() + " Age : " + getAge() + " Salary : " + salary + "\n" + "Dept. : " + this.dept + "\nUserName: " + getUsername() + "\t Password: " + getPassword() + "\n";
    }



}

