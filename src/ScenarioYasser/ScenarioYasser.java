package ScenarioYasser;

import Exit.Exit;
import Home.Home;
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
public class ScenarioYasser extends javax.swing.JFrame {

    /**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	public static ScenarioYasser frame = new ScenarioYasser();;
    private final Exit exit = new Exit();
    /**
     * Creates new form Scenario
     */
    public ScenarioYasser() {
        initComponents();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        sound = new javax.swing.JButton();
        go = new javax.swing.JButton();
        exitButton = new javax.swing.JButton();
        background = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setUndecorated(true);
        getContentPane().setLayout(null);

        sound.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Sound/on(1).png"))); // NOI18N
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
        sound.setBounds(1260, 0, 100, 100);

        go.setIcon(new javax.swing.ImageIcon(getClass().getResource("/ScenarioYasser/go.png"))); // NOI18N
        go.setBorderPainted(false);
        go.setContentAreaFilled(false);
        go.setDefaultCapable(false);
        go.setFocusPainted(false);
        go.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                goMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                goMouseExited(evt);
            }
        });
        go.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                goActionPerformed(evt);
            }
        });
        getContentPane().add(go);
        go.setBounds(1210, 630, 150, 130);

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

        background.setIcon(new javax.swing.ImageIcon(getClass().getResource("/ScenarioYasser/background.png"))); // NOI18N
        background.setLabelFor(background);
        getContentPane().add(background);
        background.setBounds(0, 0, 1370, 770);

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void soundActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_soundActionPerformed
        Home.audioClip1.loop(1);
        Home.audioClip1.start();
        if(!Home.mute){
            ImageIcon image = new ImageIcon(getClass().getResource("/Sound/mute(1).png"));
            sound.setIcon(image);
            Home.audioClip.stop();
            Home.mute = true;
        }
        else{
            ImageIcon image = new ImageIcon(getClass().getResource("/Sound/on(1).png"));
            sound.setIcon(image);
            Home.audioClip.loop(Clip.LOOP_CONTINUOUSLY);
            Home.audioClip.start();
            Home.mute = false;
        }
    }//GEN-LAST:event_soundActionPerformed

    private void goMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_goMouseEntered
        ImageIcon image = new ImageIcon(getClass().getResource("/ScenarioYasser/go-clicked.png"));
        go.setIcon(image);
    }//GEN-LAST:event_goMouseEntered

    private void goMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_goMouseExited
        ImageIcon image = new ImageIcon(getClass().getResource("/ScenarioYasser/go.png"));
        go.setIcon(image);
    }//GEN-LAST:event_goMouseExited

    private void goActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_goActionPerformed
        Home.audioClip1.loop(1);
        Home.audioClip1.start();
        if(Home.mute){
            ImageIcon image = new ImageIcon(getClass().getResource("/Sound/mute.png"));
            Home.sound.setIcon(image);
        }
        Home.frame.setVisible(true);
        frame.setVisible(false);
    }//GEN-LAST:event_goActionPerformed

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
        frame.setEnabled(false);
        Exit.from = "Scenario2";
    }//GEN-LAST:event_exitButtonActionPerformed

    public static void setIt(){
        frame.setEnabled(true);
    }
    
    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {

            public void run() {
                frame.setTitle("Memory Game");
                frame.setSize(1366, 768);
                frame.setLocationRelativeTo(null);
                frame.setResizable(false);
                frame.setVisible(true);
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
    private javax.swing.JButton go;
    private static javax.swing.JButton sound;
    // End of variables declaration//GEN-END:variables
}
