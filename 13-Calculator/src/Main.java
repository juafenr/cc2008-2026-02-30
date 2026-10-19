public class Main
{
    public static void main(String[] args) {

        // double result;

        // try {
        //     throw new NullPointerException("aaa");

        //     // result = 100 / 0;
        // } catch (ArithmeticException e) {
        //     // result = 0;
        //     System.out.println("No se puede dividir por 0");
        // } catch (NullPointerException e) {
        //     // result = 0;
        //     System.out.println("Puntero a null");
        // }

        // System.out.println(result);

        try {
            // throw new NullPointerException("aaa");
            throw new SaldoInsuficienteException("Te quedaste sin saldo");

        } catch (Exception e) {
            System.out.println(e.getMessage());
        }

    }
}