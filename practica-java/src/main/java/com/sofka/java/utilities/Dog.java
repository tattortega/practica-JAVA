package com.sofka.java.utilities;

import com.sofka.java.utilities.abstracts.Animal;
import com.sofka.java.utilities.interfaces.IDog;

import java.util.logging.Logger;

/**
 * Clase Perro que hereda de Animal e implementa interfaz propia
 *
 * @author Ricardo Ortega <tattortega.28@gmail.com>
 * @version 1.0.0 2022/05/27
 * @since 1.0.0
 */
public class Dog extends Animal implements IDog {

    /**
     * Instancia de la clase logger para registrar mensajes en consola
     */
    static final Logger logger = Logger.getLogger("logger");
    /**
     * Raza de perro
     */
    private final String race;

    /**
     * Constructor de la clase perro
     *
     * @param name  Nombre
     * @param age   Edad
     * @param genre Género
     * @param race  Raza
     */
    public Dog(String name, String age, String genre, String race) {
        super(name, age, genre);
        this.race = race;
    }

    /**
     * Método olfatear
     */
    public void sniff() {
        logger.info("El perro olfatea un paquete sospechoso");
    }

    /**
     * Método ladrar
     */
    public void bark() {
        logger.info("El perro esta ladrando para avisar de un peligro");
    }

    /**
     * Sobrescritura del método toString
     *
     * @return Información del perro
     */
    @Override
    public String toString() {
        return "Perro{" +
                "raza=" + race +
                ", género=" + genre +
                ", edad=" + age +
                ", nombre=" + name +
                '}';
    }
}
