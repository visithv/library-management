/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.libraryman.libmanagement;

import javax.swing.JOptionPane;

/**
 *
 * @author Visith Vimansana
 */
public class AddNewBookDialog extends javax.swing.JFrame {

    /**
     * Creates new form AddNewBookDialog
     */
    public AddNewBookDialog() {
        initComponents();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel1 = new javax.swing.JLabel();
        booktitle_txt = new javax.swing.JTextField();
        author_txt = new javax.swing.JTextField();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        description_txt = new javax.swing.JTextArea();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        bookid_txt = new javax.swing.JTextField();
        jLabel6 = new javax.swing.JLabel();
        published_year_txt = new javax.swing.JTextField();
        jButton1 = new javax.swing.JButton();
        jButton2 = new javax.swing.JButton();
        jPanel1 = new javax.swing.JPanel();
        jLabel7 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Add New Book");
        setBackground(new java.awt.Color(255, 255, 255));
        setResizable(false);

        jLabel1.setFont(new java.awt.Font("Google Sans", 1, 12)); // NOI18N
        jLabel1.setText("Book Title");

        booktitle_txt.setFont(new java.awt.Font("Google Sans", 0, 11)); // NOI18N
        booktitle_txt.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                booktitle_txtActionPerformed(evt);
            }
        });

        author_txt.setFont(new java.awt.Font("Google Sans", 0, 11)); // NOI18N

        jLabel2.setFont(new java.awt.Font("Google Sans", 1, 12)); // NOI18N
        jLabel2.setText("Author Name");

        jLabel3.setFont(new java.awt.Font("Google Sans", 1, 12)); // NOI18N
        jLabel3.setText("Book Description");

        description_txt.setColumns(20);
        description_txt.setLineWrap(true);
        description_txt.setRows(5);
        jScrollPane1.setViewportView(description_txt);

        jLabel4.setFont(new java.awt.Font("Google Sans", 0, 10)); // NOI18N
        jLabel4.setText("(255 letters max)");

        jLabel5.setFont(new java.awt.Font("Google Sans", 1, 12)); // NOI18N
        jLabel5.setText("Book ID");

        bookid_txt.setFont(new java.awt.Font("Google Sans", 0, 11)); // NOI18N
        bookid_txt.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                bookid_txtActionPerformed(evt);
            }
        });

        jLabel6.setFont(new java.awt.Font("Google Sans", 1, 12)); // NOI18N
        jLabel6.setText("Book Published Year");

        published_year_txt.setFont(new java.awt.Font("Google Sans", 0, 11)); // NOI18N

        jButton1.setFont(new java.awt.Font("Google Sans", 0, 12)); // NOI18N
        jButton1.setIcon(new javax.swing.ImageIcon("C:\\Users\\Visith Vimansana\\Desktop\\icon-close-512.png")); // NOI18N
        jButton1.setText(" Cancel");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });

        jButton2.setFont(new java.awt.Font("Google Sans", 0, 12)); // NOI18N
        jButton2.setIcon(new javax.swing.ImageIcon("C:\\Users\\Visith Vimansana\\Desktop\\add.png")); // NOI18N
        jButton2.setText("  Add Book");
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });

        jPanel1.setBackground(new java.awt.Color(55, 159, 202));

        jLabel7.setFont(new java.awt.Font("Google Sans", 1, 12)); // NOI18N
        jLabel7.setForeground(new java.awt.Color(255, 255, 255));
        jLabel7.setText("LIBRARY MANAGEMENT SYSTEM");

        jLabel8.setFont(new java.awt.Font("Google Sans", 1, 24)); // NOI18N
        jLabel8.setForeground(new java.awt.Color(255, 255, 255));
        jLabel8.setText("ADD NEW BOOK");

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(24, 24, 24)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jLabel7)
                    .addComponent(jLabel8))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(20, 20, 20)
                .addComponent(jLabel7)
                .addGap(1, 1, 1)
                .addComponent(jLabel8)
                .addContainerGap(18, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(bookid_txt)
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(booktitle_txt)
                    .addComponent(author_txt)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jLabel3)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(jLabel4))
                    .addComponent(published_year_txt)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel5)
                            .addComponent(jLabel1)
                            .addComponent(jLabel2)
                            .addComponent(jLabel6)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(jButton1, javax.swing.GroupLayout.PREFERRED_SIZE, 162, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jButton2, javax.swing.GroupLayout.PREFERRED_SIZE, 174, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addGap(0, 0, Short.MAX_VALUE)))
                .addContainerGap())
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(jLabel5)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(bookid_txt, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(9, 9, 9)
                .addComponent(jLabel1)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(booktitle_txt, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jLabel2)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(author_txt, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel3)
                    .addComponent(jLabel4))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jLabel6)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(published_year_txt, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(46, 46, 46)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jButton1, javax.swing.GroupLayout.PREFERRED_SIZE, 48, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jButton2, javax.swing.GroupLayout.PREFERRED_SIZE, 48, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap())
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void booktitle_txtActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_booktitle_txtActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_booktitle_txtActionPerformed

    private void bookid_txtActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_bookid_txtActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_bookid_txtActionPerformed

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        this.dispose();
    }//GEN-LAST:event_jButton1ActionPerformed

    public static boolean isInteger(String str) {
        if (str == null) {
            return false;
        }
        int length = str.length();
        if (length == 0) {
            return false;
        }
        int i = 0;
        if (str.charAt(0) == '-') {
            if (length == 1) {
                return false;
            }
            i = 1;
        }
        for (; i < length; i++) {
            char c = str.charAt(i);
            if (c < '0' || c > '9') {
                return false;
            }
        }
        return true;
    }
    
    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
        // validate input
        boolean valid = true;
        
        int bookid = 0;
        String title = "";
        String description = "";
        String author = "";
        int published = 0;
        
        // validate bookid
        if (!"".equals(bookid_txt.getText().strip()))
        {
            if (isInteger(bookid_txt.getText()))
            {
                bookid = Integer.parseInt(bookid_txt.getText());
            } else {
                valid = false;
            }
        } else {
            valid = false;
            JOptionPane.showMessageDialog(null, "Please enter a valid Book ID", "Add new book", JOptionPane.WARNING_MESSAGE);
        }
        
        // validate book title
        if (!"".equals(booktitle_txt.getText().strip()) && booktitle_txt.getText().length() < 100)
        {
            title = booktitle_txt.getText();
        } else {
            valid = false;
            JOptionPane.showMessageDialog(null, "Please enter a valid book title.", "Add new book", JOptionPane.WARNING_MESSAGE);
        }
        
        // validate book description
        if (!"".equals(description_txt.getText().strip()) && description_txt.getText().length() < 255)
        {
            description = description_txt.getText();
        } else {
            valid = false;
            JOptionPane.showMessageDialog(null, "Please enter a valid description.", "Add new book", JOptionPane.WARNING_MESSAGE);
        }
        
        if (!"".equals(author_txt.getText().strip()) && author_txt.getText().length() < 100)
        {
            author = author_txt.getText();
        } else {
            valid = false;
            JOptionPane.showMessageDialog(null, "Please enter a valid author name.", "Add new book", JOptionPane.WARNING_MESSAGE);
        }
        
        if (!"".equals(published_year_txt.getText().strip()))
        {
            if (isInteger(published_year_txt.getText()))
            {
                published = Integer.parseInt(published_year_txt.getText());
            } else {
                valid = false;
            }        
        } else {
            valid = false;
            JOptionPane.showMessageDialog(null, "Please enter a valid year for the published year.", "Add new book", JOptionPane.WARNING_MESSAGE);
        }
        
        if (valid)
        {
            Book b = new Book();
            b.title = title;
            b.description = description;
            b.author = author;
            b.published = published;
            b.availability = true;
            b.bookId = bookid;
            
            // all details are valid
            Database.addBook(b);
            this.dispose();
        }
    }//GEN-LAST:event_jButton2ActionPerformed

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
            java.util.logging.Logger.getLogger(AddNewBookDialog.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(AddNewBookDialog.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(AddNewBookDialog.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(AddNewBookDialog.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new AddNewBookDialog().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JTextField author_txt;
    private javax.swing.JTextField bookid_txt;
    private javax.swing.JTextField booktitle_txt;
    private javax.swing.JTextArea description_txt;
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton2;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTextField published_year_txt;
    // End of variables declaration//GEN-END:variables
}
