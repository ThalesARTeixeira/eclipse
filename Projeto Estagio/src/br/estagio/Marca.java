package br.estagio;

import java.util.Scanner;

public class Marca {
	private int id_marca;
	private String descricao;
	
	//metodo getter e setter
	public int getId_marca() {
		return id_marca;
	}
	public void setId_marca(int id_marca) {
		Scanner entrada = new Scanner(System.in);
		while(id_marca <= 0) {
			System.out.println("O ID da marca nao pode ser nulo(0)!");
			System.out.println("Cadastrar ID da marca novamente: ");
			//recebe o dado correto para ser salvo
			id_marca = entrada.nextInt();
			this.id_marca = id_marca;
		}
		this.id_marca = id_marca;
	}
	public String getDescricao() {
		return descricao;
	}
	public void setDescricao(String descricao) {
		this.descricao = descricao;
	}
	//construtor
	public Marca(int id_marca, String descricao) {
		this.descricao =descricao;
		this.id_marca = id_marca;
		
	}

}
