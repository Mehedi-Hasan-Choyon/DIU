package Thirdclass;

public class Game extends javax.swing.JFrame {
    int win, lose, draw;
    public int Random() {
        int comNum = (int) (Math.random() * 10);
        int answer = getNumber(comNum);
        return answer;
    }
    
    public int getNumber(int comNum) {
        if (comNum > 0 && comNum < 3) {
            return 1;
        }
        if (comNum >= 3 && comNum < 6) {
            return 2;
        } else {
            return 3;
        }
    }
    
    public void Rock(int answer, int guess) {
        if (answer == 1 && guess == 1) {
            draw ++;
            display.setText("Com is Rock. You are Rock too. It's Draw");
        } else if (answer == 1 && guess == 2) {
             win ++;
            display.setText("Com is Rock. You are Paper. You Win");
        } else if (answer == 2 && guess == 1) {
            lose ++;
            display.setText("Com is Paper. You are Rock. You Lose");
        } else if (answer == 1 && guess == 3) {
            lose ++;
            display.setText("Com is Rock. You are Scissor. You Lose");
        } else if (answer == 3 && guess == 1) {
            win ++;
            display.setText("Com is Scissor. You are Rock. You win");
        }
    }
    
    public void Paper(int answer, int guess) {
        if (answer == 2 && guess == 2) {
            draw ++;
            display.setText("Com is Paper. You are Paper too. It's Draw");
        } else if (answer == 1 && guess == 2) {
            win ++;
            display.setText("Com is Rock. You are Paper. You Win");
        } else if (answer == 2 && guess == 1) {
            lose ++;
            display.setText("Com is Paper. You are Rock. You Lose");
        } else if (answer == 2 && guess == 3) {
            win ++;
            display.setText("Com is Paper. You are Scissor. You Win");
        } else if (answer == 3 && guess == 2) {
            lose ++;
            display.setText("Com is Scissor. You are Paper. You Lose");
        }
    }
    
    public void Scissor(int answer, int guess) {
        if (answer == 3 && guess == 3) {
            draw ++;
            display.setText("Com is Scissor. You are Scissor too. It's Draw");
        } else if (answer == 2 && guess == 3) {
            win ++;
            display.setText("Com is Paper. You are Scissor. You Win");
        } else if (answer == 3 && guess == 2) {
            lose ++;
            display.setText("Com is Scissor. You are Paper. You Lose");
        } else if (answer == 1 && guess == 3) {
            lose ++;
            display.setText("Com is Rock. You are Scissor. You Lose");
        } else if (answer == 3 && guess == 1) {
            win ++;
            display.setText("Com is Scissor. You are Rock. You win");
        }
    }
    
    public Game() {
        initComponents();
    }
    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel1 = new javax.swing.JLabel();
        scissor = new javax.swing.JButton();
        rock = new javax.swing.JButton();
        paper = new javax.swing.JButton();
        display = new javax.swing.JTextField();
        display1 = new javax.swing.JTextField();
        jButton1 = new javax.swing.JButton();
        jButton2 = new javax.swing.JButton();
        jButton3 = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jLabel1.setFont(new java.awt.Font("Tahoma", 0, 24)); // NOI18N
        jLabel1.setText("Choose One Of Them....");

        scissor.setIcon(new javax.swing.ImageIcon("C:\\Users\\Daffodil\\Pictures\\11.jpg")); // NOI18N
        scissor.setBorder(new javax.swing.border.MatteBorder(null));
        scissor.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                scissorActionPerformed(evt);
            }
        });

        rock.setIcon(new javax.swing.ImageIcon("C:\\Users\\Daffodil\\Pictures\\PlymouthRockPiece1.jpg")); // NOI18N
        rock.setText("Rock");
        rock.setBorder(new javax.swing.border.MatteBorder(null));
        rock.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                rockActionPerformed(evt);
            }
        });

        paper.setIcon(new javax.swing.ImageIcon("C:\\Users\\Daffodil\\Pictures\\officePaper.png")); // NOI18N
        paper.setText("Paper");
        paper.setBorder(new javax.swing.border.MatteBorder(null));
        paper.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                paperActionPerformed(evt);
            }
        });

        display.setFont(new java.awt.Font("Tahoma", 0, 24)); // NOI18N

        display1.setFont(new java.awt.Font("Tahoma", 0, 24)); // NOI18N

        jButton1.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jButton1.setText("Resest");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });

        jButton2.setFont(new java.awt.Font("Tahoma", 0, 24)); // NOI18N
        jButton2.setText("Score");
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });

        jButton3.setText("Exit");
        jButton3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton3ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(display, javax.swing.GroupLayout.Alignment.TRAILING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(101, 101, 101)
                        .addComponent(display1, javax.swing.GroupLayout.PREFERRED_SIZE, 300, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jButton3)
                            .addComponent(jButton2, javax.swing.GroupLayout.PREFERRED_SIZE, 95, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jButton1))
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addGap(97, 97, 97)
                                .addComponent(jLabel1)
                                .addGap(0, 45, Short.MAX_VALUE))
                            .addGroup(layout.createSequentialGroup()
                                .addGap(16, 16, 16)
                                .addComponent(rock, javax.swing.GroupLayout.PREFERRED_SIZE, 87, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(paper, javax.swing.GroupLayout.PREFERRED_SIZE, 87, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(62, 62, 62)
                                .addComponent(scissor, javax.swing.GroupLayout.PREFERRED_SIZE, 87, javax.swing.GroupLayout.PREFERRED_SIZE)))))
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 51, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(54, 54, 54)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                .addComponent(paper, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(rock, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addComponent(scissor, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jButton2, javax.swing.GroupLayout.PREFERRED_SIZE, 29, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(jButton1)
                        .addGap(18, 18, 18)
                        .addComponent(jButton3)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 45, Short.MAX_VALUE)
                .addComponent(display, javax.swing.GroupLayout.PREFERRED_SIZE, 60, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(display1, javax.swing.GroupLayout.PREFERRED_SIZE, 60, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void rockActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_rockActionPerformed
        int guess = 1;
        int answer = Random();
        Rock(answer, guess);
    }//GEN-LAST:event_rockActionPerformed

    private void paperActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_paperActionPerformed
        int guess = 2;
        int answer = Random();
        Paper(answer, guess);
    }//GEN-LAST:event_paperActionPerformed

    private void scissorActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_scissorActionPerformed
        int guess = 3;
        int answer = Random();
        Scissor(answer, guess);
    }//GEN-LAST:event_scissorActionPerformed

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        win = 0;
        lose = 0;
        draw =0;
        display.setText("");
        display1.setText("");
    }//GEN-LAST:event_jButton1ActionPerformed

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
     String win = String.valueOf(this.win);
     String lose = String.valueOf(this.lose);
     String draw = String.valueOf(this.draw);
     display1.setText("Win: "+win+" "+"Lose: "+lose+" "+"Draw: "+draw);
    }//GEN-LAST:event_jButton2ActionPerformed

    private void jButton3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton3ActionPerformed
       System.exit(0);
    }//GEN-LAST:event_jButton3ActionPerformed
    
    public static void main(String args[]) {
        
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(Game.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Game.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Game.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Game.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Game().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JTextField display;
    private javax.swing.JTextField display1;
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton2;
    private javax.swing.JButton jButton3;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JButton paper;
    private javax.swing.JButton rock;
    private javax.swing.JButton scissor;
    // End of variables declaration//GEN-END:variables
}
