package task1;

import java.awt.Component;
import java.awt.Container;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.ArrayList;
import java.util.Scanner;
import javax.swing.JFrame;
import javax.swing.JOptionPane;
import javax.swing.JTable;
import javax.swing.JTextField;
import javax.swing.WindowConstants;
import javax.swing.table.DefaultTableModel;
public class filemanger {
    
    boolean write(String FilePath, Object data) throws IOException
      {
          String s;
          PrintWriter pw=(new PrintWriter(new FileWriter(FilePath,true)));
         pw.print(data);
          pw.close();
          return true;
    }
    public  ArrayList<String> Read(String filename)
    {
         ArrayList<String> arr=new ArrayList<String>();
        try {
            Scanner sc=new Scanner(new File(filename));
           
            while(sc.hasNext())
            {
                arr.add(sc.nextLine());
            }
            sc.close();
        } catch (Exception e) {
        }
    return arr;
}
      public  void FillTable(JTable table,ArrayList<String> values)
    {
        
        DefaultTableModel tbl=(DefaultTableModel) table.getModel();
        tbl.setRowCount(0);
        for (int i = 0; i < values.size(); i++) {
            if(values.get(i).contains("#"))
            {
               tbl.addRow(values.get(i).split("#")); 
            }
            else
            {
                tbl.addRow(values.get(i).split(" "));
            }
            
        }
    }
    
    public  void ShowMessage(String Message)
    {
        JOptionPane.showMessageDialog(null, Message);
    }
    
    public  void ShowForm(JFrame form)
    {
        form.setVisible(true);
        form.setLocationRelativeTo(null);
        form.setResizable(false);
        form.setDefaultCloseOperation(WindowConstants.DISPOSE_ON_CLOSE);
    }
     public  void ClearTextField(Container form)
    {
        for(Component c:form.getComponents())
        {
            if (c instanceof JTextField) {
                JTextField txt=(JTextField) c;
                txt.setText(""); 
            }
            else if(c instanceof Container)
            {
                ClearTextField((Container) c);
            }
        }
    }

}