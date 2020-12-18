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
public class Clientes {
    String Id;
    String Nombre;
    String Apellido;
    Long Rtn;

    public Clientes() {
    }

    public Clientes(String Id, String Nombre, String Apellido, Long Rtn) {
        this.Id = Id;
        this.Nombre = Nombre;
        this.Apellido = Apellido;
        this.Rtn = Rtn;
    }

    public String getId() {
        return Id;
    }

    public void setId(String Id) {
        this.Id = Id;
    }

    public String getNombre() {
        return Nombre;
    }

    public void setNombre(String Nombre) {
        this.Nombre = Nombre;
    }

    public String getApellido() {
        return Apellido;
    }

    public void setApellido(String Apellido) {
        this.Apellido = Apellido;
    }

    public Long getRtn() {
        return Rtn;
    }

    public void setRtn(Long Rtn) {
        this.Rtn = Rtn;
    }

    @Override
    public String toString() {
        return Id+","+Nombre+","+Apellido+","+Rtn; //To change body of generated methods, choose Tools | Templates.
    }
    
    
    
}
