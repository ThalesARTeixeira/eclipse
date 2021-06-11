package run;

import java.util.Scanner;

import br.estagio.Cliente;
import br.estagio.Produto;

public class Principal {

	public static void main(String[] args) {
		
		//variavel
		int menu;	
		Scanner entrada = new Scanner(System.in);
		//criar um objeto Cliente
		Cliente objCliente = new Cliente();
		//criar um objeto Produto
		Produto objProduto = new Produto();
		//criando um menu
		do {
			System.out.println("|_________________________________________________|");
			System.out.println("|____________________MENU_________________________|");
			System.out.println("|___________Escolha uma opcao abaixo:_____________|");
			System.out.println("|___________[1]Cadastrar cliente__________________|");
			System.out.println("|___________[2]Editar cliente_____________________|");
			System.out.println("|___________[3]Exibir clientes cadastrados________|");
			System.out.println("|___________[4]Excluir cliente____________________|");
			System.out.println("|___________[5]Cadastrar produto__________________|");
			System.out.println("|___________[6]Exibir produtos cadastrados________|");
			System.out.println("|___________[7]Editar produto_____________________|");
			System.out.println("|___________[8]Excluir produto____________________|");
			System.out.println("|_________________________________________________|");

			menu= entrada.nextInt();
			switch(menu) {
				case 1:
					//cadastrar clientes
					System.out.println("CADASTRAR CLIENTE ");
					System.out.println();
					System.out.println("Quantos clientes deseja cadastrar? ");
					int quantidade_clientes = entrada.nextInt();
					objCliente.cadastrarClientes(quantidade_clientes);
					System.out.println();
					System.out.println("_________________________________________________");
					break;
					
				case 2:
					//editar cliente
					System.out.println("EDITAR CLIENTE ");
					System.out.println();
					System.out.println("Digite o ID do cliente para editar os dados:");
					int idEditar = entrada.nextInt();
					boolean editar = objCliente.editarCliente(idEditar);
					if( editar == true ) {
						System.out.println("Dados alterados com sucesso!");
					}else {
						System.out.println("Impossivel editar um cliente inexistente! Verificar se foi cadastrado!");
					}
					System.out.println();
					System.out.println("_________________________________________________");
					break;
					
				case 3:
					//listar clientes
					System.out.println("LISTAGEM DE CLIENTE ");
					System.out.println();
					objCliente.exibirCliente();
					System.out.println();
					System.out.println("_________________________________________________");
					break;
					
				case 4:
					//excluir cliente 
					System.out.println("EXCLUIR CLIENTE ");
					System.out.println();
					System.out.println("Para excluir digite o Id do cliente:");
					int idExcluir = entrada.nextInt();
					boolean excluir = objCliente.excluirCliente(idExcluir);
            		if ( excluir == true) {
            			System.out.println("Cliente excluido com sucesso!");
            	
            		}else {
            			System.out.println("Cliente nao encontrado.");
            		}
            		System.out.println();
            		System.out.println("_________________________________________________");
            		break;
            		
				case 5:
					//cadastrar Produto
					System.out.println("CADASTRAR PRODUTO ");
					System.out.println();
					System.out.println("Quantos produtos deseja cadastrar? ");
					int quantidade_produto = entrada.nextInt();
					objProduto.cadastrarProdutos(quantidade_produto);	
					System.out.println();
					System.out.println("_________________________________________________");
					break;
				
				case 6:
					//listar clientes
					System.out.println("LISTAGEM DE PRODUTO ");
					System.out.println();
					objProduto.exibirProduto();
					System.out.println();
					System.out.println("_________________________________________________");
					break;
					
				case 7:
					//editar produto
					System.out.println("EDITAR PRODUTO ");
					System.out.println();
					System.out.println("Digite o ID do produto para editar os dados:");
					int idEditar_prod = entrada.nextInt();
					boolean editar_prod = objProduto.editarProduto(idEditar_prod);
					if( editar_prod == true ) {
						System.out.println("Dados alterados com sucesso!");
					}else {
						System.out.println("Impossivel editar um produto inexistente! Verificar se foi cadastrado!");
					}
					System.out.println();
					System.out.println("_________________________________________________");
					break;
            		
				case 8:
					//excluir produto 
					System.out.println("EXCLUIR PRODUTO");
					System.out.println();
					System.out.println("Para excluir digite o Id do produto:");
					int idExcluir_prod = entrada.nextInt();
					boolean excluir_prod = objProduto.excluirProduto(idExcluir_prod);
            		if ( excluir_prod == true) {
            			System.out.println("Produto excluido com sucesso!");
            	
            		}else {
            			System.out.println("Produto nao encontrado.");
            		}
            		System.out.println();
            		System.out.println("_________________________________________________");
            		break;
			}
			
		}while(menu !=9);
	}

}