package config;

import org.ini4j.Ini;

import java.io.File;
import java.io.IOException;

public class Props {

    public static void main(String[] args) {
        String pathname = System.getProperty("user.dir")+"/configuration/src/main/resources/properties.cfg";
        File cfgFile = new File(pathname);
        try {
            Ini ini = new Ini(cfgFile);

            // Read properties
            Object object;
            Ini.Section section = ini.get("upper");

            System.out.println(section.get("a"));
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
