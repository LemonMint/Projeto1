package br.game.validacoes;

import br.game.modelo.Clientes;

public class ValUsuario {

    public ValUsuario(Clientes user) {

    }

    public static boolean ValLogin(String login, String senha) {
        return login.equals("login") && senha.equals("123");
    }

}
