import java.util.Locale;
import java.util.Scanner;

public class ContaTerminal {

	public static void main(String[] args) {
		int numero;
		String agencia;
		String nomeCliente;
		Double saldo;

		Locale.setDefault(Locale.US);
		Scanner scanner = new Scanner(System.in);

		System.out.println("Por favor, digite o número da conta !");
		numero = scanner.nextInt();

		System.out.println("Por favor, digite o número da Agência !");
		agencia = scanner.next();

		scanner.nextLine();
		System.out.print("Por favor, digite o seu nome completo !");

		nomeCliente = scanner.nextLine();

		System.out.println("Digite o valor do saldo diponível em sua conta !");

		saldo = scanner.nextDouble();

		System.out.println("Olá " + nomeCliente + " obrigado por criar uma conta em nosso banco, sua agencia é "
				+ agencia + " conta " + numero + " e seu saldo " + saldo + " já está disponível para saque");

		scanner.close();

	}

}
