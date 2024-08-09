package az.edu.turing.userprofileapp.service;

import az.edu.turing.userprofileapp.exception.UserNotFoundException;
import az.edu.turing.userprofileapp.feign.UserFeignClient;
import az.edu.turing.userprofileapp.model.dto.UserDto;
import az.edu.turing.userprofileapp.model.entity.UserEntity;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
@RequiredArgsConstructor
public class UserServiceImpl implements UserService {

    private static  UserFeignClient userFeignClient;

    @Override
    public void save(UserDto userDto) {

    }

    @Override
    public List<UserDto> getAllUsers() {
        return List.of();
    }

    @Override
    public UserDto getUserById(long userId) {
        return null;
    }

    @Override
    public void deleteAll() {

    }

    @Override
    public void deleteById(long userId) {

    }

    @Override
    public UserEntity update(Long userId, UserEntity userEntity) throws UserNotFoundException {
        return null;
    }

    @Override
    public UserEntity updateAge(Long userId, UserEntity userEntity) throws UserNotFoundException {
        return null;
    }

    @Override
    public int getCountOfAllUsers() {
        return 0;
    }
}
