package br.game.validacoes;

import br.game.modelo.Usuario;

public class ValUsuario {

    public ValUsuario(Usuario user) {

    }

    public static boolean ValLogin(String login, String senha) {
        return login.equals("login") && senha.equals("123");
    }

}
