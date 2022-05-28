package com.sofka.java.utilities;

import java.util.logging.Logger;

/**
 * Clase Mensajes que muestra por consola
 *
 * @author Ricardo Ortega <tattortega.28@gmail.com>
 * @version 1.0.0 2022/05/27
 * @since 1.0.0
 */
public class Messages {

    /**
     * Instancia de la clase logger para registrar mensajes en consola
     */
    static final Logger logger = Logger.getLogger("logger");

    /**
     * Instancia de la clase
     *
     * @return Objeto
     */
    public static Messages getInstance() {
        return new Messages();
    }

    /**
     * Método de bienvenida del programa
     */
    public void showWelcome() {
        logger.info("""
                Bienvenido al programa de adopción de mascotas\s
                ¿Que animal quieres adoptar?""");
    }

    /**
     * Método para mostrar opciones de animales
     */
    public void showOption() {
        logger.info("Digite una opción:\n1.Perro \n2.Gato");
    }

    /**
     * Método que solicita el género del animal
     */
    public void genreAnimal() {
        logger.info("¿Que género(macho o hembra) quiere a su mascota?");
    }

    /**
     * Método que solicita el nombre del animal
     */
    public void nameAnimal() {
        logger.info("¿Que nombre le pondrás a tu mascota?");
    }

    /**
     * Método que solicita la edad del animal
     */
    public void ageAnimal() {
        logger.info("¿De que edad(años) quieres tu mascota?");
    }

    /**
     * Método que solicita la raza del animal
     */
    public void raceAnimal() {
        logger.info("¿De que raza quieres tu mascota?");
    }

    /**
     * Método que solicita el color del animal
     */
    public void colorAnimal() {
        logger.info("¿De que color quieres a tu mascota?");
    }
}
