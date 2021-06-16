package br.estagio;

import java.util.ArrayList;
import java.util.Scanner;

public class Produto{
	//atributos
	private int id_produto;
	private String descr_produto;
	private String marca;
	private double valor;
	private int desconto;
	private ArrayList<Produto> listaProduto;
	//contrutor 1
	public Produto() {
		listaProduto = new ArrayList<>();
	}
	
	//metodo getter and setter
	public int getId_produto() {
		return id_produto;
	}


	public void setId_produto(int id_produto) {
		Scanner entrada = new Scanner(System.in);
		while(id_produto <= 0) {
			System.out.println("O ID do produto nao pode ser nulo(0)!");
			System.out.println("Cadastrar ID do produto novamente: ");
			//recebe o dado correto para ser salvo
			id_produto = entrada.nextInt();
			this.id_produto = id_produto;
		}
		this.id_produto = id_produto;
	}


	public String getDescr_produto() {
		return descr_produto;
	}


	public void setDescr_produto(String descr_produto) {
		this.descr_produto = descr_produto;
	}


	public String getMarca() {
		return marca;
	}


	public void setMarca(String marca) {
		this.marca = marca;
	}


	public double getValor() {
		return valor;
	}


	public void setValor(double valor) {
		this.valor = valor;
	}


	public int getDesconto() {
		return desconto;
	}


	public void setDesconto(int desconto) {
		this.desconto = desconto;
	}
	
	public Produto (int id_produto, String descr_produto, String marca, double valor, int desconto) {
		this.id_produto = id_produto;
		this.descr_produto = descr_produto;
		this.marca = marca;
		this.valor = valor;
		this.desconto = desconto;
	
	}
	//metodo para cadastro de Produro
		public void cadastrarProduto() {
			
			//entrada de dados
			Scanner entrada = new Scanner(System.in);
			System.out.println("Cadastrar id do produto: ");
			id_produto = entrada.nextInt();
			setId_produto(id_produto);
			System.out.println("Informe a descricao do produto: ");
			descr_produto = entrada.next();
			System.out.println("Informe a marca do produto: ");
			marca = entrada.next();
			System.out.println("Informe o valor do produto: ");
			valor = entrada.nextDouble();
			System.out.println("Informe o desconto do produto:");
			desconto = entrada.nextInt();
			//criar novo objeto
			Produto objProduto = new Produto(id_produto, descr_produto, marca, valor, desconto); 
			
			//verifica se o ID do cliente ja existe
			boolean existe = existeProduto(id_produto);
			while(existe != false) {
				System.out.println("O ID do produto ja esta sendo usado!");
				System.out.println("Por favor digite outro ID para o produto ser salvo:");
				id_produto = entrada.nextInt();
				objProduto.setId_produto(id_produto);
				existe = existeProduto(id_produto);
				
			}

			listaProduto.add(objProduto);
			System.out.println("O ID do produto foi salvo com sucesso!");
		}
		//cadastrando mais de um produto
		public void cadastrarProdutos(int quantidade_produto) {
			for(int i = 0; i < quantidade_produto; i++) {
				cadastrarProduto();
			}
		}
		public boolean existeProduto(int id_produto) {
			boolean existe = false;
			for (int i = 0; i < listaProduto.size(); i++) {
				//cria um objeto produto
				Produto objProduto =(Produto) listaProduto.get(i);
				if (id_produto == objProduto.getId_produto()) {
					existe = true;
					break;
				}
			}
			return existe;
		}
		//editar um produto especifico
		public boolean editarProduto(int idProduto) {
			 boolean encontrado = false;
			 for(int i = 0; i < listaProduto.size(); i++) {
				 Produto objProduto = (Produto) listaProduto.get(i);
				 if(idProduto == objProduto.getId_produto()) {
					 excluirProduto(idProduto);
					 cadastrarProduto();
					 encontrado = true;
					 break;
				 }	 
			 }
			 return encontrado;
		}
		//listar os produtos
		public void exibirProduto() {
			if (listaProduto.size() == 0) {
				System.out.println("Nenhum Produto cadastrado. Para listar os produtos faça o cadastro!");
			}else {
				for(int i = 0; i < listaProduto.size(); i++) {
					Produto objProduto =  listaProduto.get(i);
					System.out.println("Id do produto: " + objProduto.getId_produto());
					System.out.println("Descricao do produto: " + objProduto.getDescr_produto());
					System.out.println("Marca do produto: " + objProduto.getMarca());
					System.out.println("Valor do produto: R$" + objProduto.getValor());
					System.out.println("Desconto do produto: " + objProduto.getDesconto() + "%");
				}
			}
				
		}
		//excluir produto atraves da Id_produto
		public boolean excluirProduto(int IdProduto) {
			boolean encontrado = false;
			for (int i = 0; i < listaProduto.size(); i++) {
				Produto objProduto = (Produto) listaProduto.get(i);
				if (IdProduto == objProduto.getId_produto()) {
					listaProduto.remove(objProduto);
					encontrado = true;
					break;
				}
			}
			return encontrado;
		}
	

}
