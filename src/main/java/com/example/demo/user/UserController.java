package com.example.demo.user;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.*;

import java.util.List;


@RestController
@RequestMapping(path = "/user")
public class UserController {

    private final UserService userService;

    @Autowired
    public UserController(UserService userService) {

        this.userService = userService;
    }

    @GetMapping
    public List<User> getUsers() {

        return userService.getUsers();
    }

    @PostMapping
    public void registerNewUser(@RequestBody User user){

        userService.addNewUser(user);
    }

    @DeleteMapping(path="{userId}")
    public List<User>  deleteUser(@PathVariable("userId") Long userId) {
        userService.deleteUser(userId);
        return userService.getUsers();
    }

    @PutMapping(path="{userId}")
    public List<User> updateUser(@PathVariable("userId") Long userId,
                                 @RequestParam(required = false) String name,
                                 @RequestParam(required = false) String email) {
        userService.updateUser(userId, name, email);
        return userService.getUsers();
    }

}
