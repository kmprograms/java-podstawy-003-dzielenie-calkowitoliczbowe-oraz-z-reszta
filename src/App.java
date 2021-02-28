public class App {
    public static void main(String[] args) {

        int number = 123;

        int result1 = number / 10;
        System.out.println("Result 1 = " + result1);

        double result2 = number / 10;
        System.out.println("Result 2 = " + result2);

        double result3 = number / 10.0;
        System.out.println("Result 3 = " + result3);

        // Dzielenie z reszta - operator % ( modulo )

        int cyfraJednosci = number % 10;
        System.out.println("Cyfra jednosci = " + cyfraJednosci);

        int cyfraDziesiatek = ( number / 10 ) % 10;
        System.out.println("Cyfra dziesiatek = " + cyfraDziesiatek);
    }
}
