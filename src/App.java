public class App {
    public static void main(String[] args) throws Exception {
        System.out.println("Este programa muestra los n primeros números de la serie de Fibonacci.");
        int n = Integer.parseInt(System.console().readLine("Por favor, introduzca n: "));
        switch (n) {
            case 1:
                System.out.println("0");
                break;
            case 2:
                System.out.println("0 1");
                break;
            default:
            System.out.print("0 1");
                int num1 = 0;
                int num2 = 1;
                int numAnterior;
                while (n > 2) {
                    numAnterior = num1;
                    num1 = num2;
                    num2 = numAnterior + num1;
                    System.out.print(" "+num2);
                    n--;
                }
            break;
        }

    }
}
