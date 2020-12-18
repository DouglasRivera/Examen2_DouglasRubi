/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package examen2_douglasrivera;

import java.io.BufferedWriter;
import java.io.File;
import java.io.FileWriter;
import java.util.ArrayList;
import java.util.Scanner;
import javax.swing.JOptionPane;

/**
 *
 * @author urs1
 */
public class OrdenesBinario {
    private ArrayList<Ordenes> ordenes;
    private File Archivo;

    public OrdenesBinario() {
        Archivo = new File("./ordenes.txt");
    }
    
      public void ReadFileScanner() {
        Scanner sc = null;//Hacemos lo mismo, leemos con el scanner
        try {
            sc = new Scanner(Archivo);
            while (sc.hasNext()) {
                String[] next = sc.nextLine().split("|"); 
                
                System.out.println(next);
            }
        } catch (Exception e) {
            e.printStackTrace();
            JOptionPane.showMessageDialog(null, "Error en la lectura.");
        }
        sc.close();
    }
     
     public ArrayList<Ordenes> ReadFileScannerArrayList() {
        Scanner sc = null;//Hacemos lo mismo, leemos con el scanner
        ArrayList<Ordenes> ordenes = new ArrayList<>();
        try {
            sc = new Scanner(Archivo);
            while (sc.hasNext()) {
                String temp = sc.nextLine();
                String[] next = temp.split(","); 
                ordenes.add(new Ordenes( ));
                
                // .out.println(next);
               
            }
            return ordenes;
        } catch (Exception e) {
            e.printStackTrace();
            JOptionPane.showMessageDialog(null, "Error en la lectura.");
            return ordenes;
        } finally {
             sc.close();
        }
        
    }
   
    
    public void WriteFile(Ordenes orden) {
        FileWriter fw = null;
        BufferedWriter bw = null; 
        try {
            fw = new FileWriter(Archivo, true);
            bw = new BufferedWriter(fw);
            bw.write(orden.toString());
            bw.newLine();
            bw.flush();
        } catch (Exception e) {
            e.printStackTrace();
            JOptionPane.showMessageDialog(null, "Error en la escritura.");
        }
    }
    
     public void WriteFileMod(ArrayList<Ordenes> ordenes) {
        FileWriter fw = null;
        BufferedWriter bw = null;
        try {
            fw = new FileWriter(Archivo, false);
            bw = new BufferedWriter(fw);
            for (Ordenes orden : ordenes) {
            bw.write(orden.toString());
            bw.newLine();
            }
            bw.flush();
        } catch (Exception e) {
            e.printStackTrace();
            JOptionPane.showMessageDialog(null, "Error en la escritura");
        }
    }
}
