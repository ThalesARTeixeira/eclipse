package run;

import java.util.Scanner;

import br.estagio.Cliente;

public class Principal {

	public static void main(String[] args) {
		
		//variavel
		int menu;	
		Scanner entrada = new Scanner(System.in);
		Cliente objCliente = new Cliente();
		do {
			System.out.println("|_________________________________________________|");
			System.out.println("|____________________MENU_________________________|");
			System.out.println("|___________Escolha uma opcao abaixo:_____________|");
			System.out.println("|___________[1]Cadastrar cliente__________________|");
			System.out.println("|___________[2]Editar cliente_____________________|");
			System.out.println("|___________[3]Exibir clientes cadastrados________|");
			System.out.println("|___________[4]Excluir cliente____________________|");
			System.out.println("|_________________________________________________|");

			menu= entrada.nextInt();
			switch(menu) {
				case 1:
					//cadastrar clientes
					System.out.println("Quantos clientes deseja cadastrar? ");
					int quantidade_clientes = entrada.nextInt();
					objCliente.cadastrarClientes(quantidade_clientes);	
					System.out.println("|_________________________________________________|");
					break;
					
				case 2:
					//editar cliente
					System.out.println("Digite o ID do cliente para editar os dados:");
					int idEditar = entrada.nextInt();
					boolean editar = objCliente.editarCliente(idEditar);
					if( editar == true ) {
						System.out.println("Dados alterados com sucesso!");
					}else {
						System.out.println("Impossivel editar um cliente inexistente! Verificar se foi cadastrado!");
					}
					System.out.println("|_________________________________________________|");
					break;
					
				case 3:
					//listar clientes
					objCliente.exibirCliente();
					System.out.println("|_________________________________________________|");
					break;
					
				case 4:
					//excluir cliente 
					System.out.println("Para excluir digite o Id do cliente:");
					int idExcluir = entrada.nextInt();
					boolean excluir = objCliente.excluirCliente(idExcluir);
            		if ( excluir == true) {
            			System.out.println("Cliente excluido com sucesso!");
            	
            		}else {
            			System.out.println("Cliente nao encontrado.");
            		}
            		System.out.println("|_________________________________________________|");
            		break;
            		
			}
		}while(menu !=4 );
	}

}