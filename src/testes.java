public class testes {
    public static void main(String[] args) {
        listaEncadeada_01 NewList = new listaEncadeada_01();
        System.out.println(NewList.vazia());
        System.out.println(NewList.tamanho());
        System.out.println(NewList.elemento(0));
        System.out.println(NewList.insere(0, 14));
        System.out.println(NewList.insere(1,  11));
        System.out.println(NewList.insere(2, 22));
        System.out.println(NewList.insere(3, 22));
        System.out.println(NewList.tamanho());
        System.out.println(NewList.vazia());
        System.out.println(NewList.elemento(2));
        System.out.println(NewList.posicao(11));
        System.out.println(NewList.posicao(14));
        System.out.println(NewList.insere(2,  12));
        System.out.println("tamanho 01: "+ NewList.tamanho());
        System.out.println(NewList.showList());

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
        System.out.println(NewList_02.posicao(88));
        System.out.println(NewList_02.insere(2,  44));
        System.out.println("tamanho 02: "+NewList_02.tamanho());
        System.out.println(NewList_02.showList());

    }
}
