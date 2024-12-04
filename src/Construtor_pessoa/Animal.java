package Construtor_pessoa;

public class Animal {
	
	private float tamanho;
	private String cor;
	
	
	//Construtor padrão é criado mesmo que não explicitado
		  public Animal() {
		  }
		  
		  //método construtor com aqrgumento
		  public Animal(float tamanho) {
			  this.tamanho = tamanho;
		  }
		  public Animal (float tamanho, String cor) {
			  this.tamanho = tamanho;
			  this.cor = cor;
		  }
		   public float getTamanho() {
			   return tamanho;
		   }
		   public void setTamanho(float tamanho) {
			   this.tamanho = tamanho;
		   }
		   public String getCor() {
			   return cor;
		   }
	
	
	

}
