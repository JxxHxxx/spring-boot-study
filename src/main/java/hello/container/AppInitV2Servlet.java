package hello.container;

import hello.servlet.GoodbyeServlet;
import jakarta.servlet.ServletContext;
import jakarta.servlet.ServletRegistration;

public class AppInitV2Servlet implements AppInitV2 {

    @Override
    public void onStartup() {
        System.out.println("vivi");
    }
}
