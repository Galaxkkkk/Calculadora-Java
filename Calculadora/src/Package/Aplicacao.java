package Package;

public class Aplicacao {

	public static void main(String[] args) {
		
		Triangulo triangulo;
		triangulo = new Triangulo();
		
		System.out.println("| CALCULAR ÁREA TRIÂNGULO |");
		triangulo.calcularTiangulo();
		System.out.println();
		
		Circulo circulo;
		circulo = new Circulo();
		
		System.out.println("| CALCULAR ÁREA DO CIRCULO |");
		circulo.calcularCirculo();
		System.out.println();
		
		Retangulo retangulo;
		retangulo = new Retangulo();
		
		System.out.println("| CALCULAR ÁREA DO RETÂNGULO |");
		retangulo.calcularRetangulo();
		
	}

}
