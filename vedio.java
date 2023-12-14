/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package vedio.rental;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.PrintStream;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.ResultSetMetaData;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.Scanner;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;
import static javax.swing.JOptionPane.*;

/**
 *
 * @author master
 */

public class vedio extends javax.swing.JFrame {
    private Connection  con;
    private Statement  state;
    ResultSet   rs=null;
    ResultSetMetaData meta=null;
    private String vedioName,length,rate,dateRelesed,dateReturnd;
    private String vedioNum;
     private Connection  getALink() throws SQLException
    {                       
        String Drv= "sun.jdbc.odbc.JdbcOdbcDriver";              
        String URL ="jdbc:odbc:video";
        try {
            Class.forName(Drv);
        } catch (ClassNotFoundException ex) {
            Logger.getLogger(vedio.class.getName()).log(Level.SEVERE, null, ex);
        }
        return DriverManager.getConnection(URL);
    }
     public void readData() throws Exception{
     Scanner in= new Scanner(new File("E:\\test\\write.txt"));
     String id = null;
     String name=null;
     String Length =null;
     String Rate =null;
     String DateOfRentel =null;
     String DateOfReturn =null;
     String DateReleased =null;
     String Customer =null;
     String catagory =null;
     
     if(in.hasNext()){
          id=in.next();
    name=in.next();
     Length =in.next();
     Rate =in.next();
     DateReleased =in.next();
     catagory =in.next();
     // DateOfRentel =in.next();
     // DateOfReturn =in.next();
     // Customer =in.next();
      
     
     }  //area.setText(id);
     System.out.print(Length);
     area.append(length);
     // area.append(name);
     }
    
     
    public vedio() throws SQLException {
        
        initComponents();
        con=getALink();
       
        System.out.println("connection done");
    }
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jScrollPane1 = new javax.swing.JScrollPane();
        area = new javax.swing.JTextArea();
        jMenuBar1 = new javax.swing.JMenuBar();
        Menu1 = new javax.swing.JMenu();
        imorttt = new javax.swing.JMenuItem();
        export = new javax.swing.JMenuItem();
        exist = new javax.swing.JMenuItem();
        Menu2 = new javax.swing.JMenu();
        add = new javax.swing.JMenuItem();
        delete = new javax.swing.JMenuItem();
        searchForVid = new javax.swing.JMenuItem();
        rent = new javax.swing.JMenuItem();
        returnvidio = new javax.swing.JMenuItem();
        searchForCus = new javax.swing.JMenuItem();
        display = new javax.swing.JMenuItem();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        area.setEditable(false);
        area.setColumns(20);
        area.setRows(5);
        area.setBorder(javax.swing.BorderFactory.createTitledBorder("display information"));
        jScrollPane1.setViewportView(area);

        Menu1.setText("File");

        imorttt.setText("import");
        imorttt.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                imortttActionPerformed(evt);
            }
        });
        Menu1.add(imorttt);

        export.setText("export");
        export.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                exportActionPerformed(evt);
            }
        });
        Menu1.add(export);

        exist.setText("exsit");
        exist.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                existActionPerformed(evt);
            }
        });
        Menu1.add(exist);

        jMenuBar1.add(Menu1);

        Menu2.setText("Options");

        add.setText("Add a new video");
        add.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                addActionPerformed(evt);
            }
        });
        Menu2.add(add);

        delete.setText("Delete a video");
        delete.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                deleteActionPerformed(evt);
            }
        });
        Menu2.add(delete);

        searchForVid.setText("Search for a video");
        searchForVid.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                searchForVidActionPerformed(evt);
            }
        });
        Menu2.add(searchForVid);

        rent.setText("rent a video");
        rent.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                rentActionPerformed(evt);
            }
        });
        Menu2.add(rent);

        returnvidio.setText("return a video");
        returnvidio.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                returnvidioActionPerformed(evt);
            }
        });
        Menu2.add(returnvidio);

        searchForCus.setText("search for a customer");
        searchForCus.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                searchForCusActionPerformed(evt);
            }
        });
        Menu2.add(searchForCus);

        display.setText("Display All");
        display.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                displayActionPerformed(evt);
            }
        });
        Menu2.add(display);

        jMenuBar1.add(Menu2);

        setJMenuBar(jMenuBar1);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 388, Short.MAX_VALUE)
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 271, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void imortttActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_imortttActionPerformed
        try {
            // TODO add your handling code here:
            readData();
        } catch (Exception ex) {
            Logger.getLogger(vedio.class.getName()).log(Level.SEVERE, null, ex);
        }
    }//GEN-LAST:event_imortttActionPerformed

    private void exportActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_exportActionPerformed
        // TODO add your handling code here:
        PrintStream fp;
            
            try {
                area.setText("saving data in a file");
                fp = new PrintStream("E:\\test\\write.txt");
                System.setOut(fp);
                con = getALink();
                state = con.createStatement();
                rs = state.executeQuery("select * from vv");
                while (rs.next()) {
                    System.out.println("number:" + rs.getInt("number") + "     "
                            + "Movie Name:" + rs.getString("MovieName") + "     "
                            + "\n"
                            + "Length:" + rs.getString("Length") + "     "
                            + "Rate:" + rs.getInt("Rate") + "     "
                            + "Date released:" + rs.getString("DateReleased") + "     "
                            + "Category:" + rs.getString("Category") + "     "
                            + "\n"
                            + "Date of rental:" + rs.getString("DateOfRental") + "     "
                            + "Date of return:" + rs.getString("DateOfReturn") + "     "
                            + "Name of customer:" + rs.getString("NameOfCustomer") + "     ");

                }
            } catch (Exception a) {
            }
    }//GEN-LAST:event_exportActionPerformed

    private void existActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_existActionPerformed

        dispose();
    }//GEN-LAST:event_existActionPerformed

    private void addActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_addActionPerformed
          
            new movi(); 
            area.setText("\nOne row is add\n\n");
       
    }//GEN-LAST:event_addActionPerformed

    private void deleteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_deleteActionPerformed
        try {
            area.setText(" ");
            Object s=JOptionPane.showInputDialog(this,"Please enter the Number of vedio you want to Delete it :" );
            con = getALink();
            state = con.createStatement();
            rs=state.executeQuery("select * from vv where number = "+s);
if(rs.next()==true){
 state.execute("delete from vv where number = "+s);
                area.append("deleted");}
else {
    System.err.println("The record is not exist !!");
    area.setText("The Number of vedio Not Found !!!");
}      
       }
       
                catch (SQLException ex) {
            Logger.getLogger(vedio.class.getName()).log(Level.SEVERE, null, ex);
        }

    }//GEN-LAST:event_deleteActionPerformed

    private void searchForVidActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_searchForVidActionPerformed
        try {
            // TODO add your handling code here:
            String s=JOptionPane.showInputDialog(this,"Please enter the Number of vedio you want to search about it :" );
            con = getALink();
            state = con.createStatement();
            rs = state.executeQuery("select * from vv where number = "+ s);
           if(rs.next()==true){
            area.setText("the vedio is found \n ");
           }
            else{
            area.setText("the vedio Not found !!");
               }
            }
         catch (SQLException ex) {
            Logger.getLogger(vedio.class.getName()).log(Level.SEVERE, null, ex);
}
        
    }//GEN-LAST:event_searchForVidActionPerformed
boolean search(int id) throws Exception{
    
            Connection con = getALink();
            Statement state = con.createStatement();
          ResultSet   rs = state.executeQuery("select * from vv where number = "+ id);
            if(rs.next()==true){
                return true;
            }
            else{
                return false;
            }
        
     //   return false;
    }
    private void rentActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_rentActionPerformed
       area.setText((" "));
     
        try {
            
            // TODO add your handling code here:
            String id=showInputDialog(this, "Enter the Number Of Movi you want to rent :");
            if(search(Integer.parseInt(id))==true){
                 try{
             Connection con = getALink();
                Statement state = con.createStatement();

                ResultSet rs = state.executeQuery("select * from vv where number = "+id +" and DateOfRental = ' '");
               
               if (rs.next()== true) {
                   String ss= rs.getString("DateOfRental");
                new Rent(id);
                System.out.println(ss);
                }
                else{
                showMessageDialog(this, "This Number Of Movi Is Already Rented ! ", ICON_PROPERTY, HEIGHT);
                 
                   
                }

            } catch (Exception ae) {
                System.out.println(ae);
               // System.out.println(ss);
            }
            
            }
            else {area.setText("THis Movi Number Not Found !!");} 
        } catch (Exception ex) {
            Logger.getLogger(vedio.class.getName()).log(Level.SEVERE, null, ex);
        }
        
    }//GEN-LAST:event_rentActionPerformed

    private void returnvidioActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_returnvidioActionPerformed
        area.setText((" "));
        try {
            
            // TODO add your handling code here:
            String id=showInputDialog(this, "Enter the Number Of Movi you want to rent :");
            if(search(Integer.parseInt(id))==true){
                 try{
             Connection con = getALink();
                Statement state = con.createStatement();

                ResultSet rs = state.executeQuery("select * from vv where number = "+id+" and DateOfReturn =' '");
               
               if (rs.next()== true) {
                   String ss= rs.getString("DateOfRental");
                  new Return(id).setVisible(true);
                System.out.println(ss);
                }
                else{
                showMessageDialog(this, "This Number Of Movi Is Already Returned ! ", ICON_PROPERTY, HEIGHT);
                 
                   
                }

            } catch (Exception ae) {
                System.out.println(ae);
               // System.out.println(ss);
            }
            
            }
            else {area.setText("THis Movi Number Not Found !!");} 
        } catch (Exception ex) {
            Logger.getLogger(vedio.class.getName()).log(Level.SEVERE, null, ex);
        }
       
    }//GEN-LAST:event_returnvidioActionPerformed

    private void searchForCusActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_searchForCusActionPerformed
        try {
            // TODO add your handling code here:
            String s=JOptionPane.showInputDialog(this,"Please enter the Name of the customer of vedio you want to search about it :" );
            con = getALink();
            state = con.createStatement();
            rs = state.executeQuery("select * from vv ");
            while(rs.next()){
                String cust=rs.getString("NameOfCustomer");
                if(s.equals(cust)){
                    area.setText("the customer is found \n ");
                }
                
                else{
                    area.setText("the customer Not found !!");
                }
                
            }
            
        } catch (SQLException ex) {
            Logger.getLogger(vedio.class.getName()).log(Level.SEVERE, null, ex);
        }


    }//GEN-LAST:event_searchForCusActionPerformed

    private void displayActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_displayActionPerformed
       area.setText("");
            
            try {
                con = getALink();
                state = con.createStatement();
                rs = state.executeQuery("select * from vv");
                String out = "";
                while (rs.next()) {
                    out += "number:" + rs.getInt("number") + "     "
                            + "Movie Name:" + rs.getString("MovieName") + "     "
                            + "\n"
                            + "Length:" + rs.getString("Length") + "     "
                            + "Rate:" + rs.getInt("Rate") + "     "
                            + "Date released:" + rs.getString("DateReleased") + "     "
                            + "Category:" + rs.getString("Category") + "     "
                            + "\n"
                            + "Date of rental:" + rs.getString("DateOfRental") + "     "
                            + "Date of return:" + rs.getString("DateOfReturn") + "     "
                            + "Name of customer:" + rs.getString("NameOfCustomer") + "     " + "\n\n"
                            + "****************\n\n";
                }
                area.setText(out);
            } catch (Exception a) {
                                      
            }
    }//GEN-LAST:event_displayActionPerformed

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
            java.util.logging.Logger.getLogger(vedio.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(vedio.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(vedio.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(vedio.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                try {
                    new vedio().setVisible(true);
                } catch (SQLException ex) {
                    Logger.getLogger(vedio.class.getName()).log(Level.SEVERE, null, ex);
                }
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JMenu Menu1;
    private javax.swing.JMenu Menu2;
    private javax.swing.JMenuItem add;
    private javax.swing.JTextArea area;
    private javax.swing.JMenuItem delete;
    private javax.swing.JMenuItem display;
    private javax.swing.JMenuItem exist;
    private javax.swing.JMenuItem export;
    private javax.swing.JMenuItem imorttt;
    private javax.swing.JMenuBar jMenuBar1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JMenuItem rent;
    private javax.swing.JMenuItem returnvidio;
    private javax.swing.JMenuItem searchForCus;
    private javax.swing.JMenuItem searchForVid;
    // End of variables declaration//GEN-END:variables
}
