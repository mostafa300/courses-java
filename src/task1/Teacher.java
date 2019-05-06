/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package task1;

import java.io.File;
import java.io.IOException;
import java.io.Serializable;
import java.util.ArrayList;
import javax.swing.JTable;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author khaled
 */
public class Teacher extends Persone implements Serializable{
    //private String dept;
    //private String StudentID;
    //private int phone;
    private double Salary;
    private String Deparment;

  
    filemangerbinary fmanger=new filemangerbinary();
    private static String filename="teacher.bin";
    public static ArrayList<Teacher> Teachers;
    public Teacher()
    {
        
    }

    Teacher (int id, String username, String password ,String fname ,String lname,int age,String phone1,String phone2,String address,int salary,String Department)
    {
        super(id ,username ,password ,fname,lname, age, phone1,phone2,address);
        this.Salary=salary;
        this.Deparment=Department;
    }
  public String getDeparment() {
        return Deparment;
    }

    public void setDeparment(String Deparment) {
        this.Deparment = Deparment;
    }
    public double getSalary() {
        return Salary;
    }

    public void setSalary(double Salary) {
        this.Salary = Salary;
    }


    public void ReadAllData()
    {
       Teachers=(ArrayList<Teacher>) fmanger.read(filename);
       if(Teachers==null)
       {
           Teachers=new ArrayList<Teacher>();
       }
    }
    public void writeAllTeacher() throws IOException
    {
        fmanger.write(filename, Teachers);
    }
    public void AddTeacher(Teacher t) throws IOException
    {
       
        ReadAllData();
       /* if (Teachers==null) {
            Teachers=new ArrayList<Teacher>();
        }*/
        Teachers.add(t);
        writeAllTeacher();
        
    }
    public void UpdateTeacher(int id,Teacher newTeacher) throws IOException
    {
        ReadAllData();
        int index=-1;
       for (int i = 0; i < Teachers.size(); i++)
       {
           if(Teachers.get(i).getId()==id)
               {
                        index=i;
                        break;
               }
       }
       if(index!=-1)
         {
            Teachers.set(index,newTeacher);
         }
            writeAllTeacher();
           
    }
    public void RemoveTeacher(int id) throws IOException
    {
        ReadAllData();
        int index=-1;
        for (int i = 0; i < Teachers.size(); i++) {
            if(Teachers.get(i).getId()==id)
               {
                        index=i;
                        break;
               }
        }
       if(index!=-1)
          {
            Teachers.remove(index);
         }
          writeAllTeacher();
           
    }
    public boolean TeacherRepeat(String username,int  id)
    {
        
        
                ReadAllData();
             for (int i = 0; i < Teachers.size(); i++)
                {
                   if (Teachers.get(i).getUsername().equalsIgnoreCase(username) ||  Teachers.get(i).getId()==id )
                       {
                           return true;
                       }
                }
            
  
         return false;
    }
    public boolean IsTeacher(String username,String password)
    {
        
       
             ReadAllData();
             for (int i = 0; i < Teachers.size(); i++)
             {
            if(Teachers.get(i).getUsername().equalsIgnoreCase(username)&&Teachers.get(i).getPassword().equalsIgnoreCase(password))
                {
                    return true;
                }
             }
           
        return false;
    }
    public void FillTable(JTable table)
    {
        DefaultTableModel tbl=(DefaultTableModel) table.getModel();
        tbl.setRowCount(0);
        ReadAllData();
      
             for (int i = 0; i < Teachers.size(); i++)
             {
                 String name=Teachers.get(i).getFname()+" "+Teachers.get(i).getLname();
                 tbl.addRow(new Object[]{name,Teachers.get(i).getId(),Teachers.get(i).getUsername(),Teachers.get(i).getPassword()});
             }
           
   
    }
    public Teacher SearchByID(int id)
    {
     
        ReadAllData();
        
             for (int i = 0; i < Teachers.size(); i++)
             {
                 if(Teachers.get(i).getId()==id)
                 {
                     return Teachers.get(i);
                 }
             }
           
            return null;
    }
    public boolean ArrayEmpty()
    {
        return Teachers.isEmpty();
    }

}
