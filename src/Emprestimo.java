
public class Emprestimo {
	
	public static double taxaDuasParcelas() {
		return 0.2;
	}
	public static double taxaTresParcelas() {
		return 0.3;
	}
	public static double taxaQuatroParcelas() {
		return 0.4;
	}
	public static double taxaMuitasParcelas() {
		return 0.55;
	}
	
	public static void calcular(double valor, int parcelas) {
		if(parcelas == 2) {
			double valorFinal = valor + (valor * taxaDuasParcelas());
			
			System.out.println("Valor Total para 2 parcelas: R$ " + valorFinal);
			
		}else if(parcelas == 3) {
			double valorFinal = valor + (valor * taxaTresParcelas());
			
			System.out.println("Valor Total para 3 parcelas: R$ " + valorFinal);
			
		}else if(parcelas == 4){
			double valorFinal = valor +(valor * taxaQuatroParcelas());
			
			System.out.println("Valor Total para 4 parcelas: R$ " + valorFinal);
			
		}else {
			double valorFinal = valor +(valor * taxaMuitasParcelas());
			
			System.out.println("Valor Total para outras parcelas: R$ " + valorFinal);
		}
	}

}
