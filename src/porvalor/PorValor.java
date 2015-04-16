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
public class PorValor {

    

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Color flor=new Color("rosa");
        System.out.println(flor.nombre);
        flor.ambiarObjeto(flor);
        System.out.println(flor.nombre);
        flor.cambiarNombre(flor);
        System.out.println(flor.nombre);
    }
    /*
    public static void mimetodo(int num) {
        num++;
        System.out.println("Imprimir desde método num=" + num + " a= " + a);

    }
    */
}
