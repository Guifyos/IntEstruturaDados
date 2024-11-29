public class Peca {

    private Peca proxima; // Uma referencia para a proxima peca.
    private Object elemento; // O dado guardado.

    public Peca(Peca proxima, Object elemento){
        this.proxima = proxima;
        this.elemento = elemento;
    }

    public Peca(Object elemento){
        this.elemento = elemento;
    }

    public Peca getProxima(){
        return proxima;
    }

    public void setProxima(Peca proxima){
        this.proxima = proxima;
    }

    public Object getElemento(){
        return elemento;
    }

}
