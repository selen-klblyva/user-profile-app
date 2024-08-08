package az.edu.turing.userprofileapp.service;

import az.edu.turing.userprofileapp.exception.UserNotFoundException;
import az.edu.turing.userprofileapp.model.dto.UserDto;
import az.edu.turing.userprofileapp.model.entity.UserEntity;

import java.util.List;

public interface UserService {
    public List<UserDto> getAllUsers();

    void save(UserDto userDto);

    UserDto getUserById(long userId);

    void deleteAll();

    void deleteById(long userId);

    UserEntity update(Long userId, UserEntity userEntity) throws UserNotFoundException;

    UserEntity updateAge(Long userId, UserEntity userEntity) throws UserNotFoundException;

    public int getCountOfAllUsers();

}
