package school.hei.news.heinews.controller;

import lombok.AllArgsConstructor;
import org.springframework.web.bind.annotation.*;
import school.hei.news.heinews.model.User;
import school.hei.news.heinews.service.UserService;

import java.util.List;
import java.util.Optional;

@RestController
@AllArgsConstructor
public class UserController {
    private UserService userService;

    @GetMapping("/users")
    public List<User> makaUsersRehetra(){
        return userService.getAllUsers();
    }

    @GetMapping("/user/{id}")
    public Optional<User> getById(@PathVariable Long id){
        return userService.getUserById(id);
    }

    @PostMapping("/user")
    public User insertUser(@RequestBody User user){
        return userService.saveUser(user);
    }

    @DeleteMapping("/user/{id}")
    public void deleteUser(@PathVariable Long id){
        userService.deleteUserById(id);
    }

    @PatchMapping("/user/{id}")
    public void modifyUser(
        @PathVariable Long id,
        @RequestParam(name = "firstName", required = false) String firstName,
        @RequestParam(name = "lastName", required = false) String lastName,
        @RequestParam(name = "username", required = false) String username
    ){
        // A completer et à décrire
    }
}
