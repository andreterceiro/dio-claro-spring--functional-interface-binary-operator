import java.util.Arrays;
import java.util.List;
import java.util.function.BinaryOperator;

/**
 * Class to make tests related to the functional interface binary operator
 */
public class FunctionalInterfaceBinaryOperator {

    /**
     * main method, who invokes other auxiliary methods
     *
     * @param args CLI args (ignored)
     * @throws Exception
     */
    public static void main(String[] args) throws Exception {
        FunctionalInterfaceBinaryOperator.forma1();
        System.out.println("----------------------");
        FunctionalInterfaceBinaryOperator.forma2();
        System.out.println("----------------------");
        FunctionalInterfaceBinaryOperator.forma3();
        System.out.println("----------------------");
        FunctionalInterfaceBinaryOperator.forma4();
    }

    /**
     * Way 1 to use the functional interface binary operator
     */
    private static void forma1() {
        List<Integer> numeros = Arrays.asList(1, 2, 3, 4, 5);
        BinaryOperator<Integer> somar = (valor1, valor2) -> valor1 + valor2;

        int soma = numeros.stream().reduce(0, somar);

        System.out.println("A soma é: " + soma);
    }

    /**
     * Way 2 to use the functional interface binary operator
     */
    private static void forma2() {
        List<Integer> numeros = Arrays.asList(1, 2, 3, 4, 5);

        int soma = numeros.stream().reduce(0, new BinaryOperator<Integer>() {
            @Override
            public Integer apply(Integer valor1, Integer valor2) {
                return valor1 + valor2;
            }
        });

        System.out.println("A soma é: " + soma);
    }

    /**
     * Way 3 to use the functional interface binary operator
     */
    private static void forma3() {
        List<Integer> numeros = Arrays.asList(1, 2, 3, 4, 5);

        // Specifying the type of the parameters in the lambda works, but is not necessary
        // int soma = numeros.stream().reduce(0, (valor1, valor2) -> valor1 + valor2);
        int soma = numeros.stream().reduce(0, (valor1, valor2) -> valor1 + valor2);

        System.out.println("A soma é: " + soma);
    }

    /**
     * Way 4 to use the functional interface binary operator
     */
    private static void forma4() {
        List<Integer> numeros = Arrays.asList(1, 2, 3, 4, 5);

        int soma = numeros.stream().reduce(0, Integer::sum);

        System.out.println("A soma é: " + soma);
    }
}