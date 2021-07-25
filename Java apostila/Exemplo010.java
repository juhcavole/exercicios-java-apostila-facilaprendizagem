import java.time.LocalDate;

/**
*Exemplo de formatação de data com LocalDate
*/
public class Exemplo010{
	public static void main(String[] args){

	LocalDate hoje = LocalDate.now();
	LocalDate ontem = hoje.minusDays(1);

	System.out.println(hoje);
	System.out.println(ontem);

}
}
	
