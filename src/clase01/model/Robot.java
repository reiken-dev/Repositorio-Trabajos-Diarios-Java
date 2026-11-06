package clase01.model;

/** Representa un robot cuyos atributos están protegidos. */
public class Robot {
    private String nombre;
    private int energia;

    /** Construye un robot con los valores iniciales indicados. */
    public Robot(String nombre, int energia) {
        this.nombre = nombre;
        setEnergia(energia);
    }

    /** Devuelve el nombre del robot. */
    public String getNombre() { return nombre; }

    /** Modifica el nombre del robot. */
    public void setNombre(String nombre) { this.nombre = nombre; }

    /** Devuelve la energía actual. */
    public int getEnergia() { return energia; }

    /** Modifica la energía si está en el intervalo de 0 a 100. */
    public void setEnergia(int energia) {
        if (energia >= 0 && energia <= 100) {
            this.energia = energia;
        }
    }
}
