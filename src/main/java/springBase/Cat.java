package springBase;

import org.springframework.stereotype.Component;

@Component("cat")
public class Cat implements Pet {
    @Override
    public String say() {
        return "meow-meow";
    }
}
