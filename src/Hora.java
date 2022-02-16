
public class Hora {

	public static void horario (int horario) {
		if (horario >= 6 && horario < 12) {
			System.out.println("São "+ horario +" horas. Tenha um Bom dia!" );
		}else if(horario > 12 && horario < 18) {
			System.out.println("São "+ horario +" horas. Tenha uma Boa tarde!" );
		}else if(horario > 18 || horario < 6 ){
			System.out.println("São "+ horario +" horas. Tenha uma Boa noite!");
		}else {
			System.out.println("Hora Inválida!");
		}
	}
}
