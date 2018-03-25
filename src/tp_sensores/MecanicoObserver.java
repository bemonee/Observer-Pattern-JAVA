package tp_sensores;

import java.util.Observable;
import java.util.Observer;

/**
 *
 * @author Ramiro Agustin Pereyra Noreiko
 */
public class MecanicoObserver implements Observer {

    @Override
    public void update(Observable o, Object arg) {
        if (o instanceof AutoObservable) {
            AutoObservable auto = ((AutoObservable) o);
            double presion = auto.getPresion_neumaticos();
            if (this.check(presion, auto.limites_presion)) {
                auto.setPresion_neumaticos(auto.limites_presion.maximo);
                System.out.println("Se corrigio la presion de los neumaticos: " + presion + " -> " + auto.getPresion_neumaticos());
            }
            double aceite = auto.getNivel_aceite();
            if (this.check(aceite, auto.limites_aceite)) {
                auto.setNivel_aceite(auto.limites_aceite.maximo);
                System.out.println("Se corrigio el nivel de aceite: " + aceite + " -> " + auto.getNivel_aceite());
            }
            double agua = auto.getNivel_de_agua();
            if (this.check(agua, auto.limites_agua)) {
                auto.setNivel_de_agua(auto.limites_agua.maximo);
                System.out.println("Se corrigio el nivel de agua: " + agua + " -> " + auto.getNivel_de_agua());
            }
        }
    }

    public boolean check(double variable, Par<Double> limites) {
        return (variable <= limites.minimo || variable > limites.maximo);
    }
}
