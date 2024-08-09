package az.edu.turing.userprofileapp.feign;


import az.edu.turing.userprofileapp.model.dto.ProfileDto;
import az.edu.turing.userprofileapp.model.dto.UserDto;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@FeignClient(name = "userService", url = "http://localhost:8082")
public interface ProfileFeignClient {

    @GetMapping("/all")
    List<ProfileDto> getProfiles();

    @GetMapping("/profiles/{id}")
    ProfileDto getProfileById(@PathVariable("id") Long profileId);

    @PostMapping("/profiles")
    UserDto createProfile(@RequestBody ProfileDto profileDto);

    @DeleteMapping("/all")
    void deleteAllProfiles();

    @DeleteMapping("/profiles/{id}")
    void deleteProfileById(@PathVariable("id") Long profileId);

}
