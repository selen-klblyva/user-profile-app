package az.edu.turing.userprofileapp.feign;


import az.edu.turing.userprofileapp.model.dto.UserDto;
import az.edu.turing.userprofileapp.model.entity.UserEntity;
import jakarta.persistence.metamodel.SingularAttribute;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.data.jpa.domain.AbstractPersistable;
import org.springframework.web.bind.annotation.*;

import java.io.Serializable;
import java.util.List;

@FeignClient(name = "userService", url = "http://localhost:8082")
public interface UserFeignClient {


    @GetMapping("/all")
    List<UserDto> getUsers();

    @GetMapping("/users/{id}")
    UserEntity getById(@PathVariable("id") Long userId);

    @GetMapping
    int getCountOfUsers(SingularAttribute<AbstractPersistable, Serializable> id);

    @PutMapping("/users/{id}")
    UserEntity updateUser(@RequestBody UserEntity userEntity);

    @PostMapping("/users")
    UserDto createUser(@RequestBody UserEntity userDto);

    @PatchMapping("/users/{age}")
    UserEntity updateUserAge(@RequestBody UserEntity userEntity);

    @DeleteMapping("/users/{id}")
    void deleteUserById(@PathVariable("id") Long userIdd);

    @DeleteMapping("/all")
    void deleteUsers();


}
