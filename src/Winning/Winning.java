package Winning;

import Home.Home;
import Home.Open;
import Exit.Exit;
import java.awt.Color;
import java.awt.Font;
import javax.sound.sampled.Clip;
import javax.swing.ImageIcon;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Ahmed
 */
public class Winning extends javax.swing.JFrame {

    /**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	public static Winning frame = new Winning();
    private final Exit exit = new Exit();
    public static String from;
    /**
     * Creates new form winning
     */
    public Winning() {
        initComponents();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        exitButton = new javax.swing.JButton();
        home = new javax.swing.JButton();
        nextLevel = new javax.swing.JButton();
        sound = new javax.swing.JButton();
        score = new javax.swing.JButton();
        background = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setUndecorated(true);
        getContentPane().setLayout(null);

        exitButton.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Exit/exit.png"))); // NOI18N
        exitButton.setBorderPainted(false);
        exitButton.setContentAreaFilled(false);
        exitButton.setDefaultCapable(false);
        exitButton.setFocusPainted(false);
        exitButton.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                exitButtonMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                exitButtonMouseExited(evt);
            }
        });
        exitButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                exitButtonActionPerformed(evt);
            }
        });
        getContentPane().add(exitButton);
        exitButton.setBounds(0, 0, 200, 70);

        home.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Winning/home.png"))); // NOI18N
        home.setBorderPainted(false);
        home.setContentAreaFilled(false);
        home.setDefaultCapable(false);
        home.setFocusPainted(false);
        home.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                homeMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                homeMouseExited(evt);
            }
        });
        home.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                homeActionPerformed(evt);
            }
        });
        getContentPane().add(home);
        home.setBounds(380, 540, 272, 97);

        nextLevel.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Winning/next-level.png"))); // NOI18N
        nextLevel.setBorderPainted(false);
        nextLevel.setContentAreaFilled(false);
        nextLevel.setDefaultCapable(false);
        nextLevel.setFocusPainted(false);
        nextLevel.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                nextLevelMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                nextLevelMouseExited(evt);
            }
        });
        nextLevel.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                nextLevelActionPerformed(evt);
            }
        });
        getContentPane().add(nextLevel);
        nextLevel.setBounds(380, 440, 271, 100);

        sound.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Sound/on.png"))); // NOI18N
        sound.setBorderPainted(false);
        sound.setContentAreaFilled(false);
        sound.setDefaultCapable(false);
        sound.setFocusPainted(false);
        sound.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                soundActionPerformed(evt);
            }
        });
        getContentPane().add(sound);
        sound.setBounds(1240, 0, 122, 128);

        score.setText("0");
        score.setBorderPainted(false);
        score.setContentAreaFilled(false);
        score.setDefaultCapable(false);
        score.setFocusPainted(false);
        getContentPane().add(score);
        score.setBounds(290, 210, 310, 180);

        background.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Winning/bachground-winning.png"))); // NOI18N
        background.setLabelFor(background);
        getContentPane().add(background);
        background.setBounds(0, 0, 1370, 770);

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void exitButtonMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_exitButtonMouseEntered
        ImageIcon image = new ImageIcon(getClass().getResource("/Exit/exit-clicked.png"));
        exitButton.setIcon(image);
    }//GEN-LAST:event_exitButtonMouseEntered

    private void exitButtonMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_exitButtonMouseExited
        ImageIcon image = new ImageIcon(getClass().getResource("/Exit/exit.png"));
        exitButton.setIcon(image);
    }//GEN-LAST:event_exitButtonMouseExited

    private void exitButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_exitButtonActionPerformed
        Home.audioClip1.loop(1);
        Home.audioClip1.start();
        exit.setTitle("Memory Game");
        exit.setSize(600, 446);
        exit.setVisible(true);
        exit.setLocationRelativeTo(null);
        exit.setResizable(false);
        this.setEnabled(false);
        Exit.from = "Play";
    }//GEN-LAST:event_exitButtonActionPerformed

    private void homeMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_homeMouseEntered
        ImageIcon image = new ImageIcon(getClass().getResource("/Winning/home-clicked.png"));
        home.setIcon(image);
    }//GEN-LAST:event_homeMouseEntered

    private void homeMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_homeMouseExited
        ImageIcon image = new ImageIcon(getClass().getResource("/Winning/home.png"));
        home.setIcon(image);
    }//GEN-LAST:event_homeMouseExited

    private void homeActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_homeActionPerformed
        Home.audioClip1.loop(1);
        Home.audioClip1.start();
        if(Home.mute){
            ImageIcon image = new ImageIcon(getClass().getResource("/Sound/mute.png"));
            Home.sound.setIcon(image);
        }
        Home.frame.setVisible(true);
        frame.setVisible(false);
    }//GEN-LAST:event_homeActionPerformed

    private void nextLevelMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_nextLevelMouseEntered
        ImageIcon image = new ImageIcon(getClass().getResource("/Winning/next-level-clicked.png"));
        nextLevel.setIcon(image);
    }//GEN-LAST:event_nextLevelMouseEntered

    private void nextLevelMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_nextLevelMouseExited
        ImageIcon image = new ImageIcon(getClass().getResource("/Winning/next-level.png"));
        nextLevel.setIcon(image);
    }//GEN-LAST:event_nextLevelMouseExited

    private void nextLevelActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_nextLevelActionPerformed
        Home.audioClip1.loop(1);
        Home.audioClip1.start();
        switch (from) {
            case "Level1":
                Open.open = "2";
                Open.main(null);
                frame.setVisible(false);
                break;
            case "Level2":
                Open.open = "3";
                Open.main(null);
                frame.setVisible(false);
                break;
        }
    }//GEN-LAST:event_nextLevelActionPerformed

    private void soundActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_soundActionPerformed
        Home.audioClip1.loop(1);
        Home.audioClip1.start();
        if(!Home.mute){
            ImageIcon image = new ImageIcon(getClass().getResource("/Sound/mute.png"));
            sound.setIcon(image);
            Home.audioClip.stop();
            Home.mute = true;
        }
        else{
            ImageIcon image = new ImageIcon(getClass().getResource("/Sound/on.png"));
            sound.setIcon(image);
            Home.audioClip.loop(Clip.LOOP_CONTINUOUSLY);
            Home.audioClip.start();
            Home.mute = false;
        }
    }//GEN-LAST:event_soundActionPerformed

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
            java.util.logging.Logger.getLogger(Winning.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Winning.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Winning.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Winning.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {

            public void run() {
                frame.setTitle("Memory Game");
                frame.setSize(1366, 768);
                frame.setLocationRelativeTo(null);
                frame.setResizable(false);
                frame.setVisible(true);
                score.setForeground(Color.BLUE);
                Font font1 = new Font("SansSerif", Font.BOLD, 50);
                score.setFont(font1);
                if(Home.mute){
                    ImageIcon image = new ImageIcon(getClass().getResource("/Sound/mute(1).png"));
                    sound.setIcon(image);
                }
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel background;
    private javax.swing.JButton exitButton;
    private javax.swing.JButton home;
    private javax.swing.JButton nextLevel;
    public static javax.swing.JButton score;
    private static javax.swing.JButton sound;
    // End of variables declaration//GEN-END:variables
}
