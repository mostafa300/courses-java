package task1;

import java.io.Serializable;


public class Persone implements Serializable{
    private int id;
    private String username;
    private String password;
    private String fname;
    private String lname;
    private int age;
    private String phone1;
    private String phone2;
    private String address;
    filemangerbinary FManger = new filemangerbinary();
    public Persone(){}
    public Persone(int id ,String username,String password ,String fname,String lname,int age ,String phone1 ,String phone2,String address)
    {
        this.id=id ;
        this.username=username;
        this.password=password;
        this.fname=fname;
        this.lname=lname;
        this.age=age;    
        this.phone1=phone1;
        this.phone2=phone2;
        this.address=address;
    }
    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public String getFname() {
        return fname;
    }

    public void setFname(String fname) {
        this.fname = fname;
    }

    public String getLname() {
        return lname;
    }

    public void setLname(String lname) {
        this.lname = lname;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

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
    
}

