
package br.game.inout;

import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;


public class SalvarLog {
    
     public static void escreverLog(String mensagem, String logFile) throws IOException {
        FileWriter fileWriter = new FileWriter(logFile, true);
        BufferedWriter bufferedWriter = new BufferedWriter(fileWriter);
        String data = (new java.util.Date()).toString();
        String msg = data + " : " + mensagem + "\n";
        bufferedWriter.write(msg);
        bufferedWriter.flush();
        bufferedWriter.close();
    }
}
