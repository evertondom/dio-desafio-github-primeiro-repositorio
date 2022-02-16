
public class Inicio {

	public static void main(String[] args) {
		
		System.out.println("==================================================");
		System.out.println("=============== Jony Calculadoras ================");
		Calculadora.soma(9, 20);
		Calculadora.subtracao(8, 30);
		Calculadora.multiplicacao(7, 40);
		Calculadora.divisao(6, 50);
		
		
		System.out.println("");
		
		
		System.out.println("================ Jony Relógio ====================");
		Hora.horario(9);
		Hora.horario(15);
		Hora.horario(21);
		
		System.out.println("");
		
		System.out.println("============== Jony Emprestimos ==================");
		Emprestimo.calcular(1000, 2);
		Emprestimo.calcular(1000, 3);
		Emprestimo.calcular(1000, 4);
		Emprestimo.calcular(1000, 8);
	}

}
