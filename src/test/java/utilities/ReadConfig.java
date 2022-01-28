package utilities;


import java.io.File;
import java.io.FileInputStream;
import java.util.Properties;

public class ReadConfig {
    Properties pro;

    public ReadConfig() {
        File src = new File ("src/test/Configuration/config.properties");

        try {
            FileInputStream fis = new FileInputStream(src);
            pro = new Properties();
            pro.load(fis);
        }catch ( Exception e){
            System.out.println(e.getMessage());
        }
    }

        public String getBaseUrl(){
            return pro.getProperty("baseUrl");
         }

        public String getUserName(){
            return pro.getProperty("userName");
         }
        public String getPassword(){
            return pro.getProperty("pwd");
         }

         public String getChromePath(){
            return pro.getProperty("chromepath");
         }

}
