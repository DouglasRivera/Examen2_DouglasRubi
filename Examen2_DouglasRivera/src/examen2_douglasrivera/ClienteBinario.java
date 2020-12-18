/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package examen2_douglasrivera;

import java.io.BufferedWriter;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Scanner;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;

/**
 *
 * @author urs1
 */
public class ClienteBinario {
      private ArrayList<Clientes> clientes;
      private File Archivo;

    public ClienteBinario() {
        Archivo = new File("./clientes.txt");
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
     
     public ArrayList<Clientes> ReadFileScannerArrayList() {
        Scanner sc = null;//Hacemos lo mismo, leemos con el scanner
        ArrayList<Clientes> clientes = new ArrayList<>();
        try {
            sc = new Scanner(Archivo);
            while (sc.hasNext()) {
                String temp = sc.nextLine();
                String[] next = temp.split(","); 
                Long rtn = ("".equals(next[3]) || next[3] == null) ? 0L :  Long.parseLong(next[3]);
                clientes.add(new Clientes(next[0], next[1], next[2],rtn ));
                
                // .out.println(next);
               
            }
            return clientes;
        } catch (Exception e) {
            e.printStackTrace();
            JOptionPane.showMessageDialog(null, "Error en la lectura.");
            return clientes;
        } finally {
             sc.close();
        }
        
    }
   
    
    public void WriteFile(Clientes cliente) {
        FileWriter fw = null;
        BufferedWriter bw = null; 
        try {
            fw = new FileWriter(Archivo, true);
            bw = new BufferedWriter(fw);
            bw.write(cliente.toString());
            bw.newLine();
            bw.flush();
        } catch (Exception e) {
            e.printStackTrace();
            JOptionPane.showMessageDialog(null, "Error en la escritura.");
        }
    }
    
     public void WriteFileMod(ArrayList<Clientes> clientes) {
        FileWriter fw = null;
        BufferedWriter bw = null;
        try {
            fw = new FileWriter(Archivo, false);
            bw = new BufferedWriter(fw);
            for (Clientes cliente : clientes) {
            bw.write(cliente.toString());
            bw.newLine();
            }
            bw.flush();
        } catch (Exception e) {
            e.printStackTrace();
            JOptionPane.showMessageDialog(null, "Error en la escritura");
        }
    }
}
