package az.edu.turing.userprofileapp.service;


import az.edu.turing.userprofileapp.feign.ProfileFeignClient;
import az.edu.turing.userprofileapp.model.dto.ProfileDto;
import az.edu.turing.userprofileapp.repository.ProfileRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
@RequiredArgsConstructor
public class ProfileServiceImpl implements ProfileService {

    private static ProfileFeignClient profileFeignClient;

    @Override
    public List<ProfileDto> getAllProfiles() {
        return List.of();
    }

    @Override
    public void save(ProfileDto profileDto) {

    }

    @Override
    public void deleteAll() {

    }

    @Override
    public ProfileDto getProfileById(long profileId) {
        return null;
    }

    @Override
    public void deleteProfileById(long profileId) {

    }
}
