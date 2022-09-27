package exercicio3;

import java.sql.DriverManager;
import java.sql.SQLException;
import java.util.Scanner;

public class Exercicio3 {

    public static void main(String[] args) {

        Scanner ler = new Scanner(System.in);

        int x = 0;
        while (x != 9) {
            System.out.println("Por favor digite o tipo de imovel");
            System.out.println("Digite 1 para imoveis novos, 2 para imoveis usados ou digite 9 para finalizar");
            x = ler.nextInt();

            if (x == 9) {
                break;
            }

            while (x > 2) {
                System.out.println("Por favor digite o tipo de imovel");
                System.out.println("Digite 1 para imoveis novos, 2 para imoveis usados ou digite 9 para finalizar");
                x = ler.nextInt();

            }

            switch (x) {
                case 1: // Imovel Novo
                    Imoveis imoveis = new Imoveis();
                    imoveis.mostraDados();
                    ImovNovo imovNovo = new ImovNovo();
                    double calc = imovNovo.getPreco(imoveis.getPreco());
                    System.out.println("Valor do imovel: " + calc);

                    break;

                case 2: // Imovel Usado 
                    ImovUsado imovU = new ImovUsado();
                    imovU.mostraDados();
                    double calc2 = imovU.getPreco();
                    System.out.println("Valor aluguel: " + calc2);

                    break;

            }
        }
        
        try {
            Class.forName("com.mysql.cj.jdbc.Driver");
            String serverName = "127.0.0.1:3306";    //caminho do servidor do BD
            String mydatabase = "aula";        //nome do seu banco de dados
            String url = "jdbc:mysql://" + serverName + "/" + mydatabase + "?useTimezone=true&serverTimezone=UTC";
            String username = "root";        //nome de um usuário de seu BD
            String password = "";      //sua senha de acesso
            Object connection = DriverManager.getConnection(url, username, password);

            //Testa sua conexão//
            if (connection != null) {
                System.out.println("STATUS--->Conectado com sucesso!");
            } else {
                System.out.println("STATUS--->Não foi possivel realizar conexão");
            }

        } catch (ClassNotFoundException e) {  //Driver não encontrado
            System.out.println("O driver expecificado nao foi encontrado.");

        } catch (SQLException e) {
            //Não conseguindo se conectar ao banco
            System.out.println("Nao foi possivel conectar ao Banco de Dados." + e.getMessage());
        }
    }

}
