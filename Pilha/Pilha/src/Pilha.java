public class Pilha {
    private Peca topo; // Referencia ao topo da pilha
    private int totalDeElementos = 0 ;

    public Pilha(){
        this.topo = null;
        this.totalDeElementos = 0;
    }

    // Add uma peca na pilha
    public void empilhar(Object elemento){
        Peca novaPeca = new Peca(this.topo, elemento);
        this.topo = novaPeca;
        this.totalDeElementos++;
    }

    public Object desimpilhar(){
        if(this.totalDeElementos == 0){
            throw new IllegalArgumentException("A pilha esta vazia");
        }
        Object elementoDesempilhando = this.topo.getElemento();
        this.topo = topo.getProxima();
        this.totalDeElementos--;
        return elementoDesempilhando;
    }

    public String toString(){
        StringBuilder builder = new StringBuilder("[");
        Peca atual = this.topo;
        while (atual != null ){
            builder.append(atual.getElemento());
            if (atual.getProxima() != null){
                builder.append(",");
            }
            atual = atual.getProxima();
        }

        builder.append("]");
        return builder.toString();
 



    }

    public int tamanhoPilha(){
        return this.totalDeElementos;
    }

    public boolean estaVazia(){
        return this.totalDeElementos == 0;

    }

    public Object topo(){
        if(this.totalDeElementos == 0){
            throw new IllegalArgumentException("A pilha esta vazia!");
    }
    return this.topo.getElemento();
}

}