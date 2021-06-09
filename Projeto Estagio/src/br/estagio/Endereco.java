package br.estagio;

public class Endereco {
	//atributos
	private int id_endereco;
	private String logradouro;
	private int numero;
	private int quadra;
	private int lote;
	private String estado;
	private String bairro;
	
	//metodo getter and setter
	public int getId_endereco() {
		return id_endereco;
	}
	public void setId_endereco(int id_endereco) {
		this.id_endereco = id_endereco;
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
	public String getEstado() {
		return estado;
	}
	public void setEstado(String estado) {
		this.estado = estado;
	}
	public String getBairro() {
		return bairro;
	}
	public void setBairro(String bairro) {
		this.bairro = bairro;
	}
	
	//construtor
	public Endereco(int id_endereco, String logradouro, int numero, int quadra, int lote, String estado, String bairro) {
		this.id_endereco = id_endereco;
		this.logradouro = logradouro;
		this.numero = numero;
		this.quadra = quadra;
		this.lote = lote;
		this.estado = estado;
		this.bairro = bairro;
		
	}
	
	
	
}
