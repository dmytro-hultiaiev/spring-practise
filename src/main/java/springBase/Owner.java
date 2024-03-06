package springBase;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

@Component("owner")
public class Owner {
    @Autowired
    @Qualifier("dog")
    private Pet pet;
    @Value("${person.name}")
    private String name;

    public Pet getPet() {
        return pet;
    }

    public String getName() {
        return name;
    }
}
