package hello.core.singleton;

import org.assertj.core.api.Assertions;
import org.junit.jupiter.api.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.annotation.Bean;


class StatefulServiceTest {

    @Test
    void statefulServiceSingleton(){
        ApplicationContext ac = new AnnotationConfigApplicationContext(TestConfig.class);
        StatefulService st1 = ac.getBean(StatefulService.class);
        StatefulService st2 = ac.getBean(StatefulService.class);

        int user1 = st1.order("user1", 10000);
        int user2 = st2.order("user2", 20000);

//        int price = st1.getPrice();
        System.out.println("user1 = " + user1);
        System.out.println("user2 = " + user2);

//        Assertions.assertThat(st1.getPrice()).isEqualTo(20000);
    }

    static class TestConfig{

        @Bean
        public StatefulService statefulService(){
            return new StatefulService();
        }
    }



}