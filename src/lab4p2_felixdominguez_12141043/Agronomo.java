/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package lab4p2_felixdominguez_12141043;

/**
 *
 * @author Lenovo I7
 */
public class Agronomo extends Aldeano{
    private int ataque;

    public Agronomo() {
    }

    public Agronomo(String nombre, String apellido, int edad, int vida) {
        super(nombre, apellido, edad, vida);
        this.ataque = 100;
    }

    @Override
    public int getAtaque() {
        return ataque;
    }

    @Override
    public String toString() {
        return super.toString() + "ataque=" + ataque;
    }
}