package ltm.httpserver;

import ltm.httpserver.config.Configuration;
import ltm.httpserver.config.ConfigurationManager;
import ltm.httpserver.core.ServerListenerThread;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;


import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.net.ServerSocket;
import java.net.Socket;

public class HttpServer {
    private final static Logger LOGGER = LoggerFactory.getLogger(HttpServer.class);
    public static void main(String[] args) {

        LOGGER.info("Server starting...");

        ConfigurationManager.getInstance().loadConfigurationFile("src/main/resources/http.json");
        Configuration conf = ConfigurationManager.getInstance().getCurrentConfiguration();

        LOGGER.info("Using Port:" + conf.getPort());
        LOGGER.info("Using WebRoot:" + conf.getWebRoot());

        try {
            ServerListenerThread serverListenerThread = new ServerListenerThread(conf.getPort(), conf.getWebRoot());
            serverListenerThread.start();
        } catch (IOException e) {
            e.printStackTrace();
        }

    }
}
