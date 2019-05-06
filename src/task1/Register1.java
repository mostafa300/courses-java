
package task1;


import java.io.IOException;
import java.io.Serializable;
import java.util.ArrayList;


public class Register1 extends Course implements Serializable{
    private String sname;
    private String cname;
    private String cid;
    private  int sid;
  
    
     //FileMangerBinary File = new FileMangerBinary();
     private final String FileName = "Register.bin";
    public static ArrayList<Register1> register = new ArrayList<Register1>();
  
    public Register1 ()  {
      
    }
    public void setsname(String sname)
    {
        this.sname=sname;
    }
    public void setcname(String cname)
    {
        this.cname=cname;
    }
    public void setcid(String cid)
    {
        this.cid=cid;
    }
    public void setsid(int sid)
    {
        this.sid=sid;
    }
   
    public String getsname()
    {
        return this.sname;
    }
     public String getcname()
    {
        return this.cname;
    }
      public String getcid()
    {
        return this.cid;
    }
       public int getsid()
    {
        return this.sid;
    }
   
           
       public void loadFromFile1() {
           if( FManger.read(FileName)==null){}
           else {register = (ArrayList<Register1>) FManger.read(FileName);}
       
    }
    
     public boolean commitToFile1() {
        return FManger.write(FileName, register);
    }
     
     public boolean addCourse1() {
        loadFromFile1();
       register.add(this);
        return commitToFile1();
    }
      public ArrayList<Register1> listCourses1() {
        loadFromFile1();
        return register;
      }
      
      
    private int getStudentIndex1(int id)
   {
       for(int i=0;i<register.size();i++)
       {
           if(register.get(i).getsid()==id)
           {
                 return i; 
           }
            
           
       }
       return -1;
       
   }
   public Register1 SearchStudentById1(int id)
   {
      Register1 x =new Register1();
       loadFromFile1();
       int index = getStudentIndex1(id);  
       if(index!=-1)
       {
           return register.get(index);
       }
       else
           return x;
       
       
   }
    private int getStudentIndex1(String id,int sid)
   {
       for(int i=0;i<register.size();i++)
       {
           if(register.get(i).getcid().equalsIgnoreCase(id)&&register.get(i).getsid()==sid)
           {
                 return i; 
           }
            
       }
       return -1;
       
   }
   public Register1 SearchStudentById1(String id,int sid)
   {
      Register1 x =new Register1();
       loadFromFile1();
       int index = getStudentIndex1(id,sid);  
       if(index!=-1)
       {
           return register.get(index);
       }
       else
           return null;
     
   }
}