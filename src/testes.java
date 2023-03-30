public class testes {
    public static void main(String[] args) {
        // Criação de uma lista vazia
        listaEncadeada_01 NewList = new listaEncadeada_01();
        // Verificando se está vazia
        System.out.println(NewList.vazia());
        // Verificando o tamanho
        System.out.println("Tamanho da lista 01" + NewList.tamanho());
        // Inserindo elementos
        System.out.println(NewList.insere(0, 14));  // Nao irá aceitar
        System.out.println(NewList.insere(1,  20));
        System.out.println(NewList.insere(2, 22));
        System.out.println(NewList.insere(3, 23));
        // Inserindo novo elemento no meio
        System.out.println(NewList.insere(2,  12));
        // Inserindo elemento no final
        System.out.println(NewList.insere(4, 24));
        // Modificando o valor de um elemento
        System.out.println(NewList.trocaValor(2, 21));
        // Verificando novo tamanho
        System.out.println("Tamanho da lista 01" + NewList.tamanho());
        // Verificando se não é mais vazia
        System.out.println(NewList.vazia());
        // Obtendo elemento por uma posição
        System.out.println("Elemento da posição 2: " + NewList.elemento(2));
        // Obtendo a posição de um elemento
        System.out.println("Posição do elemento 20: " + NewList.posicao(20));
        // Verificando novo tamanho
        System.out.println("Tamanho da lista 01: "+ NewList.tamanho());
        //Imprimindo a lista 01
        System.out.println(NewList.showList());

        /*
        listaEncadeada_01 NewList_02 = new listaEncadeada_01();
        System.out.println(NewList_02.vazia());
        System.out.println(NewList_02.tamanho());
        System.out.println(NewList_02.elemento(0));
        System.out.println(NewList_02.insere(0, 14));
        System.out.println(NewList_02.insere(1,  55));
        System.out.println(NewList_02.insere(2, 66));
        System.out.println(NewList_02.insere(3, 77));
        System.out.println(NewList_02.tamanho());
        System.out.println(NewList_02.vazia());
        System.out.println(NewList_02.elemento(2));
        System.out.println(NewList_02.posicao(99));
        System.out.println("dado 66:" + NewList_02.posicao(66));
        System.out.println(NewList_02.trocaValor(1, 99));
        System.out.println(NewList_02.insere(2,  44));
        System.out.println("tamanho 02: "+NewList_02.tamanho());
        System.out.println(NewList_02.showList());

         */
    }
}
