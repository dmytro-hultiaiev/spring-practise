package aop;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class Main {
    public static void main(String[] args) {
        try(AnnotationConfigApplicationContext context = new AnnotationConfigApplicationContext(ConfigScan.class)) {
            Library library = context.getBean("library", Library.class);
            library.getBook();
        }
    }
}
