package task1;
import java.io.File;
import java.io.IOException;
import java.util.Scanner;
public class Main {
    public static Department general = new Department("0", "General", "General Dept");
    public static Department cs = new Department("1", "CS", "Computer Science");
    public static Department is = new Department("1", "IS", "Information System");
    public static Department it = new Department("1", "IT", "Information Technology");
    public static Department sw = new Department("1", "SW", "Software Engineering");
    public static Department sa = new Department("2", "SA", "Student Affairs");
    public static Department sta = new Department("3", "StA", "Staff Affairs");

    public static void main(String[] args) {  
   opening m=new opening();
   m.setVisible(true);
    }    
}