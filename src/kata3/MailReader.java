/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package kata3;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author usuario
 */
public class MailReader {
    private final String filepath;

    public MailReader(String filepathe) {
        this.filepath = filepathe;
    }
    
    public String[] readDomain (){
        ArrayList<String> domainList = new ArrayList <>();
        try {
            BufferedReader reader = new BufferedReader (new FileReader (filepath));
            String line = reader.readLine();
            while (line!= null){
                if (line.contains("@")){
                    domainList.add(line.split("@")[1]);
                    line = reader.readLine();
                }
            }
        } catch (IOException ex) {
        }
        return domainList.toArray(new String [domainList.size()]);
}
    
}
