/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package main;

import java.time.LocalDate;
import java.util.List;
import javax.swing.JTable;
import javax.swing.table.DefaultTableModel;
import static main.location.verdad;

/**
 *
 * @author salak403
 */
public class citas extends javax.swing.JFrame {

    public JTable tablapacientes;
    public static boolean verdad=true;
    
    public citas(JTable tablapacientes) {
        initComponents();
        this.tablapacientes=tablapacientes;
        jTable1.setModel(tablapacientes.getModel());
        
        if(verdad==true)
        {
           agregar(); 
        }
       
    }
    
    public void agregar()
    {
        DefaultTableModel modelo= (DefaultTableModel) jTable1.getModel();
        modelo.addColumn("PROXIMA CITA");
        jTable1.setModel(modelo);
        verdad=false;
    }
    
    public void citaagregada(List<paciente> lista)
    {
        LocalDate ultimacita=null;
        
        int fila=jTable1.getRowCount();
        
        if(fila>0)
        {
            ultimacita=(LocalDate) jTable1.getValueAt(fila-1, 4);
        }
        
        int edad1=(int) jTable1.getValueAt(fila-1, 2);
        
        LocalDate proximacita;
        proximacita= calcular(ultimacita,edad1);
        
        modificarfecha(proximacita,lista);
        
    }
    
    public void modificarfecha(LocalDate proximacita, List<paciente> lista)
    {
        DefaultTableModel modelo = (DefaultTableModel) jTable1.getModel();
        
        for(int i=0;i<lista.size();i++)
        {
            if(modelo.getValueAt(i, modelo.getColumnCount()-1) == null)
            {
                modelo.setValueAt(proximacita, i, modelo.getColumnCount()-1);
            }
        }
        
        jTable1.setModel(modelo);
    }
    
    public LocalDate calcular(LocalDate ultimacita,int edad)
    {
        if(edad>=25 && edad<35)
        {
           return ultimacita.plusMonths(2).plusWeeks(2);
        }
        else
        {
            if(edad>=35 && edad<45)
            {
               return ultimacita.plusMonths(1).plusWeeks(2);
            }
            else
            {
               return ultimacita.plusWeeks(2);
            }
        }
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
        jScrollPane1 = new javax.swing.JScrollPane();
        jTable1 = new javax.swing.JTable();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jLabel1.setText("CITA AGENDADA PARA EL PACIENTE");

        jTable1.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null}
            },
            new String [] {
                "Title 1", "Title 2", "Title 3", "Title 4", "Title 5"
            }
        ));
        jScrollPane1.setViewportView(jTable1);

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(25, 25, 25)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 677, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel1))
                .addContainerGap(65, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel1)
                .addGap(38, 38, 38)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(51, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 193, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 180, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    /**
     * @param args the command line arguments
     */
    

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel jLabel1;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTable jTable1;
    // End of variables declaration//GEN-END:variables
}
