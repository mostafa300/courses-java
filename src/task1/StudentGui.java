package task1;

import java.awt.Color;
import java.awt.Dimension;
import static java.awt.SystemColor.window;
import java.awt.event.KeyEvent;
import java.io.File;
import java.io.IOException;
import java.io.Serializable;
import java.util.ArrayList;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.DefaultComboBoxModel;
import javax.swing.ImageIcon;
import javax.swing.JFileChooser;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;
import static task1.degrees.all;


/**
 *
 * @author MOSTAFA
 */
public class StudentGui extends javax.swing.JFrame implements Serializable{
    filemanger fmn=new filemanger();
    String sid;
    degrees d=new degrees();
    int pid;
    String a;
    int aid;
    public StudentGui(int id,String a,int adid) {
        this.a=a;
        this.aid=adid;
        pid=id;//int of is
        this.sid=String.valueOf(id);//string of id
        initComponents();
       photo(); fun();Register1 v = new Register1();
            invoices d = new invoices();
            ArrayList<invoices> Money = new ArrayList<invoices>();
            Money = d.listMoney();
            ArrayList<Register1> register = new ArrayList<Register1>();
            register = v.listCourses1();
            String[] values=new String[5];
            int n=0;
                for (int i = 0; i < register.size(); i++) {
                    int id4 = register.get(i).getsid();
                    int id2 = pid;

                    Register1 returned = v.SearchStudentById1(id2);
                    int id3 = returned.getsid();
                    if (id4 == id3) {
                      
                        values[n]=register.get(i).getcid();
                        n++;
                        
                    }

                }
                String[] v2=new String[n];
                for (int i = 0; i < n; i++) {
                v2[i]=values[i];
            }
               
                cmb1.setModel(new DefaultComboBoxModel<>(v2));
              if(  cmb1.getSelectedItem()!=null){
              
                funshowdegree(pid,cmb1.getSelectedItem().toString());}
    /*    JFileChooser ch=new JFileChooser();
ch.showOpenDialog(null);
//File b=new File(null);
File  h=ch.getSelectedFile();
String f=h.getAbsolutePath();
//Image image=GenerateImage.toImage(true);  //this generates an image file
jLabel1.setIcon(new ImageIcon(f));
validate();*/
        
        
      // rqewthedgi##efgefhrgj#sdfbgn.dsfgnh
    }
 void funshowdegree(int id,String select)
    {
        DefaultTableModel tbl11=(DefaultTableModel) tbl1.getModel();
        DefaultTableModel tbl22=(DefaultTableModel) tbl2.getModel();
        DefaultTableModel tbl33=(DefaultTableModel) tbl3.getModel();
        DefaultTableModel tbl44=(DefaultTableModel) tbl4.getModel();
      degrees temp=d.spicial(id,select);
      if(temp!=null){
        tbl11.setNumRows(0);
        tbl22.setNumRows(0);
        tbl33.setNumRows(0);
        tbl44.setNumRows(0);
        for (int i = 0; i < temp.Sectionnumber(); i++) {
            tbl11.addRow(new Object[]{i+1,temp.Sections.get(i)});
        }
        for (int i = 0; i < temp.Lecturenumber(); i++) {
            tbl22.addRow(new Object[]{i+1,temp.Lectures.get(i)});
        }
        for (int i = 0; i < temp.Quizenumber(); i++) {
            tbl33.addRow(new Object[]{i+1,temp.Quizes.get(i)});
        }
       for (int i = 0; i < temp.Sheetnumber(); i++) {
            tbl44.addRow(new Object[]{i+1,temp.Sheets.get(i)});
        }
       mi.setText(temp.getMidterm());
       pr.setText(temp.getPartical());
       fi.setText(temp.getFinalterm());
    }
      else
      {
           mi.setText("");
       pr.setText("");
       fi.setText("");
      tbl11.setNumRows(0);
        tbl22.setNumRows(0);
        tbl33.setNumRows(0);
        tbl44.setNumRows(0);
      }
    }
    void photo() 
    {
       Student m=new Student();
        int loc;
      loc= m.searchStudent(pid, "photo.bin");
      
        if(loc==-1)
        {
 ImageIcon icon = new ImageIcon("D:\\java\\task\\src\\Images\\1y.png");
 
jLabel5.setIcon(icon);
Dimension imageSize = new Dimension(icon.getIconWidth(), icon.getIconHeight());
jLabel5.setPreferredSize(imageSize);
         validate();
        }
        else
        {
             File imageCheck = new File(m.Students.get(loc).getUsername());
    if(imageCheck.exists())
    {
        
     ImageIcon icon = new ImageIcon(m.Students.get(loc).getUsername());
jLabel5.setIcon(icon);
Dimension imageSize = new Dimension(icon.getIconWidth(), icon.getIconHeight());
jLabel5.setPreferredSize(imageSize);
         validate();   
    }
    else 
    {
       ImageIcon icon = new ImageIcon("D:\\java\\task\\src\\Images\\1y.png");
 
jLabel5.setIcon(icon);
Dimension imageSize = new Dimension(icon.getIconWidth(), icon.getIconHeight());
jLabel5.setPreferredSize(imageSize);
         validate();
    }
            
        }
    }
void fun()
{
    Student m=new Student();
  int l=  m.searchStudent(pid,"stupro.bin");
  String d=  m.Students.get(l).getFname();
  d=d+ " "+ m.Students.get(l).getLname();
  jLabel9.setText(d);

  mi.setEditable(false);
  pr.setEditable(false);
  fi.setEditable(false);
  idn.setEditable(false);
     un.setEditable(false);
        pa.setEditable(false);
        fn.setEditable(false);
        ln.setEditable(false);
        gpa.setEditable(false);
        jSpinner1.setEnabled(false);
jSpinner2.setEnabled(false);  
p1.setEditable(false);p2.setEditable(false);adress.setEditable(false);de.setEditable(false);
        this.setVisible(true);
    if(this.a==null) 
        {
            delet.setVisible(false);
jButton4.setVisible(false);
// Check if this user is admin or not
        }
}
    /**
     `* This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jTabbedPane2 = new javax.swing.JTabbedPane();
        jPanel2 = new javax.swing.JPanel();
        jLabel19 = new javax.swing.JLabel();
        jLabel20 = new javax.swing.JLabel();
        jLabel21 = new javax.swing.JLabel();
        mi = new javax.swing.JTextField();
        pr = new javax.swing.JTextField();
        fi = new javax.swing.JTextField();
        jScrollPane1 = new javax.swing.JScrollPane();
        tbl1 = new javax.swing.JTable();
        jScrollPane2 = new javax.swing.JScrollPane();
        tbl2 = new javax.swing.JTable();
        jLabel15 = new javax.swing.JLabel();
        jLabel16 = new javax.swing.JLabel();
        jScrollPane3 = new javax.swing.JScrollPane();
        tbl3 = new javax.swing.JTable();
        jLabel17 = new javax.swing.JLabel();
        jScrollPane4 = new javax.swing.JScrollPane();
        tbl4 = new javax.swing.JTable();
        jLabel18 = new javax.swing.JLabel();
        jLabel22 = new javax.swing.JLabel();
        cmb1 = new javax.swing.JComboBox<String>();
        jPanel1 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        un = new javax.swing.JTextField();
        gpa = new javax.swing.JTextField();
        jLabel5 = new javax.swing.JLabel();
        jLabel9 = new javax.swing.JLabel();
        jButton1 = new javax.swing.JButton();
        jSpinner1 = new javax.swing.JSpinner();
        jSpinner2 = new javax.swing.JSpinner();
        jButton3 = new javax.swing.JButton();
        fn = new javax.swing.JTextField();
        ln = new javax.swing.JTextField();
        pa = new javax.swing.JTextField();
        jLabel10 = new javax.swing.JLabel();
        p1 = new javax.swing.JTextField();
        jLabel11 = new javax.swing.JLabel();
        p2 = new javax.swing.JTextField();
        jLabel12 = new javax.swing.JLabel();
        adress = new javax.swing.JTextField();
        jLabel13 = new javax.swing.JLabel();
        de = new javax.swing.JTextField();
        delet = new javax.swing.JButton();
        jButton2 = new javax.swing.JButton();
        jLabel14 = new javax.swing.JLabel();
        idn = new javax.swing.JTextField();
        jButton4 = new javax.swing.JButton();
        jPanel4 = new javax.swing.JPanel();
        jScrollPane5 = new javax.swing.JScrollPane();
        jTextAreafeedback = new javax.swing.JTextArea();
        jButton6 = new javax.swing.JButton();
        jLabel23 = new javax.swing.JLabel();
        jPanelfb = new javax.swing.JPanel();
        jButton5 = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jTabbedPane2.setBackground(new java.awt.Color(255, 255, 255));
        jTabbedPane2.setBorder(javax.swing.BorderFactory.createTitledBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 51, 255), 5), "Students", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Tahoma", 0, 48), new java.awt.Color(0, 0, 255))); // NOI18N
        jTabbedPane2.setFont(new java.awt.Font("Tahoma", 0, 24)); // NOI18N
        jTabbedPane2.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jTabbedPane2MouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                jTabbedPane2MouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                jTabbedPane2MouseExited(evt);
            }
            public void mousePressed(java.awt.event.MouseEvent evt) {
                jTabbedPane2MousePressed(evt);
            }
            public void mouseReleased(java.awt.event.MouseEvent evt) {
                jTabbedPane2MouseReleased(evt);
            }
        });
        jTabbedPane2.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                jTabbedPane2KeyPressed(evt);
            }
            public void keyTyped(java.awt.event.KeyEvent evt) {
                jTabbedPane2KeyTyped(evt);
            }
        });

        jLabel19.setText("midterm");

        jLabel20.setText("partical");

        jLabel21.setText("final");

        fi.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                fiActionPerformed(evt);
            }
        });

        tbl1.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Number", "Attend"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, false
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        jScrollPane1.setViewportView(tbl1);

        tbl2.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Number", "Attend"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, false
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        jScrollPane2.setViewportView(tbl2);

        jLabel15.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jLabel15.setText("Lectures");

        jLabel16.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jLabel16.setText("Sections");

        tbl3.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Number", "Degree"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, false
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        jScrollPane3.setViewportView(tbl3);

        jLabel17.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jLabel17.setText("Quizes");

        tbl4.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Number", "Degree"
            }
        ));
        jScrollPane4.setViewportView(tbl4);

        jLabel18.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jLabel18.setText("Sheets");

        jLabel22.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jLabel22.setText("Courses");

        cmb1.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "Item 1", "Item 2", "Item 3", "Item 4" }));
        cmb1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cmb1ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGap(2, 2, 2)
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel19)
                            .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                                .addComponent(jLabel20, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(jLabel21, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addGap(144, 144, 144)
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(fi)
                            .addComponent(pr, javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(mi, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 216, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel15))
                        .addGap(31, 31, 31)
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel16)
                            .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 216, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(35, 35, 35)
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel17)
                            .addComponent(jScrollPane3, javax.swing.GroupLayout.PREFERRED_SIZE, 216, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(41, 41, 41)
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel18)
                            .addGroup(jPanel2Layout.createSequentialGroup()
                                .addComponent(jScrollPane4, javax.swing.GroupLayout.PREFERRED_SIZE, 216, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 120, Short.MAX_VALUE)
                                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jLabel22)
                                    .addComponent(cmb1, javax.swing.GroupLayout.PREFERRED_SIZE, 143, javax.swing.GroupLayout.PREFERRED_SIZE))))))
                .addGap(53, 53, 53))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGap(22, 22, 22)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel15)
                            .addComponent(jLabel16))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 190, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 190, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addComponent(jLabel17)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(jScrollPane3, javax.swing.GroupLayout.PREFERRED_SIZE, 190, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addComponent(jLabel18)
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel2Layout.createSequentialGroup()
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(jScrollPane4, javax.swing.GroupLayout.PREFERRED_SIZE, 190, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(jPanel2Layout.createSequentialGroup()
                                .addGap(84, 84, 84)
                                .addComponent(jLabel22)
                                .addGap(35, 35, 35)
                                .addComponent(cmb1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))))
                .addGap(50, 50, 50)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel19)
                    .addComponent(mi, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(23, 23, 23)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel20)
                    .addComponent(pr, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel21)
                    .addComponent(fi, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(55, Short.MAX_VALUE))
        );

        jTabbedPane2.addTab("my rate", jPanel2);

        jLabel1.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jLabel1.setText("user name");

        jLabel2.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jLabel2.setText("pass word");

        jLabel3.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jLabel3.setText("first name");

        jLabel4.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jLabel4.setText("level");

        jLabel6.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jLabel6.setText("last name");

        jLabel7.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jLabel7.setText("age");

        jLabel8.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jLabel8.setText("GPa");

        un.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                unActionPerformed(evt);
            }
        });
        un.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                unKeyTyped(evt);
            }
        });

        gpa.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                gpaActionPerformed(evt);
            }
        });
        gpa.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                gpaKeyTyped(evt);
            }
        });

        jLabel9.setFont(new java.awt.Font("Tahoma", 2, 18)); // NOI18N
        jLabel9.setText("        ");

        jButton1.setText("edit");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });

        jSpinner1.setModel(new javax.swing.SpinnerNumberModel(16, 16, 60, 1));

        jSpinner2.setModel(new javax.swing.SpinnerNumberModel(1, 1, 4, 1));

        jButton3.setText("submit");
        jButton3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton3ActionPerformed(evt);
            }
        });

        ln.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                lnActionPerformed(evt);
            }
        });

        pa.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                paKeyTyped(evt);
            }
        });

        jLabel10.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel10.setText("phone 1");

        p1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                p1ActionPerformed(evt);
            }
        });
        p1.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                p1KeyTyped(evt);
            }
        });

        jLabel11.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel11.setText("phone 2");

        p2.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                p2KeyTyped(evt);
            }
        });

        jLabel12.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel12.setText("adress");

        jLabel13.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel13.setText("depart");

        delet.setText("delet");
        delet.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                deletActionPerformed(evt);
            }
        });

        jButton2.setText("edit");
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });

        jLabel14.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jLabel14.setText(" id number");

        jButton4.setText("regist");
        jButton4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton4ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(39, 39, 39)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel14)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(jLabel10)
                        .addGap(112, 112, 112)
                        .addComponent(p1, javax.swing.GroupLayout.PREFERRED_SIZE, 136, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                                .addGroup(jPanel1Layout.createSequentialGroup()
                                    .addGap(255, 255, 255)
                                    .addComponent(jButton4, javax.swing.GroupLayout.PREFERRED_SIZE, 88, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addComponent(jButton3)
                                    .addGap(18, 18, 18)
                                    .addComponent(jButton1, javax.swing.GroupLayout.PREFERRED_SIZE, 82, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                    .addComponent(delet))
                                .addGroup(jPanel1Layout.createSequentialGroup()
                                    .addComponent(jLabel11, javax.swing.GroupLayout.PREFERRED_SIZE, 60, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addGap(115, 115, 115)
                                    .addComponent(p2, javax.swing.GroupLayout.PREFERRED_SIZE, 131, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addGap(69, 69, 69)
                                    .addComponent(jLabel12, javax.swing.GroupLayout.PREFERRED_SIZE, 45, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addGap(53, 53, 53)
                                    .addComponent(adress, javax.swing.GroupLayout.PREFERRED_SIZE, 132, javax.swing.GroupLayout.PREFERRED_SIZE)))
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGap(328, 328, 328)
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addComponent(jLabel5, javax.swing.GroupLayout.PREFERRED_SIZE, 459, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addGroup(jPanel1Layout.createSequentialGroup()
                                        .addGap(16, 16, 16)
                                        .addComponent(jLabel9, javax.swing.GroupLayout.PREFERRED_SIZE, 390, javax.swing.GroupLayout.PREFERRED_SIZE)))
                                .addGap(30, 30, 30)
                                .addComponent(jButton2, javax.swing.GroupLayout.PREFERRED_SIZE, 59, javax.swing.GroupLayout.PREFERRED_SIZE))))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(jLabel6, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(jLabel8, javax.swing.GroupLayout.PREFERRED_SIZE, 76, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(jLabel3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(jLabel7, javax.swing.GroupLayout.PREFERRED_SIZE, 102, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel4)
                            .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 102, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel13, javax.swing.GroupLayout.PREFERRED_SIZE, 102, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGap(139, 139, 139)
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                    .addComponent(jSpinner2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jSpinner1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGap(67, 67, 67)
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                                    .addComponent(de, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, 158, Short.MAX_VALUE)
                                    .addComponent(un, javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(gpa, javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(fn, javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(ln, javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(pa, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, 158, Short.MAX_VALUE)
                                    .addComponent(idn, javax.swing.GroupLayout.Alignment.LEADING))))))
                .addContainerGap(59, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addContainerGap(18, Short.MAX_VALUE)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(un, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(18, 18, 18)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(pa, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(12, 12, 12)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(fn, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel6, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(ln, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(18, 18, 18)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel7, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jSpinner1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(18, 18, 18)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel4, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jSpinner2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(11, 11, 11)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel8, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(gpa, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(18, 18, 18)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(de, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel13))
                        .addGap(11, 11, 11))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(jLabel5, javax.swing.GroupLayout.PREFERRED_SIZE, 273, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel9, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(jButton2))))
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(44, 44, 44)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel12)
                            .addComponent(adress, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(18, 18, 18)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(delet)
                            .addComponent(jButton1)
                            .addComponent(jButton3)))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(11, 11, 11)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel14)
                            .addComponent(idn, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(18, 18, 18)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(p1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel10)
                            .addComponent(jLabel11)
                            .addComponent(p2, javax.swing.GroupLayout.PREFERRED_SIZE, 20, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(jButton4)))
                .addGap(16, 16, 16))
        );

        jTabbedPane2.addTab("edit my data", jPanel1);

        jTextAreafeedback.setColumns(20);
        jTextAreafeedback.setRows(5);
        jScrollPane5.setViewportView(jTextAreafeedback);

        jButton6.setFont(new java.awt.Font("Tahoma", 3, 18)); // NOI18N
        jButton6.setText("submit");
        jButton6.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton6ActionPerformed(evt);
            }
        });

        jLabel23.setFont(new java.awt.Font("Tahoma", 3, 18)); // NOI18N
        jLabel23.setText("feedback");
        jLabel23.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));

        javax.swing.GroupLayout jPanelfbLayout = new javax.swing.GroupLayout(jPanelfb);
        jPanelfb.setLayout(jPanelfbLayout);
        jPanelfbLayout.setHorizontalGroup(
            jPanelfbLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 135, Short.MAX_VALUE)
        );
        jPanelfbLayout.setVerticalGroup(
            jPanelfbLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 39, Short.MAX_VALUE)
        );

        javax.swing.GroupLayout jPanel4Layout = new javax.swing.GroupLayout(jPanel4);
        jPanel4.setLayout(jPanel4Layout);
        jPanel4Layout.setHorizontalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel4Layout.createSequentialGroup()
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel4Layout.createSequentialGroup()
                        .addGap(34, 34, 34)
                        .addComponent(jLabel23)
                        .addGap(92, 92, 92)
                        .addComponent(jScrollPane5, javax.swing.GroupLayout.PREFERRED_SIZE, 367, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(65, 65, 65)
                        .addComponent(jPanelfb, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel4Layout.createSequentialGroup()
                        .addGap(300, 300, 300)
                        .addComponent(jButton6, javax.swing.GroupLayout.PREFERRED_SIZE, 103, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(519, Short.MAX_VALUE))
        );
        jPanel4Layout.setVerticalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel4Layout.createSequentialGroup()
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel4Layout.createSequentialGroup()
                        .addGap(19, 19, 19)
                        .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jScrollPane5, javax.swing.GroupLayout.PREFERRED_SIZE, 201, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel23)))
                    .addGroup(jPanel4Layout.createSequentialGroup()
                        .addGap(52, 52, 52)
                        .addComponent(jPanelfb, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(72, 72, 72)
                .addComponent(jButton6, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(128, Short.MAX_VALUE))
        );

        jTabbedPane2.addTab("feedback", jPanel4);

        jButton5.setText("back");
        jButton5.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton5ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jTabbedPane2)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jButton5)
                        .addGap(0, 0, Short.MAX_VALUE)))
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addComponent(jButton5)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jTabbedPane2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void lnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_lnActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_lnActionPerformed

    private void jButton3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton3ActionPerformed
        exption my=new exption();
        String uname=un.getText(),pass=pa.getText(),fname=fn.getText(),lname=ln.getText(),gpa1=gpa.getText(),dep=de.getText();
        String p1n=p1.getText(),p2n=p2.getText(),ad=adress.getText();
        int agem=(Integer)jSpinner1.getValue(),levelm=(Integer)jSpinner2.getValue(),flag=1;
        double gpam=1;
        if (my.checkphone(p1n) == false || my.checkphone(p2n) == false) {
            JOptionPane.showMessageDialog(null, "please enter right phone ", "data", JOptionPane.INFORMATION_MESSAGE);
        }
       else if(my.checkPassLength(pass)==false)
        {
            JOptionPane.showMessageDialog(null, "pass should contain mor than 8","data", JOptionPane.INFORMATION_MESSAGE);
        }
       else if(my.checkphone(p2n)==false&&my.checkphone(p1n)==false)
       {
           JOptionPane.showMessageDialog(null, "please enter wright phone","data", JOptionPane.INFORMATION_MESSAGE);
       }
        else{
        Student z=new Student();
       
        try{gpam=Double.parseDouble(gpa1);
            flag=1;
            if(gpam >= 5 || gpam <= 0){flag=0;JOptionPane.showMessageDialog(null, "please put write gpa","data", JOptionPane.INFORMATION_MESSAGE);}
        }
        catch(Exception e){JOptionPane.showMessageDialog(null, "please put integer only in gpa","data", JOptionPane.INFORMATION_MESSAGE);
            flag=0;
        }
        if(flag==1)
        {
            try {
                if( z.update(levelm, pass, uname, agem, sid, gpam, lname, fname,p1n,p2n,ad,dep)==3)
                {JOptionPane.showMessageDialog(null, "another user use sme user name","data", JOptionPane.INFORMATION_MESSAGE);}
                else
                {
                    JOptionPane.showMessageDialog(null, "done","data", JOptionPane.INFORMATION_MESSAGE);
                      un.setEditable(false);
        pa.setEditable(false);
        fn.setEditable(false);
        ln.setEditable(false);
        gpa.setEditable(false);
        jSpinner1.setEnabled(false);
jSpinner2.setEnabled(false);  
p1.setEditable(false);
p2.setEditable(false);
adress.setEditable(false);
de.setEditable(false);
                }
            } catch (IOException ex) {
                Logger.getLogger(StudentGui.class.getName()).log(Level.SEVERE, null, ex);
            }
        }
        }
    }//GEN-LAST:event_jButton3ActionPerformed

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
un.setEditable(true);
        pa.setEditable(true);
        fn.setEditable(true);
        ln.setEditable(true);
        gpa.setEditable(true);
        jSpinner1.setEnabled(true);
jSpinner2.setEnabled(true);  
p1.setEditable(true);p2.setEditable(true);adress.setEditable(true);de.setEditable(true);

// TODO add your handling code here:
    
        
    }//GEN-LAST:event_jButton1ActionPerformed

    private void gpaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_gpaActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_gpaActionPerformed

    private void jTabbedPane2KeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_jTabbedPane2KeyTyped
        // TODO add your handling code here:
    }//GEN-LAST:event_jTabbedPane2KeyTyped

    private void jTabbedPane2KeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_jTabbedPane2KeyPressed
     // TODO add your handling code here:
    }//GEN-LAST:event_jTabbedPane2KeyPressed

    private void unKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_unKeyTyped

        if(un.getText().length()>20)
        {
            evt.consume();
        }   
     // TODO add your handling code here:
    }//GEN-LAST:event_unKeyTyped

    private void paKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_paKeyTyped

        if(pa.getText().length()>15)
        {
            evt.consume();
        }        // TODO add your handling code here:
    }//GEN-LAST:event_paKeyTyped

    private void jTabbedPane2MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jTabbedPane2MouseClicked
       
// TODO add your handling code here:
    }//GEN-LAST:event_jTabbedPane2MouseClicked

    private void jTabbedPane2MousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jTabbedPane2MousePressed
 Student m=new Student();
   int loc=m.searchStudent(pid, "stupro.bin");
            un.setText(m.Students.get(loc).getUsername());
            pa.setText(m.Students.get(loc).getPassword());
            fn.setText(m.Students.get(loc).getFname());
            ln.setText(m.Students.get(loc).getLname());
            gpa.setText(String.valueOf(m.Students.get(loc).getGpa()));
            jSpinner1.setValue(m.Students.get(loc).getAge());
            jSpinner2.setValue(m.Students.get(loc).getLevel());
            p1.setText(m.Students.get(loc).getPhone1());
            p2.setText(m.Students.get(loc).getPhone2());
            adress.setText(m.Students.get(loc).getPhone2());
            de.setText(m.Students.get(loc).getdepart());
            String s=String.valueOf(m.Students.get(loc).getId());
            idn.setText(s);
            //de.setText(m.Students.get(loc).getDepart());
// TODO add your handling code here:
    }//GEN-LAST:event_jTabbedPane2MousePressed

    private void jTabbedPane2MouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jTabbedPane2MouseEntered
        // TODO add your handling code here:
    }//GEN-LAST:event_jTabbedPane2MouseEntered

    private void jTabbedPane2MouseReleased(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jTabbedPane2MouseReleased
        // TODO add your handling code here:
    }//GEN-LAST:event_jTabbedPane2MouseReleased

    private void jTabbedPane2MouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jTabbedPane2MouseExited
        // TODO add your handling code here:
    }//GEN-LAST:event_jTabbedPane2MouseExited

    private void p1KeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_p1KeyTyped
 char k = evt.getKeyChar();
        if (!(Character.isDigit(k)) || (k == KeyEvent.VK_BACK_SPACE) || (k == KeyEvent.VK_DELETE)) {
            evt.consume();
        }
        if (p1.getText().length() > 10) {
            evt.consume();
        }          // TODO add your handling code here:
    }//GEN-LAST:event_p1KeyTyped

    private void p2KeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_p2KeyTyped
 char k = evt.getKeyChar();
        if (!(Character.isDigit(k)) || (k == KeyEvent.VK_BACK_SPACE) || (k == KeyEvent.VK_DELETE)) {
            evt.consume();
        }
        if (p2.getText().length() > 10) {
            evt.consume();
        }          // TODO add your handling code here:
    }//GEN-LAST:event_p2KeyTyped

    private void gpaKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_gpaKeyTyped
char k = evt.getKeyChar();
        if (!(Character.isDigit(k)) || (k == KeyEvent.VK_BACK_SPACE) || (k == KeyEvent.VK_DELETE)) {
            evt.consume();
        }      // TODO add your handling code here:
    }//GEN-LAST:event_gpaKeyTyped

    private void deletActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_deletActionPerformed
        // TODO add your handling code here:
        Student ob=new Student();
       int selectedOption= JOptionPane.showConfirmDialog(null, "Do you delet this", "Choose", JOptionPane.YES_NO_OPTION); 
if (selectedOption == JOptionPane.YES_OPTION)
{
     int x=ob.searchStudent(pid, "stupro.bin");
        ob.Students.remove(x);
            try {
                ob.commitToFile("stupro.bin");
            } catch (IOException ex) {
                Logger.getLogger(StudentGui.class.getName()).log(Level.SEVERE, null, ex);
            }
        this.dispose();
        admingui ob1=new admingui(aid,"f");
}

    }//GEN-LAST:event_deletActionPerformed

    private void unActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_unActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_unActionPerformed

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
       // TODO add your han.sdling code here:
        Student m=new Student();
      int loc=  m.searchStudent(pid,"photo.bin");
       if(loc==-1)
       {

        try {
             JFileChooser ch=new JFileChooser();
ch.showOpenDialog(null);
File  h=ch.getSelectedFile();
String f=h.getAbsolutePath();    
Student obj=new Student(pid, f, f, f, f, pid,f, f,f, pid, pid);
obj.loadFromFile("photo.bin");
 obj.Students.add(obj);
            obj.commitToFile("photo.bin");
            ImageIcon icon = new ImageIcon(f);
jLabel5.setIcon(icon);
Dimension imageSize = new Dimension(icon.getIconWidth(), icon.getIconHeight());
jLabel5.setPreferredSize(imageSize);
         validate();
        } catch (IOException ex) {
            Logger.getLogger(StudentGui.class.getName()).log(Level.SEVERE, null, ex);
        }

       }
       else
       {
           try{    
           JFileChooser ch=new JFileChooser();
           ch.showOpenDialog(null);
           File  h=ch.getSelectedFile();
           if(h.getAbsolutePath()!=null)
           {
           String f=h.getAbsolutePath();
            Student obj=new Student(pid, f, null, null, null, 0, null, null, null, 0, 0);
           obj.loadFromFile("photo.bin");
           obj.Students.set(loc, obj);
           ImageIcon icon = new ImageIcon(f);
           jLabel5.setIcon(icon);
           Dimension imageSize = new Dimension(icon.getIconWidth(), icon.getIconHeight());
           jLabel5.setPreferredSize(imageSize);
           validate();
           obj.commitToFile("photo.bin");
            }
          }
           catch (IOException mo) {
               Logger.getLogger(StudentGui.class.getName()).log(Level.SEVERE, null, mo);
           }
           
       }
    }//GEN-LAST:event_jButton2ActionPerformed

    private void p1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_p1ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_p1ActionPerformed

    private void fiActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_fiActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_fiActionPerformed

    private void jButton4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton4ActionPerformed
        ListCourse m=new ListCourse(pid,aid );
    }//GEN-LAST:event_jButton4ActionPerformed

    private void jButton5ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton5ActionPerformed
        // TODO add your handling code here:
        if(this.a==null)
        {this.dispose();
            opening x=new opening();}
        else if(this.a.equalsIgnoreCase("admin"))
        {this.dispose();admingui m=new admingui(aid,"f");}

    }//GEN-LAST:event_jButton5ActionPerformed

    private void cmb1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cmb1ActionPerformed
        funshowdegree(pid, cmb1.getSelectedItem().toString());
    }//GEN-LAST:event_cmb1ActionPerformed

    private void jButton6ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton6ActionPerformed
        // TODO add your handling code here:
        jTextAreafeedback.getText();
        feedback x=new feedback(jTextAreafeedback.getText(),pid);
        if(x.addfeedback()){
            jPanelfb.setToolTipText("thank you ");
            jTextAreafeedback.setText("");
        }
    }//GEN-LAST:event_jButton6ActionPerformed

    private void SubmitActionPerformed(java.awt.event.ActionEvent evt) {                                       
    }
    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        /* Set the Nimbus look and feel */
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
         */
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(StudentGui.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(StudentGui.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(StudentGui.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(StudentGui.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new StudentGui(1,null,1).setVisible(true);
            }
        });
    }
    protected void reset (){
        un.setText("");
        pa.setText("");
        gpa.setText("");
        jSpinner1.setValue(16);
         jSpinner2.setValue(1);
        fn.setText("");
        ln.setText("");
        gpa.setText("");
        de.setText("");
        p1.setText("");
        p2.setText("");
        adress.setText("");
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JTextField adress;
    private javax.swing.JComboBox<String> cmb1;
    private javax.swing.JTextField de;
    private javax.swing.JButton delet;
    private javax.swing.JTextField fi;
    private javax.swing.JTextField fn;
    private javax.swing.JTextField gpa;
    private javax.swing.JTextField idn;
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton2;
    private javax.swing.JButton jButton3;
    private javax.swing.JButton jButton4;
    private javax.swing.JButton jButton5;
    private javax.swing.JButton jButton6;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel13;
    private javax.swing.JLabel jLabel14;
    private javax.swing.JLabel jLabel15;
    private javax.swing.JLabel jLabel16;
    private javax.swing.JLabel jLabel17;
    private javax.swing.JLabel jLabel18;
    private javax.swing.JLabel jLabel19;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel20;
    private javax.swing.JLabel jLabel21;
    private javax.swing.JLabel jLabel22;
    private javax.swing.JLabel jLabel23;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel4;
    private javax.swing.JPanel jPanelfb;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JScrollPane jScrollPane3;
    private javax.swing.JScrollPane jScrollPane4;
    private javax.swing.JScrollPane jScrollPane5;
    private javax.swing.JSpinner jSpinner1;
    private javax.swing.JSpinner jSpinner2;
    private javax.swing.JTabbedPane jTabbedPane2;
    private javax.swing.JTextArea jTextAreafeedback;
    private javax.swing.JTextField ln;
    private javax.swing.JTextField mi;
    private javax.swing.JTextField p1;
    private javax.swing.JTextField p2;
    private javax.swing.JTextField pa;
    private javax.swing.JTextField pr;
    private javax.swing.JTable tbl1;
    private javax.swing.JTable tbl2;
    private javax.swing.JTable tbl3;
    private javax.swing.JTable tbl4;
    private javax.swing.JTextField un;
    // End of variables declaration//GEN-END:variables
}
