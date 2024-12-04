package Construtor_pessoa;

public class Carro {
	
	 private String placa;
	 private int numChassi;
	 
	//Construtor padrão é criado mesmo que não explicitado
	  public Carro() {
	  }
	  
	  //método construtor com aqrgumento
	  public Carro(String Placa) {
		  this.placa= Placa;
	  }
	  public Carro(String Placa, int numChassi) {
		  this.placa = Placa;
		  this.numChassi = numChassi;
	  }
	   public String getPlaca() {
		   return placa;
	   }
	   public void setPlaca(String placa) {
		   this.placa = placa;
	   }
	   public int getnumChassi() {
		   return numChassi;
	   }

}
