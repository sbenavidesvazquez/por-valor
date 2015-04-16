/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package porvalor;

/**
 *
 * @author sbenavidesvazquez
 */
public class Color {
    String nombre;

    public Color(String nombre) {
        this.nombre = nombre;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }
    
    public void ambiarObjeto(Color obj1){
        obj1=new Color("purpura");
        System.out.println(obj1.nombre);
    }
    
    public void cambiarNombre(Color obj2){
        obj2.setNombre("azul");
        System.out.println(obj2.nombre);
    }
}
