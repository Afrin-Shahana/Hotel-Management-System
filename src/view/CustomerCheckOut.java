//import java.sql.*;
/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package view;
import com.itextpdf.text.Paragraph;
import com.itextpdf.text.pdf.PdfPTable;
import com.itextpdf.text.pdf.PdfWriter;
import java.io.FileOutputStream;
import java.sql.*;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;
import project.*;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.io.File;

/**
 *
 * @author HP
 */
public class CustomerCheckOut extends javax.swing.JFrame {

    /** Creates new form CustomerCheckOut */
    public CustomerCheckOut() {
        initComponents();
        
        jTextField2.setEditable(false);
        jTextField3.setEditable(false);
        jTextField4.setEditable(false);
        jTextField5.setEditable(false);
        jTextField6.setEditable(false);
        jTextField7.setEditable(false);
        jTextField8.setEditable(false);
        jTextField9.setEditable(false);
        
    }
     int id=0;
     String Query;
     String roomType;
     String bed;
     String roomNo;
     
    /** This method is called from within the constructor to
     * initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is
     * always regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel1 = new javax.swing.JLabel();
        jButton1 = new javax.swing.JButton();
        jLabel2 = new javax.swing.JLabel();
        jTextField1 = new javax.swing.JTextField();
        jButton2 = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        jTable1 = new javax.swing.JTable();
        jLabel3 = new javax.swing.JLabel();
        jTextField2 = new javax.swing.JTextField();
        jLabel4 = new javax.swing.JLabel();
        jTextField3 = new javax.swing.JTextField();
        jLabel5 = new javax.swing.JLabel();
        jTextField4 = new javax.swing.JTextField();
        jLabel6 = new javax.swing.JLabel();
        jTextField5 = new javax.swing.JTextField();
        jLabel7 = new javax.swing.JLabel();
        jTextField6 = new javax.swing.JTextField();
        jLabel8 = new javax.swing.JLabel();
        jTextField7 = new javax.swing.JTextField();
        jLabel9 = new javax.swing.JLabel();
        jTextField8 = new javax.swing.JTextField();
        jLabel10 = new javax.swing.JLabel();
        jTextField9 = new javax.swing.JTextField();
        jButton3 = new javax.swing.JButton();
        jButton4 = new javax.swing.JButton();
        jButton5 = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setLocation(new java.awt.Point(50, 118));
        setUndecorated(true);
        addComponentListener(new java.awt.event.ComponentAdapter() {
            public void componentShown(java.awt.event.ComponentEvent evt) {
                formComponentShown(evt);
            }
        });
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel1.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
        jLabel1.setText("Customer Check Out");
        getContentPane().add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(38, 32, 260, 37));

        jButton1.setBackground(new java.awt.Color(255, 102, 102));
        jButton1.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jButton1.setText("Close");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });
        getContentPane().add(jButton1, new org.netbeans.lib.awtextra.AbsoluteConstraints(1157, 31, 99, 48));

        jLabel2.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jLabel2.setText("Room Number");
        getContentPane().add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(350, 101, -1, -1));

        jTextField1.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        getContentPane().add(jTextField1, new org.netbeans.lib.awtextra.AbsoluteConstraints(520, 98, 187, -1));

        jButton2.setBackground(new java.awt.Color(255, 102, 102));
        jButton2.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jButton2.setText("Search");
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });
        getContentPane().add(jButton2, new org.netbeans.lib.awtextra.AbsoluteConstraints(747, 97, -1, -1));

        jTable1.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "ID", "Name", "Mobile Number", "Nationality", "Gender", "Email", "ID Proof", "Address", "Check In Date", "Room Number", "Bed", "Room Type", "Price Per Day"
            }
        ));
        jScrollPane1.setViewportView(jTable1);

        getContentPane().add(jScrollPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 394, 1246, 190));

        jLabel3.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jLabel3.setText("Customer Name");
        getContentPane().add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(38, 164, -1, -1));

        jTextField2.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        getContentPane().add(jTextField2, new org.netbeans.lib.awtextra.AbsoluteConstraints(38, 185, 250, -1));

        jLabel4.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jLabel4.setText("Check In Date");
        getContentPane().add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(323, 164, -1, -1));

        jTextField3.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        getContentPane().add(jTextField3, new org.netbeans.lib.awtextra.AbsoluteConstraints(323, 185, 250, -1));

        jLabel5.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jLabel5.setText("Check Out Date(Today)");
        getContentPane().add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(618, 164, -1, -1));

        jTextField4.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        getContentPane().add(jTextField4, new org.netbeans.lib.awtextra.AbsoluteConstraints(618, 185, 250, -1));

        jLabel6.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jLabel6.setText("Customer Mobile Number");
        getContentPane().add(jLabel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(917, 164, -1, -1));

        jTextField5.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        getContentPane().add(jTextField5, new org.netbeans.lib.awtextra.AbsoluteConstraints(917, 185, 250, -1));

        jLabel7.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jLabel7.setText("Price Per Day");
        getContentPane().add(jLabel7, new org.netbeans.lib.awtextra.AbsoluteConstraints(38, 242, -1, -1));

        jTextField6.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        getContentPane().add(jTextField6, new org.netbeans.lib.awtextra.AbsoluteConstraints(38, 268, 250, -1));

        jLabel8.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jLabel8.setText("Number Of Day Stay");
        getContentPane().add(jLabel8, new org.netbeans.lib.awtextra.AbsoluteConstraints(323, 242, -1, -1));

        jTextField7.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        getContentPane().add(jTextField7, new org.netbeans.lib.awtextra.AbsoluteConstraints(323, 268, 250, -1));

        jLabel9.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jLabel9.setText("Total Amount to Collect From Customer");
        getContentPane().add(jLabel9, new org.netbeans.lib.awtextra.AbsoluteConstraints(618, 242, -1, -1));

        jTextField8.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        getContentPane().add(jTextField8, new org.netbeans.lib.awtextra.AbsoluteConstraints(618, 268, 250, -1));

        jLabel10.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jLabel10.setText("Email");
        getContentPane().add(jLabel10, new org.netbeans.lib.awtextra.AbsoluteConstraints(917, 242, -1, -1));

        jTextField9.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        getContentPane().add(jTextField9, new org.netbeans.lib.awtextra.AbsoluteConstraints(917, 268, 250, -1));

        jButton3.setBackground(new java.awt.Color(255, 102, 102));
        jButton3.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jButton3.setText("Check Out");
        jButton3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton3ActionPerformed(evt);
            }
        });
        getContentPane().add(jButton3, new org.netbeans.lib.awtextra.AbsoluteConstraints(38, 317, -1, -1));

        jButton4.setBackground(new java.awt.Color(255, 102, 102));
        jButton4.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jButton4.setText("Clear");
        jButton4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton4ActionPerformed(evt);
            }
        });
        getContentPane().add(jButton4, new org.netbeans.lib.awtextra.AbsoluteConstraints(187, 317, -1, -1));

        jButton5.setForeground(new java.awt.Color(153, 153, 153));
        getContentPane().add(jButton5, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 600, 1370, 190));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        // TODO add your handling code here:
        setVisible(false);
    }//GEN-LAST:event_jButton1ActionPerformed

    private void formComponentShown(java.awt.event.ComponentEvent evt) {//GEN-FIRST:event_formComponentShown
        // TODO add your handling code here:
        ResultSet rs=select.getData("select *from customer where checkout is NULL");
        DefaultTableModel model=(DefaultTableModel)jTable1.getModel();
        try{
        while(rs.next()){
        
        model.addRow(new Object[]{rs.getString(1),rs.getString(2),rs.getString(3),rs.getString(4),rs.getString(5),rs.getString(6),rs.getString(7),rs.getString(8),rs.getString(9),rs.getString(10),rs.getString(11),rs.getString(12),rs.getString(13),});
        }
        rs.close();
        }
        catch(Exception e){
        
        //JOptionPane.showMessageDaialog(null,e);
         JOptionPane.showMessageDialog(null, e);
        }
        
    }//GEN-LAST:event_formComponentShown

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
        // TODO add your handling code here:
        String roomNo=jTextField1.getText();
        try{
        ResultSet rs=select.getData("select *from customer where roomNo='"+roomNo+"' and checkout is NULL");
        if(rs.next()){
            
            //search e user paua gele dsbl
        jTextField1.setEditable(false);
        id=rs.getInt(1);  
        jTextField2.setText(rs.getString(2));//mysql new rtable er 2nd place e name ase
        jTextField3.setText(rs.getString(9));
        
        jTextField5.setText(rs.getString(3));
        jTextField6.setText(rs.getString(13));
        
        SimpleDateFormat myformat=new SimpleDateFormat("yyyy/MM/dd");
        Calendar cal=Calendar.getInstance();
        jTextField4.setText(myformat.format(cal.getTime()));
        String dateBeforeString=rs.getString(9);
            java.util.Date dateBefore=myformat.parse(dateBeforeString);
            String dateAfterString=myformat.format(cal.getTime());
            java.util.Date dateAfter=myformat.parse(dateAfterString);
            long difference=dateAfter.getTime() - dateBefore.getTime();
            int noOfDayStay=(int)(difference/(1000*60*60*24));
            if(noOfDayStay==0)
            {
            noOfDayStay=1;
            jTextField7.setText(String.valueOf(noOfDayStay));
            float price=Float.parseFloat(jTextField6.getText());
            jTextField8.setText(String.valueOf(noOfDayStay*price));
            jTextField9.setText(rs.getString(6));
            roomType=rs.getString(12);
            bed=rs.getString(11);
         
            }
            else{
            JOptionPane.showMessageDialog(null, "Room Number is not Booked or Room Number Doesn't Exist");
            }
        }
        
        }
        catch(Exception e){
        
         JOptionPane.showMessageDialog(null, e);
        }
    }//GEN-LAST:event_jButton2ActionPerformed

    private void jButton3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton3ActionPerformed
        // TODO add your handling code here:
        String name=jTextField2.getText();
        String mobileNumber=jTextField5.getText();
        String email=jTextField9.getText();
        
        String checkOut=jTextField4.getText();
        String numberOfDayStay=jTextField7.getText();
        String totalAmount=jTextField8.getText();
        roomNo=jTextField1.getText();
        Query="update customer set numberOfDaysStay='"+numberOfDayStay+"',totalAmount='"+totalAmount+"',checkout='"+checkOut+"' where id='"+id+"'";
        InsertUpdateDelete.setData(Query, "");
        Query="update room set Status='Not Booked' where roomNo='"+roomNo+"'";
        InsertUpdateDelete.setData(Query, "");
        String path="E:\\";//ekhane itext.jar file add korte bolsay
       com.itextpdf.text.Document doc=new com.itextpdf.text.Document();
       try{
           PdfWriter.getInstance(doc, new FileOutputStream(path+""+id+".pdf"));
           
       doc.open();
       Paragraph paragraph1=new Paragraph("                                    HOTEL MANAGEMENT SYSTEM\n");
       doc.add(paragraph1);
       
       Paragraph paragraph2=new Paragraph("                                    ******************************************************************************************************");
       doc.add(paragraph2);
       
       Paragraph paragraph3=new Paragraph("\tBill ID: "+id+"\nCustomer Details:\nName:"+name+"\name:"+name+"\nMobile number: "+mobileNumber+"\nEmail:"+email+"\n");
       doc.add(paragraph3);
       doc.add(paragraph2);
        Paragraph paragraph4=new Paragraph("\tRoom Details:\nNumber: "+jTextField1.getText()+"\nType: "+roomType+"\nBed: "+bed+"\nPrice Per Day: "+jTextField6.getText()+"");
       doc.add(paragraph4);
       doc.add(paragraph2);
           PdfPTable tb1=new PdfPTable(4);
       tb1.addCell("Check IN Date: "+jTextField3.getText());
       tb1.addCell("Check OUT Date: "+checkOut);
       tb1.addCell("No Of Day Stay: "+numberOfDayStay);
       tb1.addCell("Total Amount Paid: "+totalAmount);
       doc.add(tb1);
       doc.add(paragraph2);
        Paragraph paragraph5=new Paragraph("Thank You,Please Visit Again. ");
       doc.add(paragraph5);
       
       
       }
       catch(Exception e){
       JOptionPane.showMessageDialog(null, e);
       }
       doc.close();//till now created pdf
       int a=JOptionPane.showConfirmDialog(null, "Do you want to Print Bill","select",JOptionPane.YES_NO_OPTION);
       
       if(a==0){
       try{
       
       if((new File("E:\\"+id+".pdf")).exists()){
       Process p=Runtime
               .getRuntime()
                .exec("rundll32 url.dll,FileProtocolHandler E:\\"+id+".pdf");
       }
       else
           System.out.println("File not Exists");
       
       }
       catch(Exception e){
       
       JOptionPane.showInternalMessageDialog(null, e);
       }
       
       }
       //to refresh page
       setVisible(false);
       new CustomerCheckOut().setVisible(true);
       
    }//GEN-LAST:event_jButton3ActionPerformed

    private void jButton4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton4ActionPerformed
        // TODO add your handling code here:
        setVisible(false);
        new CustomerCheckOut().setVisible(true);
    }//GEN-LAST:event_jButton4ActionPerformed

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
            java.util.logging.Logger.getLogger(CustomerCheckOut.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(CustomerCheckOut.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(CustomerCheckOut.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(CustomerCheckOut.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new CustomerCheckOut().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton2;
    private javax.swing.JButton jButton3;
    private javax.swing.JButton jButton4;
    private javax.swing.JButton jButton5;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTable jTable1;
    private javax.swing.JTextField jTextField1;
    private javax.swing.JTextField jTextField2;
    private javax.swing.JTextField jTextField3;
    private javax.swing.JTextField jTextField4;
    private javax.swing.JTextField jTextField5;
    private javax.swing.JTextField jTextField6;
    private javax.swing.JTextField jTextField7;
    private javax.swing.JTextField jTextField8;
    private javax.swing.JTextField jTextField9;
    // End of variables declaration//GEN-END:variables

}