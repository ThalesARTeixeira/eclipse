package br.estagio;

import java.util.Scanner;

public class Estado {
	//atributos
	private int idEstado;
	private String nome;
	private String uf;
	
	//metodo gettter and setter
	public int getIdEstado() {
		return idEstado;
	}
	public void setIdEstado(int idEstado) {
		this.idEstado = idEstado;
	}
	public String getNome() {
		return nome;
	}
	public void setNome(String nome) {
		this.nome = nome;
	}
	public String getUf() {
		return uf;
	}
	public void setUf(String uf) {
		this.uf = uf;
	}
	//construtor
	public Estado(int idEstado, String nome, String uf) {
		this.idEstado = idEstado;
		this.nome = nome;
		this.uf = uf;
		
	}
	public Estado() {
		
	}
	//metodo para cadastrar estado
	public void cadastrarEstado() {
		Scanner entrada = new Scanner(System.in);
		
		System.out.println("|__________________ESTADO_____________________|");
		System.out.println("Informe o id do estado: ");
		idEstado = entrada.nextInt();
		System.out.println("Informe o nome: " );
		nome = entrada.next();
		System.out.println("Informe a UF: ");
		uf = entrada.next();

	}
	
}
