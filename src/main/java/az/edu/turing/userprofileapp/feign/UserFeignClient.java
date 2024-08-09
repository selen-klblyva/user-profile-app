package az.edu.turing.userprofileapp.feign;


import az.edu.turing.userprofileapp.model.dto.UserDto;
import az.edu.turing.userprofileapp.model.entity.UserEntity;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.*;

import java.util.List;

import static org.springframework.data.jpa.domain.AbstractPersistable_.id;

@FeignClient(name = "userService", url = "http://localhost:8082")
public interface UserFeignClient {


    @GetMapping("/all")
    List<UserDto> getUsers();

    @GetMapping("/users/{id}")
    UserDto getUserById(@PathVariable("id") Long userId);

    @GetMapping
    int getCountOfUsers();

    @PutMapping("/users/{id}")
    UserEntity updateUser(@PathVariable("id") Long userId, @RequestBody UserEntity userEntity);

    @PostMapping("/users")
    UserDto createUser(@RequestBody UserDto userDto);

    @PatchMapping("/users/{age}")
    UserEntity updateUserAge(@PathVariable("id") Long userId, @RequestBody UserEntity userEntity);

    @DeleteMapping("/users/{id}")
    void deleteUserById(@PathVariable("id") Long userIdd);

    @DeleteMapping("/all")
    void deleteUsers();


}
