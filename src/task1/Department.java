package task1;

import java.io.Serializable;
import task1.filemangerbinary;

/**
 *
 * @author Tamer A.Yassen
 */
public class Department implements Serializable {

    private String DeptID;
    private String DeptName;
    private String DeptDesc;

    //filemangerbinaryanger FManger = new fileManger();
    filemangerbinary FManger = new filemangerbinary();
    private final String DeptFileName = "Department.bin";

    public Department() {

    }

    public Department(String DeptID, String DeptName, String DeptDesc) {
        this.DeptID = DeptID;
        this.DeptName = DeptName;
        this.DeptDesc = DeptDesc;
    }

    public void setDeptID(String DeptID) {
        this.DeptID = DeptID;
    }

    public void setDeptName(String DeptName) {
        this.DeptName = DeptName;
    }

    public void setDeptDesc(String DeptDesc) {
        this.DeptDesc = DeptDesc;
    }

    public String getDeptID() {
        return this.DeptID;
    }

    public String getDeptName() {
        return this.DeptName;
    }

    public String getDeptDesc() {
        return this.DeptDesc;
    }
/*
    public boolean addDept() {
        if (FManger.write(getDeptData(), DeptFileName )) {
            return true;
        } else {
            return false;
        }
    }

    private String getDeptData() {
        return this.DeptID + "@" + this.DeptName + "@" + this.DeptDesc + "@";
    }
*/
    @Override
    public String toString() {
        return "Dept Name : " + DeptName + "\n" + "Dept Desc : " + DeptDesc + "\n";
    }
}
