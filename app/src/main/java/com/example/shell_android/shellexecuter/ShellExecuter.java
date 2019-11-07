package com.example.shell_android.shellexecuter;

import java.io.BufferedReader;
import java.io.InputStreamReader;

/**
 * Created by Gavin
 */
public class ShellExecuter {

    public ShellExecuter() {

    }

    public String Executer(String command) {

        StringBuilder output = new StringBuilder();

        Process p;
        try {
            p = Runtime.getRuntime().exec(command);
            p.waitFor();
            BufferedReader reader = new BufferedReader(new InputStreamReader(p.getInputStream()));

            String line;
            while ((line = reader.readLine()) != null) {
                output.append(line);
            }

        } catch (Exception e) {
            e.printStackTrace();
        }
        return output.toString();
    }
}
