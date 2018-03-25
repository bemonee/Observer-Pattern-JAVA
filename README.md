# TP-2-Observer
**Ciclo de ejecucion del patron utilizado** 

1.  addObserver
    1.  addElement
2.  setChanged
3.  notifyObservers
    1.  clearChanged
    2.  For Observers : o 
        1.  o.update
    
**Que argumentos se pasan al metodo update y en que momento se ejecuta dicho metodo**

El metodo update recibe una referencia del objecto el cual efectuo la notificacion y un argumento opcional en el caso de encesitarse al invocar el metodo notifiyObservers.
Update se ejecuta cuando se realiza una notificacion a los observadores mediante el objeto observado. El metodo update solo es invocado si se detecto que el objeto observado haya cambiado.
