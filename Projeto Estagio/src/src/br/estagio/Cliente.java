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
	private ArrayList<Cliente> listaCliente = new ArrayList<>();
	
	//contrutor vazio
	public Cliente() {
			
	}
	//metodo get and set
	public int getId_cliente() {
		return id_cliente;
	}
	public void setId_cliente(int id_cliente) {
		if(id_cliente == 0) {
			System.out.println("O id do cliente nao pode ser nulo(0).");
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
	
	//construtor
	public Cliente(int id_cliente, String razaoSocial, String fantasia, String endereco) {
		this.id_cliente = id_cliente;
		this.razaoSocial = razaoSocial;
		this.fantasia = fantasia;
		this.endereco = endereco;
	}
	//metodo para cadastro de Cliente
	public void cadastrarCliente() {
		//entrada de dados
		Scanner entrada = new Scanner(System.in);
		System.out.println("Cadastrar id do cliente: ");
		id_cliente = entrada.nextInt();
		System.out.println("Informe razao social do cliente: ");
		razaoSocial = entrada.next();
		System.out.println("Informe a fantasia: ");
		fantasia = entrada.next();
		System.out.println("Informe o endereco: ");
		endereco = entrada.next();
		
		//criar novo objeto
		Cliente objCliente = new Cliente();
		
		listaCliente.add(objCliente);
		
	}
	public void cadastrarClientes(int quantidade_cliente) {
		for(int i = 0; i < quantidade_cliente; i++) {
			cadastrarCliente();
		}
	}
	
	public void exibirDados() {
		if (listaCliente.size() == 0) {
			System.out.println("Nenhum cliente cadastrado. Para listar os clientes faça o cadastro!");
		}
			for(int i = 0; i < listaCliente.size(); i++) {
				Cliente objCliente =  listaCliente.get(i);
				System.out.println("Id do cliente:" + objCliente.getId_cliente());
				System.out.println("Razao social do cliente:" + objCliente.getRazaoSocial());
				System.out.println("Fantasia do cliente:" + objCliente.getFantasia());
				System.out.println("Endereco do cliente:" + objCliente.getEndereco());
			}
		}
}
