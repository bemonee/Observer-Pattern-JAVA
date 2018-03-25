package tp_sensores;

/**
 *
 * @author Ramiro Agustin Pereyra Noreiko
 */
public class Par<T> {
    
    public T minimo;
    public T maximo;

    public Par(T izquierda, T derecha) {
        this.minimo = izquierda;
        this.maximo = derecha;
    }
    
}
