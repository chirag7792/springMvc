package co.pragra.learning.mvc.mvcdemo;

import co.pragra.learning.mvc.mvcdemo.entity.User;
import co.pragra.learning.mvc.mvcdemo.service.UserService;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;

@SpringBootApplication
public class SpringBootMvcApplication {

    public static void main(String[] args) {

        ApplicationContext context = SpringApplication.run(SpringBootMvcApplication.class, args);
        System.out.println("ABC");
//        UserService service = new UserService();
//        service.createUser( new User("chig", "wigy", "234567378", "asdf@gmail.com"));
        UserService bean = context.getBean(UserService.class);
        System.out.println(bean.createUser(new
                User(1L, "cdfg", "ghjk",
                "1234567890", "qwer@gmail.com")));
    }

}
