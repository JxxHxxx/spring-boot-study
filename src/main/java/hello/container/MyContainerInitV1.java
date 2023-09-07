package hello.container;

import hello.servlet.HelloServlet;
import jakarta.servlet.ServletContainerInitializer;
import jakarta.servlet.ServletContext;
import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.HandlesTypes;

import java.util.Set;

// 서블릿 초기화 하는 애들

public class MyContainerInitV1 implements ServletContainerInitializer {

    @Override
    public void onStartup(Set<Class<?>> c, ServletContext ctx) throws ServletException {
        System.out.println("MyContainerInitV1.onStartup");
        System.out.println("MyContainerInitV1 c = " + c);
        System.out.println("MyContainerInitV1 ctx = " + ctx);

        AppInitV1Servlet appInitV1Servlet = new AppInitV1Servlet();
        appInitV1Servlet.onStartup(ctx);
    }
}
