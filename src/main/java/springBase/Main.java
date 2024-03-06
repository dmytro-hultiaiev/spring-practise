package springBase;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Main {
    public static void main(String[] args) {
        AnnotationConfigApplicationContext context = new AnnotationConfigApplicationContext(MyConfiguration.class);

        Owner owner = context.getBean("owner", Owner.class);
        System.out.println(owner.getName() + " " + owner.getPet().say());

        context.close();
    }
}
