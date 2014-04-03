package spring.knights;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * @author hubery.chen
 */
public class KnightMain {

    public static void main(String[] args) {

        ApplicationContext context = new ClassPathXmlApplicationContext("beans.xml");
        Knight knight = (Knight) context.getBean("knight");
        knight.embarkOnQuest();
    }

}
