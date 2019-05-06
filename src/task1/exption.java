
package task1;

import javax.swing.JOptionPane;


public class exption {
      public String toString() {
        return "My Exception";
    }
public boolean checkphone(String phone)
{
    if(phone.charAt(0)=='0'&&phone.charAt(1)=='1'&&phone.length()==11&&(phone.charAt(2)=='2'||phone.charAt(2)=='1'||phone.charAt(2)=='0'||phone.charAt(2)=='5'))
    {
        
        return true;
    }
    return false;
}
    public int checkPositive(String x) {
        int number;
        do {
            number = Integer.parseInt(JOptionPane.showInputDialog("Enter Positive Number for " + x + " !"));
            if (number <= 0) {
                JOptionPane.showMessageDialog(null, "Not valid Input for Positive Int Try Again :(");
            }
        } while (number <= 0);

        return number;
    }

    public String checkEmail(String x)
    {
        String email;
        do {
            email = JOptionPane.showInputDialog("Enter Valid input for " + x + " !");
            if (!email.contains("@") || !email.contains(".")) {
                JOptionPane.showMessageDialog(null, "Not valid Input for Email Try Again :(");
            }
        } while (!email.contains("@") || !email.contains("."));

        return email;
    }

    
    public  boolean checkPassLength(String x) {
      
            
            if (x.length()>8) 
            {
               return true;
            }
            else
            {
                return false;
            }
      
}
    
}
