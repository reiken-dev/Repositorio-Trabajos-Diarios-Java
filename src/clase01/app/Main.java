package clase01.app;

import clase01.model.Robot;

/** Demuestra atributos privados, getters, setters y validación. */
public class Main {
    /** Punto de entrada del miniproyecto. */
    public static void main(String[] args) {
        Robot robot = new Robot("Atlas Fix", 80);
        System.out.println("Energía inicial: " + robot.getEnergia());
        robot.setEnergia(120); // No se acepta: fuera del intervalo.
        System.out.println("Tras intento inválido: " + robot.getEnergia());
        robot.setEnergia(50);
        
    }
}
