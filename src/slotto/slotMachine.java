/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package slotto;

import java.util.*;
import java.util.concurrent.TimeUnit;

/**
 *
 * @author zguledp16
 */
public class slotMachine extends javax.swing.JFrame {

    int bank = 4000;
    int bet = 0;
    Fruit reel1;
    Fruit reel2;
    Fruit reel3;
    static ArrayList<Integer> reelnumbs = new ArrayList<>();
    boolean cannotNudge = false;
    Fruit[][] slots;
    int recwin;
    boolean canSpin=false;
    /**
     * Creates new form slotMachine
     */
    public slotMachine() {
        this.slots = new Fruit[3][3];
        initComponents();
        jLabel6.setText("£" + bank);
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jButton1 = new javax.swing.JButton();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        jLabel9 = new javax.swing.JLabel();
        jLabel10 = new javax.swing.JLabel();
        jLabel11 = new javax.swing.JLabel();
        jLabel12 = new javax.swing.JLabel();
        jLabel13 = new javax.swing.JLabel();
        jLabel14 = new javax.swing.JLabel();
        jButton2 = new javax.swing.JButton();
        jButton3 = new javax.swing.JButton();
        jButton4 = new javax.swing.JButton();
        jSpinner1 = new javax.swing.JSpinner();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jPanel1.setRequestFocusEnabled(false);

        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/slotto/EEEEEE.gif"))); // NOI18N

        jLabel2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/slotto/EEEEEE.gif"))); // NOI18N

        jLabel3.setIcon(new javax.swing.ImageIcon(getClass().getResource("/slotto/EEEEEE.gif"))); // NOI18N

        jButton1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/slotto/spin.png"))); // NOI18N
        jButton1.setContentAreaFilled(false);
        jButton1.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                jButton1MousePressed(evt);
            }
            public void mouseReleased(java.awt.event.MouseEvent evt) {
                jButton1MouseReleased(evt);
            }
        });
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });

        jLabel4.setText("SLOT MACHINE!");
        jLabel4.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);

        jLabel5.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jLabel5.setText("Bank:");

        jLabel6.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jLabel6.setText("-");

        jLabel7.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jLabel7.setText("Bet:£");

        jLabel8.setText("Enter a bet to get started.");

        jButton2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/slotto/nudge.png"))); // NOI18N
        jButton2.setContentAreaFilled(false);
        jButton2.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                jButton2MousePressed(evt);
            }
            public void mouseReleased(java.awt.event.MouseEvent evt) {
                jButton2MouseReleased(evt);
            }
        });
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });

        jButton3.setIcon(new javax.swing.ImageIcon(getClass().getResource("/slotto/nudge.png"))); // NOI18N
        jButton3.setContentAreaFilled(false);
        jButton3.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                jButton3MousePressed(evt);
            }
            public void mouseReleased(java.awt.event.MouseEvent evt) {
                jButton3MouseReleased(evt);
            }
        });
        jButton3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton3ActionPerformed(evt);
            }
        });

        jButton4.setIcon(new javax.swing.ImageIcon(getClass().getResource("/slotto/nudge.png"))); // NOI18N
        jButton4.setContentAreaFilled(false);
        jButton4.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                jButton4MousePressed(evt);
            }
            public void mouseReleased(java.awt.event.MouseEvent evt) {
                jButton4MouseReleased(evt);
            }
        });
        jButton4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton4ActionPerformed(evt);
            }
        });

        jSpinner1.setFont(new java.awt.Font("Segoe UI", 0, 24)); // NOI18N
        jSpinner1.setModel(new javax.swing.SpinnerNumberModel());
        jSpinner1.setToolTipText("");

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap(25, Short.MAX_VALUE)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(jLabel12, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addComponent(jLabel13, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(136, 136, 136)
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addGroup(jPanel1Layout.createSequentialGroup()
                                        .addComponent(jLabel5, javax.swing.GroupLayout.PREFERRED_SIZE, 107, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addComponent(jLabel6, javax.swing.GroupLayout.PREFERRED_SIZE, 168, javax.swing.GroupLayout.PREFERRED_SIZE))
                                    .addGroup(jPanel1Layout.createSequentialGroup()
                                        .addComponent(jLabel7, javax.swing.GroupLayout.PREFERRED_SIZE, 47, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addComponent(jSpinner1))))
                            .addComponent(jButton1, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                                    .addComponent(jLabel9, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addComponent(jLabel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                                .addGap(18, 18, 18)
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addComponent(jLabel4, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addComponent(jLabel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addComponent(jLabel10, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(jPanel1Layout.createSequentialGroup()
                                        .addGap(18, 18, 18)
                                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                            .addComponent(jLabel14, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)
                                            .addComponent(jLabel3, javax.swing.GroupLayout.Alignment.LEADING)))
                                    .addGroup(jPanel1Layout.createSequentialGroup()
                                        .addGap(19, 19, 19)
                                        .addComponent(jLabel11, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE))))
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                                .addComponent(jButton2, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(18, 18, 18)
                                .addComponent(jButton3, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(18, 18, 18)
                                .addComponent(jButton4, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(1, 1, 1)))
                        .addGap(33, 33, 33)
                        .addComponent(jLabel8, javax.swing.GroupLayout.PREFERRED_SIZE, 329, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(120, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel4)
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(jLabel11, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(jLabel9, javax.swing.GroupLayout.DEFAULT_SIZE, 100, Short.MAX_VALUE)
                            .addComponent(jLabel10, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(jLabel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(jLabel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(jLabel3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                        .addGap(7, 7, 7)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(jLabel12, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(jLabel13, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(jLabel14, javax.swing.GroupLayout.DEFAULT_SIZE, 100, Short.MAX_VALUE)))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(jLabel8, javax.swing.GroupLayout.PREFERRED_SIZE, 171, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(jLabel5, javax.swing.GroupLayout.DEFAULT_SIZE, 50, Short.MAX_VALUE)
                            .addComponent(jLabel6, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel7, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(jSpinner1, javax.swing.GroupLayout.DEFAULT_SIZE, 75, Short.MAX_VALUE))))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jButton4, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jButton2, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jButton3, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jButton1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents
    // <editor-fold desc="Graphics setting code">   
    private void setSlotGraphics() {
        jLabel9.setIcon(new javax.swing.ImageIcon(getClass().getResource("/slotto/" + slots[0][0].getName() + ".png")));
        jLabel10.setIcon(new javax.swing.ImageIcon(getClass().getResource("/slotto/" + slots[1][0].getName() + ".png")));
        jLabel11.setIcon(new javax.swing.ImageIcon(getClass().getResource("/slotto/" + slots[2][0].getName() + ".png")));
        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/slotto/" + reel1.getName() + "spec.png")));
        jLabel2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/slotto/" + reel2.getName() + "spec.png")));
        jLabel3.setIcon(new javax.swing.ImageIcon(getClass().getResource("/slotto/" + reel3.getName() + "spec.png")));
        jLabel12.setIcon(new javax.swing.ImageIcon(getClass().getResource("/slotto/" + slots[0][2].getName() + ".png")));
        jLabel13.setIcon(new javax.swing.ImageIcon(getClass().getResource("/slotto/" + slots[1][2].getName() + ".png")));
        jLabel14.setIcon(new javax.swing.ImageIcon(getClass().getResource("/slotto/" + slots[2][2].getName() + ".png")));
    }

    private void setFailGraphics() {
        jLabel8.setText("You're BROKE!");
        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/slotto/ERR.png")));
        jLabel2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/slotto/ERR.png")));
        jLabel3.setIcon(new javax.swing.ImageIcon(getClass().getResource("/slotto/ERR.png")));
        jLabel9.setIcon(new javax.swing.ImageIcon(getClass().getResource("/slotto/ERR.png")));
        jLabel10.setIcon(new javax.swing.ImageIcon(getClass().getResource("/slotto/ERR.png")));
        jLabel11.setIcon(new javax.swing.ImageIcon(getClass().getResource("/slotto/ERR.png")));
        jLabel12.setIcon(new javax.swing.ImageIcon(getClass().getResource("/slotto/ERR.png")));
        jLabel13.setIcon(new javax.swing.ImageIcon(getClass().getResource("/slotto/ERR.png")));
        jLabel14.setIcon(new javax.swing.ImageIcon(getClass().getResource("/slotto/ERR.png")));
    }
    
    private void setNudgeFailGraphics() {
        jButton2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/slotto/nudge2.png")));
        jButton3.setIcon(new javax.swing.ImageIcon(getClass().getResource("/slotto/nudge2.png")));
        jButton4.setIcon(new javax.swing.ImageIcon(getClass().getResource("/slotto/nudge2.png")));
        jLabel8.setText("You can't nudge again until you spin!");
    }

    private void resetNudgeGraphics(){
        jButton2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/slotto/nudge.png")));
        jButton3.setIcon(new javax.swing.ImageIcon(getClass().getResource("/slotto/nudge.png")));
        jButton4.setIcon(new javax.swing.ImageIcon(getClass().getResource("/slotto/nudge.png"))); 
    }
    
    private void setErrGraphics(){
        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/slotto/ERR.png")));
        jLabel2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/slotto/ERR.png")));
        jLabel3.setIcon(new javax.swing.ImageIcon(getClass().getResource("/slotto/ERR.png")));
        jButton1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/slotto/spin2.png")));
    }
    // </editor-fold>
    
    private void spinSlots() {
        cannotNudge = false;
        resetNudgeGraphics();
        jLabel8.setText("");
        if (reel1.getID() == reel2.getID() && reel2.getID() == reel3.getID()) {
            switch (reel1.getID()) {
                case 0:
                    bet *= 10;
                    bank += bet;
                    recwin = bet;
                    jLabel6.setText("£" + bank);
                    break;
                case 1:
                    bet *= 10;
                    bank += bet;
                    recwin = bet;
                    jLabel6.setText("£" + bank);
                    break;
                case 2:
                    bet *= 20;
                    bank += bet;
                    recwin = bet;
                    jLabel6.setText("£" + bank);
                    break;
                case 3:
                    bet *= 30;
                    bank += bet;
                    recwin = bet;
                    jLabel6.setText("£" + bank);
                    break;
                case 4:
                    bet *= 40;
                    bank += bet;
                    recwin = bet;
                    jLabel6.setText("£" + bank);
                    break;
                case 5:
                    bet *= 60;
                    bank += bet;
                    recwin = bet;
                    jLabel6.setText("£" + bank);
                    break;
                case 6:
                    bet *= 100;
                    bank += bet;
                    recwin = bet;
                    /*
                    for(int i=0;i<bet;i++){
                        bet+=i;
                    }*/
                    jLabel6.setText("£" + bank);
                    break;
            }
        } else if (reel1.getID() == 0 || reel2.getID() == 0 || reel3.getID() == 0) {
            if (((reel1.getID() == reel2.getID() || reel1.getID() == reel3.getID()) && reel1.getID() == 0) || (reel2.getID() == reel3.getID()) && reel2.getID() == 0) {
                bet *= 5;
                bank += bet;
                recwin = bet;
                jLabel6.setText("£" + bank);
            } else {
                bet *= 2;
                bank += bet;
                recwin = bet;
                jLabel6.setText("£" + bank);
            }
        } else {
            bank -= bet;
            recwin -= bet;
            System.out.println(bank);
            jLabel6.setText("£" + bank);
        }
        if (bank <= 0) {
            setFailGraphics();
        }
    }

    private void placeBet() {
        System.out.println("Successful bet placement!");
        int x = (Integer) jSpinner1.getValue();
        if (x > bank) {
            jLabel8.setText("You can't bet more than you have!");
        } else if (x <= 0) {
            jLabel8.setText("You can't bet nothing!");
        } else {
            bet = x;
            canSpin=true;
            System.out.println("CANSPIN = "+canSpin);
            System.out.println("BET = "+bet);
            System.out.println("X = "+x);
            try {
                TimeUnit.MILLISECONDS.sleep(20);
            } catch (InterruptedException e) {
                System.out.println("FAIL");
            }

        }
    }
    
    private void nudge(Fruit[] slotsToMove) {
        if(cannotNudge||!canSpin){
            setNudgeFailGraphics();
        }else{
            bank = Math.abs(recwin - bank) - 10;
            jLabel6.setText("£" + bank);
            System.out.println("[" + slotsToMove[0].getName() + ", " + slotsToMove[1].getName() + ", " + slotsToMove[2].getName() + "]");
            slotsToMove[2].replace(slotsToMove[1]);
            slotsToMove[1].replace(slotsToMove[0]);
            slotsToMove[0].spinner(reelnumbs);
            setSlotGraphics();
            spinSlots();
            cannotNudge=true;
        }
    }
    
    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        placeBet();
        if(canSpin) {
            System.out.println("action triggered");
            slots[0][0] = new Fruit("", 0);
            slots[0][1] = new Fruit("", 0);
            slots[0][2] = new Fruit("", 0);

            slots[1][0] = new Fruit("", 0);
            slots[1][1] = new Fruit("", 0);
            slots[1][2] = new Fruit("", 0);

            slots[2][0] = new Fruit("", 0);
            slots[2][1] = new Fruit("", 0);
            slots[2][2] = new Fruit("", 0);

            for (int i = 0; i < 3; i++) {
                slots[0][i].spinner(reelnumbs);
                slots[1][i].spinner(reelnumbs);
                slots[2][i].spinner(reelnumbs);
            }
            reel1 = slots[0][1];
            reel2 = slots[1][1];
            reel3 = slots[2][1];
            setSlotGraphics();
            spinSlots();
            //<editor-fold defaultstate="collapsed" desc="rng code">
            /*
             if(bank<=100){ if(bank<=200){ if(bank<=300){ if(bank<=400){
             if(bank<=500){ for(int i=0;i<6;i++){ reelnumbs.remove(i); } }
             else { int b=0; while(reelnumbs.contains(0)){
             reelnumbs.remove(0); } } } else { for(int i=1;i<7;i++){
             reelnumbs.remove(i); } } } else reelnumbs.remove(6); } }
             */
            //</editor-fold>
            // TODO add your handling code here:
        } else {
            setErrGraphics();
        }
    }//GEN-LAST:event_jButton1ActionPerformed
//<editor-fold desc="Code for nudge button actions">
    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
        nudge(slots[0]);
    }//GEN-LAST:event_jButton2ActionPerformed

    private void jButton3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton3ActionPerformed
        nudge(slots[1]);
    }//GEN-LAST:event_jButton3ActionPerformed

    private void jButton4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton4ActionPerformed
        nudge(slots[2]);
    }//GEN-LAST:event_jButton4ActionPerformed
//</editor-fold>
//<editor-fold defaultstate="collapsed" desc="Code for button press/release graphics">
    private void jButton1MousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jButton1MousePressed
        jButton1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/slotto/spin2.png")));
    }//GEN-LAST:event_jButton1MousePressed

    private void jButton1MouseReleased(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jButton1MouseReleased
        if(canSpin)jButton1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/slotto/spin.png")));
    }//GEN-LAST:event_jButton1MouseReleased
    
    private void jButton2MousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jButton2MousePressed
        jButton2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/slotto/nudge2.png")));
    }//GEN-LAST:event_jButton2MousePressed

    private void jButton2MouseReleased(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jButton2MouseReleased
        if(!cannotNudge&&canSpin)jButton2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/slotto/nudge.png")));
    }//GEN-LAST:event_jButton2MouseReleased

    private void jButton3MousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jButton3MousePressed
        jButton3.setIcon(new javax.swing.ImageIcon(getClass().getResource("/slotto/nudge2.png")));
    }//GEN-LAST:event_jButton3MousePressed

    private void jButton3MouseReleased(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jButton3MouseReleased
        if(!cannotNudge&&canSpin)jButton3.setIcon(new javax.swing.ImageIcon(getClass().getResource("/slotto/nudge.png")));
    }//GEN-LAST:event_jButton3MouseReleased

    private void jButton4MousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jButton4MousePressed
        jButton4.setIcon(new javax.swing.ImageIcon(getClass().getResource("/slotto/nudge2.png")));
    }//GEN-LAST:event_jButton4MousePressed

    private void jButton4MouseReleased(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jButton4MouseReleased
        if(!cannotNudge&&canSpin)jButton4.setIcon(new javax.swing.ImageIcon(getClass().getResource("/slotto/nudge.png")));
    }//GEN-LAST:event_jButton4MouseReleased
//</editor-fold>
    //HI
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
            java.util.logging.Logger.getLogger(slotMachine.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(slotMachine.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(slotMachine.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(slotMachine.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        int x = 0;
        for (int i = 0; i < 7; i++) {
            reelnumbs.add(x);
            reelnumbs.add(x);
            reelnumbs.add(x);
            x++;
        }


        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new slotMachine().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton2;
    private javax.swing.JButton jButton3;
    private javax.swing.JButton jButton4;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel13;
    private javax.swing.JLabel jLabel14;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JSpinner jSpinner1;
    // End of variables declaration//GEN-END:variables
}
