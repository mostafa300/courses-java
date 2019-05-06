package task1;

import java.io.BufferedWriter;
import java.io.File;
import java.io.FileOutputStream;
import java.io.FileWriter;
import java.io.IOException;
import java.io.ObjectOutputStream;
import java.io.Serializable;
import java.util.ArrayList;
import java.io.Serializable;
import static task1.Student.Students;

/**
 *
 * @author android
 */
public class Student extends Persone implements Serializable {
    //private String phone1;
    //private String phone2;
    //private String address;
    private int level;
    private double gpa;
    private String depart;
    //private String ProfileImagePath;// pacture 
    //private final String studentFileName = "Students1.bin";
    public static ArrayList<Student> Students = new ArrayList<Student>();
    public Student (){}
    public Student(int id, String username, String password ,String fname ,String lname,int age,String phone1,String phone2,String address,int level,double gpa){
        super(id ,username ,password ,fname,lname, age, phone1,phone2,address);
        //this.phone1=phone1;
        //this.phone2=phone2;
       // this.address=address;
        this.level=level;
        this.gpa=gpa;
       
    }
/*
    public String getPhone1() {
        return phone1;
    }

    public void setPhone1(String phone1) {
        this.phone1 = phone1;
    }

    public String getPhone2() {
        return phone2;
    }

    public void setPhone2(String phone2) {
        this.phone2 = phone2;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }
*/
    public int getLevel() {
        return level;
    }

    public void setLevel(int level) {
        this.level = level;
    }

    public double getGpa() {
        return gpa;
    }

    public void setGpa(double gpa) {
        this.gpa = gpa;
    }
     public String getdepart() {
        return depart;
    }

    public void setdepart(String depart) {
        this.depart=depart;
    }
    
    public boolean commitToFile(String path) throws IOException {

        return FManger.write(path, Students);
    }
    
    public boolean loadFromFile(String path) {
        if (FManger.read(path) == null) {
             for(int i=0;i<Students.size();i++)
          {
              
              Students.remove(i);
          }
            return false;
        } else {
          for(int i=0;i<Students.size();i++)
          {
              
              Students.remove(i);
          }
            Students = (ArrayList<Student>) FManger.read(path);
            return true;
        }
    }
    public int getStudentIndex(int id) {
        for (int i = 0; i < Students.size(); i++) {
            if (Students.get(i).getId() == id) {
                return i;
            }
        }
        return -1;
    }

     public int searchStudent(int id, String path) {
        loadFromFile(path);
        int index = getStudentIndex(id);
        if (index != -1) {
            return index;
        } else {
            return -1;
        }
    }
     
           public int getuserIndex(String user) {
        for (int i = 0; i < Students.size(); i++) {
            if (Students.get(i).getUsername().equalsIgnoreCase(user)) {
                return i;
            }
        }
        return -1;
    }
    
        public int  stud_log( String pass, String name) throws IOException {
        loadFromFile("stupro.bin");
        int x;
        if ((x = getuserIndex(name)) != -1) {
            if (Students.get(x).getPassword().equalsIgnoreCase(pass) && Students.get(x).getUsername().equalsIgnoreCase(name)) {
                return Students.get(x).getId();
            }
        }
        return -1;
    }
        
        public int addstudentpr(int level, String password, String username, int age, String id, double GPa, String lname, String fname, String phone1, String phone2, String address,String depart) throws IOException {
        int iid = Integer.parseInt(id);
        int loc = searchStudent(iid, "stupro.bin");
        
        for (int i = 0; i < Students.size(); i++) {
                  if (Students.get(i).getId() == iid) {
                      return 4;
                }  else if(Students.get(i).getUsername().equalsIgnoreCase(username)) {
                    return 3;
                }
        }
            if (loc == -1) {
            this.setFname(fname);
            this.setdepart(depart);
            this.setLname(lname);//setlname(lname);
            this.setPhone1(phone1);
            this.setPhone2(phone2);
            this.setAddress(address);
            this.setUsername(username);
            this.setPassword(password);
            this.setGpa(GPa);//setGPA(GPa);
            this.setLevel(level);//setLevel(level);
            this.setId(iid);//setid(iid);
            this.setAge(age);//setlage(age);
            Students.add(this);
            commitToFile("stupro.bin");
        }
      
        
        return 0;
    }
        
     public int update(int level, String password, String username, int age, String id, double GPa, String lname, String fname, String phone1, String phone2, String address,String depart) throws IOException {
        int iid = Integer.parseInt(id);
        int loc = searchStudent(iid, "stupro.bin");
            for (int i = 0; i < Students.size(); i++) {
                if (loc == i) {
                } 
               else if (Students.get(i).getUsername().equalsIgnoreCase(username)) {
                    return 3;
                }
            }
           this.setLname(lname);//setlname(lname);
           this.setFname(fname);//setlname(lname);
           this.setdepart(depart);
            this.setPhone1(phone1);
            this.setPhone2(phone2);
            this.setAddress(address);
            this.setUsername(username);
            this.setPassword(password);
            this.setGpa(GPa);//setGPA(GPa);
            this.setLevel(level);//setLevel(level);
            this.setId(iid);//setid(iid);
            this.setAge(age);//setlage(age);
            Students.set(loc,this);
            commitToFile("stupro.bin");
            return 11;
        }    
}
