package generic_utility;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.Properties;

public class fileUtility {

    public String getPropertyKeyvalue(String key) throws IOException {

        FileInputStream fis = new FileInputStream(
            "./src/test/resources/OrangeHRM_CommonData/commondata.properties"
        );

        Properties prop = new Properties();
        prop.load(fis);

        return prop.getProperty(key);
    }

 
    public void setPropertyPair(String key, String value) throws IOException {

        Properties prop = new Properties();

       
        FileInputStream fis = new FileInputStream(
            "./src/test/resources/OrangeHRM_CommonData/commondata.properties"
        );
        prop.load(fis);

        FileOutputStream fos = new FileOutputStream(
            "./src/test/resources/OrangeHRM_CommonData/commondata.properties"
        );

        prop.setProperty(key, value);
        prop.store(fos, null);

        fos.close();
    }
}