package kptr;
import kptr.KPTR;
import java.awt.Color;
import javax.swing.ImageIcon;
import javax.swing.JButton;

public class KptrGUI extends javax.swing.JPanel {

    private final String animationPath = "tip.gif";
    KPTR m = new KPTR();

public KptrGUI(KPTR m) {
        initComponents();
        this.m = m;
        this.setSize(557, 500);
        lblRollInstruction.setForeground(Color.decode("906608"));
        lblChooseYourGuess.setForeground(Color.decode("906608"));
        btnOne.setEnabled(false);
        btnTwo.setEnabled(false);
        btnThree.setEnabled(false);
        btnFour.setEnabled(false);
        lblChooseYourGuess.setText(null);
        lblShowTrueGess.setText("Play The Game............");

    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        lblShowTrueGess = new javax.swing.JLabel();
        lblChooseYourGuess = new javax.swing.JLabel();
        btnSpin = new javax.swing.JButton();
        btnOne = new javax.swing.JButton();
        btnTwo = new javax.swing.JButton();
        btnThree = new javax.swing.JButton();
        btnFour = new javax.swing.JButton();

        lblResult = new javax.swing.JLabel();
        lblMinimize = new javax.swing.JLabel();
        lblExit = new javax.swing.JLabel();
        lblRollInstruction = new javax.swing.JLabel();
        jSeparator1 = new javax.swing.JSeparator();
        lblbg = new javax.swing.JLabel();

        setMaximumSize(new java.awt.Dimension(550, 500));
        setMinimumSize(new java.awt.Dimension(550, 500));
        setLayout(null);

        lblShowTrueGess.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
        lblShowTrueGess.setForeground(new java.awt.Color(51, 255, 0));
        lblShowTrueGess.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        add(lblShowTrueGess);
        lblShowTrueGess.setBounds(0, 100, 550, 180);

        lblChooseYourGuess.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        lblChooseYourGuess.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lblChooseYourGuess.setText("Choose Your Guess");
        add(lblChooseYourGuess);
        lblChooseYourGuess.setBounds(50, 310, 240, 20);

        btnSpin.setFont(new java.awt.Font("Tahoma", 1, 36)); // NOI18N
        btnSpin.setText("Roll");
        btnSpin.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btnSpin.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                btnSpinMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                btnSpinMouseExited(evt);
            }
            public void mouseReleased(java.awt.event.MouseEvent evt) {
                btnSpinMouseReleased(evt);
            }
        });
        btnSpin.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnSpinActionPerformed(evt);
            }
        });
        add(btnSpin);
        btnSpin.setBounds(375, 340, 140, 140);

        btnOne.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
        btnOne.setText("Player1");
        btnOne.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btnOne.setPreferredSize(new java.awt.Dimension(55, 55));
        btnOne.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                btnOneMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                btnOneMouseExited(evt);
            }
        });
        btnOne.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnOneActionPerformed(evt);
            }
        });
        add(btnOne);
        btnOne.setBounds(10, 340, 150, 60);
        btnOne.getAccessibleContext().setAccessibleDescription("");

        btnTwo.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
        btnTwo.setText("Player2");
        btnTwo.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btnTwo.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                btnTwoMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                btnTwoMouseExited(evt);
            }
        });
        btnTwo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnTwoActionPerformed(evt);
            }
        });
        add(btnTwo);
        btnTwo.setBounds(170, 340, 150, 60);
        btnTwo.getAccessibleContext().setAccessibleDescription("");

        btnThree.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
        btnThree.setText("Player3");
        btnThree.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btnThree.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                btnThreeMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                btnThreeMouseExited(evt);
            }
        });
        btnThree.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnThreeActionPerformed(evt);
            }
        });
        add(btnThree);
        btnThree.setBounds(10, 420, 150, 60);
        btnThree.getAccessibleContext().setAccessibleDescription("");

        btnFour.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
        btnFour.setText("Player4");
        btnFour.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btnFour.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                btnFourMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                btnFourMouseExited(evt);
            }
        });
        btnFour.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnFourActionPerformed(evt);
            }
        });
        add(btnFour);
        btnFour.setBounds(170, 420, 150, 60);
        btnFour.getAccessibleContext().setAccessibleDescription("");

      
        lblResult.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
        lblResult.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        add(lblResult);
        lblResult.setBounds(0, 60, 550, 40);

        lblMinimize.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        lblMinimize.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                lblMinimizeMouseClicked(evt);
            }
        });
        add(lblMinimize);
        lblMinimize.setBounds(450, 0, 30, 30);

        lblExit.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        lblExit.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                lblExitMouseClicked(evt);
            }
        });
        add(lblExit);
        lblExit.setBounds(500, 0, 30, 30);

        lblRollInstruction.setFont(new java.awt.Font("Tahoma", 1, 16)); // NOI18N
        lblRollInstruction.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lblRollInstruction.setText("Press roll to playing");
        add(lblRollInstruction);
        lblRollInstruction.setBounds(350, 310, 200, 20);

        jSeparator1.setOrientation(javax.swing.SwingConstants.VERTICAL);
        add(jSeparator1);
        jSeparator1.setBounds(345, 310, 10, 180);

        lblbg.setIcon(new javax.swing.ImageIcon(getClass().getResource("Dicebg.png"))); // NOI18N
        add(lblbg);
        lblbg.setBounds(0, 0, 550, 500);
    }// </editor-fold>//GEN-END:initComponents

    private void btnSpinActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnSpinActionPerformed
        spin();
        btnSpin.setEnabled(false);
        btnSpin.setForeground(Color.decode("906608"));
        lblResult.setForeground(new Color(139, 0, 139));
        lblResult.setText("Turning..........");
    }//GEN-LAST:event_btnSpinActionPerformed

    private void btnSpinMouseReleased(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnSpinMouseReleased

    }//GEN-LAST:event_btnSpinMouseReleased

    private void btnSpinMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnSpinMouseExited
        if (btnSpin.isEnabled()) {
            btnSpin.setForeground(new Color(139, 0, 139));
            btnSpin.setBackground(new Color(238, 130, 238));
        }
    }//GEN-LAST:event_btnSpinMouseExited

    private void btnSpinMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnSpinMouseEntered
        if (btnSpin.isEnabled()) {
            btnSpin.setForeground(Color.decode("906608"));
            btnSpin.setBackground(new Color(139, 0, 139));
        }
    }//GEN-LAST:event_btnSpinMouseEntered

    private void btnFourActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnFourActionPerformed
        disableButtons(btnFour);
        Dice d = new Dice(4);
        d.play(lblResult, lblShowTrueGess);
    }//GEN-LAST:event_btnFourActionPerformed

    private void btnFourMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnFourMouseExited
        if (btnFour.isEnabled()) {
            btnFour.setForeground(new Color(139, 0, 139));
            btnFour.setBackground(new Color(238, 130, 238));
        }
    }//GEN-LAST:event_btnFourMouseExited

    private void btnFourMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnFourMouseEntered
        if (btnFour.isEnabled()) {
            btnFour.setForeground(Color.decode("906608"));
            btnFour.setBackground(new Color(139, 0, 139));
        }
    }//GEN-LAST:event_btnFourMouseEntered

    private void btnThreeActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnThreeActionPerformed
        disableButtons(btnThree);
        Dice d = new Dice(3);
        d.play(lblResult, lblShowTrueGess);
    }//GEN-LAST:event_btnThreeActionPerformed

    private void btnThreeMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnThreeMouseExited
        if (btnThree.isEnabled()) {
            btnThree.setForeground(new Color(139, 0, 139));
            btnThree.setBackground(new Color(238, 130, 238));
        }
    }//GEN-LAST:event_btnThreeMouseExited

    private void btnThreeMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnThreeMouseEntered
        if (btnThree.isEnabled()) {
            btnThree.setForeground(Color.decode("906608"));
            btnThree.setBackground(new Color(139, 0, 139));
        }
    }//GEN-LAST:event_btnThreeMouseEntered

    private void btnTwoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnTwoActionPerformed
        disableButtons(btnTwo);
        lblShowTrueGess.setIcon(new ImageIcon(getClass().getResource(animationPath)));
        Dice d = new Dice(2);
        d.play(lblResult, lblShowTrueGess);

    }//GEN-LAST:event_btnTwoActionPerformed

    private void btnTwoMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnTwoMouseExited
        if (btnTwo.isEnabled()) {
            btnTwo.setForeground(new Color(139, 0, 139));
            btnTwo.setBackground(new Color(238, 130, 238));
        }
    }//GEN-LAST:event_btnTwoMouseExited

    private void btnTwoMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnTwoMouseEntered
        if (btnTwo.isEnabled()) {
            btnTwo.setForeground(Color.decode("906608"));
            btnTwo.setBackground(new Color(139, 0, 139));
        }
    }//GEN-LAST:event_btnTwoMouseEntered

    private void btnOneActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnOneActionPerformed
        disableButtons(btnOne);
        Dice d = new Dice(1);
        d.play(lblResult, lblShowTrueGess);

    }//GEN-LAST:event_btnOneActionPerformed

    private void btnOneMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnOneMouseExited
        if (btnOne.isEnabled()) {
            btnOne.setForeground(new Color(139, 0, 139));
            btnOne.setBackground(new Color(238, 130, 238));
        }
    }//GEN-LAST:event_btnOneMouseExited

    private void btnOneMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnOneMouseEntered
        if (btnOne.isEnabled()) {
            btnOne.setForeground(Color.decode("906608"));
            btnOne.setBackground(new Color(139, 0, 139));
        }
    }//GEN-LAST:event_btnOneMouseEntered

    private void lblMinimizeMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lblMinimizeMouseClicked
        m.setState(KPTR.ICONIFIED);
    }//GEN-LAST:event_lblMinimizeMouseClicked

    private void lblExitMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lblExitMouseClicked
        System.exit(0);        // TODO add your handling code here:
    }//GEN-LAST:event_lblExitMouseClicked

    private void spin() {
        //Enabling Buttons
        btnOne.setEnabled(true);
        btnTwo.setEnabled(true);
        btnThree.setEnabled(true);
        btnFour.setEnabled(true);
       
        //Changing button's Foreground color
        btnOne.setForeground(new Color(238, 130, 238));
        btnTwo.setForeground(new Color(238, 130, 238));
        btnThree.setForeground(new Color(238, 130, 238));
        btnFour.setForeground(new Color(238, 130, 238));
       
        //Changing button's background color
        btnSpin.setBackground(new Color(139, 0, 139));
        btnOne.setBackground(new Color(139, 0, 139));
        btnTwo.setBackground(new Color(139, 0, 139));
        btnThree.setBackground(new Color(139, 0, 139));
        btnFour.setBackground(new Color(139, 0, 139));
       
        //Stting spin animation
        lblShowTrueGess.setIcon(new ImageIcon(getClass().getResource(animationPath)));

        //Seting text
        lblResult.setText(null);

        //Desabiling roll label
        lblRollInstruction.setText(null);
        lblShowTrueGess.setText(null);
        //Setting text on label 
        lblChooseYourGuess.setText("*Select your Option*");
    }

    private void disableButtons(JButton btn) {
        btnOne.setEnabled(false);
        btnTwo.setEnabled(false);
        btnThree.setEnabled(false);
        btnFour.setEnabled(false);
        btnSpin.setEnabled(true);
        btn.setForeground(Color.decode("906608"));
        lblRollInstruction.setText("Press Roll to play again");
        lblChooseYourGuess.setText(null);
        btnSpin.setForeground(new Color(221, 160, 221));

    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnFour;
    private javax.swing.JButton btnOne;
    private javax.swing.JButton btnSpin;
    private javax.swing.JButton btnThree;
    private javax.swing.JButton btnTwo;
    private javax.swing.JSeparator jSeparator1;
    private javax.swing.JLabel lblChooseYourGuess;
    private javax.swing.JLabel lblExit;
    private javax.swing.JLabel lblMinimize;
    private javax.swing.JLabel lblResult;
    private javax.swing.JLabel lblRollInstruction;
    private javax.swing.JLabel lblShowTrueGess;
    private javax.swing.JLabel lblbg;
    // End of variables declaration//GEN-END:variables
}
