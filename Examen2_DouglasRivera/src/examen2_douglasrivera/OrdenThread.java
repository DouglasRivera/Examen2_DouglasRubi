/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package examen2_douglasrivera;

import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JLabel;
import javax.swing.JProgressBar;
import javax.swing.JTable;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author urs1
 */
public class OrdenThread  extends Thread{

    private JProgressBar barra;
    private JTable tabla;
    private JLabel etiqueta;
    private boolean vive;
    private Ordenes orden;
    private boolean enProgreso;

    public OrdenThread(JProgressBar barra, JTable tabla) {
        this.barra = barra;
        this.tabla = tabla;
    }

    public OrdenThread(JProgressBar barra, JTable tabla, JLabel etiqueta) {
        this.barra = barra;
        this.tabla = tabla;
        this.etiqueta = etiqueta;
    }

    public OrdenThread(JProgressBar barra, JTable tabla, JLabel etiqueta, boolean vive, Ordenes orden) {
        this.barra = barra;
        this.tabla = tabla;
        this.etiqueta = etiqueta;
        this.vive = vive;
        this.orden = orden;
    }

    public Ordenes getOrden() {
        return orden;
    }

    public void setOrden(Ordenes orden) {
        this.orden = orden;
    }

    public boolean isEnProgreso() {
        return enProgreso;
    }

    public void setEnProgreso(boolean enProgreso) {
        this.enProgreso = enProgreso;
    }
    
    

    public JProgressBar getBarra() {
        return barra;
    }

    public void setBarra(JProgressBar barra) {
        this.barra = barra;
    }

    public JTable getTabla() {
        return tabla;
    }

    public void setTabla(JTable tabla) {
        this.tabla = tabla;
    }

    public boolean isVive() {
        return vive;
    }

    public void setVive(boolean vive) {
        this.vive = vive;
    }

    public JLabel getEtiqueta() {
        return etiqueta;
    }

    public void setEtiqueta(JLabel etiqueta) {
        this.etiqueta = etiqueta;
    }
    
    
    
    @Override
    public void run() {
        super.run(); //To change body of generated methods, choose Tools | Templates.
         while (vive) {
             if(enProgreso){
                   DefaultTableModel modelo = (DefaultTableModel) tabla.getModel();
             barra.setMaximum(orden.getPollos());
             for (int i = 1; i <= orden.getPollos(); i++) {
                esperar(1000);
                this.barra.setValue(barra.getValue()+1);
             }
             this.etiqueta.setText("Piezas de pollo fritas");
              Object newRow[] = {
                            orden.getId(),orden.getPollos()+ " Piezas de pollo", orden.getPollos() * 1 };
              modelo.addRow(newRow);
              tabla.setModel(modelo);
             
              barra.setValue(0);
             barra.setMaximum(orden.getBiscuits());
              for (int i = 1; i <= orden.getBiscuits(); i++) {
                esperar(1000);
                this.barra.setValue(barra.getValue()+1);
             }
             this.etiqueta.setText("Bisquits listos");
             Object newRow1[] = {
                            orden.getId(),orden.getBiscuits()+ " Bisquits", orden.getBiscuits()* 1 };
              modelo.addRow(newRow1);
              tabla.setModel(modelo);
             
              barra.setValue(0);
             barra.setMaximum(orden.getPure());
              for (int i = 1; i <= orden.getPure(); i++) {
                esperar(1000);
                this.barra.setValue(barra.getValue()+1);
             }
             this.etiqueta.setText("Pure listo");
             Object newRow2[] = {
                            orden.getId(),orden.getPure()+ " Puré", orden.getPure()* 1 };
              modelo.addRow(newRow2);
              tabla.setModel(modelo);
              
              barra.setValue(0);
             barra.setMaximum(orden.getPapas());
              for (int i = 1; i <= orden.getPapas(); i++) {
                esperar(1000);
                this.barra.setValue(barra.getValue()+1);
             }
             this.etiqueta.setText("Papas listas");
             Object newRow3[] = {
                            orden.getId(),orden.getPapas()+ " Papas Fritas", orden.getPapas()* 1 };
              modelo.addRow(newRow3);
              tabla.setModel(modelo);
              
              barra.setValue(0);
             barra.setMaximum(orden.getRefresco());
              for (int i = 1; i <= orden.getRefresco(); i++) {
                esperar(1000);
                this.barra.setValue(barra.getValue()+1);
             }
             this.etiqueta.setText("Refresco");
             Object newRow4[] = {
                            orden.getId(),orden.getRefresco()+ " Refresco", orden.getRefresco()* 1 };
              modelo.addRow(newRow4);
              tabla.setModel(modelo);
              
              barra.setValue(0);
             barra.setMaximum(orden.getPies());
              for (int i = 1; i <= orden.getPies(); i++) {
                esperar(1000);
                this.barra.setValue(barra.getValue()+1);
             }
             this.etiqueta.setText("Pie");
             Object newRow5[] = {
                            orden.getId(),orden.getPies()+ " Pie", orden.getPies()* 1 };
              modelo.addRow(newRow5);
              tabla.setModel(modelo);
              
              esperar(1000);
              this.etiqueta.setText("Orden lista");
              enProgreso = false;
         } else {
                 barra.setValue(0);
                

             }
         } 
        
    }
    
    private void esperar(long milisegundos){
        try {
            Thread.sleep(milisegundos);
        } catch (InterruptedException ex) {
            ex.printStackTrace();
            Logger.getLogger(OrdenThread.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
    
    
    
}
