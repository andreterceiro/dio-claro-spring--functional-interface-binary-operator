import java.util.Arrays;
import java.util.List;
import java.util.function.BinaryOperator;

public class FunctionalInterfaceBinaryOperator {
    public static void main(String[] args) throws Exception {
        FunctionalInterfaceBinaryOperator.forma1();
    }

    private static void forma1() {
        List<Integer> numeros = Arrays.asList(1, 2, 3, 4, 5);
        BinaryOperator<Integer> somar = (valor1, valor2) -> valor1 + valor2;

        int soma = numeros.stream().reduce(0, somar);

        System.out.println("A soma é: " + soma);
    }
}