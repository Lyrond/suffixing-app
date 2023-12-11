import java.util.Properties;

public class SuffixingApp {
    public static void main(String[] args) throws Exception {
        String configPath = args[0];
        ConfigRead config = new ConfigRead(configPath);

        Properties properties = config.readData();
        FileChange fileChanger = new FileChange(properties);

        fileChanger.change();
    }
}