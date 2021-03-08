package Chapter5.ProjetoBancoCompleto;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class mainProjetoLPI1 {

       private static final List<Produto> listaProdutos = new ArrayList<>();
       private static final List<Pedido> listaPedidos = new ArrayList<>();

       public static void main(String[] args) {
              Scanner sc = new Scanner(System.in);
              int opcao = -1;
              do {
                     System.out.println("Sistema de Frente de Caixa");
                     System.out.println("---------------------------");
                     System.out.println("Informe: ");
                     System.out.println("[-1] Acessar Produtos");
                     System.out.println("[0] Acessar Pedidos");
                     System.out.println("[1] Sair");
                     System.out.print("Opção: ");
                     opcao = sc.nextInt();
                     if (opcao == -1) {
                            acessarProdutos();
                     } else if (opcao == 0) {
                            acessarPedidos();
                     }
              } while(opcao != 1);
       }

       public static void acessarProdutos(){
              Scanner sc = new Scanner(System.in);
              int opcao = -1;
              do {
                     System.out.println("Cadastramento de Produtos");
                     System.out.println("---------------------------");
                     System.out.println("Informe: ");
                     System.out.println("[0] Cadastrar Novo Produto");
                     System.out.println("[1] Listar Produtos");
                     System.out.println("[2] Remover Produto");
                     System.out.println("[3] Sair");
                     System.out.print("Opção: ");
                     opcao = sc.nextInt();
                     if (opcao == 0) {
                            System.out.print("Id: ");
                            int id = sc.nextInt();

                            System.out.print("Descrição: ");
                            String descricao = sc.next();

                            System.out.print("Valor Padrão: ");
                            float valorPadrao = sc.nextFloat();
                            addProduto(id, descricao, valorPadrao);
                     } else if (opcao == 1) {
                            if (listaProdutos.size() == 0) {
                                   System.out.println("Não existem Produtos cadastrados");
                            } else {
                                   for (Produto p : listaProdutos) {
                                          System.out.println("Id          : " + Integer.toString(p.getId()));
                                          System.out.println("Descrição   : " + p.getDescricao());
                                          System.out.println("Valor Padrão: " + Float.toString(p.getValorPadrao()));
                                          System.out.println("------------------------------------------------------");
                                   }
                            }
                     } else if (opcao == 2){
                            System.out.println("REMOÇÃO DE PRODUTO!!!");
                            System.out.print("Informe um ID: ");
                            int id = sc.nextInt();
                            for (Produto p : listaProdutos) {
                                   if (p.getId() == id) {
                                          String descricao = p.getDescricao();
                                          listaProdutos.remove(p);
                                          System.out.println("Produto " + descricao + " removido com sucesso!");
                                          break;
                                   }
                            }
                     }
              } while(opcao != 3);
       }

       public static void acessarPedidos(){
              Scanner sc = new Scanner(System.in);
              int opcao = -1;
              do {
                     System.out.println("Lançamento de Pedidos");
                     System.out.println("---------------------------");
                     System.out.println("Informe: ");
                     System.out.println("[0] Lançar novo Pedido");
                     System.out.println("[1] Listar Pedidos realizados");
                     System.out.println("[2] Remover Pedido");
                     System.out.println("[3] Sair");
                     System.out.print("Opção: ");
                     opcao = sc.nextInt();
                     if (opcao == 0) {
                            int op;
                            do {
                                   System.out.println("Id produto");
                                   int id = sc.nextInt();
                                   System.out.println("Descrição do Produto");
                                   String descricao = sc.next();
                                   System.out.println("Valor Padrao");
                                   float valorPadrao = sc.nextFloat();
                                   System.out.println("Valor Unitário");
                                   float valorUnitario = sc.nextFloat();
                                   System.out.println("Quantos produtos deseja adquirir ?");
                                   int qtdProduto = sc.nextInt() ;
                                   //Apenas para testar
                                   Pedido p = new Pedido();
                                   p.addProduto(id,descricao,valorPadrao,qtdProduto,valorUnitario);
                                   System.out.println("Deseja cadastrar mais produtos ? digite qualquer número positivo");
                                   System.out.println("Para cancelar digite -1");
                                    op = sc.nextInt();
                            }while(op != -1);


                     } else if (opcao == 1) {
                            if (listaPedidos.size() == 0) {
                                   System.out.println("Não existem Pedidos lançados");
                            } else {
                                   for (Pedido p : listaPedidos) {
                                          System.out.println("id: " + Integer.toString(p.getId()));
                                          System.out.println("Data: " + p.getData());
                                          System.out.println("Nome Cliente: " + p.getNomeCliente());
                                          System.out.println("Valor Total: " + p.getValorTotal());
                                   }
                            }
                     } else if (opcao == 2){
                            System.out.println("REMOÇÃO DE PEDIDO!!!");
                            System.out.print("Informe um ID: ");
                            int id = sc.nextInt();
                            for (Pedido p : listaPedidos) {
                                String nomeCliente = p.getNomeCliente();
                                if(p.getId() == id){
                                       listaPedidos.remove(p);
                                       break;
                                }
                                   System.out.println("Pedido do cliente " + nomeCliente + "removido com sucesso");
                            }
                     }
              } while(opcao != 3);
       }


       public static void addProduto(Produto newProduto) {
              listaProdutos.add(newProduto);
       }

       public static void addProduto(int id, String descricao, float valorPadrao) {
              Produto newProduto = new Produto();
              newProduto.setId(id);
              newProduto.setDescricao(descricao);
              newProduto.setValorPadrao(valorPadrao);
              addProduto(newProduto);
       }

       public static void addPedido(Pedido newPedido) {
              listaPedidos.add(newPedido);
       }

}
