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
	private int id_cliente;
	private String razaoSocial;
	private String fantasia;
	private String endereco;
	private ArrayList<Cliente> listaCliente;
	
	//contrutor1
	public Cliente() {
		listaCliente = new ArrayList<>();
	}
	//metodo get and set
	public int getId_cliente() {
		return id_cliente;
	}
	public void setId_cliente(int id_cliente) {
		Scanner entrada = new Scanner(System.in);
		if(id_cliente == 0) {
			System.out.println("O id do cliente nao pode ser nulo(0).");
			System.out.println("Cadastrar id do cliente novamente: ");
			this.id_cliente = entrada.nextInt();
			
		}else {
			this.id_cliente = id_cliente;
		}
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
	public String getEndereco() {
		return endereco;
	}
	public void setEndereco(String endereco) {
		this.endereco = endereco;
	}
	public ArrayList<Cliente> getListaCliente() {
		return listaCliente;
	}
	public void setListaCliente(ArrayList<Cliente> listaCliente) {
		this.listaCliente = listaCliente;
	}
	//construtor2
	public Cliente(int id_cliente, String razaoSocial, String fantasia, String endereco) {
		this.id_cliente = id_cliente;
		this.razaoSocial = razaoSocial;
		this.fantasia = fantasia;
		this.endereco = endereco;
		listaCliente = new ArrayList<>();
	}
	//metodo para cadastro de Cliente
	public void cadastrarCliente() {
		int num = 1;
		
		//Cliente cliente = new Cliente();
		//entrada de dados
		Scanner entrada = new Scanner(System.in);
		System.out.println("Cadastrar id do cliente: ");
		id_cliente = entrada.nextInt();
		System.out.println("id cliente atual" + id_cliente);
		setId_cliente(id_cliente);
		System.out.println("id cliente alterado" + id_cliente);
		
		System.out.println("Informe razao social do cliente: ");
		razaoSocial = entrada.next();
		System.out.println("Informe a fantasia: ");
		fantasia = entrada.next();
		System.out.println("Informe o endereco: ");
		endereco = entrada.next();
		
		//criar novo objeto
		Cliente objCliente = new Cliente(id_cliente, razaoSocial,fantasia,endereco);
		listaCliente.add(objCliente);
		
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
			 if(idCliente == objCliente.getId_cliente()) {
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
				System.out.println("Id do cliente:" + objCliente.getId_cliente());
				System.out.println("Razao social do cliente:" + objCliente.getRazaoSocial());
				System.out.println("Fantasia do cliente:" + objCliente.getFantasia());
				System.out.println("Endereco do cliente:" + objCliente.getEndereco());
			}
		}
			
	}
	//excluir cliente atraves da Id_cliente
	public boolean excluirCliente(int IdCliente) {
		boolean encontrado = false;
		for (int i = 0; i < listaCliente.size(); i++) {
			Cliente objCliente = (Cliente) listaCliente.get(i);
			if (IdCliente == objCliente.getId_cliente()) {
				listaCliente.remove(objCliente);
				encontrado = true;
				break;
			}
		}
		return encontrado;
	}
}
