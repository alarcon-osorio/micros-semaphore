/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package presentation;

import java.awt.BorderLayout;
import java.awt.FlowLayout;
import java.util.Timer;
import java.util.TimerTask;

import persistence.Light;

/**
 *
 * @author jeison.alarcon
 */
public class SemaphoresView extends javax.swing.JFrame {
    
    private Light semaphore1 = new Light();
    private Light semaphore2 = new Light();
    private Light semaphore3 = new Light();
    private Light semaphore4 = new Light();

    TimerTask taskFailSem1;
    TimerTask taskFailSem2;
    TimerTask taskFailSem3;
    TimerTask taskFailSem4;
    TimerTask taskOffSem1;
    TimerTask taskOffSem2;
    TimerTask taskOffSem3;
    TimerTask taskOffSem4;

    TimerTask taskAutoGroup1Red;
    TimerTask taskAutoGroup1Yellow;
    TimerTask taskAutoGroup1Green;
    TimerTask taskAutoGroup1Yellow2;

    TimerTask taskAutoGroup2Red;
    TimerTask taskAutoGroup2Yellow;
    TimerTask taskAutoGroup2Green;
    TimerTask taskAutoGroup2Yellow2;

    TimerTask taskAutoGroup1Red2;

    TimerTask taskAutoGroup2Green2;


    Timer timer = new Timer();


    /**
     * Creates new form vista1
     */
    public SemaphoresView() {
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

        setTitle("Semaforo");
        jPanel1 = new javax.swing.JPanel();
        jPanel2 = new javax.swing.JPanel();
        jPanel3 = new javax.swing.JPanel();
        jPanel4 = new javax.swing.JPanel();
        jPanel5 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jPanel6 = new javax.swing.JPanel();
        jLabel3 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jPanel1.setBorder(javax.swing.BorderFactory.createEtchedBorder());

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 120, Short.MAX_VALUE)
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 274, Short.MAX_VALUE)
        );

        jPanel2.setBorder(javax.swing.BorderFactory.createEtchedBorder());

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 109, Short.MAX_VALUE)
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 274, Short.MAX_VALUE)
        );

        jPanel3.setBorder(javax.swing.BorderFactory.createEtchedBorder());

        javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(jPanel3);
        jPanel3.setLayout(jPanel3Layout);
        jPanel3Layout.setHorizontalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 120, Short.MAX_VALUE)
        );
        jPanel3Layout.setVerticalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 260, Short.MAX_VALUE)
        );

        jPanel4.setBorder(javax.swing.BorderFactory.createEtchedBorder());

        javax.swing.GroupLayout jPanel4Layout = new javax.swing.GroupLayout(jPanel4);
        jPanel4.setLayout(jPanel4Layout);
        jPanel4Layout.setHorizontalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 0, Short.MAX_VALUE)
        );
        jPanel4Layout.setVerticalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 260, Short.MAX_VALUE)
        );

        jPanel5.setBorder(javax.swing.BorderFactory.createEtchedBorder());

        jLabel1.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        jLabel1.setText("GRUPO SEMAFORICO 1");

        javax.swing.GroupLayout jPanel5Layout = new javax.swing.GroupLayout(jPanel5);
        jPanel5.setLayout(jPanel5Layout);
        jPanel5Layout.setHorizontalGroup(
            jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel5Layout.createSequentialGroup()
                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 147, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );
        jPanel5Layout.setVerticalGroup(
            jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel5Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel1)
                .addContainerGap(10, Short.MAX_VALUE))
        );

        jPanel6.setBorder(javax.swing.BorderFactory.createEtchedBorder());

        jLabel3.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        jLabel3.setText("GRUPO SEMAFORICO 2");

        javax.swing.GroupLayout jPanel6Layout = new javax.swing.GroupLayout(jPanel6);
        jPanel6.setLayout(jPanel6Layout);
        jPanel6Layout.setHorizontalGroup(
            jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel6Layout.createSequentialGroup()
                .addComponent(jLabel3)
                .addGap(0, 12, Short.MAX_VALUE))
        );
        jPanel6Layout.setVerticalGroup(
            jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel6Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel3)
                .addContainerGap(11, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(22, 22, 22)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jPanel3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGap(38, 38, 38)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addComponent(jPanel4, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                            .addGroup(layout.createSequentialGroup()
                                .addGap(32, 32, 32)
                                .addComponent(jPanel5, javax.swing.GroupLayout.PREFERRED_SIZE, 145, javax.swing.GroupLayout.PREFERRED_SIZE))))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(56, 56, 56)
                        .addComponent(jPanel6, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPanel5, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addComponent(jPanel6, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jPanel3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jPanel4, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(25, Short.MAX_VALUE))
        );

        jPanel1.setSize(200, 200);
        jPanel1.setLayout(new FlowLayout(FlowLayout.CENTER));
        semaphore1.setSize(100, 90);
        jPanel1.add(semaphore1);
        getContentPane().add(jPanel1, BorderLayout.CENTER);
        jPanel2.setSize(200, 200);
        jPanel2.setLayout(new FlowLayout(FlowLayout.CENTER));
        semaphore2.setSize(100, 90);
        jPanel2.add(semaphore2);
        getContentPane().add(jPanel2, BorderLayout.CENTER);
        jPanel3.setSize(200, 200);
        jPanel3.setLayout(new FlowLayout(FlowLayout.CENTER));
        semaphore3.setSize(100, 90);
        jPanel3.add(semaphore3);
        getContentPane().add(jPanel3, BorderLayout.CENTER);
        jPanel4.setSize(200, 200);
        jPanel4.setLayout(new FlowLayout(FlowLayout.CENTER));
        semaphore4.setSize(100, 90);
        jPanel4.add(semaphore4);
        getContentPane().add(jPanel4, BorderLayout.CENTER);

        pack();
    }// </editor-fold>//GEN-END:initComponents

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
            java.util.logging.Logger.getLogger(SemaphoresView.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(SemaphoresView.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(SemaphoresView.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(SemaphoresView.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(() -> {
            new SemaphoresView().setVisible(true);
        });
    }
    
    public void red1(){
        System.out.println("00001011 - Luz Roja Semaforo 1 Grupo 1");
        semaphore1.red();
        System.out.println("00001011 - Luz Roja Semaforo 2 Grupo 1");
        semaphore2.red();
    }

    public void yellow1(){
        System.out.println("00000011 - Luz Amarilla Semaforo 1 Grupo 1");
        semaphore1.yellow();
        System.out.println("00000011 - Luz Amarilla Semaforo 2 Grupo 1");
        semaphore2.yellow();
    }

    public void green1(){
        System.out.println("00100011 - Luz Verde Semaforo 1 Grupo 1");
        semaphore1.green();
        System.out.println("00100011 - Luz Verde Semaforo 2 Grupo 1");
        semaphore2.green();
    }

    public void red2(){
        System.out.println("00001011 - Luz Roja Semaforo 1 Grupo 2");
        semaphore3.red();
        System.out.println("00001011 - Luz Roja Semaforo 2 Grupo 2");
        semaphore4.red();
    }

    public void yellow2(){
        System.out.println("00000011 - Luz Amarilla Semaforo 1 Grupo 2");
        semaphore3.yellow();
        System.out.println("00000011 - Luz Amarilla Semaforo 2 Grupo 2");
        semaphore4.yellow();
    }

    public void green2(){
        System.out.println("00100011 - Luz Verde Semaforo 1 Grupo 2");
        semaphore3.green();
        System.out.println("00100011 - Luz Verde Semaforo 2 Grupo 2");
        semaphore4.green();
    }

    public void off(){
        System.out.println("00000000 - Semaforos Apagados");

        semaphore1.off();
        semaphore2.off();
        semaphore3.off();
        semaphore4.off();

        taskAutoGroup1Red.cancel();
        taskAutoGroup1Yellow.cancel();
        taskAutoGroup1Green.cancel();
        taskAutoGroup1Yellow2.cancel();

        taskAutoGroup2Red.cancel();
        taskAutoGroup2Yellow.cancel();
        taskAutoGroup2Green.cancel();
        taskAutoGroup2Yellow2.cancel();

        taskAutoGroup2Green2.cancel();
        taskAutoGroup1Red2.cancel();


    }


    public void auto() {

        //Semaforo 1
        //Semaforo 2

        taskAutoGroup1Red = new TimerTask(){
            @Override
            public void run(){
                semaphore1.red();
                semaphore2.red();
                System.out.println("00001011 - Luz Roja Automatica - Semaforo 1");
                System.out.println("00001011 - Luz Roja Automatica - Semaforo 2");
            }
        };

        timer.schedule(taskAutoGroup1Red, 2000, 20000);

        taskAutoGroup1Yellow = new TimerTask(){
            @Override
            public void run(){
                semaphore1.yellow();
                semaphore2.yellow();
                System.out.println("00001011 - Luz Amarilla Automatica - Semaforo 1");
                System.out.println("00001011 - Luz Amarilla Automatica - Semaforo 2");
            }
        };

        timer.schedule(taskAutoGroup1Yellow, 4000, 20000);

        taskAutoGroup1Green = new TimerTask(){
            @Override
            public void run(){
                semaphore1.green();
                semaphore2.green();
                System.out.println("00001011 - Luz Verde Automatica - Semaforo 1");
                System.out.println("00001011 - Luz Verde Automatica - Semaforo 2");
            }
        };

        timer.schedule(taskAutoGroup1Green, 6000, 20000);

        taskAutoGroup1Yellow2 = new TimerTask(){
            @Override
            public void run(){
                semaphore1.yellow();
                semaphore2.yellow();
                System.out.println("00001011 - Luz Amarilla Automatica - Semaforo 1");
                System.out.println("00001011 - Luz Amarilla Automatica - Semaforo 2");
            }
        };

        timer.schedule(taskAutoGroup1Yellow2, 8000, 20000);


        taskAutoGroup1Red2 = new TimerTask(){
            @Override
            public void run(){
                semaphore1.red();
                semaphore2.red();
                System.out.println("00001011 - Luz Roja Automatica - Semaforo 1");
                System.out.println("00001011 - Luz Roja Automatica - Semaforo 2");
            }
        };

        timer.schedule(taskAutoGroup1Red2, 10000, 20000);


        //Grupo de semaforos
        //Semaforo 3
        //Semaforo 4

        taskAutoGroup2Green = new TimerTask(){
            @Override
            public void run(){
                semaphore3.green();
                semaphore4.green();
                System.out.println("00001011 - Luz Verde Automatica - Semaforo 3");
                System.out.println("00001011 - Luz Verde Automatica - Semaforo 4");


            }
        };

        timer.schedule(taskAutoGroup2Green, 2000, 20000);

        taskAutoGroup2Yellow = new TimerTask(){
            @Override
            public void run(){

                semaphore3.yellow();
                semaphore4.yellow();
                System.out.println("00001011 - Luz Amarilla Automatica - Semaforo 3");
                System.out.println("00001011 - Luz Amarilla Automatica - Semaforo 4");
            }
        };

        timer.schedule(taskAutoGroup2Yellow, 4000, 20000);

        taskAutoGroup2Red = new TimerTask(){
            @Override
            public void run(){
                semaphore3.red();
                semaphore4.red();
                System.out.println("00001011 - Luz Roja Automatica - Semaforo 3");
                System.out.println("00001011 - Luz Roja Automatica - Semaforo 4");
            }
        };

        timer.schedule(taskAutoGroup2Red, 6000, 20000);

        taskAutoGroup2Yellow2 = new TimerTask(){
            @Override
            public void run(){
                semaphore3.yellow();
                semaphore4.yellow();
                System.out.println("00001011 - Luz Amarilla Automatica - Semaforo 3");
                System.out.println("00001011 - Luz Amarilla Automatica - Semaforo 4");
            }
        };

        timer.schedule(taskAutoGroup2Yellow2, 8000, 20000);

        taskAutoGroup2Green2 = new TimerTask(){
            @Override
            public void run(){
                semaphore3.green();
                semaphore4.green();
                System.out.println("00001011 - Luz Verde Automatica - Semaforo 3");
                System.out.println("00001011 - Luz Verde Automatica - Semaforo 4");
            }
        };

        timer.schedule(taskAutoGroup2Green2, 10000, 20000);


    }

    public void fail(){

        //Semaforo 1
        taskFailSem1 = new TimerTask(){
            @Override
            public void run(){
                semaphore1.fail();
                System.out.println("00001011 - Intermitencia: Falla Semaforo 1");
            }
        };

        timer.schedule(taskFailSem1, 0, 1000);

        taskOffSem1 = new TimerTask(){
            @Override
            public void run(){
                semaphore1.off();
                System.out.println("00001011 - Intermitencia: Falla Semaforo 1");
            }
        };

        timer.schedule(taskOffSem1, 200, 1000);

        //Semaforo 2
        taskFailSem2 = new TimerTask(){
            @Override
            public void run(){
                semaphore2.fail();
                System.out.println("00001011 - Intermitencia: Falla Semaforo 2");
            }
        };

        timer.schedule(taskFailSem2, 0, 1000);

        taskOffSem2 = new TimerTask(){
            @Override
            public void run(){
                semaphore2.off();
                System.out.println("00001011 - Intermitencia: Falla Semaforo 2");
            }
        };

        timer.schedule(taskOffSem2, 200, 1000);

        //Semaforo 3
        taskFailSem3 = new TimerTask(){
            @Override
            public void run(){
                semaphore3.fail();
                System.out.println("00001011 - Intermitencia: Falla Semaforo 3");
            }
        };

        timer.schedule(taskFailSem3, 0, 1000);

        taskOffSem3 = new TimerTask(){
            @Override
            public void run(){
                semaphore3.off();
                System.out.println("00001011 - Intermitencia: Falla Semaforo 3");
            }
        };

        timer.schedule(taskOffSem3, 200, 1000);

        //Semaforo 4
        taskFailSem4 = new TimerTask(){
            @Override
            public void run(){
                semaphore4.fail();
                System.out.println("00001011 - Intermitencia: Falla Semaforo 4");
            }
        };

        timer.schedule(taskFailSem4, 0, 1000);

        taskOffSem4 = new TimerTask(){
            @Override
            public void run(){
                semaphore4.off();
                System.out.println("00001011 - Intermitencia: Falla Semaforo 4");
            }
        };

        timer.schedule(taskOffSem4, 200, 1000);

        off();

    }
    public void repair(){
        System.out.println("Semaforo Reparado reiniciando el sistema el sistema");

        off();

        taskOffSem1.cancel();
        taskOffSem2.cancel();
        taskOffSem3.cancel();
        taskOffSem4.cancel();

        taskFailSem1.cancel();
        taskFailSem2.cancel();
        taskFailSem3.cancel();
        taskFailSem4.cancel();

    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JPanel jPanel4;
    private javax.swing.JPanel jPanel5;
    private javax.swing.JPanel jPanel6;
    // End of variables declaration//GEN-END:variables
}
