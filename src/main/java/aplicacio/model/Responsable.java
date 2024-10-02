/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package aplicacio.model;

import java.util.Date;

/**
 *
 * @author Yoel
 */
public class Responsable extends Usuari {

    // Constructor que recibe todos los atributos
    public Responsable(String nomUsuari, String password, Date dataAlta, double sueldoMensual, int anysAntiguitat) {
        super(nomUsuari, password, dataAlta, sueldoMensual, anysAntiguitat);
    }

    // Constructor que solo recibe nomUsuari y password
    public Responsable(String nomUsuari, String password) {
        super(nomUsuari, password);
    }

}
