package aop;

import org.springframework.stereotype.Component;

@Component("library")
public class Library {
    public void getBook(){
        System.out.println("We get book!");
    }
}
