/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package deberestudiantes;

import java.util.ArrayList;
import javax.swing.JOptionPane;
public class VentanaEstudiantes extends javax.swing.JFrame {

   ArrayList<DeberEstudiantes> estudiante = new ArrayList();
       int aumento=0;
   public VentanaEstudiantes() {
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

        Titulo = new javax.swing.JLabel();
        lblNombre = new javax.swing.JLabel();
        lblApellido = new javax.swing.JLabel();
        lblNota1 = new javax.swing.JLabel();
        lblNota2 = new javax.swing.JLabel();
        lblNota3 = new javax.swing.JLabel();
        txtNota1 = new javax.swing.JTextField();
        txtNombre = new javax.swing.JTextField();
        txtApellido = new javax.swing.JTextField();
        txtNota2 = new javax.swing.JTextField();
        txtNota3 = new javax.swing.JTextField();
        btnProceso = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        Pantalla = new javax.swing.JTextArea();
        btnReiniciar = new javax.swing.JButton();
        btnIngresar = new javax.swing.JButton();
        btnSalir = new javax.swing.JButton();
        lblMensaje = new javax.swing.JLabel();
        lblEtiqueta = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        Titulo.setText("ESTUDIANTES");
        getContentPane().add(Titulo, new org.netbeans.lib.awtextra.AbsoluteConstraints(164, 11, -1, -1));

        lblNombre.setText("NOMBRE");
        getContentPane().add(lblNombre, new org.netbeans.lib.awtextra.AbsoluteConstraints(55, 46, -1, -1));

        lblApellido.setText("APELLIDO");
        getContentPane().add(lblApellido, new org.netbeans.lib.awtextra.AbsoluteConstraints(55, 80, -1, -1));

        lblNota1.setText("NOTA 1");
        getContentPane().add(lblNota1, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 111, -1, -1));

        lblNota2.setText("NOTA 2");
        getContentPane().add(lblNota2, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 137, -1, -1));

        lblNota3.setText("NOTA 3");
        getContentPane().add(lblNota3, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 163, -1, -1));

        txtNota1.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        txtNota1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtNota1ActionPerformed(evt);
            }
        });
        getContentPane().add(txtNota1, new org.netbeans.lib.awtextra.AbsoluteConstraints(149, 108, 65, -1));

        txtNombre.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        txtNombre.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtNombreActionPerformed(evt);
            }
        });
        getContentPane().add(txtNombre, new org.netbeans.lib.awtextra.AbsoluteConstraints(134, 43, 185, -1));

        txtApellido.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        getContentPane().add(txtApellido, new org.netbeans.lib.awtextra.AbsoluteConstraints(134, 77, 185, -1));

        txtNota2.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        getContentPane().add(txtNota2, new org.netbeans.lib.awtextra.AbsoluteConstraints(149, 134, 65, -1));

        txtNota3.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        getContentPane().add(txtNota3, new org.netbeans.lib.awtextra.AbsoluteConstraints(149, 160, 65, -1));

        btnProceso.setText("MOSTRAR");
        btnProceso.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnProcesoActionPerformed(evt);
            }
        });
        getContentPane().add(btnProceso, new org.netbeans.lib.awtextra.AbsoluteConstraints(238, 193, -1, -1));

        Pantalla.setColumns(20);
        Pantalla.setRows(5);
        jScrollPane1.setViewportView(Pantalla);

        getContentPane().add(jScrollPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 254, 294, 153));

        btnReiniciar.setText("REINICIAR");
        btnReiniciar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnReiniciarActionPerformed(evt);
            }
        });
        getContentPane().add(btnReiniciar, new org.netbeans.lib.awtextra.AbsoluteConstraints(95, 413, -1, -1));

        btnIngresar.setText("INGRESAR");
        btnIngresar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnIngresarActionPerformed(evt);
            }
        });
        getContentPane().add(btnIngresar, new org.netbeans.lib.awtextra.AbsoluteConstraints(99, 193, -1, -1));

        btnSalir.setText("SALIR");
        btnSalir.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnSalirActionPerformed(evt);
            }
        });
        getContentPane().add(btnSalir, new org.netbeans.lib.awtextra.AbsoluteConstraints(255, 413, -1, -1));
        getContentPane().add(lblMensaje, new org.netbeans.lib.awtextra.AbsoluteConstraints(99, 222, 220, 21));

        lblEtiqueta.setText(" Nombre        Apellido     N1   N2   N3   Promedio");
        getContentPane().add(lblEtiqueta, new org.netbeans.lib.awtextra.AbsoluteConstraints(61, 240, 280, -1));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void txtNota1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtNota1ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtNota1ActionPerformed

    private void btnSalirActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnSalirActionPerformed
        System.exit(0);
    }//GEN-LAST:event_btnSalirActionPerformed

    private void btnReiniciarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnReiniciarActionPerformed
        int i=JOptionPane.showConfirmDialog(rootPane,"La información se borrará","Confirmación",JOptionPane.YES_NO_CANCEL_OPTION);
        if(i==0){
        Pantalla.setText("");
        estudiante.clear();
         aumento=0;
         lblMensaje.setText("");
        }
        
        aumento=0;
      
    }//GEN-LAST:event_btnReiniciarActionPerformed

    private void txtNombreActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtNombreActionPerformed
        
    }//GEN-LAST:event_txtNombreActionPerformed

    private void btnIngresarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnIngresarActionPerformed
       if (datos()==true){
        String nombre = txtNombre.getText();
        String apellido = txtApellido.getText();
       
         double num1= Double.parseDouble(txtNota1.getText());
         double num2 = Double.parseDouble(txtNota2.getText());
         double num3 = Double.parseDouble(txtNota3.getText());
       aumento=0;
         double promedio=(num1+num2+num3)/3;
          
             
             DeberEstudiantes e = new DeberEstudiantes(nombre.toUpperCase(),apellido.toUpperCase(),num1,num2,num3,promedio);
             estudiante.add(e);
             lblMensaje.setText("Estudiante Añadido");
             txtNombre.setText("");
             txtApellido.setText("");
             txtNota1.setText("");
             txtNota2.setText("");
             txtNota3.setText("");
            
             
         }  else  {
         JOptionPane.showMessageDialog(rootPane,"Ingrese todos los datos,Por favor.");
         }
    }//GEN-LAST:event_btnIngresarActionPerformed

    private void btnProcesoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnProcesoActionPerformed
         
         if(aumento==0){
                for(Object item : estudiante) {
               Pantalla.setText(Pantalla.getText() + '\n'+ item);            
          
                }  
                 
         }
          aumento=1;
         
    }//GEN-LAST:event_btnProcesoActionPerformed

   public boolean datos (){
   boolean confirmacion=true;   
   if(txtNombre.getText().equals("")||txtApellido.getText().equals("")|| txtNota1.getText().equals("") || txtNota2.getText().equals("") || txtNota3.getText().equals("") ){
    confirmacion = false;
            return confirmacion;
           }else{
            return confirmacion;
        }

   }
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JTextArea Pantalla;
    private javax.swing.JLabel Titulo;
    private javax.swing.JButton btnIngresar;
    private javax.swing.JButton btnProceso;
    private javax.swing.JButton btnReiniciar;
    private javax.swing.JButton btnSalir;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JLabel lblApellido;
    private javax.swing.JLabel lblEtiqueta;
    private javax.swing.JLabel lblMensaje;
    private javax.swing.JLabel lblNombre;
    private javax.swing.JLabel lblNota1;
    private javax.swing.JLabel lblNota2;
    private javax.swing.JLabel lblNota3;
    private javax.swing.JTextField txtApellido;
    private javax.swing.JTextField txtNombre;
    private javax.swing.JTextField txtNota1;
    private javax.swing.JTextField txtNota2;
    private javax.swing.JTextField txtNota3;
    // End of variables declaration//GEN-END:variables
}
