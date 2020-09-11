package blood;

import java.awt.HeadlessException;
import java.awt.event.KeyEvent;
//import java.io.FileOutputStream;
import java.sql.*;
import java.text.DateFormat;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.GregorianCalendar;
import java.util.logging.Level;
import java.util.logging.Logger;
import javafxapplication1.JavaFXApplication1;
import javax.swing.*;

/**
 * b
 *
 * @author Kaushal
 */
public class homeblood extends javax.swing.JFrame {

    public homeblood() {
        initComponents();
    }
    private static final DateFormat df = new SimpleDateFormat("yyyy/MM/dd");

    private static java.util.Date getDate(String date) throws ParseException {
        return df.parse(date);
    }

    private static long daysBetween(java.util.Date one, java.util.Date two) {
        long difference = (one.getTime() - two.getTime()) / 86400000;
        return Math.abs(difference);
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jPanel2 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        jLabel9 = new javax.swing.JLabel();
        jLabel10 = new javax.swing.JLabel();
        dname = new javax.swing.JTextField();
        demail = new javax.swing.JTextField();
        dnumber = new javax.swing.JTextField();
        dpincode = new javax.swing.JTextField();
        daddress = new javax.swing.JTextField();
        ddistrict = new javax.swing.JTextField();
        dblood = new javax.swing.JComboBox<>();
        dgender = new javax.swing.JComboBox<>();
        date = new javax.swing.JTextField();
        month = new javax.swing.JTextField();
        year = new javax.swing.JTextField();
        mm = new javax.swing.JTextField();
        yy = new javax.swing.JTextField();
        dd = new javax.swing.JTextField();
        jButton1 = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setTitle("DONOR DETAIL");

        jPanel1.setBackground(javax.swing.UIManager.getDefaults().getColor("Button.shadow"));

        jPanel2.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "Donor Detail's", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Tahoma", 1, 14))); // NOI18N

        jLabel1.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jLabel1.setText("NAME OF DONOR");

        jLabel2.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jLabel2.setText("GENDER");

        jLabel3.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jLabel3.setText("DATE OF BIRTH");

        jLabel4.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jLabel4.setText("EMAIL");

        jLabel5.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jLabel5.setText("DISTRICT");

        jLabel6.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jLabel6.setText("PINCODE");

        jLabel7.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jLabel7.setText("ADDRESS");

        jLabel8.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jLabel8.setText("CONTACT NUMBER");

        jLabel9.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jLabel9.setText("BLOOD GROUP TYPE");

        jLabel10.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jLabel10.setText("PREVIOUS BLOOD GROUP DONATION DATE");

        dname.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        dname.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                dnameActionPerformed(evt);
            }
        });

        demail.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N

        dnumber.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        dnumber.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                dnumberKeyTyped(evt);
            }
        });

        dpincode.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        dpincode.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                dpincodeActionPerformed(evt);
            }
        });
        dpincode.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                dpincodeKeyTyped(evt);
            }
        });

        daddress.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N

        ddistrict.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N

        dblood.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        dblood.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "SELECT", "A+", "A-", "B+", "B-", "O+", "O-", "AB+", "AB-" }));

        dgender.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        dgender.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "SELECT", "MALE", "FEMALE", "OTHER" }));

        date.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        date.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                dateKeyTyped(evt);
            }
        });

        month.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        month.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                monthKeyTyped(evt);
            }
        });

        year.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        year.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                yearKeyTyped(evt);
            }
        });

        mm.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        mm.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                mmKeyTyped(evt);
            }
        });

        yy.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        yy.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                yyKeyTyped(evt);
            }
        });

        dd.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        dd.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                ddKeyTyped(evt);
            }
        });

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel2Layout.createSequentialGroup()
                                .addGap(10, 10, 10)
                                .addComponent(jLabel7)
                                .addGap(284, 284, 284)
                                .addComponent(jLabel8))
                            .addGroup(jPanel2Layout.createSequentialGroup()
                                .addContainerGap()
                                .addComponent(daddress, javax.swing.GroupLayout.PREFERRED_SIZE, 290, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(80, 80, 80)
                                .addComponent(dnumber, javax.swing.GroupLayout.PREFERRED_SIZE, 250, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addGap(87, 87, 87)
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel2Layout.createSequentialGroup()
                                .addGap(10, 10, 10)
                                .addComponent(dblood, javax.swing.GroupLayout.PREFERRED_SIZE, 112, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addComponent(jLabel9)))
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGap(10, 10, 10)
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel2Layout.createSequentialGroup()
                                .addComponent(jLabel4)
                                .addGap(312, 312, 312)
                                .addComponent(jLabel5)
                                .addGap(249, 249, 249)
                                .addComponent(jLabel6))
                            .addGroup(jPanel2Layout.createSequentialGroup()
                                .addComponent(demail, javax.swing.GroupLayout.PREFERRED_SIZE, 296, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(74, 74, 74)
                                .addComponent(ddistrict, javax.swing.GroupLayout.PREFERRED_SIZE, 252, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(87, 87, 87)
                                .addComponent(dpincode, javax.swing.GroupLayout.PREFERRED_SIZE, 185, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addComponent(jLabel10)
                            .addGroup(jPanel2Layout.createSequentialGroup()
                                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jLabel1)
                                    .addComponent(dname, javax.swing.GroupLayout.PREFERRED_SIZE, 296, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGap(74, 74, 74)
                                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jLabel2)
                                    .addComponent(dgender, javax.swing.GroupLayout.PREFERRED_SIZE, 112, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGap(227, 227, 227)
                                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(jPanel2Layout.createSequentialGroup()
                                        .addComponent(date, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addComponent(month, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addComponent(year, javax.swing.GroupLayout.PREFERRED_SIZE, 73, javax.swing.GroupLayout.PREFERRED_SIZE))
                                    .addComponent(jLabel3)))
                            .addGroup(jPanel2Layout.createSequentialGroup()
                                .addGap(10, 10, 10)
                                .addComponent(dd, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(mm, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(yy, javax.swing.GroupLayout.PREFERRED_SIZE, 73, javax.swing.GroupLayout.PREFERRED_SIZE)))))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGap(11, 11, 11)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel1)
                    .addComponent(jLabel2)
                    .addComponent(jLabel3))
                .addGap(6, 6, 6)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(date, javax.swing.GroupLayout.DEFAULT_SIZE, 34, Short.MAX_VALUE)
                    .addComponent(dname)
                    .addComponent(dgender)
                    .addComponent(month)
                    .addComponent(year))
                .addGap(18, 18, 18)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel4)
                    .addComponent(jLabel5)
                    .addComponent(jLabel6))
                .addGap(6, 6, 6)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(demail, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(ddistrict, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(dpincode, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel7)
                    .addComponent(jLabel8)
                    .addComponent(jLabel9))
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGap(6, 6, 6)
                        .addComponent(dblood, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(daddress, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(dnumber))))
                .addGap(14, 14, 14)
                .addComponent(jLabel10)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(dd)
                    .addComponent(mm)
                    .addComponent(yy, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(28, Short.MAX_VALUE))
        );

        jButton1.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
        jButton1.setText("DONATE");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(382, 382, 382)
                        .addComponent(jButton1))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(jButton1)
                .addContainerGap(80, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        try {
            PreparedStatement st;
            String st1 = "";
            Connection con = DriverManager.getConnection("jdbc:mysql://localhost:8080/a", "root", "");
            String string = "insert into donor values(?,?,?,?,?,?,?,?,?,?,default)";
            st = con.prepareStatement(string);
            st.setString(1, dname.getText());
            Object i = dgender.getSelectedItem();
            st.setString(2, (String) i);
            st.setString(3, year.getText() + month.getText() + date.getText());
            /*DateFormat date = new SimpleDateFormat("MM");
            Calendar cal = Calendar.getInstance();
            System.out.println(date.format(cal.getTime()));
            int ij =Integer.parseInt(date.format(cal.getTime())) ;
            if (cal.get(Calendar.DAY_OF_MONTH)<ij) {
            
            }*/
            boolean status = email_validation.emailaildation(demail.getText());
            if (status) {
                st.setString(4, demail.getText());
            } else {
                JOptionPane.showMessageDialog(null, "Email is Not Correct");
            }
            st.setString(5, ddistrict.getText());
            st.setString(6, dpincode.getText());
            boolean statusss = addressvalidate.address(daddress.getText());
            if (statusss) {
                st.setString(7, daddress.getText());
            } else {
                JOptionPane.showMessageDialog(null, "Address is Not Correct");
            }
            long numberOfDays = 0, dob = 0;
            DateFormat dateFormat = new SimpleDateFormat("yyyy/MM/dd");
            java.util.Date first;
            java.util.Date first2;
            try {
                first2 = new SimpleDateFormat("dd/MM/yyyy").parse(date.getText() + "/" + month.getText() + "/" + year.getText());
                first = new SimpleDateFormat("dd/MM/yyyy").parse(dd.getText() + "/" + mm.getText() + "/" + yy.getText());
                System.out.println(dateFormat.format(first));

                Calendar cal = new GregorianCalendar();
                java.util.Date one = getDate(dateFormat.format(first));
                java.util.Date one1 = getDate(dateFormat.format(first2));
                java.util.Date date = new java.util.Date();
                java.util.Date two = getDate(dateFormat.format(date));
                numberOfDays = daysBetween(one, two);
                dob = daysBetween(one1, two);
            } catch (ParseException ex) {
                JOptionPane.showMessageDialog(null, ex);
            }
            if (dob >= 6570) {
                if (numberOfDays >= 91) {
                    System.out.println("you are eligible");

                    boolean statuss = mobile.mobilevaildation(dnumber.getText());
                    if (statuss) {
                        st.setString(8, dnumber.getText());
                    } else {
                        JOptionPane.showMessageDialog(null, "Please Check Your Mobile no");
                    }
                    Object bt = dblood.getSelectedItem();
                    st.setString(9, (String) bt);
                    st.setString(10, yy.getText() + mm.getText() + dd.getText());
                    if (!i.equals("SELECT")) {
                        if (!bt.equals("SELECT")) {
                            st.executeUpdate();
                            JOptionPane.showMessageDialog(null, "THANK YOU FOR BLOOD DONOATION ");
                            Pdf d = new Pdf();
                            d.PDF();
                            int dpin = Integer.parseInt(dpincode.getText());
                            if (dpin > 160001 && dpin < 160031) {
                                st1 = "update searchh set quantity=quantity+1 where bloodgorup = ? and state=? and city='Sector-32'";
                                st = con.prepareStatement(st1);
                                st.setString(1, (String) bt);
                                st.setString(2, ddistrict.getText());
                                st.executeUpdate();
                            } else if (dpin > 160031 && dpin < 160061) {
                                st1 = "update searchh set quantity=quantity+1 where bloodgorup = ? and state=? and city='P.G.I'";
                                st = con.prepareStatement(st1);
                                st.setString(1, (String) bt);
                                st.setString(2, ddistrict.getText());
                                st.executeUpdate();
                            } else if (dpin > 160061 && dpin < 160091) {
                                st1 = "update searchh set quantity=quantity+1 where bloodgorup = ? and state=? and city='Sector-16";
                                st = con.prepareStatement(st1);
                                st.setString(1, (String) bt);
                                st.setString(2, ddistrict.getText());
                                st.executeUpdate();
                            } else {
                                st1 = "update searchh set quantity=quantity+1 where bloodgorup = ? and state=?";
                                st = con.prepareStatement(st1);
                                st.setString(1, (String) bt);
                                st.setString(2, ddistrict.getText());
                                st.executeUpdate();
                            }
                            new Thread() {
                                @Override
                                public void run() {
                                    javafx.application.Application.launch(JavaFXApplication1.class);//application.Application.launch(StartUpTest.class);
                                }
                            }.start();
                        } else {
                            JOptionPane.showMessageDialog(null, "SELECT BLOOD GROUP ");
                        }
                    } else {
                        JOptionPane.showMessageDialog(null, "SELECT GENDER ");
                    }
                } else {
                    JOptionPane.showMessageDialog(null, "you are not eligible");
                }
            } else {
                JOptionPane.showMessageDialog(null, "you are not eligible -18");
            }
        } catch (SQLException | HeadlessException e) {
            JOptionPane.showMessageDialog(null, e.getMessage());
        }


    }//GEN-LAST:event_jButton1ActionPerformed

    private void dpincodeKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_dpincodeKeyTyped
        char c = evt.getKeyChar();
        if (!(Character.isDigit(c) || (c == KeyEvent.VK_BACK_SPACE) || (c == KeyEvent.VK_DELETE))) {
            getToolkit().beep();
            evt.consume();
        }
    }//GEN-LAST:event_dpincodeKeyTyped

    private void dnumberKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_dnumberKeyTyped
        char c = evt.getKeyChar();
        if (!(Character.isDigit(c) || (c == KeyEvent.VK_BACK_SPACE) || (c == KeyEvent.VK_DELETE))) {
            getToolkit().beep();
            evt.consume();
        }
    }//GEN-LAST:event_dnumberKeyTyped

    private void dateKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_dateKeyTyped
        char c = evt.getKeyChar();
        if (!(Character.isDigit(c) || (c == KeyEvent.VK_BACK_SPACE) || (c == KeyEvent.VK_DELETE))) {
            getToolkit().beep();
            evt.consume();
        }
    }//GEN-LAST:event_dateKeyTyped

    private void monthKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_monthKeyTyped
        char c = evt.getKeyChar();
        if (!(Character.isDigit(c) || (c == KeyEvent.VK_BACK_SPACE) || (c == KeyEvent.VK_DELETE))) {
            getToolkit().beep();
            evt.consume();
        }
    }//GEN-LAST:event_monthKeyTyped

    private void yearKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_yearKeyTyped
        char c = evt.getKeyChar();
        if (!(Character.isDigit(c) || (c == KeyEvent.VK_BACK_SPACE) || (c == KeyEvent.VK_DELETE))) {
            getToolkit().beep();
            evt.consume();
        }
    }//GEN-LAST:event_yearKeyTyped

    private void ddKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_ddKeyTyped
        char c = evt.getKeyChar();
        if (!(Character.isDigit(c) || (c == KeyEvent.VK_BACK_SPACE) || (c == KeyEvent.VK_DELETE))) {
            getToolkit().beep();
            evt.consume();
        }
    }//GEN-LAST:event_ddKeyTyped

    private void mmKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_mmKeyTyped
        char c = evt.getKeyChar();
        if (!(Character.isDigit(c) || (c == KeyEvent.VK_BACK_SPACE) || (c == KeyEvent.VK_DELETE))) {
            getToolkit().beep();
            evt.consume();
        }
    }//GEN-LAST:event_mmKeyTyped

    private void yyKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_yyKeyTyped
        char c = evt.getKeyChar();
        if (!(Character.isDigit(c) || (c == KeyEvent.VK_BACK_SPACE) || (c == KeyEvent.VK_DELETE))) {
            getToolkit().beep();
            evt.consume();
        }
    }//GEN-LAST:event_yyKeyTyped

    private void dpincodeActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_dpincodeActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_dpincodeActionPerformed

    private void dnameActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_dnameActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_dnameActionPerformed

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
            java.util.logging.Logger.getLogger(homeblood.class
                    .getName()).log(java.util.logging.Level.SEVERE, null, ex);

        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(homeblood.class
                    .getName()).log(java.util.logging.Level.SEVERE, null, ex);

        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(homeblood.class
                    .getName()).log(java.util.logging.Level.SEVERE, null, ex);

        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(homeblood.class
                    .getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new homeblood().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JTextField daddress;
    private javax.swing.JTextField date;
    private javax.swing.JComboBox<String> dblood;
    private javax.swing.JTextField dd;
    private javax.swing.JTextField ddistrict;
    private javax.swing.JTextField demail;
    private javax.swing.JComboBox<String> dgender;
    public static javax.swing.JTextField dname;
    private javax.swing.JTextField dnumber;
    private javax.swing.JTextField dpincode;
    private javax.swing.JButton jButton1;
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
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JTextField mm;
    private javax.swing.JTextField month;
    private javax.swing.JTextField year;
    private javax.swing.JTextField yy;
    // End of variables declaration//GEN-END:variables

}
