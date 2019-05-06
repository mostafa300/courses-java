/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package task1;

import java.io.Serializable;
import java.util.ArrayList;

/**
 *
 * @author khaled
 */
public class StudentCourses implements Serializable{
    filemangerbinary fmanger=new filemangerbinary();
    private int id;
   private ArrayList<Course> courses=new ArrayList<>();
    public static ArrayList<StudentCourses> all;
    private static final String filename="StudentCourses.bin";
    public StudentCourses()
    {
        
    }
    public StudentCourses(int id,String CName,String CID,int Hours,float price,Department Department)
    {
        this.id=id;
        this.courses.add(new Course(CName, CID, Hours, price, Main.cs));
    }
    
    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public ArrayList<Course> getCourses() {
        return courses;
    }

    public void setCourses(ArrayList<Course> courses) {
        this.courses = courses;
    }
    
    public void ReadAllData()
    {
        all=(ArrayList<StudentCourses>) fmanger.read(filename);
        if(all==null)
        {
            all=new ArrayList<>();
        }
    }
    public int Exists(int id)
    {
        ReadAllData();
        for (int i = 0; i <all.size() ; i++) {
            if(all.get(i).getId()==id)
            {
             return i;
            }
        }
        return -1;
    }
    public void AddCourse(StudentCourses sc)
    {
        int index=Exists(sc.getId());
        if(index!=-1)
        {
            all.get(index).courses.add(sc.courses.get(0));
        }
        else{
            all.add(sc);
        }
    }
    public boolean StudentExist(int id)
    {
        
        ArrayList<Student> all;
      all=(ArrayList<Student>) fmanger.read("stupro.bin");
      if(all==null)
      {
          all=new ArrayList<Student>();
      }
        for (int i = 0; i < all.size(); i++) {
            if(all.get(i).getId()==id)
            {
               
                return true;
            }
        }
        return false;
    }
    public StudentCourses allCourses(int id)
    {
       int index=Exists(id);
       if(index!=-1)
       {
           return all.get(index);
       }
       else{
           return null;
       }
    }
    
    
}
