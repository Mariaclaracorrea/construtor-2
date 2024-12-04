package Construtor_pessoa;

public class Animal02 {
	
    public static void main(String[]args) {
		
		
		Animal animal1 = new Animal("marrom",grande);
		Animal animal2 = new Animal("preto",pequeno);
		
		
		System.out.println(animal1.getCor());
		System.out.println(animal1.getTamanho());
		
		System.out.println(animal2.getCor());
		System.out.println(animal2.getTamanho());
		
 }
}
