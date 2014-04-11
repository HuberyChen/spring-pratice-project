package com.springinaction.springidol;

import com.springinaction.springidol.performer.OneManBand;
import com.springinaction.springidol.poem.PoeticJuggler;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * @author hubery.chen
 */
public class Main {

    public static void main(String[] args) {
        ApplicationContext context = new ClassPathXmlApplicationContext("spring-idol.xml");
        OneManBand hank = (OneManBand) context.getBean("hank");
        hank.perform();

        PoeticJuggler poeticDuke = (PoeticJuggler) context.getBean("poeticDuke");
        poeticDuke.perform();
    }
}
