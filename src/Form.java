import java.io.BufferedWriter;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.time.LocalDateTime;
import java.util.Scanner;


public class Form {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        System.out.println("Digite seu nome completo: ");

        String nome = scanner.nextLine();

        System.out.println("Digite sua idade: ");

        String idade = scanner.nextLine();

        System.out.println("Digite sua o nome de sua cidade: ");

        String cidade = scanner.nextLine();

        System.out.println("Digite seu email: ");

        String email = scanner.nextLine();

        System.out.println("Digite seu telefone: ");

        String tel = scanner.nextLine();

        System.out.println("Digite seu nome de usuário: ");

        String usuario = scanner.nextLine();


        File file = new File("C:\\Users\\Lucas\\Desktop\\FormularioJava\\src\\infos\\" + usuario + ".txt");
        try {
            BufferedWriter output = null;
            try {
                output = new BufferedWriter(new FileWriter(file));
                output.write("Informações do formulário:");
                output.newLine();
                output.newLine();
                output.write("Formulário enviado por: " + nome);
                output.newLine();
                output.newLine();

                output.write("Nome: " + nome);
                output.newLine();
                output.write("Idade: " + idade);
                output.newLine();
                output.write("Cidade: " + cidade);
                output.newLine();
                output.write("Usuário: " + usuario);
                output.newLine();
                output.write("Email: " + email);
                output.newLine();
                output.write("Telefone: " + tel);
                output.newLine();
                output.write("Resumo: O " + nome + " tem " + idade + " anos e mora em " + cidade + "seu telefone é " + tel + " e seu email é " + email);
                output.newLine();
                output.write("Data e hora do envio: " + LocalDateTime.now());
            } catch (IOException e) {
                e.printStackTrace();
            } finally {
                if (output != null) {
                    output.close();
                }
            }
        } catch (Exception e) {
            e.printStackTrace();
        }

    }


}
