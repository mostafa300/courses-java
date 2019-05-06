
package task1;

import java.util.ArrayList;
import java.io.Serializable;
public class invoices extends Register1 implements Serializable{
     //filemangerbinary File = new filemangerbinary();
      private final String FileMoney = "Student money.bin";
    public  ArrayList<invoices> Money = new ArrayList<invoices>();
    private String SN;
    private  int SI;
   
    public invoices (){
    
    
    }
    public void setSN(String s)
    {
        this.SN=s;
    }
    public void setSI(int i)
    {
        this.SI=i;
    }
  public String getSN()
  {
      return this.SN;
  }
  public int getSI()
  {
      return this.SI;
  }
     public void loadFile() {
         if(FManger.read(FileMoney)==null){}
         else{  Money= (ArrayList<invoices>) FManger.read(FileMoney);}
    }
    
     public boolean commitFile() {
        return FManger.write(FileMoney, Money);
    }
     
     public boolean addMoney() {
        loadFile();
       Money.add(this);
        return commitFile();
    }
      public ArrayList<invoices> listMoney() {
        loadFile();
        return Money;
      }
      
      
       private int getStudent(int id)
   {
       for(int i=0;i<Money.size();i++)
       {
           if(Money.get(i).getsid()==id)
           {
                 return i; 
           }
            
           
       }
       return -1;
       
   }
   public invoices SearchStudent(int id)
   {
      invoices x =new invoices();
       loadFile();
       int index = getStudent(id);  
       if(index!=-1)
       {
           return Money.get(index);
       }
       else
           return x;
       
       
   }

  
    
    
}
