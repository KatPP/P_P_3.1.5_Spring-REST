package ru.kata.spring.boot_security.demo;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;
import ru.kata.spring.boot_security.demo.model.Role;
import ru.kata.spring.boot_security.demo.model.User;
import ru.kata.spring.boot_security.demo.service.RoleService;
import ru.kata.spring.boot_security.demo.service.UserService;

@SpringBootApplication
public class SpringBootSecurityDemoApplication {

    public static void main(String[] args) {
        	SpringApplication.run(SpringBootSecurityDemoApplication.class, args);
        //   ApplicationContext context = SpringApplication.run(SpringBootSecurityDemoApplication.class, args);
      // try {
      //     UserService userService = context.getBean(UserService.class);
      //     RoleService roleService = context.getBean(RoleService.class);

      //     Role user = new Role("ROLE_USER", 1);
      //     Role admin = new Role("ROLE_ADMIN", 2);

      //     roleService.save(user);
      //     roleService.save(admin);

      //     User user1 = new User("User", "Ivan", 33, "user@mail.ru", "200");
      //     User user2 = new User("Admin", "Nikolay", 45, "admin@mail.ru", "200");


      //     user1.addRole(roleService.findByName("ROLE_ADMIN"));
      //     user2.addRole(roleService.findByName("ROLE_USER"));
      //     user2.addRole(roleService.findByName("ROLE_ADMIN"));

      //     userService.saveUser(user1);
      //     userService.saveUser(user2);

      // } catch (Exception ignored) {
      // }
    }
}
