package springBase;

import org.springframework.stereotype.Component;

@Component("dog")
public class Dog implements Pet {
    @Override
    public String say() {
        return "woof-woof";
    }
    public void init(){
        System.out.println("Class Dog init!");
    }
    public void destroy(){
        System.out.println("Class Dog destroy!");
    }
}