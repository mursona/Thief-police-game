package kptr;

import java.awt.BorderLayout;
import java.awt.Color;
import javax.swing.ImageIcon;
public class KPTR extends javax.swing.JFrame {

    int xOnScreen, yOnScreen;
    private final String animationPath = "DicePjct.png";

    public KPTR() {
        initComponents();
        this.setResizable(false);
        this.setSize(548, 500);
        this.setLocationRelativeTo(null);
        lblAnimation.setIcon(new ImageIcon(getClass().getResource(animationPath)));
        startGame.setForeground(new Color(139, 0, 139));
        startGame.setBackground(new Color(221, 160, 221));
        
        
    }
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        placeHolder = new javax.swing.JPanel();
        startGame = new javax.swing.JButton();
        lblMinmize = new javax.swing.JLabel();
        lblAnimation = new javax.swing.JLabel();
        lblExit = new javax.swing.JLabel();
        lblbg = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("KPTR(Thief & Police  Game)");
        setUndecorated(true);

        placeHolder.setMaximumSize(new java.awt.Dimension(550, 500));
        placeHolder.setMinimumSize(new java.awt.Dimension(550, 500));
        placeHolder.addMouseMotionListener(new java.awt.event.MouseMotionAdapter() {
            public void mouseDragged(java.awt.event.MouseEvent evt) {
                placeHolderMouseDragged(evt);
            }
        });
        placeHolder.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                placeHolderMousePressed(evt);
            }
            public void mouseReleased(java.awt.event.MouseEvent evt) {
                placeHolderMouseReleased(evt);
            }
        });
        placeHolder.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                placeHolderKeyPressed(evt);
            }
        });
        placeHolder.setLayout(null);

        startGame.setFont(new java.awt.Font("Tahoma", 1, 20)); // NOI18N
        startGame.setText("Play the game");
        startGame.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        startGame.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                startGameMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                startGameMouseExited(evt);
            }
        });
        startGame.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                startGameActionPerformed(evt);
            }
        });
        placeHolder.add(startGame);
        startGame.setBounds(170, 400, 197, 68);

        lblMinmize.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        lblMinmize.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                lblMinmizeMouseClicked(evt);
            }
        });
        placeHolder.add(lblMinmize);
        lblMinmize.setBounds(490, 0, 30, 30);
        placeHolder.add(lblAnimation);
        lblAnimation.setBounds(0, 40, 550, 330);

        lblExit.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        lblExit.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                lblExitMouseClicked(evt);
            }
        });
        placeHolder.add(lblExit);
        lblExit.setBounds(520, 0, 30, 30);

        lblbg.setIcon(new javax.swing.ImageIcon(getClass().getResource("Dicebg.png"))); // NOI18N
        placeHolder.add(lblbg);
        lblbg.setBounds(0, 0, 549, 500);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(placeHolder, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(placeHolder, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void startGameActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_startGameActionPerformed
        KptrGUI dgui = new KptrGUI(this);
        placeHolder.removeAll();
        placeHolder.repaint();
        placeHolder.revalidate();

        placeHolder.setLayout(new BorderLayout());
        placeHolder.add(dgui, BorderLayout.CENTER);
        placeHolder.repaint();
        placeHolder.revalidate();

    }//GEN-LAST:event_startGameActionPerformed

    private void placeHolderMouseDragged(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_placeHolderMouseDragged
        int x = evt.getXOnScreen();
        int y = evt.getYOnScreen();
        this.setLocation(x - xOnScreen, y - yOnScreen);
    }//GEN-LAST:event_placeHolderMouseDragged

    private void placeHolderMouseReleased(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_placeHolderMouseReleased

    }//GEN-LAST:event_placeHolderMouseReleased

    private void placeHolderKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_placeHolderKeyPressed

    }//GEN-LAST:event_placeHolderKeyPressed

    private void placeHolderMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_placeHolderMousePressed
        xOnScreen = evt.getX();
        yOnScreen = evt.getY();
    }//GEN-LAST:event_placeHolderMousePressed

    private void lblMinmizeMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lblMinmizeMouseClicked
        this.setState(KPTR.ICONIFIED);
    }//GEN-LAST:event_lblMinmizeMouseClicked

    private void lblExitMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lblExitMouseClicked
        System.exit(0);
    }//GEN-LAST:event_lblExitMouseClicked

    private void startGameMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_startGameMouseEntered
        startGame.setForeground(Color.decode("906608"));
        startGame.setBackground(new Color(221, 160, 221));
    }//GEN-LAST:event_startGameMouseEntered

    private void startGameMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_startGameMouseExited
        startGame.setForeground(new Color(139, 0, 139));
        startGame.setBackground(new Color(221, 160, 221));
    }//GEN-LAST:event_startGameMouseExited

    /**
     * @param args the command line arguments
     */


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel lblAnimation;
    private javax.swing.JLabel lblExit;
    private javax.swing.JLabel lblMinmize;
    private javax.swing.JLabel lblbg;
    private javax.swing.JPanel placeHolder;
    private javax.swing.JButton startGame;
    // End of variables declaration//GEN-END:variables
}
