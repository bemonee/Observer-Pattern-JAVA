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
            if (this.check(auto.getPresion_neumaticos(), auto.limites_presion)) {
                auto.setPresion_neumaticos(auto.limites_presion.maximo);
                System.out.println("Se corrigio la presion de los neumaticos");
            }
            if (this.check(auto.getNivel_aceite(), auto.limites_aceite)) {
                auto.setNivel_aceite(auto.limites_aceite.maximo);
                System.out.println("Se corrigio el nivel de aceite");
            }
            if (this.check(auto.getNivel_de_agua(), auto.limites_agua)) {
                auto.setNivel_de_agua(auto.limites_agua.maximo);
                System.out.println("Se corrigio el nivel de agua");
            }
        }
    }

    public boolean check(double variable, Par<Double> limites) {
        return (variable <= limites.minimo || variable > limites.maximo);
    }
}
