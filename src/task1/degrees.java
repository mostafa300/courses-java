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
import static task1.Teacher.Teachers;

/**
 *
 * @author khaled
 */
public class degrees implements Serializable{
    filemangerbinary fmanger=new filemangerbinary();
    private  int  StudentID;
    private String CourseID;
    public ArrayList<Boolean> Lectures=new ArrayList<>();
    public ArrayList<Boolean> Sections=new ArrayList<>();
    public ArrayList<String> Quizes=new ArrayList<>();
    public ArrayList<String> Sheets=new ArrayList<>();
    private String partical,finalterm,midterm;
    public static ArrayList<degrees> all;
    
    private final static String filename="degrees.bin";
    
   
    public String getCourseID()
    {
        return CourseID;
    }

    public void setCourseID(String CourseID)
    {
        this.CourseID = CourseID;
    }

    public void setStudentID(int StudentID)
    {
        this.StudentID = StudentID;
    }
     public int getStudentID()
    {
        return StudentID;
    }


    public String getPartical() {
        return partical;
    }

    public void setPartical(String partical) {
        this.partical = partical;
    }

    public String getFinalterm() {
        return finalterm;
    }

    public void setFinalterm(String finalterm) {
        this.finalterm = finalterm;
    }

    public String getMidterm() {
        return midterm;
    }

    public void setMidterm(String midterm) {
        this.midterm = midterm;
    }
        public void ReadAllData()
    {
      all=(ArrayList<degrees>) fmanger.read(filename);
      if(all==null)
      {
          all=new ArrayList<degrees>();
      }
    }
    public void writeAllTeacher() throws IOException
    {
        fmanger.write(filename, all);
    }
    public void AddDegree(degrees d) throws IOException
    {
       
        ReadAllData();
        int index=DegreePutten(d.StudentID);
        if(index>=0)
        {
            all.set(index, d);
        }
        all.add(d);
        writeAllTeacher();
        
    }
    public int DegreePutten(int id)
    {
        ReadAllData();
        for (int i = 0; i < all.size(); i++) {
            if(all.get(i).getStudentID()==id)
            {
                return i;
            }
        }
        return -1;
    }
    public void UpdateDegree(int id,degrees newDegree) throws IOException
    {
       ReadAllData();
        int index=-1;
       for (int i = 0; i < all.size(); i++)
       {
           if(all.get(i).getStudentID()==id)
               {
                        index=i;
                        break;
               }
       }
       if(index!=-1)
         {
            all.set(index,newDegree);
         }
            writeAllTeacher();
        
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
    public int Quizenumber()
    {
        return Quizes.size();
    }
    public int Sheetnumber()
    {
        return Sheets.size();
    }
    public int Lecturenumber()
    {
        return Lectures.size();
    }
    public int Sectionnumber()
    {
        return Sections.size();
    }
    public degrees spicial(int id,String Cid)
    {
        ReadAllData();
            for (int i = 0; i < all.size(); i++) {
                if(all.get(i).getStudentID()==id&&all.get(i).getCourseID().equals(Cid))
                {
                    return all.get(i);
                }
        }
       return null;
    }
    public int degreeIndex(int id)
    {
             ReadAllData();
            for (int i = 0; i < all.size(); i++)
            {
                if(all.get(i).getStudentID()==id)
                {
                    return i;
                }
            }   
        return -1;
    }
    
}