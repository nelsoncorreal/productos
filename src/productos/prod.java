/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package productos;

/**
 *
 * @author sebastian salamanca
 */
public class prod {
    String nombre;
    int cant;
    float precio;
    float IVA;

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getNombre() {
        return nombre;
    }

    public void setCant(int cant) {
        this.cant = cant;
    }

    public int getCant() {
        return cant;
    }

    public void setPrecio(float precio) {
        this.precio = precio;
    }

    public float getPrecio() {
        return precio;
    }

    public void setIVA(float IVA) {
        this.IVA = IVA;
    }

    public float getIVA() {
        return IVA;
    }
    
    
}
