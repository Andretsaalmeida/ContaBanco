import java.text.DecimalFormat;
import java.util.Scanner;
import java.util.regex.Pattern;

public class ContaTerminal {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Solicitar e ler dados da conta bancária
        String numeroConta;
        do {
            System.out.println("Por favor, digite o número da conta:");
            numeroConta = scanner.nextLine();
        } while (!validarNumeroConta(numeroConta));

        String numeroAgencia;
        do {
            System.out.println("Por favor, digite o número da agência:");
            numeroAgencia = scanner.nextLine();
        }while (!validarNumeroAgencia(numeroAgencia)) ;

        //Solicitar e ler o nome do cliente
        String nomeCliente;
        do{
            System.out.println("Por favor, digite o nome do cliente:");
            nomeCliente = scanner.nextLine().trim();
        }while (!validarNomeCliente(nomeCliente));

        System.out.println("Por favor, digite o saldo:");
        double saldo = 0;
        while (true) {
            try {
                saldo = Double.parseDouble(scanner.nextLine());
                break; // Sai do loop se o saldo for válido
            } catch (NumberFormatException e) {
                System.out.println("Saldo inválido. Por favor, digite um número válido:");
            }
        }

        // Formatar o saldo para exibir duas casas decimais e separador de milhares
        DecimalFormat formatoSaldo = new DecimalFormat("#,##0.00");
        String saldoFormatado = formatoSaldo.format(saldo);

        // Exibir mensagem com os dados inseridos
        System.out.println("Olá " + nomeCliente.concat(", obrigado por criar uma conta em nosso banco,"));
        System.out.println("sua agência é " + numeroAgencia
                .concat(", conta ")
                .concat(String.valueOf(numeroConta))
                .concat(" e seu saldo ")
                .concat(saldoFormatado)
                .concat(" já está disponível para saque."));

        // Fechar o scanner
        scanner.close();

    }
    //Método para validar número de conta bancária
    public static boolean validarNumeroConta(String numeroConta) {
        // Verifica se o número da conta tem exatamente 4 numeros
        if (numeroConta.matches("\\d{4}+")) {
            return true;
        }
        // Se  nao passou pela verificação, retorna false (numeroConta inválido)
        return false;
    }
    // Método para validar número de agência bancária
    public static boolean validarNumeroAgencia(String numeroAgencia) {

        if (numeroAgencia == null || numeroAgencia.isEmpty() || !numeroAgencia.matches("^\\d{3}-\\d{1}$")) {
            return false;
        }

        // Se passou pela verificação, retorna true (válido)
        return true;
    }

    // Método para validar nome do cliente
    public static boolean validarNomeCliente(String nomeCliente) {
        // Verifica se o nome tem o comprimento mínimo e máximo de caracteres
        if (nomeCliente.length() < 3 || nomeCliente.length() > 50) {
            return false;
        }

        // Verifica se o nome contém apenas letras, espaços e alguns caracteres especiais
        if (!Pattern.matches("[A-Za-zÀ-ÖØ-öø-ÿ-' ]+", nomeCliente)) {
            return false;
        }

        // Verifica se o nome não contém números
        if (Pattern.matches(".*\\d.*", nomeCliente)) {
            return false;
        }

        // Se passou por todas as verificações, retorna true (válido)
        return true;
    }

}

