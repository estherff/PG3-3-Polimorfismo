/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package gal.teis.pgr.ud3.polimorfismo_1;

/**
 *
 * @author Esther Ferreiro
 */
public class EmpleadoProduccion extends Asalariado{

    private String turno;

    public EmpleadoProduccion(String nombre, String nif, int diasVacaciones, double salarioBase, String turno) {
        super(nombre, nif, diasVacaciones, salarioBase);
        this.turno = turno;
    }

    public String getTurno() {
        return this.turno;
    }

    public void setTurno(String nuevo_turno) {
        this.turno = nuevo_turno;
    }

    public double getSalario() {
        return super.getSalario() * (1 + 0.15);
    }

    @Override
    public String toString() {
        return super.toString() + "turno=" + turno + '}';
    }
    
    

}
