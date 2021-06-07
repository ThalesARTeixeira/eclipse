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
			System.out.println("|___________________MENU__________________________|\n");
			System.out.println("|___________[1]Cadastrar cliente__________________|\n");
			System.out.println("|___________[2]Exibir clientes cadastrados________|\n");
			
			menu= entrada.nextInt();
			switch(menu) {
				case 1:
					//cadastrar clientes
					System.out.println("Quantos clientes deseja cadastrar? ");
					int quantidade_clientes = entrada.nextInt();
					objCliente.cadastrarClientes(quantidade_clientes);	
					break;
				case 2:
					//listar clientes
					objCliente.exibirDados();
					break;
			}
		}while(menu !=2 );
	}

}