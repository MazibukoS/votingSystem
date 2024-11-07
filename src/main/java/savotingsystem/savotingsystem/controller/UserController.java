package savotingsystem.savotingsystem.controller;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import savotingsystem.savotingsystem.model.User;
import savotingsystem.savotingsystem.service.UserService;

@RestController
@RequestMapping("/api/user")
public class UserController {

    UserService userService = new UserService();

    @GetMapping("/data")
    public ResponseEntity<String> getData() {
        return ResponseEntity.ok("Hello from the Java backend!");
    }

    @PostMapping("/register")
    public ResponseEntity<String> registerUser(@RequestBody User user) {
        System.out.println(user);
        try {
            userService.registerUser(user);
            return ResponseEntity.status(HttpStatus.CREATED).body("User created Succesfully");
        } catch (Exception e) {
            return ResponseEntity.status(HttpStatus.INTERNAL_SERVER_ERROR).body("Unable to create User");
        }

    }

    @GetMapping("/login")
    public ResponseEntity<User> getUser(@RequestBody String email, @RequestBody String password) {
        return ResponseEntity.ok(userService.getUser(email, password));
    }

}
