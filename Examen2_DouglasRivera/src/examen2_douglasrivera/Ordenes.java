/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package examen2_douglasrivera;

/**
 *
 * @author urs1
 */
public class Ordenes {
    int Id;
    int Pollos;
    int Biscuits;
    int Pure;
    int Papas;
    int Refresco;
    int Pies;
    Clientes cl = new Clientes();
    String IdCliente;

    public Ordenes() {
    }

    public Ordenes(int Id, int Pollos, int Biscuits, int Pure, int Papas, int Refresco, int Pies, String IdCliente) {
        this.Id = Id;
        this.Pollos = Pollos;
        this.Biscuits = Biscuits;
        this.Pure = Pure;
        this.Papas = Papas;
        this.Refresco = Refresco;
        this.Pies = Pies;
        this.IdCliente = IdCliente;
    }

    public int getId() {
        return Id;
    }

    public void setId(int Id) {
        this.Id = Id;
    }

    public int getPollos() {
        return Pollos;
    }

    public void setPollos(int Pollos) {
        this.Pollos = Pollos;
    }

    public int getBiscuits() {
        return Biscuits;
    }

    public void setBiscuits(int Biscuits) {
        this.Biscuits = Biscuits;
    }

    public int getPure() {
        return Pure;
    }

    public void setPure(int Pure) {
        this.Pure = Pure;
    }

    public int getPapas() {
        return Papas;
    }

    public void setPapas(int Papas) {
        this.Papas = Papas;
    }

    public int getRefresco() {
        return Refresco;
    }

    public void setRefresco(int Refresco) {
        this.Refresco = Refresco;
    }

    public int getPies() {
        return Pies;
    }

    public void setPies(int Pies) {
        this.Pies = Pies;
    }

    public Clientes getCl() {
        return cl;
    }

    public void setCl(Clientes cl) {
        this.cl = cl;
    }
    public String getIdCliente() {
        return IdCliente;
    }

    public void setIdCliente(String IdCliente) {
        this.IdCliente = IdCliente;
    }

    @Override
    public String toString() {
        return Id+","+Pollos+","+Biscuits+","+Pure+","+Papas+","+Refresco+","+Pies+","+IdCliente;
    }
    
    
    
    
}
