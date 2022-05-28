package com.sofka.java;

import com.sofka.java.utilities.Cat;
import com.sofka.java.utilities.Dog;
import com.sofka.java.utilities.Messages;

import java.util.Scanner;
import java.util.logging.Logger;

/**
 * Clase principal donde se ejecuta el programa
 * Se pide por consola los datos de adopción del animal seleccionado
 *
 * @author Ricardo Ortega <tattortega.28@gmail.com>
 * @version 1.0.0 2022/05/27
 * @since 1.0.0
 */
public class App {

    /**
     * Instancia de la clase logger para registrar mensajes en consola
     */
    static final Logger logger = Logger.getLogger("logger");
    /**
     * Instancia de la clase messages para mostrar datos por pantalla
     */
    static Messages messages = Messages.getInstance();
    /**
     * Instancia de la clase Scanner para capturar valores por teclado
     */
    static final Scanner input = new Scanner(System.in);


    public static void main(String[] args) {
        try {
            messages.showWelcome();
            messages.showOption();
            Integer animalSelected = getAnimalSelected();
            if (animalSelected != 1 && animalSelected != 2) {
                logger.info("Solo hay dos animales para elegir, intenta de nuevo");
            } else {
                messages.genreAnimal();
                String genreAnimal = getInputText();
                messages.nameAnimal();
                String nameAnimal = getInputText();
                messages.ageAnimal();
                String ageAnimal = getInputText();
                String informationAnimal;
                if (animalSelected.equals(1)) {
                    messages.raceAnimal();
                    String raceAnimal = getInputText();
                    Dog dog = new Dog(nameAnimal, ageAnimal, genreAnimal, raceAnimal);
                    informationAnimal = dog.toString();
                    logger.info(informationAnimal);
                    dog.run();
                    dog.stop();
                    dog.sniff();
                    dog.bark();
                } else {
                    messages.colorAnimal();
                    String colorAnimal = getInputText();
                    Cat cat = new Cat(nameAnimal, ageAnimal, genreAnimal, colorAnimal);
                    informationAnimal = cat.toString();
                    logger.info(informationAnimal);
                    cat.purr();
                    cat.run();
                    cat.stop();
                    cat.scratch();
                }
            }
        } catch (Exception e) {
            e.getCause();
            logger.warning("Error en el proceso de adopción, intenta de nuevo");
        }
    }

    /**
     * Método para capturar la opción del animal seleccionado
     *
     * @return Integer
     */
    private static Integer getAnimalSelected() {
        int option;
        option = input.nextInt();
        return option;
    }

    /**
     * Método para capturar texto
     *
     * @return String
     */
    private static String getInputText() {
        String text;
        text = input.next();
        return text;
    }
}
