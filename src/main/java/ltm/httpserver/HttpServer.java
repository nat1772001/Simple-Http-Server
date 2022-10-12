package ltm.httpserver;

import ltm.httpserver.config.Configuration;
import ltm.httpserver.config.ConfigurationManager;

public class HttpServer {
    public static void main(String[] args) {

        System.out.println("Server starting...");

        ConfigurationManager.getInstance().loadConfigurationFile("src/main/resources/http.json");
        Configuration conf = ConfigurationManager.getInstance().getCurrentConfiguration();

        System.out.println("Using Port:" + conf.getPort());
        System.out.println("Using WebRoot:" + conf.getWebRoot());
    }
}
