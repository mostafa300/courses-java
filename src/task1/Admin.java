package task1;

import java.io.IOException;
import java.io.Serializable;
import java.util.ArrayList;

/**
 *
 * @author Tamer A.Yassen
 */
public class Admin extends  Persone  implements Serializable{
    private int salary ;
    public static ArrayList<Admin> admin=new ArrayList<Admin>();
    //private final String fileadmin ="admins.bin" ;
    Admin()
    {
    
    }
    Admin(int id, String username, String password ,String fname ,String lname,int age,String phone1,String phone2,String address,int salary)
    {
        super(id ,username ,password ,fname,lname, age, phone1,phone2,address);
        this.salary=salary;
    }

//    public Admin1() {
  //      throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    //}

    public int getSalary() {
        return salary;
    }

    public void setSalary(int salary) {
        this.salary = salary;
    }
    
    public boolean commitToFile(String path) throws IOException {

        return FManger.write(path, admin);
    }
    
    public boolean loadFromFile(String path) {
        if (FManger.read(path) == null) {
            return false;
        } else {
            admin = (ArrayList<Admin>) FManger.read(path);
            return true;
        }
    }
    
    public int getadminIndex(int id) {
        
        for (int i = 0; i < admin .size(); i++) {
            if (admin.get(i).getId() == id) {
                return i;
            }
        }
        return -1;
    }

    
    public int searchadmin(int id, String path) {
        loadFromFile(path);
        int index = getadminIndex(id);
        if (index != -1) {
            return index;
        } else {
            return -1;
        }
    }
    
    public int getuserIndex(String user) {
        for (int i = 0; i < admin.size(); i++) {
            if (admin.get(i).getUsername().equalsIgnoreCase(user)) {
                return i;
            }
        }
        return -1;
    }
    
    
    int  admin_log( String pass, String name) throws IOException {
        loadFromFile("admin.bin");
       
        int x;
       
        if ((x = getuserIndex(name)) != -1) {
            if (admin.get(x).getPassword().equalsIgnoreCase(pass) && admin.get(x).getUsername().equalsIgnoreCase(name)) {
                return admin.get(x).getId();
            }
        }
        return -1;
    }
    
    public int addadminpr( String pass, String username, int age, String id,  String lname, String fname, String phone1, String phone2, String adress,int sallary) throws IOException {
        int iid = Integer.parseInt(id);
        int loc = searchadmin(iid, "admin.bin");
        
        for (int i = 0; i < admin.size(); i++) {
                  if (admin.get(i).getId()== iid) {
                      return 4;
                }  else if(admin.get(i).getUsername().equalsIgnoreCase(username)) {
                    return 3;
                }
        }
            if (loc == -1) {
            this.setFname(fname);//setfname(fname);
            this.setSalary(sallary);//thissetsallsry(sallary);
            this.setLname(lname);//setlname(lname);
            this.setPhone1(phone1);//setphone1(phone1);
            this.setPhone2(phone2);//setphone2(phone2);
            this.setAddress(adress);//setadress(adress);
            this.setUsername(username);//setusername(username);
            this.setPassword(pass);//setpassword(pass);
            this.setId(iid);//setid(iid);
            this.setAge(age);//setlage(age);
            admin.add(this);
            commitToFile("admin.bin");
            }
        return 0;
    }
    
    public int update( String pass, String username, int age, String id,  String lname, String fname, String phone1, String phone2, String adress,int sallary) throws IOException {
        int iid = Integer.parseInt(id);
        int loc = searchadmin(iid, "admin.bin");
            for (int i = 0; i < admin.size(); i++) {
                if (loc == i) {
                } 
               else if (admin.get(i).getUsername().equalsIgnoreCase(username)) {
                    return 3;
                }
            }
       this.setFname(fname);//setfname(fname);
            this.setSalary(sallary);//thissetsallsry(sallary);
            this.setLname(lname);//setlname(lname);
            this.setPhone1(phone1);//setphone1(phone1);
            this.setPhone2(phone2);//setphone2(phone2);
            this.setAddress(adress);//setadress(adress);
            this.setUsername(username);//setusername(username);
            this.setPassword(pass);//setpassword(pass);
            this.setId(iid);//setid(iid);
            this.setAge(age);//setlage(age);
            admin.set(loc,this);
            commitToFile("admin.bin");
            return 11;
        }
    
    
    public ArrayList<Admin> listAdmin ()
    {
        loadFromFile("admin.bin");
        return admin;
    }
}       
