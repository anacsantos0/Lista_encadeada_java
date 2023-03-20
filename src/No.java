public class No {
    private int conteudo;
    private No proximo;

    public No() {
        proximo = null;
    }

    // Métodos get e set

    public int getConteudo() {
        return conteudo;
    }

    public void setConteudo(int conteudo) {
        this.conteudo = conteudo;
    }

    public No getProx() {
        return proximo;
    }

    public void setProx(No proximo) {
        this.proximo = proximo;
    }
}
