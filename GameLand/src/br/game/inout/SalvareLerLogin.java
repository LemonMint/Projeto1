package br.game.inout;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

public class SalvareLerLogin {

    public static void escreverLogin(String mensagem, String logFile) throws IOException {
        FileWriter fileWriter = new FileWriter(logFile, false);
        BufferedWriter bufferedWriter = new BufferedWriter(fileWriter);
        //String data = (new java.util.Date()).toString();
        //String msg = data + " : " + mensagem + "\n";
        String msg = mensagem + "\n";
        bufferedWriter.write(msg);
        bufferedWriter.flush();
        bufferedWriter.close();
    }

    public static String lerLogin(String logFile) throws IOException {
        String linha = null;
        FileReader fileReader = new FileReader(logFile);
        BufferedReader bufferedReader = new BufferedReader(fileReader);

        while (bufferedReader.ready()) {
            linha = bufferedReader.readLine();
        }

        bufferedReader.close();
        return linha;
    }

}
