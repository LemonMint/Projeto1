package br.game.validacoes;

import br.game.modelo.Cliente;

public class ValUsuario {

    public ValUsuario(Cliente user) {

    }

    public static boolean ValLogin(String login, String senha) {
        return login.equals("login") && senha.equals("123");
    }

}
