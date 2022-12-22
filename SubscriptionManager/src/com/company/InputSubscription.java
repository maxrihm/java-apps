package com.company;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

public class InputSubscription {

    String str_main;

    public void readFile() throws IOException {
        BufferedReader br = new BufferedReader(new FileReader("file.txt"));
        try {
            StringBuilder sb = new StringBuilder();
            String line = br.readLine();

            while (line != null) {
                sb.append(line);
                sb.append(System.lineSeparator());
                line = br.readLine();
            }
            this.str_main = sb.toString();
        } finally {
            br.close();
        }
    }

    public String[] stringToArr() throws IOException {
        readFile();
        String new_lines = this.str_main.replaceAll("\r\n", ", ");
        String[] arr_split = new_lines.split(", ");

        return arr_split;
    }
}
