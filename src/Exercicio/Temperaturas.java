package Exercicio;

public class Temperaturas {
	
	private int celsius;
	private int  freheit;
	
	
	
	public String nome;
	
	
	public int getCelsius() {
		return celsius;
	}
	public void setCelsius(int celsius) {
		this.celsius = celsius;
	}
	public int getFreheit() {
		return freheit;
	}
	public void setFreheit(int freheit) {
		this.freheit = freheit;
	}
	
	
	public int Convertercelsius() {
		
		int converter = (celsius  * 9/5) + 32;
		
		System.out.println("Digite Celsius");
		System.out.println(converter);
		
		
		return converter ;
		
	
}
	
	
	
	public int Convertfreheit() {
		
	
		int converter = ((freheit - 32) * 5 / 9) ;
		
		System.out.println(converter);
		
		return converter;
		
		

		
	}

	

	
}
