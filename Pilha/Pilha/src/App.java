public class App {
    public static void main(String[] args) throws Exception {
        System.out.println("Hello, World!");


        Pilha pilha = new Pilha();

        pilha.empilhar("Peca 1");
        pilha.empilhar("Peca 2");
        pilha.empilhar("Peca 3");
        
        System.out.println("Pilha atual: " + pilha.toString());

        System.out.println("Desempilhando: " + pilha.desimpilhar());

        System.out.println("Topo da pilha?" + pilha.topo());

        System.out.println("Pilha atual: " + pilha.toString());

        System.out.println("Tamanho da Pilha: " + pilha.tamanhoPilha());

        System.out.println("A pilha esta vazia?" + pilha.estaVazia());
    }
}
