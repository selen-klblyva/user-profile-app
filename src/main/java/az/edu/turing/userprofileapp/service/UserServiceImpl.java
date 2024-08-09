package az.edu.turing.userprofileapp.service;

import az.edu.turing.userprofileapp.exception.UserNotFoundException;
import az.edu.turing.userprofileapp.feign.UserFeignClient;
import az.edu.turing.userprofileapp.model.dto.UserDto;
import az.edu.turing.userprofileapp.model.entity.UserEntity;
import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Service;

import java.time.LocalDateTime;
import java.util.List;
import java.util.Optional;
import java.util.stream.Collectors;

import static org.springframework.data.jpa.domain.AbstractPersistable_.id;

@Service
@RequiredArgsConstructor
@Slf4j
public class UserServiceImpl implements UserService {

    private static  UserFeignClient userFeignClient;

    @Override
    public void save(UserDto userDto) {
        UserEntity userEntity=UserEntity.builder()
                .username(userDto.getUsername())
                .age(userDto.getAge())
                .createdAt(LocalDateTime.now())
                .updatedAt(LocalDateTime.now())
                .build();
                userFeignClient.createUser(userEntity);
        log.info("User saved: {}", userEntity);

    }

    @Override
    public List<UserDto> getAllUsers() {
        return userFeignClient.getUsers().stream()
                .map(entity -> new UserDto(entity.getUserId(),entity.getUsername(),
                        entity.getAge(),entity.getCreatedAt(),entity.getUpdatedAt()))
                .collect(Collectors.toList());
    }

    @Override
    public UserDto getUserById(long userId) {
            UserEntity userEntity=userFeignClient.getById(userId);
            if(userEntity==null){
                log.error("User not found");
            }

            return new UserDto(userEntity.getUserId(),userEntity.getUsername(),
                    userEntity.getAge(),userEntity.getCreatedAt(),userEntity.getUpdatedAt());
    }

    @Override
    public void deleteAll() {
        userFeignClient.deleteUsers();
    }

    @Override
    public void deleteById(long userId) {
         userFeignClient.deleteUserById(userId);
    }


    @Override
    public UserEntity update(Long userId, UserEntity userEntity) throws UserNotFoundException {
        UserEntity existingUser = userFeignClient.getById(userId);
        existingUser.setUsername(userEntity.getUsername());
        existingUser.setAge(userEntity.getAge());
        existingUser.setCreatedAt(LocalDateTime.now());
        existingUser.setUpdatedAt(LocalDateTime.now());
        userFeignClient.updateUser(existingUser);
        log.info("User updated with id: {}", userId);
        return existingUser;
    }


    @Override
    public UserEntity updateAge(Long userId, UserEntity userEntity) throws UserNotFoundException {
        UserEntity existingUser = userFeignClient.getById(userId);
        existingUser.setAge(userEntity.getAge());
        userFeignClient.updateUserAge(existingUser);
        log.info("User age updated with id: {}", id);
        return existingUser;
    }

    @Override
    public int getCountOfAllUsers() {
        return userFeignClient.getCountOfUsers(id);
    }
}
