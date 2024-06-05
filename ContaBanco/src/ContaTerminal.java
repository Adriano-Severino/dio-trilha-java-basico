import java.text.MessageFormat;
import java.util.InputMismatchException;
import java.util.Scanner;

public class ContaTerminal {
    public static void main(String[] args) throws Exception {

        Scanner scanner = new Scanner(System.in);
        
        Integer numero = 0;
        String agencia = "";
        String nome_cliente = "";
        double saldo = 237.48;

        try {
            System.out.print("Por favor, digite o número da Agência ! ");
            agencia = scanner.nextLine();

            System.out.print("Por favor, digite o número da conta ! ");
            numero = scanner.nextInt();
            scanner.nextLine(); 

            System.out.print("Por favor, o seu nome ! ");
            nome_cliente = scanner.nextLine();

            String mensagem = MessageFormat.format("Olá {0}, obrigado por criar uma conta em nosso banco, sua agência é {1}, conta {2} e seu saldo {3} já está disponível para saque", nome_cliente, agencia,numero,saldo);

            System.out.println(mensagem);

        } 
        catch (InputMismatchException e)
        {
            System.out.print("Por favor, em numero da conta digite apenas numero ! ");
        }
        catch (Exception e)
        {
            System.out.print("Aconteceu um erro ! ");
        }

        scanner.close();
    } 
}
