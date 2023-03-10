/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */

package Pantallas;

import java.awt.BorderLayout;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.table.DefaultTableModel;
import pantallas.Configuracion;
import pantallas.Tableroacciones;
import pantallas.agregarActividades;
import pantallas.dashboard;
import pantallas.espacio_de_trabajo;

/**
 *
 * @author user
 */
public class pantallaTablero extends javax.swing.JFrame {
    
    public pantallaTablero() throws Exception {
        initComponents();
        try{
            Class.forName("org.postgresql.Driver");
            Connection con = DriverManager.getConnection("jdbc:postgresql://localhost:5432/Euclick","postgres", "Keigomitsui77");
            
            Statement st = con.createStatement();
            
            String sql = "select nombre_actividad, fecha_inicio, fecha_limite  from actividad a where id_estado = 1";
            ResultSet rs = st.executeQuery(sql);
            
            while(rs.next()){
                
                
                String Nombre = rs.getString("nombre_actividad");
                String FechaI = String.valueOf(rs.getDate("fecha_inicio"));
                String FechaF = String.valueOf(rs.getDate("fecha_limite"));
                
                String tbData[] = {Nombre,FechaI,FechaF};
                DefaultTableModel tblModel = (DefaultTableModel)tablaproceso.getModel();
                tblModel.addRow(tbData);
            }
            con.close();
            
        }catch(Exception e){
            System.out.println(e.getMessage());
        }
        
        try{
            Class.forName("org.postgresql.Driver");
            Connection con = DriverManager.getConnection("jdbc:postgresql://localhost:5432/Euclick","postgres", "Keigomitsui77");
            
            Statement st = con.createStatement();
            
            String sql = "select nombre_actividad, fecha_inicio, fecha_limite  from actividad a where id_estado = 2";
            ResultSet rs = st.executeQuery(sql);
            
            while(rs.next()){
                
                
                String Nombre = rs.getString("nombre_actividad");
                String FechaI = String.valueOf(rs.getDate("fecha_inicio"));
                String FechaF = String.valueOf(rs.getDate("fecha_limite"));
                
                String tbData[] = {Nombre,FechaI,FechaF};
                DefaultTableModel tblModel = (DefaultTableModel)tablapendiente.getModel();
                tblModel.addRow(tbData);
            }
            con.close();
            
        }catch(Exception e){
            System.out.println(e.getMessage());
        }
        
        try{
            Class.forName("org.postgresql.Driver");
            Connection con = DriverManager.getConnection("jdbc:postgresql://localhost:5432/Euclick","postgres", "Keigomitsui77");
            
            Statement st = con.createStatement();
            
            String sql = "select nombre_actividad, fecha_inicio, fecha_limite  from actividad a where id_estado = 3";
            ResultSet rs = st.executeQuery(sql);
            
            while(rs.next()){
                
                
                String Nombre = rs.getString("nombre_actividad");
                String FechaI = String.valueOf(rs.getDate("fecha_inicio"));
                String FechaF = String.valueOf(rs.getDate("fecha_limite"));
                
                String tbData[] = {Nombre,FechaI,FechaF};
                DefaultTableModel tblModel = (DefaultTableModel)tablafinalizada.getModel();
                tblModel.addRow(tbData);
            }
            con.close();
            
        }catch(Exception e){
            System.out.println(e.getMessage());
        }
    }

    /** This method is called from within the constructor to
     * initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is
     * always regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel5 = new javax.swing.JLabel();
        jButton7 = new javax.swing.JButton();
        jButton6 = new javax.swing.JButton();
        jButton8 = new javax.swing.JButton();
        labelusuario = new javax.swing.JLabel();
        lbltuerca = new javax.swing.JLabel();
        lblnombrefirma = new javax.swing.JLabel();
        lblpartesup = new javax.swing.JLabel();
        lblpartelat = new javax.swing.JLabel();
        btnaggacti = new javax.swing.JButton();
        lblevaluaciones = new javax.swing.JLabel();
        lblacciones = new javax.swing.JLabel();
        content = new javax.swing.JPanel();
        jScrollPane1 = new javax.swing.JScrollPane();
        tablaproceso = new javax.swing.JTable();
        jScrollPane4 = new javax.swing.JScrollPane();
        tablapendiente = new javax.swing.JTable();
        jScrollPane5 = new javax.swing.JScrollPane();
        tablafinalizada = new javax.swing.JTable();
        jButton1 = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setAlwaysOnTop(true);
        setMinimumSize(new java.awt.Dimension(1760, 690));
        setResizable(false);
        getContentPane().setLayout(null);

        jLabel5.setFont(new java.awt.Font("SansSerif", 0, 18)); // NOI18N
        jLabel5.setText("MEN??");
        getContentPane().add(jLabel5);
        jLabel5.setBounds(130, 150, 70, 24);

        jButton7.setBackground(new java.awt.Color(204, 204, 204));
        jButton7.setText("Espacios de trabajo");
        jButton7.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jButton7MouseClicked(evt);
            }
        });
        jButton7.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton7ActionPerformed(evt);
            }
        });
        getContentPane().add(jButton7);
        jButton7.setBounds(0, 190, 330, 22);

        jButton6.setBackground(new java.awt.Color(204, 204, 204));
        jButton6.setText("Dashboard");
        jButton6.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton6ActionPerformed(evt);
            }
        });
        getContentPane().add(jButton6);
        jButton6.setBounds(0, 230, 330, 22);

        jButton8.setBackground(new java.awt.Color(204, 204, 204));
        jButton8.setText("Configuraciones");
        jButton8.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton8ActionPerformed(evt);
            }
        });
        getContentPane().add(jButton8);
        jButton8.setBounds(0, 270, 330, 22);

        labelusuario.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/logousuario.png"))); // NOI18N
        getContentPane().add(labelusuario);
        labelusuario.setBounds(1260, 70, 55, 55);

        lbltuerca.setFont(new java.awt.Font("SansSerif", 1, 12)); // NOI18N
        lbltuerca.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/logotuerca.png"))); // NOI18N
        lbltuerca.setText("jLabel1");
        lbltuerca.setMaximumSize(new java.awt.Dimension(50, 50));
        lbltuerca.setMinimumSize(new java.awt.Dimension(50, 50));
        getContentPane().add(lbltuerca);
        lbltuerca.setBounds(15, 47, 50, 50);

        lblnombrefirma.setFont(new java.awt.Font("SansSerif", 1, 36)); // NOI18N
        lblnombrefirma.setText("Euclick");
        getContentPane().add(lblnombrefirma);
        lblnombrefirma.setBounds(80, 50, 148, 45);

        lblpartesup.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/partesuperior2.png"))); // NOI18N
        getContentPane().add(lblpartesup);
        lblpartesup.setBounds(0, 0, 1760, 140);

        lblpartelat.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/partelateral.png"))); // NOI18N
        getContentPane().add(lblpartelat);
        lblpartelat.setBounds(0, 140, 330, 560);

        btnaggacti.setBackground(new java.awt.Color(255, 255, 204));
        btnaggacti.setFont(new java.awt.Font("SansSerif", 1, 18)); // NOI18N
        btnaggacti.setText("+ Agregar Actividad");
        btnaggacti.setBorder(null);
        btnaggacti.setBorderPainted(false);
        btnaggacti.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        btnaggacti.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btnaggactiMouseClicked(evt);
            }
        });
        btnaggacti.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnaggactiActionPerformed(evt);
            }
        });
        getContentPane().add(btnaggacti);
        btnaggacti.setBounds(1160, 150, 250, 40);

        lblevaluaciones.setFont(new java.awt.Font("SansSerif", 1, 24)); // NOI18N
        lblevaluaciones.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        lblevaluaciones.setText("Evaluaciones");
        lblevaluaciones.setToolTipText("");
        getContentPane().add(lblevaluaciones);
        lblevaluaciones.setBounds(350, 150, 250, 40);

        lblacciones.setFont(new java.awt.Font("Dialog", 1, 24)); // NOI18N
        lblacciones.setText("Actividades");
        getContentPane().add(lblacciones);
        lblacciones.setBounds(370, 200, 250, 40);

        content.setMinimumSize(new java.awt.Dimension(544, 450));
        content.setName(""); // NOI18N
        content.setPreferredSize(new java.awt.Dimension(544, 450));
        getContentPane().add(content);
        content.setBounds(850, 190, 544, 450);

        tablaproceso.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Actividades pendientes", "Fecha Ini", "Fecha limi"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, false, false
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        jScrollPane1.setViewportView(tablaproceso);
        if (tablaproceso.getColumnModel().getColumnCount() > 0) {
            tablaproceso.getColumnModel().getColumn(0).setResizable(false);
            tablaproceso.getColumnModel().getColumn(1).setResizable(false);
            tablaproceso.getColumnModel().getColumn(2).setResizable(false);
        }

        getContentPane().add(jScrollPane1);
        jScrollPane1.setBounds(360, 240, 460, 140);

        tablapendiente.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Actividades en proceso", "Fecha Ini", "Fecha limi"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, false, false
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        jScrollPane4.setViewportView(tablapendiente);
        if (tablapendiente.getColumnModel().getColumnCount() > 0) {
            tablapendiente.getColumnModel().getColumn(0).setResizable(false);
            tablapendiente.getColumnModel().getColumn(1).setResizable(false);
            tablapendiente.getColumnModel().getColumn(2).setResizable(false);
        }

        getContentPane().add(jScrollPane4);
        jScrollPane4.setBounds(360, 390, 460, 140);

        tablafinalizada.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Actividades finalizadas", "Fecha Ini", "Fecha limi"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, false, false
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        jScrollPane5.setViewportView(tablafinalizada);
        if (tablafinalizada.getColumnModel().getColumnCount() > 0) {
            tablafinalizada.getColumnModel().getColumn(0).setResizable(false);
            tablafinalizada.getColumnModel().getColumn(1).setResizable(false);
            tablafinalizada.getColumnModel().getColumn(2).setResizable(false);
        }

        getContentPane().add(jScrollPane5);
        jScrollPane5.setBounds(360, 550, 460, 140);

        jButton1.setText("Ir a acciones");
        jButton1.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jButton1MouseClicked(evt);
            }
        });
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });
        getContentPane().add(jButton1);
        jButton1.setBounds(705, 210, 110, 22);

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnaggactiMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnaggactiMouseClicked
        //
    }//GEN-LAST:event_btnaggactiMouseClicked

    private void jButton7ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton7ActionPerformed
        // TODO add your handling code here:
        espacio_de_trabajo newframe = new espacio_de_trabajo();
        newframe.setVisible(true);
        this.dispose();
    }//GEN-LAST:event_jButton7ActionPerformed

    private void jButton6ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton6ActionPerformed
        // TODO add your handling code here:
        dashboard newframe = new dashboard();
        newframe.setVisible(true);
        this.dispose();
    }//GEN-LAST:event_jButton6ActionPerformed

    private void jButton8ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton8ActionPerformed
        // TODO add your handling code here:
        Configuracion newframe = new Configuracion();
        newframe.setVisible(true);
        this.dispose();
    }//GEN-LAST:event_jButton8ActionPerformed

    private void btnaggactiActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnaggactiActionPerformed
        agregarActividades eT = null;
        try {
            eT = new agregarActividades();
        } catch (Exception ex) {
            Logger.getLogger(pantallaTablero.class.getName()).log(Level.SEVERE, null, ex);
        }
        eT.setSize(540,470);
        eT.setLocation(0,0);
        
        content.removeAll();
        content.add(eT, BorderLayout.CENTER);
        content.revalidate();
        content.repaint();
    }//GEN-LAST:event_btnaggactiActionPerformed

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
       
    }//GEN-LAST:event_jButton1ActionPerformed

    private void jButton1MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jButton1MouseClicked
        Tableroacciones newFrame = null;
        try {
            newFrame = new Tableroacciones();
        } catch (Exception ex) {
            Logger.getLogger(pantallaTablero.class.getName()).log(Level.SEVERE, null, ex);
        }
        newFrame.setVisible(true);
        this.dispose();
    }//GEN-LAST:event_jButton1MouseClicked

    private void jButton7MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jButton7MouseClicked
        // TODO add your handling code here:
    }//GEN-LAST:event_jButton7MouseClicked

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
            java.util.logging.Logger.getLogger(pantallaTablero.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(pantallaTablero.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(pantallaTablero.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(pantallaTablero.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                try {
                    new pantallaTablero().setVisible(true);
                } catch (Exception ex) {
                    Logger.getLogger(pantallaTablero.class.getName()).log(Level.SEVERE, null, ex);
                }
            }
        }); 
   }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnaggacti;
    private javax.swing.JPanel content;
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton6;
    private javax.swing.JButton jButton7;
    private javax.swing.JButton jButton8;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane4;
    private javax.swing.JScrollPane jScrollPane5;
    private javax.swing.JLabel labelusuario;
    private javax.swing.JLabel lblacciones;
    private javax.swing.JLabel lblevaluaciones;
    private javax.swing.JLabel lblnombrefirma;
    private javax.swing.JLabel lblpartelat;
    private javax.swing.JLabel lblpartesup;
    private javax.swing.JLabel lbltuerca;
    private javax.swing.JTable tablafinalizada;
    private javax.swing.JTable tablapendiente;
    private javax.swing.JTable tablaproceso;
    // End of variables declaration//GEN-END:variables


    

}
