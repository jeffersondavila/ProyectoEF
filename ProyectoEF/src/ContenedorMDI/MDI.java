/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ContenedorMDI;

import Modelo.*;
import Modelo.Usuarios;

/**
 *
 */
public class MDI extends javax.swing.JFrame {

    Usuarios mod;
    
    
    

    public MDI() {
        initComponents();
    }

    MDI(Usuarios mod) {
        initComponents();
        this.setExtendedState(MDI.MAXIMIZED_BOTH);
        setLocationRelativeTo(null);
        this.mod = mod;

         if (mod.getIdTipo() == 1) {
            menuAbrir.setVisible(true);
            menuCatalogo.setVisible(true);
            menuProcesos.setVisible(true);
            menuInformes.setVisible(true);
            menuHerramientas.setVisible(true);
            menuAyuda.setVisible(true);
            menuSalir.setVisible(true);
        }
         if (mod.getIdTipo() == 2) {
            menuAbrir.setVisible(true);
            menuCatalogo.setVisible(true);
            menuProcesos.setVisible(false);
            menuInformes.setVisible(false);
            menuHerramientas.setVisible(false);
            menuAyuda.setVisible(true);
            menuSalir.setVisible(true);
        }
          if (mod.getIdTipo() == 3) {
            menuAbrir.setVisible(true);
            menuCatalogo.setVisible(false);
            menuProcesos.setVisible(true);
            menuInformes.setVisible(true);
            menuHerramientas.setVisible(false);
            menuAyuda.setVisible(true);
            menuSalir.setVisible(true);
        }
           if (mod.getIdTipo() < 1||mod.getIdTipo() > 3){
            menuAbrir.setVisible(true);
            menuCatalogo.setVisible(false);
            menuProcesos.setVisible(true);
            menuInformes.setVisible(true);
            menuHerramientas.setVisible(false);
            menuAyuda.setVisible(true);
            menuSalir.setVisible(true);
        }
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jMenuItem11 = new javax.swing.JMenuItem();
        jDesktopPane1 = new javax.swing.JDesktopPane();
        FuncionUsuarioMantenimiento = new javax.swing.JMenuBar();
        menuAbrir = new javax.swing.JMenu();
        menuCatalogo = new javax.swing.JMenu();
        jMenuItem2 = new javax.swing.JMenuItem();
        jMenuItem1 = new javax.swing.JMenuItem();
        jMenuItem3 = new javax.swing.JMenuItem();
        jMenuItem7 = new javax.swing.JMenuItem();
        jMenuItem8 = new javax.swing.JMenuItem();
        jMenuItem9 = new javax.swing.JMenuItem();
        jMenuItem10 = new javax.swing.JMenuItem();
        jMenuItem12 = new javax.swing.JMenuItem();
        jMenuItem13 = new javax.swing.JMenuItem();
        menuProcesos = new javax.swing.JMenu();
        jMenuItem5 = new javax.swing.JMenuItem();
        jMenuItem6 = new javax.swing.JMenuItem();
        menuInformes = new javax.swing.JMenu();
        menuHerramientas = new javax.swing.JMenu();
        menuAyuda = new javax.swing.JMenu();
        menuSalir = new javax.swing.JMenu();
        jMenuItem4 = new javax.swing.JMenuItem();

        jMenuItem11.setText("jMenuItem11");

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);

        jDesktopPane1.setBackground(new java.awt.Color(0, 51, 102));

        javax.swing.GroupLayout jDesktopPane1Layout = new javax.swing.GroupLayout(jDesktopPane1);
        jDesktopPane1.setLayout(jDesktopPane1Layout);
        jDesktopPane1Layout.setHorizontalGroup(
            jDesktopPane1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 568, Short.MAX_VALUE)
        );
        jDesktopPane1Layout.setVerticalGroup(
            jDesktopPane1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 408, Short.MAX_VALUE)
        );

        menuAbrir.setText("ABRIR");
        FuncionUsuarioMantenimiento.add(menuAbrir);

        menuCatalogo.setText("CATALOGO");

        jMenuItem2.setText("Mantenimiento Alumnos");
        jMenuItem2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItem2ActionPerformed(evt);
            }
        });
        menuCatalogo.add(jMenuItem2);

        jMenuItem1.setText("Mantenimiento Maestros");
        jMenuItem1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItem1ActionPerformed(evt);
            }
        });
        menuCatalogo.add(jMenuItem1);

        jMenuItem3.setText("Mantenimiento Facultades");
        jMenuItem3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItem3ActionPerformed(evt);
            }
        });
        menuCatalogo.add(jMenuItem3);

        jMenuItem7.setText("Mantenimiento Carreras");
        jMenuItem7.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItem7ActionPerformed(evt);
            }
        });
        menuCatalogo.add(jMenuItem7);

        jMenuItem8.setText("Mantenimiento Cursos");
        jMenuItem8.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItem8ActionPerformed(evt);
            }
        });
        menuCatalogo.add(jMenuItem8);

        jMenuItem9.setText("Mantenimiento Secciones");
        jMenuItem9.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItem9ActionPerformed(evt);
            }
        });
        menuCatalogo.add(jMenuItem9);

        jMenuItem10.setText("Mantenimiento Sedes");
        jMenuItem10.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItem10ActionPerformed(evt);
            }
        });
        menuCatalogo.add(jMenuItem10);

        jMenuItem12.setText("Mantenimiento Aulas");
        jMenuItem12.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItem12ActionPerformed(evt);
            }
        });
        menuCatalogo.add(jMenuItem12);

        jMenuItem13.setText("Mantenimiento Jornadas");
        jMenuItem13.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItem13ActionPerformed(evt);
            }
        });
        menuCatalogo.add(jMenuItem13);

        FuncionUsuarioMantenimiento.add(menuCatalogo);

        menuProcesos.setText("PROCESOS");

        jMenuItem5.setText("Asignacion Alumno");
        jMenuItem5.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItem5ActionPerformed(evt);
            }
        });
        menuProcesos.add(jMenuItem5);

        jMenuItem6.setText("Asignacion Maestro");
        jMenuItem6.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItem6ActionPerformed(evt);
            }
        });
        menuProcesos.add(jMenuItem6);

        FuncionUsuarioMantenimiento.add(menuProcesos);

        menuInformes.setText("INFORMES");
        FuncionUsuarioMantenimiento.add(menuInformes);

        menuHerramientas.setText("HERRAMIENTAS");
        FuncionUsuarioMantenimiento.add(menuHerramientas);

        menuAyuda.setText("AYUDA");
        FuncionUsuarioMantenimiento.add(menuAyuda);

        menuSalir.setText("SALIR");

        jMenuItem4.setText("Salir");
        jMenuItem4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItem4ActionPerformed(evt);
            }
        });
        menuSalir.add(jMenuItem4);

        FuncionUsuarioMantenimiento.add(menuSalir);

        setJMenuBar(FuncionUsuarioMantenimiento);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jDesktopPane1)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jDesktopPane1)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jMenuItem4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItem4ActionPerformed
        // TODO add your handling code here:
        dispose();//Codigo  para  salir del Programa
    }//GEN-LAST:event_jMenuItem4ActionPerformed

    private void jMenuItem5ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItem5ActionPerformed
        
    }//GEN-LAST:event_jMenuItem5ActionPerformed

    private void jMenuItem6ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItem6ActionPerformed
        
         
    }//GEN-LAST:event_jMenuItem6ActionPerformed

    private void jMenuItem2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItem2ActionPerformed
        
        
    }//GEN-LAST:event_jMenuItem2ActionPerformed

    private void jMenuItem1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItem1ActionPerformed
        
    }//GEN-LAST:event_jMenuItem1ActionPerformed

    private void jMenuItem3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItem3ActionPerformed
        
    }//GEN-LAST:event_jMenuItem3ActionPerformed

    private void jMenuItem7ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItem7ActionPerformed
        
    }//GEN-LAST:event_jMenuItem7ActionPerformed

    private void jMenuItem8ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItem8ActionPerformed
        
    }//GEN-LAST:event_jMenuItem8ActionPerformed

    private void jMenuItem9ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItem9ActionPerformed
       
    }//GEN-LAST:event_jMenuItem9ActionPerformed

    private void jMenuItem10ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItem10ActionPerformed
        
    }//GEN-LAST:event_jMenuItem10ActionPerformed

    private void jMenuItem12ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItem12ActionPerformed
        
    }//GEN-LAST:event_jMenuItem12ActionPerformed

    private void jMenuItem13ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItem13ActionPerformed
        
    }//GEN-LAST:event_jMenuItem13ActionPerformed

    public static void main(String args[]) {
        

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new MDI().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JMenuBar FuncionUsuarioMantenimiento;
    private javax.swing.JDesktopPane jDesktopPane1;
    private javax.swing.JMenuItem jMenuItem1;
    private javax.swing.JMenuItem jMenuItem10;
    private javax.swing.JMenuItem jMenuItem11;
    private javax.swing.JMenuItem jMenuItem12;
    private javax.swing.JMenuItem jMenuItem13;
    private javax.swing.JMenuItem jMenuItem2;
    private javax.swing.JMenuItem jMenuItem3;
    private javax.swing.JMenuItem jMenuItem4;
    private javax.swing.JMenuItem jMenuItem5;
    private javax.swing.JMenuItem jMenuItem6;
    private javax.swing.JMenuItem jMenuItem7;
    private javax.swing.JMenuItem jMenuItem8;
    private javax.swing.JMenuItem jMenuItem9;
    private javax.swing.JMenu menuAbrir;
    private javax.swing.JMenu menuAyuda;
    private javax.swing.JMenu menuCatalogo;
    private javax.swing.JMenu menuHerramientas;
    private javax.swing.JMenu menuInformes;
    private javax.swing.JMenu menuProcesos;
    private javax.swing.JMenu menuSalir;
    // End of variables declaration//GEN-END:variables
}
