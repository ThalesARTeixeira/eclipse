package br.estagio;

import java.util.Scanner;


public class Endereco {
	//atributos
	private int idEndereco;
	private String logradouro;
	private int numero;
	private int quadra;
	private int lote;
	private Estado estado;
	private String bairro;

	//metodo getter and setter
	public int getIdEndereco() {
		
		return idEndereco;
	}
	public void setIdEndereco(int idEndereco) {
		
		this.idEndereco = idEndereco;
	}
	public String getLogradouro() {
		return logradouro;
	}
	public void setLogradouro(String logradouro) {
		this.logradouro = logradouro;
	}
	public int getNumero() {
		return numero;
	}
	public void setNumero(int numero) {
		this.numero = numero;
	}
	public int getQuadra() {
		return quadra;
	}
	public void setQuadra(int quadra) {
		this.quadra = quadra;
	}
	public int getLote() {
		return lote;
	}
	public void setLote(int lote) {
		this.lote = lote;
	}
	public Estado getEstado() {
		this.estado = this.estado == null ? new Estado() : this.estado;
		return estado;
	}
	public void setEstado(Estado estado) {
		this.estado = estado;
	}
	public String getBairro() {
		return bairro;
	}
	public void setBairro(String bairro) {
		this.bairro = bairro;
	}
	
	//construtor
	public Endereco(int idEndereco, String logradouro, int numero, int quadra, int lote, Estado estado, String bairro) {
		this.idEndereco = idEndereco;
		this.logradouro = logradouro;
		this.numero = numero;
		this.quadra = quadra;
		this.lote = lote;
		this.estado = estado;
		this.bairro = bairro;
		
	}
	
	public Endereco() {
		
	}
	//metodo para cadastrar endereco
	public void cadastrarEndereco() {
		Scanner entrada = new Scanner(System.in);
		System.out.println("|__________________ENDERECO_____________________|");
		System.out.println("Informe o id do endereco: ");
		idEndereco = entrada.nextInt();
		System.out.println("Informe o logradouro: " );
		logradouro = entrada.next();
		System.out.println("Informe o numero: ");
		numero = entrada.nextInt();
		System.out.println("Informe o quadra: " );
		quadra = entrada.nextInt();
		System.out.println("Informe o lote: " );
		lote = entrada.nextInt();
		System.out.println("Informe o bairro: " );
		bairro = entrada.next();
	
	}
	
	
	
}
