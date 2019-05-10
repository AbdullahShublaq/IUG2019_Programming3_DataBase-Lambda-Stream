/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Q2;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.Collection;
import java.util.HashMap;
import java.util.Map;
import java.util.stream.Collectors;

/**
 *
 * @author Abdullah Shublaq
 */
public class Main {

    public static void main(String[] args) throws IOException {
        
        File file = new File("file.txt");
        FileInputStream fis = new FileInputStream(file);
        InputStreamReader isr = new InputStreamReader(fis);
        BufferedReader br = new BufferedReader(isr);

        StringBuilder sb = new StringBuilder();
        while (br.ready()) {
            sb.append(br.readLine()).append("\n");
        }
        System.out.println(sb);

        myOperation count = (text) -> {

            HashMap<String, Integer> hm = new HashMap();

            for (int i = 0; i < text.length(); i++) {
                Character chr = text.charAt(i);
                Integer i1 = hm.get(chr.toString());
                if (i1 == null) {
                    hm.put(chr.toString(), 1);
                } else {
                    hm.put(chr.toString(), i1 + 1);
                }
            }
            return hm;
        };

        System.out.println(count.operation(sb.toString()));
        
    }

    interface myOperation {

        Object operation(String text);
    }
}
