/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package gal.teis.pgr.ud3.polimorfismo_0;

/**
 *
 * @author Esther Ferreiro
 */
public class Principal {

    /**
     * Método estático que ejecuta el método afinar() de cada objeto
     * que se pasa por parámetro. Usa polimorfismo en el paso de parámetros
     * @param i Instrumento
     */
    static void afinar(Instrumento i) {
        // ...
        System.out.println(i.afinar());
    }

    /**
     * Llama al método estático afinar de esta clase que usa el polimorfismo en 
     * el paso de parámetros 
     * @param e Array de Instrumento 
     */
    static void afinarTodo(Instrumento[] e) {

        for (int i = 0; i < e.length; i++) {
            afinar(e[i]);
        }
    }

    public static void main(String[] args) {
        Instrumento[] orquesta = new Instrumento[4];
        int i = 0;
        // Up-casting al asignarse el Arreglo
        orquesta[i++] = new Guitarra();
        orquesta[i++] = new Piano();
        orquesta[i++] = new Saxofon();
        orquesta[i++] = new Ukelele();
        afinarTodo(orquesta);
    }

}
