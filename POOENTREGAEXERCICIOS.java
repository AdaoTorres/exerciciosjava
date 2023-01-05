package FUNCIONARIO;

public class FUNCIONARIO {

	
	private String nomeFuncionario;
	private String idadeFuncionario;
	private String cpfFuncionario;
	private String pesoFuncionario;
	private String alturaFuncionario;
	
	
	public FUNCIONARIO(String nomeFuncionario, String idadeFuncionario, String cpfFuncionario, String pesoFuncionario,
			String alturaFuncionario) {
		super();
		this.nomeFuncionario = nomeFuncionario;
		this.idadeFuncionario = idadeFuncionario;
		this.cpfFuncionario = cpfFuncionario;
		this.pesoFuncionario = pesoFuncionario;
		this.alturaFuncionario = alturaFuncionario;
	}


	public String getNomeFuncionario() {
		return nomeFuncionario;
	}


	public void setNomeFuncionario(String nomeFuncionario) {
		this.nomeFuncionario = nomeFuncionario;
	}


	public String getIdadeFuncionario() {
		return idadeFuncionario;
	}


	public void setIdadeFuncionario(String idadeFuncionario) {
		this.idadeFuncionario = idadeFuncionario;
	}


	public String getCpfFuncionario() {
		return cpfFuncionario;
	}


	public void setCpfFuncionario(String cpfFuncionario) {
		this.cpfFuncionario = cpfFuncionario;
	}


	public String getPesoFuncionario() {
		return pesoFuncionario;
	}


	public void setPesoFuncionario(String pesoFuncionario) {
		this.pesoFuncionario = pesoFuncionario;
	}


	public String getAlturaFuncionario() {
		return alturaFuncionario;
	}


	public void setAlturaFuncionario(String alturaFuncionario) {
		this.alturaFuncionario = alturaFuncionario;
	}
	
	public void imprimirinfo() {
		
		System.out.println("\nNome: "+nomeFuncionario+" idade"+idadeFuncionario+" CPF"+cpfFuncionario+" peso"+pesoFuncionario+" altura"+alturaFuncionario);
		
	}
	
	
	
}










package FUNCIONARIO;

import CLIENTE.CLIENTE;
import FUNCIONARIO.FUNCIONARIO;

public class FUNCIONARIOTESTE {

	public static void main(String[] args) {
		
		
		FUNCIONARIO fun = new FUNCIONARIO("NOME","IDADE","CPF","PESO","ALTURA");
		fun.imprimirinfo();
		
		System.out.printf("\nNovo funcionário");
		fun.setNomeFuncionario("Roberta Miranda");
		fun.setIdadeFuncionario("99");
		fun.setCpfFuncionario("123.345.456.78");
		fun.setPesoFuncionario("92kg");
		fun.setAlturaFuncionario("1,67m");
		fun.imprimirinfo();

		
		System.out.printf("\nNovo funcionário");
		fun.setNomeFuncionario("Roberto Carlos");
		fun.setIdadeFuncionario("+99");
		fun.setCpfFuncionario("000.111.222-33");
		fun.setPesoFuncionario("-50kg");
		fun.setAlturaFuncionario("1,71m");
		fun.imprimirinfo();
		
	}

}

















package CLIENTE;

public class CLIENTE {

	private String nomeCliente;
	private String idadeCliente;
	private String cpfCliente;
	private String pesoCliente;
	private String alturaCliente;
	
	

	





public CLIENTE(String nomeCliente, String idadeCliente, String cpfCliente, String pesoCliente,
			String alturaCliente) {
		super();
		this.nomeCliente = nomeCliente;
		this.idadeCliente = idadeCliente;
		this.cpfCliente = cpfCliente;
		this.pesoCliente = pesoCliente;
		this.alturaCliente = alturaCliente;
	}










public String getNomeCliente() {
	return nomeCliente;
}










public void setNomeCliente(String nomeCliente) {
	this.nomeCliente = nomeCliente;
}










public String getIdadeCliente() {
	return idadeCliente;
}










public void setIdadeCliente(String idadeCliente) {
	this.idadeCliente = idadeCliente;
}










public String getCpfCliente() {
	return cpfCliente;
}










public void setCpfCliente(String cpfCliente) {
	this.cpfCliente = cpfCliente;
}










public String getPesoCliente() {
	return pesoCliente;
}










public void setPesoCliente(String pesoCliente) {
	this.pesoCliente = pesoCliente;
}










public String getAlturaCliente() {
	return alturaCliente;
}










public void setAlturaCliente(String alturaCliente) {
	this.alturaCliente = alturaCliente;
}










public void imprimirinfo() {
		
		System.out.println("\nNome: "+nomeCliente+" idade"+idadeCliente+" CPF"+cpfCliente+" peso"+pesoCliente+" altura"+alturaCliente);
		
	}
	
	
}
















package CLIENTE;

public class CLIENTETESTE {

	public static void main(String[] args) {
	
		
		CLIENTE cli = new CLIENTE("Francisco Silva","47","111111111-11","78","1,75");
		cli.imprimirinfo();
		
		System.out.printf("\nNovo cliente");
		cli.setNomeCliente("Franciscano Silveira");
		cli.setIdadeCliente("74");
		cli.setCpfCliente("000000000-00");
		cli.setAlturaCliente("1,57");
		cli.imprimirinfo();
		
	}

}
