package Stage.utilities;

import java.io.File;
import java.io.FileInputStream;
import java.util.Properties;

public class ReadConfig {

    Properties properties;//one object for Properties class

    public ReadConfig() { // constructor to read the config.properties file
        File src = new File("./Configuration/config.properties");//path of the properties file
        try {
            FileInputStream fis = new FileInputStream(src); //read mode for reading data from the file
            properties = new Properties();
            properties.load(fis); //load complete file
        }catch(Exception e) { //exception when file is not there
            System.out.println("Exception is " + e.getMessage() );
        }
    }
    //creating method for reading each value
    public String getApplicationURL()
    {
        String url=properties.getProperty("baseURL");//read our site address
        return url;
    }
    public String getChromeDriverPath() { //read our chromedriver address
        String chromepath=properties.getProperty("chromedriverpath");
        return chromepath; }

    public String getSafariDriverPath() {
        String safaripath=properties.getProperty("safaridriverpath");
        return safaripath;
    }
}


