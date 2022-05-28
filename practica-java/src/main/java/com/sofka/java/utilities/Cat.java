package com.sofka.java.utilities;

import com.sofka.java.utilities.abstracts.Animal;
import com.sofka.java.utilities.interfaces.ICat;

import java.util.logging.Logger;

/**
 * Clase Gato que hereda de Animal e implementa interfaz propia
 *
 * @author Ricardo Ortega <tattortega.28@gmail.com>
 * @version 1.0.0 2022/05/27
 * @since 1.0.0
 */
public class Cat extends Animal implements ICat {

    /**
     * Instancia de la clase logger para registrar mensajes en consola
     */
    static final Logger logger = Logger.getLogger("logger");
    /**
     * Color del gato
     */
    private final String color;

    /**
     * Constructor de la clase gato
     *
     * @param name  Nombre
     * @param age   Edad
     * @param genre Género
     * @param color Color
     */
    public Cat(String name, String age, String genre, String color) {
        super(name, age, genre);
        this.color = color;
    }

    /**
     * Método arañar
     */
    public void scratch() {
        logger.info("El gato arañó el mueble");
    }

    /**
     * Método ronronear
     */
    public void purr() {
        logger.info("El gato esta ronroneando");
    }

    /**
     * Sobrescritura del método toString
     *
     * @return Información del gato
     */
    @Override
    public String toString() {
        return "Gato{" +
                "color=" + color +
                ", género=" + genre +
                ", edad=" + age +
                ", nombre=" + name +
                '}';
    }
}
