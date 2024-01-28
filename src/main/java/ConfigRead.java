import java.io.FileReader;
import java.util.Properties;

public class ConfigRead {
    private String configPath;
    public ConfigRead(String configPath){
        this.configPath = configPath;
    }

    public Properties readData() throws Exception {
        FileReader reader = new FileReader(configPath);
        Properties p = new Properties();
        p.load(reader);
        return p;
    }
}