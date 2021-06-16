package br.estagio;
/*
 * Cliente
	-id
	-razaoSocial
	-fatasia
	-endereco
 */

import java.util.Scanner;
import java.util.ArrayList;
public class Cliente{
	//atributos
	private int idCliente;
	private String razaoSocial;
	private String fantasia;
	private Endereco endereco;
	private ArrayList<Cliente> listaCliente;
	
	//contrutor1
	public Cliente() {
		listaCliente = new ArrayList<>();
	}
	//metodo getter and setter
	public int getIdCliente() {
		return idCliente;
	}
	public void setIdCliente(int idCliente) {
		Scanner entrada = new Scanner(System.in);
		while(idCliente <= 0) {
			System.out.println("O ID do cliente nao pode ser nulo(0)!");
			System.out.println("Cadastrar ID do cliente novamente: ");
			//recebe o dado correto para ser salvo
			idCliente = entrada.nextInt();
			this.idCliente = idCliente;
		}
		this.idCliente = idCliente;
	}
	public String getRazaoSocial() {
		return razaoSocial;
	}
	public void setRazaoSocial(String razaoSocial) {
		this.razaoSocial = razaoSocial;
	}
	public String getFantasia() {
		return fantasia;
	}
	public void setFantasia(String fantasia) {
		this.fantasia = fantasia;
	}
	public Endereco getEndereco() {
		
		return endereco;
	}
	public void setEndereco(Endereco endereco) {
		this.endereco = endereco;
	}
	public ArrayList<Cliente> getListaCliente() {
		return listaCliente;
	}
	public void setListaCliente(ArrayList<Cliente> listaCliente) {
		this.listaCliente = listaCliente;
	}
	//construtor2
	public Cliente(int idCliente, String razaoSocial, String fantasia, Endereco endereco) {
		this.idCliente = idCliente;
		this.razaoSocial = razaoSocial;
		this.fantasia = fantasia;
		this.endereco = endereco;
		listaCliente = new ArrayList<>();
	}
	//metodo para cadastro de Cliente
	public void cadastrarCliente() {
		//criar objeto Endereco
		Endereco objEndereco = new Endereco();
		//entrada de dados
		Scanner entrada = new Scanner(System.in);
		System.out.println("|__________________CLIENTE_____________________|");
		System.out.println("Cadastrar id do cliente: ");
		idCliente = entrada.nextInt();
		setIdCliente(idCliente);
		System.out.println("Informe razao social do cliente: ");
		razaoSocial = entrada.next();
		System.out.println("Informe a fantasia: ");
		fantasia = entrada.next();
		System.out.println();
		
		objEndereco.cadastrarEndereco();
		//criar novo objeto
		Cliente objCliente = new Cliente(idCliente, razaoSocial, fantasia, objEndereco); 
		
		//verifica se o ID do cliente ja existe
		boolean existe = existeCliente(idCliente);
		while(existe != false) {
			System.out.println("O ID do cliente ja esta sendo usado!");
			System.out.println("Por favor digite outro ID para o cliente ser salvo:");
			idCliente = entrada.nextInt();
			objCliente.setIdCliente(idCliente);
			existe = existeCliente(idCliente);
			
		}
		
		listaCliente.add(objCliente);
		System.out.println("O ID do cliente foi salvo com sucesso!");
	}
	//cadastrando mais de um cliente
	public void cadastrarClientes(int quantidade_cliente) {
		for(int i = 0; i < quantidade_cliente; i++) {
			cadastrarCliente();
		}
	}
	
	//editar um cliente especifico
	public boolean editarCliente(int idCliente) {
		 boolean encontrado = false;
		 for(int i = 0; i < listaCliente.size(); i++) {
			 Cliente objCliente = (Cliente) listaCliente.get(i);
			 if(idCliente == objCliente.getIdCliente()) {
				 excluirCliente(idCliente);
				 cadastrarCliente();
				 encontrado = true;
				 break;
			 }	 
		 }
		 return encontrado;
	}
	
	
	//listar os Clientes
	public void exibirCliente() {
		if (listaCliente.size() == 0) {
			System.out.println("Nenhum cliente cadastrado. Para listar os clientes faça o cadastro!");
		}else {
			for(int i = 0; i < listaCliente.size(); i++) {
				Cliente objCliente =  listaCliente.get(i);
				System.out.println("Id do cliente:" + objCliente.getIdCliente());
				System.out.println("Razao social do cliente:" + objCliente.getRazaoSocial());
				System.out.println("Fantasia do cliente:" + objCliente.getFantasia());
				System.out.println("Id Endereco do cliente:" + objCliente.getEndereco().getIdEndereco());
				System.out.println("Logradouro do cliente:" + objCliente.getEndereco().getLogradouro());
				System.out.println("Numero do cliente:" + objCliente.getEndereco().getNumero());
				System.out.println("Quadra do cliente:" + objCliente.getEndereco().getQuadra());
				System.out.println("Lote do cliente:" + objCliente.getEndereco().getQuadra());
				System.out.println("Bairro do cliente:" + objCliente.getEndereco().getBairro());
				System.out.println("ID Estado do cliente:" + objCliente.getEndereco().getEstado().getIdEstado());
				System.out.println("Nome da cidade do cliente:" + objCliente.getEndereco().getEstado().getNome());
				System.out.println("UF do cliente:" + objCliente.getEndereco().getEstado().getUf());

			}
		}
			
	}
	//excluir cliente atraves da Id_cliente
	public boolean excluirCliente(int IdCliente) {
		boolean encontrado = false;
		for (int i = 0; i < listaCliente.size(); i++) {
			Cliente objCliente = (Cliente) listaCliente.get(i);
			if (IdCliente == objCliente.getIdCliente()) {
				listaCliente.remove(objCliente);
				encontrado = true;
				break;
			}
		}
		return encontrado;
	}
	public boolean existeCliente(int idCliente) {
		boolean existe = false;
		for (int i = 0; i < listaCliente.size(); i++) {
			//cria um objeto cliente
			Cliente objCliente =(Cliente) listaCliente.get(i);
			if (idCliente == objCliente.getIdCliente()) {
				existe = true;
				break;
			}
		}
		return existe;
	}
}
