package br.estagio;

public class Estado {
	private int id_estado;
	private String nome;
	private String uf;
	
	//metodo get and set
	public int getId_estado() {
		return id_estado;
	}
	public void setId_estado(int id_estado) {
		this.id_estado = id_estado;
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
	public Estado(int id_estado, String nome, String uf) {
		this.id_estado = id_estado;
		this.nome = nome;
		this.uf = uf;
		
	}
	//metodo para calcular o valor do frete
	//public void calcularFrete(String GO, String MG, String TO) {
	
		
	
	//}
}
