package org.example;

import java.io.*;

/**
 * email logs info
 */
public class App 
{
    public static void main( String[] args )
    {
        int passCounter=0;
        int failCounter=0;
        int logs=0;
        int protWww = 0,protImap = 0,protPop3 = 0,protSmtp = 0;

        System.out.println( "Logowanie plik "+args[0] );

        File file = new File(args[0]);
        try {
            FileReader fileReader = new FileReader(file);
            BufferedReader bufferedReader = new BufferedReader(fileReader);
            StringBuffer stringBuffer = new StringBuffer();
            String line;
            while ((line=bufferedReader.readLine())!=null){
                logs++;

                if(line.contains("PASS")) {
                    passCounter++;
                } else {
                    failCounter++;
                }
                if(line.contains("www"))protWww++;
                if(line.contains("SMTP"))protSmtp++;
                if(line.contains("pop3"))protPop3++;
                if(line.contains("imap"))protImap++;

                stringBuffer.append(line);
                stringBuffer.append("\n");
            }
            fileReader.close();
            int allLogs = (logs / 10);
            int wrongLogs = (failCounter/10);

            System.out.println(" ŁąCZNA LICZBA LOGOWAŃ "+logs);
            System.out.println(" LICZBA UDANYCH PRAWIDŁOWYCH LOGOWAŃ :"+passCounter);
            System.out.println(" LICZBA PRÓB WŁAMAŃ DO SKRZYNKI :"+failCounter+"  \n");
            System.out.println("UżYCIE PROTOKOŁÓW:");
            System.out.println("WWW \t"+protWww);
            System.out.println("IMAP \t"+protImap);
            System.out.println("POP3 \t"+protPop3);
            System.out.println("SMTP \t"+protSmtp);
            System.out.print("ALL  :\t");
            for(int i=0;i<allLogs;i++){
                System.out.print("#");
            }
            System.out.print("\nFAIL:\t");
            for(int j=0;j<wrongLogs;j++){
                System.out.print("#");
            }
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }
}
