import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class ExercicioProposto {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        List<Double> temperaturasSemestral = new ArrayList<>();

        double soma = 0;

        for (int i = 1; i <= 6; i++){
            System.out.println("Qual a temperatura do mês" + i + ":");
            double temp = scan.nextDouble();
            temperaturasSemestral.add(temp);
            soma += temp;
        }
        double mediaTemperaturasSemestral = soma/temperaturasSemestral.size();
        System.out.println("TemperaturasSemestral: " + temperaturasSemestral);
        System.out.println("MédiaTemperaturasSemestral: " + mediaTemperaturasSemestral + "ºC" );
        System.out.println("-------------");

        for (Double temp : temperaturasSemestral) {
            if (temp > mediaTemperaturasSemestral) {
                int index = temperaturasSemestral.indexOf(temp);
                switch (index) {
                    case 1:
                        System.out.println((index + 1) + " - JANEIRO: " + temp + " oC");
                        break;
                    case 2:
                        System.out.println((index + 1) + " - FEVEREIRO: " + temp + " oC");
                        break;
                    case 3:
                        System.out.println((index + 1) + " - MARÇO: " + temp + " oC");
                        break;
                    case 4:
                        System.out.println((index + 1) + " - ABRIL: " + temp + " oC");
                        break;
                    case 5:
                        System.out.println((index + 1) + " - MAIO: " + temp + " oC");
                        break;
                    case 6:
                        System.out.println((index + 1) + " - JUNHO: " + temp + " oC");
                        break;
                    default:
                        break;
                }
            }
        }
    }

}
