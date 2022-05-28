package com.sofka.java.utilities.abstracts;

import java.util.logging.Logger;

/**
 * Clase abstracta de animal
 * Se crean los atributos y métodos en común de animal
 *
 * @author Ricardo Ortega <tattortega.28@gmail.com>
 * @version 1.0.0 2022/05/27
 * @since 1.0.0
 */
public abstract class Animal {
    protected String genre;
    protected String age;
    protected String name;
    static final Logger logger = Logger.getLogger("logger");

    /**
     * Constructor de la clase animal
     *
     * @param genre Género
     * @param age   Edad
     * @param name  Nombre
     */
    protected Animal(String genre, String age, String name) {
        this.genre = genre;
        this.age = age;
        this.name = name;

    }

    /**
     * Método correr
     */
    public void run() {
        logger.info("El animal esta corriendo");
    }

    /**
     * Método detenerse
     */
    public void stop() {
        logger.info("El animal se detuvo");
    }

}
