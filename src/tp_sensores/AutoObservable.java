package tp_sensores;

import java.util.Observable;

/**
 *
 * @author Ramiro Agustin Pereyra Noreiko
 */
public class AutoObservable extends Observable {

    private String patente;
    private String marca;
    private String modelo;

    private double nivel_aceite;
    private double presion_neumaticos;
    private double nivel_de_agua;

    public final Par<Double> limites_aceite;
    public final Par<Double> limites_presion;
    public final Par<Double> limites_agua;

    public AutoObservable(String patente, String marca, String modelo, double nivel_aceite, double presion_neumaticos, double nivel_de_agua) {
        this.patente = patente;
        this.marca = marca;
        this.modelo = modelo;
        this.nivel_aceite = nivel_aceite;
        this.presion_neumaticos = presion_neumaticos;
        this.nivel_de_agua = nivel_de_agua;

        this.limites_aceite = new Par<>(0.6, 1.6);
        this.limites_presion = new Par<>(22.0, 30.0);
        this.limites_agua = new Par<>(0.5, 1.5);
    }

    public void recorrer(int kms) {
        for (int i = 0; i <= kms; i++) {
            this.setNivel_aceite(this.nivel_aceite - 0.01);
            this.setNivel_de_agua(this.nivel_de_agua - 0.02);
            this.setPresion_neumaticos(this.presion_neumaticos - 0.1);
        }
    }

    private void setChangedAndNotify() {
        this.setChanged();
        this.notifyObservers();
    }

    public String getPatente() {
        return patente;
    }

    public void setPatente(String patente) {
        this.patente = patente;
    }

    public String getMarca() {
        return marca;
    }

    public void setMarca(String marca) {
        this.marca = marca;
    }

    public String getModelo() {
        return modelo;
    }

    public void setModelo(String modelo) {
        this.modelo = modelo;
    }

    public double getNivel_aceite() {
        return nivel_aceite;
    }

    public void setNivel_aceite(double nivel_aceite) {
        this.nivel_aceite = nivel_aceite;
        this.setChangedAndNotify();
    }

    public double getPresion_neumaticos() {
        return presion_neumaticos;
    }

    public void setPresion_neumaticos(double presion_neumaticos) {
        this.presion_neumaticos = presion_neumaticos;
        this.setChangedAndNotify();
    }

    public double getNivel_de_agua() {
        return nivel_de_agua;
    }

    public void setNivel_de_agua(double nivel_de_agua) {
        this.nivel_de_agua = nivel_de_agua;
        this.setChangedAndNotify();
    }

}
