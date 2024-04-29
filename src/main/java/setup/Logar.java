package setup;

import dao.LoginDao;

import java.util.Scanner;

public class Logar {
    public void logar() {
        Scanner scanner = new Scanner(System.in);

        String nomeUsuario;
        String senha;
        Boolean autenticado = false;

        do {
            System.out.println("User name:");
            nomeUsuario = scanner.nextLine();

            System.out.println("Password: ");
            senha = scanner.nextLine();

            autenticado = new LoginDao().autenticarUsuario(nomeUsuario, senha);

            if(!autenticado) {
                System.out.println("Invalid credentials, try again!");
            }
        } while (!autenticado);
        System.out.println("Logged in successfully");
    }
}
