import java.util.Scanner;

public class Main extends listaEncadeada_01{
    public static void main(String[] args) {
        
        // Inicializando variáveis
        Scanner sc = new Scanner(System.in);
        int op, pos, dado;

        // Criar lista vazia
        listaEncadeada_01 array = new listaEncadeada_01();
        System.out.println("Uma nova lista encadeada foi criada. ");

        // Criar menu
        do{
            //Menu de opções para o usuário
            System.out.println("\n\n-------------- MENU -------------");
            System.out.println("--- Escolha uma opção:");
            System.out.println("1 - Mostrar o estado da lista");  // Verifica de ela está vazia
            System.out.println("2 - Mostrar o tamanho da lista");
            System.out.println("3 - Obter valor de um elemento da lista");
            System.out.println("4 - Modificar elementos da lista");
            System.out.println("5 - Imprimir lista");
            System.out.println("6 - Sair");

            op = sc.nextInt();

            switch (op){

                // Verificar se a lista esta vazia
                case 1: {
                    if(array.vazia() == true){
                        System.out.println("A lista está vazia");
                    }else {
                        System.out.println("A lista não esta vazia, contém " + array.tamanho()+ " elementos");
                    }
                    break;
                }

                // Obter tamanho da lista
                case 2:{
                    System.out.println("Tamanho atual da lista: "+ array.tamanho()+" elementos");
                    break;
                }

                // Obter valor do elemento de uma determinada posição da lista
                case 3:{
                    System.out.println("Informe a posição do elemento que deseja buscar: ");
                    pos = sc.nextInt();

                    if(array.elemento(pos) == -1){
                        System.out.println("Valor de posição inválido !! :(");
                    }else{
                        System.out.println("Valor encontrado na posição "+pos+": "+array.elemento(pos));
                    }
                    break;
                }

                //// Modificar lista
                case 4:{
                    int op2;
                    System.out.println("---- Modificando elementos ----");
                    System.out.println("Escolha uma opção: ");
                    System.out.println("1 - Modificando o valor de um elemento");
                    System.out.println("2 - Inserir um elemento");
                    System.out.println("3 - Remover um elemento");

                    op2 = sc.nextInt();

                    switch (op2){

                        // Modificar o valor do elemento de uma determinada posição da lista
                        case 1:
                            System.out.println("Insira a posição do elemento a ser modificado: ");
                            dado = sc.nextInt();
                            System.out.println("Insira o novo valor do elemento: ");
                            pos = sc.nextInt();
                            array.trocaValor(pos, dado);
                            break;

                        // Inserir um elemento em uma determinada posição
                        case 2:{
                            System.out.println("Insira valor do elemento: ");
                            dado = sc.nextInt();
                            System.out.println("Insira a posição do novo elemento: ");
                            pos = sc.nextInt();
                            array.insere(pos, dado);
                            break;
                        }

                        // Retirar um elemento de uma determinada posição
                        case 3:{
                            System.out.println("Insira a posição do elemento que deseja remover");
                            pos = sc.nextInt();
                            System.out.println("Deseja remover o elemento " + array.elemento(pos) + "da posição " + pos + "? \n1 - SIM\n2 - NÃO");
                            int aux = sc.nextInt();
                            if (aux == 1){
                                array.remove(pos);

                            }else{
                                System.out.println("Operação de remoção cancelada");
                            }
                            break;
                        }
                        default: {
                            System.out.println("// OPÇÃo INVÁlIDA //");
                        }
                    }
                    break;
                }

                // Imprimir os elementos de toda a lista
                case 5: {
                    array.showList();
                    break;
                }
                case 6:{
                    System.out.println("Saindo...");
                    break;
                }
                default:{
                    System.out.println("// OPÇÃO INVÁLIDA //\nTente novamente");
                    break;
                }
            }
        }while(op != 6);

    }
}