import java.util.Arrays;
import java.util.HashSet;
import java.util.Set;

public class ExSet {
    public static void main(String[] args) {
        System.out.println("Crie um conjunto e adicione as notas: ");
        Set<Double> notas = new HashSet<>(Arrays.asList(7d, 8.5, 9.3, 5d, 7d, 0d, 3.6));
        System.out.println(notas);

        System.out.println("Confira se a nota 5.0 está no conjunto: " + notas.contains(5d));

    }
}
