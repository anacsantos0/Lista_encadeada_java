
public class listaEncadeada_01 {
    private No cabeca;
    private int tamanho;

    public listaEncadeada_01(){
        cabeca =  null;
        tamanho = 0;
    }

    /** Verifica se a Lista está vazia */
    public boolean vazia(){
        if (tamanho == 0 )
            return true;
        else
            return false;
    }

    public int tamanho() {
        No p = cabeca;
        int cont = 0;
        while(p != null){
            p = p.getProx();
            cont++;
        }
        return cont;
    }

    /** Obtém o i-ésimo elemento de uma lista
     Retorna o valor encontrado. */
    public int elemento (int pos) {
        No aux = cabeca;
        int cont = 1;
        if (vazia()) return -1; // Consulta falhou
        if ((pos < 1) || (pos > tamanho))
            return -1; // Posicao invalida

        // Percorre a lista do 1o elemento até pos
        while (cont < pos){
            aux = aux.getProx();
            cont++;
        }
        return aux.getConteudo();
    }

    /**Retorna a posição de um elemento pesquisado.
     Retorna -1 caso não seja encontrado */
    public int posicao (int dado) {
        int cont = 1;
        No aux;
        if (vazia()) return 0;
        aux = cabeca;
        while (aux != null) {
            if (aux.getConteudo() == dado)
                return cont;
            aux = aux.getProx();
            cont++;
        }
        return -1;
    }

    /**Insere um elemento em uma determinada posição
     Retorna true se conseguir inserir e
     false caso contrario */
    boolean insere(int pos, int dado) {
        if ((vazia()) && (pos != 1)) return false;
        if (pos == 1){ // insercao no inicio da lista
            return insereInicioLista(dado);
        }
        else if (pos == tamanho+1){ // inserção no fim
            return insereFimLista(dado);
        }
        else{ // inserção no meio da lista
            return insereMeioLista(pos, dado);
        }
    }

    /** Insere nó em lista vazia */
    private boolean insereInicioLista(int valor) {
        // Aloca memoria para um novo no */
        No novoNo = new No();
        // Insere novo elemento na cabeca da lista
        novoNo.setConteudo(valor);
        novoNo.setProx(cabeca);
        cabeca = novoNo;
        tamanho++;
        return true;
    }

    /** Insere nó no meio da lista */
    private boolean insereMeioLista(int pos, int dado){
        int cont = 1;
        No novoNo = new No(); // Aloca memoria para novo no
        novoNo.setConteudo(dado);
        // Localiza a pos. onde será inserido o novo nó
        No aux = cabeca;
        while ((cont < pos-1) && (aux != null)){
            aux = aux.getProx();
            cont++;
        }
        if (aux == null) return false;
        novoNo.setProx(aux.getProx());
        aux.setProx(novoNo);
        tamanho++;
        return true;
    }

    /** Insere nó no fim da lista */
    private boolean insereFimLista(int dado){
        No novoNo = new No();
        novoNo.setConteudo(dado);
        // Procura o final da lista
        No aux = cabeca;
        while(aux.getProx() != null){
            aux = aux.getProx();
        }
        novoNo.setProx(null);
        aux.setProx(novoNo);
        this.tamanho++;
        return true;
    }

    /**Remove um elemento de uma determinada posição
     Retorna o valor a ser removido.
     -1 se a posição for inválida ou a lista vazia
     */public int remove(int pos) {
        if (vazia()) return -1; // Lista vazia
        // remoção do elemento da cabeça da lista
        if (pos == 1){
            return removeInicioLista();
        }
        // remoção em outro lugar da lista
        else{
            return removeNaLista(pos);
        }
    }

    /** Remove elemento do início da lista */
    private int removeInicioLista(){
        No p = cabeca;
        int dado = p.getConteudo();
        // Retira o 1o elemento da lista (p)
        cabeca = p.getProx();
        tamanho--;
        // Sugere ao garbage collector que libere a
        // memoria da regiao apontada por p
        p = null;
        return dado;
    }

    /** Remove elemento no meio da lista */
    private int removeNaLista(int pos){
        No atual = null, antecessor = null;
        int dado = -1, cont = 1;
        atual = cabeca;
        while((cont < pos) && (atual != null)){
            antecessor = atual;
            atual = atual.getProx();
            cont++;
        }
        if (atual == null)
            return -1;

        // retira o elemento da lista
        dado = atual.getConteudo();
        antecessor.setProx(atual.getProx());
        tamanho--;
        // sugere ao garbage collector que libere a memoria
        // da regiao apontada por p
        atual = null;
        return dado;
    }

    public boolean showList(){
        System.out.println("\n ------------ LISTA -----------\n");
        for( int i = 0; i <tamanho;  i++){
            System.out.println("POSIÇÃO: " + (i+1) + "    =    " + elemento(i+1));
        }
        return true;
    }


}
