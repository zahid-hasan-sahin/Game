/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package tictactoe;

import java.awt.Image;
import java.util.concurrent.TimeUnit;
import javax.swing.ImageIcon;
import javax.swing.JOptionPane;

public class GameMulti extends javax.swing.JFrame {

    /**
     * Creates new form SetUp
     */
    boolean turn = true;
    int[][] matrix = new int[3][3];
    boolean stop = false;

    public GameMulti() {

        initComponents();
        setResizable(false);
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                setVisible(true);
            }
        });
        gameLogic();

    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        buttonGroup1 = new javax.swing.ButtonGroup();
        jPanel1 = new javax.swing.JPanel();
        jPanel3 = new javax.swing.JPanel();
        jPanel5 = new javax.swing.JPanel();
        jPanel2 = new javax.swing.JPanel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        jLabel9 = new javax.swing.JLabel();
        jLabel10 = new javax.swing.JLabel();
        jLabel11 = new javax.swing.JLabel();
        jButton1 = new javax.swing.JButton();
        jButton2 = new javax.swing.JButton();
        jButton3 = new javax.swing.JButton();
        jSeparator1 = new javax.swing.JSeparator();
        jLabel1 = new javax.swing.JLabel();
        jLabel12 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setLocation(new java.awt.Point(250, 30));
        setMinimumSize(new java.awt.Dimension(750, 650));
        getContentPane().setLayout(null);

        jPanel1.setBackground(new java.awt.Color(255, 255, 255));
        jPanel1.setBorder(javax.swing.BorderFactory.createTitledBorder(""));
        getContentPane().add(jPanel1);
        jPanel1.setBounds(160, 170, 370, 10);

        jPanel3.setBackground(new java.awt.Color(255, 255, 255));
        jPanel3.setBorder(javax.swing.BorderFactory.createTitledBorder(""));
        getContentPane().add(jPanel3);
        jPanel3.setBounds(160, 300, 370, 10);

        jPanel5.setBackground(new java.awt.Color(255, 255, 255));
        jPanel5.setBorder(javax.swing.BorderFactory.createTitledBorder(""));
        getContentPane().add(jPanel5);
        jPanel5.setBounds(260, 90, 10, 310);

        jPanel2.setBackground(new java.awt.Color(255, 255, 255));
        jPanel2.setBorder(javax.swing.BorderFactory.createTitledBorder(""));
        getContentPane().add(jPanel2);
        jPanel2.setBounds(410, 90, 10, 310);

        jLabel3.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel3.setAlignmentY(0.0F);
        jLabel3.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabel3MouseClicked(evt);
            }
        });
        jLabel3.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                jLabel3KeyPressed(evt);
            }
            public void keyReleased(java.awt.event.KeyEvent evt) {
                jLabel3KeyReleased(evt);
            }
        });
        getContentPane().add(jLabel3);
        jLabel3.setBounds(120, 60, 140, 110);

        jLabel4.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel4.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabel4MouseClicked(evt);
            }
        });
        getContentPane().add(jLabel4);
        jLabel4.setBounds(270, 60, 140, 110);

        jLabel5.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel5.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabel5MouseClicked(evt);
            }
        });
        getContentPane().add(jLabel5);
        jLabel5.setBounds(420, 60, 150, 110);

        jLabel6.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel6.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabel6MouseClicked(evt);
            }
        });
        getContentPane().add(jLabel6);
        jLabel6.setBounds(120, 180, 140, 120);

        jLabel7.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel7.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabel7MouseClicked(evt);
            }
        });
        getContentPane().add(jLabel7);
        jLabel7.setBounds(270, 180, 140, 120);

        jLabel8.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel8.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabel8MouseClicked(evt);
            }
        });
        getContentPane().add(jLabel8);
        jLabel8.setBounds(420, 180, 140, 120);

        jLabel9.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel9.setToolTipText("");
        jLabel9.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabel9MouseClicked(evt);
            }
        });
        getContentPane().add(jLabel9);
        jLabel9.setBounds(420, 310, 140, 100);

        jLabel10.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel10.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabel10MouseClicked(evt);
            }
        });
        getContentPane().add(jLabel10);
        jLabel10.setBounds(270, 310, 140, 100);

        jLabel11.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel11.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabel11MouseClicked(evt);
            }
        });
        getContentPane().add(jLabel11);
        jLabel11.setBounds(120, 310, 140, 100);

        jButton1.setText("Reset");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });
        getContentPane().add(jButton1);
        jButton1.setBounds(180, 460, 80, 40);

        jButton2.setText("Close");
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });
        getContentPane().add(jButton2);
        jButton2.setBounds(300, 460, 80, 40);

        jButton3.setText("Back");
        jButton3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton3ActionPerformed(evt);
            }
        });
        getContentPane().add(jButton3);
        jButton3.setBounds(420, 460, 80, 40);

        jSeparator1.setBackground(new java.awt.Color(255, 255, 255));
        getContentPane().add(jSeparator1);
        jSeparator1.setBounds(220, 50, 270, 20);

        jLabel1.setFont(new java.awt.Font("Sitka Text", 1, 24)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(255, 255, 255));
        jLabel1.setText("Multiplayer Mode");
        getContentPane().add(jLabel1);
        jLabel1.setBounds(260, 10, 260, 40);

        jLabel12.setFont(new java.awt.Font("Sitka Subheading", 1, 18)); // NOI18N
        jLabel12.setForeground(new java.awt.Color(255, 153, 153));
        jLabel12.setText("Turn: Player1");
        getContentPane().add(jLabel12);
        jLabel12.setBounds(20, 50, 140, 50);

        jLabel2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/tictactoe/bg.jpg"))); // NOI18N
        getContentPane().add(jLabel2);
        jLabel2.setBounds(0, -10, 750, 650);

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jLabel3KeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_jLabel3KeyPressed

    }//GEN-LAST:event_jLabel3KeyPressed

    private void jLabel3KeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_jLabel3KeyReleased
        // TODO add your handling code here:
    }//GEN-LAST:event_jLabel3KeyReleased

    private void jLabel3MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel3MouseClicked
        if (jLabel3.getIcon() == null && turn) {
            jLabel3.setIcon(new javax.swing.ImageIcon(getClass().getResource("/tictactoe/o.png")));
            matrix[0][0] = 1;
            turn = !turn;
            jLabel12.setText("Turn: Player2");
        } else if (jLabel3.getIcon() == null) {
            jLabel3.setIcon(new javax.swing.ImageIcon(getClass().getResource("/tictactoe/x.png")));
            matrix[0][0] = 2;
            turn = !turn;
            jLabel12.setText("Turn: Player1");
        }
        gameLogic();

    }//GEN-LAST:event_jLabel3MouseClicked

    private void jLabel4MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel4MouseClicked
        if (jLabel4.getIcon() == null && turn) {
            jLabel4.setIcon(new javax.swing.ImageIcon(getClass().getResource("/tictactoe/o.png")));
            matrix[0][1] = 1;
            turn = !turn;
            jLabel12.setText("Turn: Player2");
        } else if (jLabel4.getIcon() == null) {
            jLabel4.setIcon(new javax.swing.ImageIcon(getClass().getResource("/tictactoe/x.png")));
            matrix[0][1] = 2;
            turn = !turn;
            jLabel12.setText("Turn: Player1");
        }
        gameLogic();
    }//GEN-LAST:event_jLabel4MouseClicked

    private void jLabel5MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel5MouseClicked
        if (jLabel5.getIcon() == null && turn) {
            jLabel5.setIcon(new javax.swing.ImageIcon(getClass().getResource("/tictactoe/o.png")));
            matrix[0][2] = 1;
            turn = !turn;
            jLabel12.setText("Turn: Player2");
        } else if (jLabel5.getIcon() == null) {
            jLabel5.setIcon(new javax.swing.ImageIcon(getClass().getResource("/tictactoe/x.png")));
            matrix[0][2] = 2;
            turn = !turn;
            jLabel12.setText("Turn: Player1");
        }
        gameLogic();
    }//GEN-LAST:event_jLabel5MouseClicked

    private void jLabel6MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel6MouseClicked
        if (jLabel6.getIcon() == null && turn) {
            jLabel6.setIcon(new javax.swing.ImageIcon(getClass().getResource("/tictactoe/o.png")));
            matrix[1][0] = 1;
            turn = !turn;
            jLabel12.setText("Turn: Player2");
        } else if (jLabel6.getIcon() == null) {
            jLabel6.setIcon(new javax.swing.ImageIcon(getClass().getResource("/tictactoe/x.png")));
            matrix[1][0] = 2;
            turn = !turn;
            jLabel12.setText("Turn: Player1");
        }
        gameLogic();
    }//GEN-LAST:event_jLabel6MouseClicked

    private void jLabel7MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel7MouseClicked
        if (jLabel7.getIcon() == null && turn) {
            jLabel7.setIcon(new javax.swing.ImageIcon(getClass().getResource("/tictactoe/o.png")));
            matrix[1][1] = 1;
            turn = !turn;
            jLabel12.setText("Turn: Player2");
        } else if (jLabel7.getIcon() == null) {
            jLabel7.setIcon(new javax.swing.ImageIcon(getClass().getResource("/tictactoe/x.png")));
            matrix[1][1] = 2;
            turn = !turn;
            jLabel12.setText("Turn: Player1");
        }
        gameLogic();

    }//GEN-LAST:event_jLabel7MouseClicked

    private void jLabel8MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel8MouseClicked
        if (jLabel8.getIcon() == null && turn) {
            jLabel8.setIcon(new javax.swing.ImageIcon(getClass().getResource("/tictactoe/o.png")));
            matrix[1][2] = 1;
            turn = !turn;
            jLabel12.setText("Turn: Player2");
        } else if (jLabel8.getIcon() == null) {
            jLabel8.setIcon(new javax.swing.ImageIcon(getClass().getResource("/tictactoe/x.png")));
            matrix[1][2] = 2;
            turn = !turn;
            jLabel12.setText("Turn: Player1");
        }
        gameLogic();

    }//GEN-LAST:event_jLabel8MouseClicked

    private void jLabel11MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel11MouseClicked
        if (jLabel11.getIcon() == null && turn) {
            jLabel11.setIcon(new javax.swing.ImageIcon(getClass().getResource("/tictactoe/o.png")));
            matrix[2][0] = 1;
            turn = !turn;
            jLabel12.setText("Turn: Player2");
        } else if (jLabel11.getIcon() == null) {
            jLabel11.setIcon(new javax.swing.ImageIcon(getClass().getResource("/tictactoe/x.png")));
            matrix[2][0] = 2;
            turn = !turn;
            jLabel12.setText("Turn: Player1");
        }
        gameLogic();
    }//GEN-LAST:event_jLabel11MouseClicked

    private void jLabel10MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel10MouseClicked
        if (jLabel10.getIcon() == null && turn) {
            jLabel10.setIcon(new javax.swing.ImageIcon(getClass().getResource("/tictactoe/o.png")));
            matrix[2][1] = 1;
            turn = !turn;
            jLabel12.setText("Turn: Player2");
        } else if (jLabel10.getIcon() == null) {
            jLabel10.setIcon(new javax.swing.ImageIcon(getClass().getResource("/tictactoe/x.png")));
            matrix[2][1] = 2;
            turn = !turn;
            jLabel12.setText("Turn: Player1");
        }
        gameLogic();
    }//GEN-LAST:event_jLabel10MouseClicked

    private void jLabel9MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel9MouseClicked
        if (jLabel9.getIcon() == null && turn) {
            jLabel9.setIcon(new javax.swing.ImageIcon(getClass().getResource("/tictactoe/o.png")));
            matrix[2][2] = 1;
            turn = !turn;
            jLabel12.setText("Turn: Player2");
        } else if (jLabel9.getIcon() == null) {
            jLabel9.setIcon(new javax.swing.ImageIcon(getClass().getResource("/tictactoe/x.png")));
            matrix[2][2] = 2;
            turn = !turn;
            jLabel12.setText("Turn: Player1");
        }
        gameLogic();

    }//GEN-LAST:event_jLabel9MouseClicked

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed

        this.dispose();
        new GameMulti().setVisible(true);

    }//GEN-LAST:event_jButton1ActionPerformed

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed

        System.exit(0);

    }//GEN-LAST:event_jButton2ActionPerformed

    private void jButton3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton3ActionPerformed
        // TODO add your handling code here:
        stop = true;
        this.dispose();
        new SetUp().setVisible(true);
    }//GEN-LAST:event_jButton3ActionPerformed

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
            java.util.logging.Logger.getLogger(GameMulti.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(GameMulti.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(GameMulti.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(GameMulti.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>
        GameMulti ob = new GameMulti();
        /* Create and display the form */

    }

    boolean checkRow() {
        for (int i = 0; i < 3; i++) {
            int me = 0;
            int other = 0;
            for (int j = 0; j < 3; j++) {
                if (matrix[i][j] == 1) {
                    ++me;
                } else if (matrix[i][j] == 2) {
                    ++other;
                }
            }
            if (me == 3) {
                JOptionPane.showMessageDialog(null, "Player1 Won", "Player1", JOptionPane.INFORMATION_MESSAGE);
                this.dispose();
                new GameMulti().setVisible(true);
                return true;

            }
            if (other == 3) {
                JOptionPane.showMessageDialog(null, "Player2 Won", "Player2", JOptionPane.ERROR_MESSAGE);
                this.dispose();
                new GameMulti().setVisible(true);
                return true;

            }
        }
        return false;
    }

    boolean checkCol() {
        for (int i = 0; i < 3; i++) {
            int me = 0;
            int other = 0;
            for (int j = 0; j < 3; j++) {
                if (matrix[j][i] == 1) {
                    ++me;
                } else if (matrix[j][i] == 2) {
                    ++other;
                }
            }
            if (me == 3) {
                JOptionPane.showMessageDialog(null, "Player1 Won", "Player1", JOptionPane.INFORMATION_MESSAGE);

                this.dispose();
                new GameMulti().setVisible(true);

                return true;

            }
            if (other == 3) {
                JOptionPane.showMessageDialog(null, "Player2 Won", "Player2", JOptionPane.ERROR_MESSAGE);

                this.dispose();
                new GameMulti().setVisible(true);

                return true;

            }
        }
        return false;
    }

    boolean checkDig() {

        int me = 0;
        int other = 0;
        for (int i = 0; i < 3; i++) {
            if (matrix[i][i] == 1) {
                ++me;
            }
            if (matrix[i][i] == 2) {
                ++other;
            }
        }

        if (me == 3) {
            JOptionPane.showMessageDialog(null, "Player1 Won", "Player1", JOptionPane.INFORMATION_MESSAGE);
            this.dispose();
            new GameMulti().setVisible(true);

            return true;

        }
        if (other == 3) {
            JOptionPane.showMessageDialog(null, "Player2 Won", "Player2", JOptionPane.ERROR_MESSAGE);
            this.dispose();
            new GameMulti().setVisible(true);

            return true;
        }

        me = 0;
        other = 0;
        for (int i = 0, j = 2; i < 3; i++, j--) {
            if (matrix[i][j] == 1) {
                ++me;
            }
            if (matrix[i][j] == 2) {
                ++other;
            }
        }
        if (me == 3) {
            JOptionPane.showMessageDialog(null, "Player1 Won", "Player1", JOptionPane.INFORMATION_MESSAGE);
            this.dispose();
            new GameMulti().setVisible(true);

            return true;
        }
        if (other == 3) {
            JOptionPane.showMessageDialog(null, "Player2 Won", "Player2", JOptionPane.ERROR_MESSAGE);
            this.dispose();
            new GameMulti().setVisible(true);

            return true;

        }
        return false;
    }

    boolean check() {
        if (checkDig() || checkRow() || checkCol()) {
            return true;
        }
        return false;
    }

    boolean isDraw() {
        int c = 0;
        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {
                if (matrix[i][j] != 0) {
                    ++c;
                }
            }
        }
        return c == 9;
    }

    void gameLogic() {

        boolean ch = check();
        if (ch) {
            return;
        }
        if (stop) {
            this.dispose();
            new GameMulti().setVisible(true);
            return;
        }
        if (isDraw()) {
            JOptionPane.showMessageDialog(null, "Match Draw", "Draw", JOptionPane.INFORMATION_MESSAGE);
            this.dispose();
            new GameMulti().setVisible(true);
        }
    }
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.ButtonGroup buttonGroup1;
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton2;
    private javax.swing.JButton jButton3;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel12;
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
    private javax.swing.JPanel jPanel3;
    private javax.swing.JPanel jPanel5;
    private javax.swing.JSeparator jSeparator1;
    // End of variables declaration//GEN-END:variables
}
