package com.daoleen.javaee.training.config;

import org.thymeleaf.TemplateEngine;
import org.thymeleaf.templateresolver.ServletContextTemplateResolver;

/**
 * Created by alex on 25.5.14.
 */
public class TrainingApplication {

    private static TemplateEngine templateEngine;

    static {
        initializeTemplateEngine();
    }

    private static void initializeTemplateEngine() {
        ServletContextTemplateResolver templateResolver = new ServletContextTemplateResolver();
        templateResolver.setTemplateMode("HTML");
        templateResolver.setPrefix("/WEB-INF/views/");
        templateResolver.setSuffix(".html");
        templateResolver.setCacheTTLMs(3600000L);
        templateResolver.setCacheable(false);   // For debug purposes

        templateEngine = new TemplateEngine();
        templateEngine.setTemplateResolver(templateResolver);
    }


    public static TemplateEngine getTemplateEngine() {
        return templateEngine;
    }

    public static void setTemplateEngine(TemplateEngine templateEngine) {
        TrainingApplication.templateEngine = templateEngine;
    }
}
