package tp_sensores;

/**
 * 
 * @author Ramiro Agustin Pereyra Noreiko
 */
public class Tp_sensores {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        AutoObservable auto = new AutoObservable("ABC123", "Volkswagen", "Gol", 1.6, 15, 1.5);
        MecanicoObserver mecanico = new MecanicoObserver();
        auto.addObserver(mecanico);
        
        auto.recorrer(200);
    }
    
}
