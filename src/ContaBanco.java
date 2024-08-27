import java.util.*;;

public class ContaBanco {
    public static void main(String[] args) throws Exception {
        Scanner scanner = new Scanner(System.in);

        int numero = 0;
        String agencia = "";
        String nomeCliente = "";
        double saldo = 1000.0;

        //Validação da Agência
        while (true) {
            System.out.println("Por favor digite o número da agência");
            agencia = scanner.nextLine();
            if (agencia.matches("[0-9-]+")) {
                break;
            } else {
                System.out.println("Erro, digite o número da sua agência. Exemplo: 014-7");
            }
        } 
        //Validação da conta bancária
        while (true) {
            System.out.println("Digite o número da sua conta bancária.");
            if (scanner.hasNextInt()) {
                numero = scanner.nextInt();
                scanner.nextLine();
                break;
            } else {
                scanner.next();
                System.out.println("Erro, digite o número da sua conta bancária. Exemplo: 1004");
            }
        }

        //Validação do nome cliente
        while (true) {
            System.out.println("Digite o seu nome.");
            nomeCliente = scanner.nextLine();
            if (nomeCliente.matches("[A-Za-z ]+")) {
                break;
            } else {
                System.out.println("Erro digite um nome válido. Exemplo: Carla, Rodrigo, Luiz");
            }
        }

        System.out.println("Olá " + nomeCliente + ", obrigado por criar uma conta em nosso banco, sua agência é " + agencia + ", conta " + numero + " e seu saldo " + saldo + " já está disponível para saque.");
    }
}
