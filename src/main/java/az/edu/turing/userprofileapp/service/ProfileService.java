package az.edu.turing.userprofileapp.service;

import az.edu.turing.userprofileapp.model.dto.ProfileDto;
import org.springframework.context.annotation.Profile;

import java.util.List;

public interface ProfileService {
    public List<ProfileDto> getAllProfiles();

    void save(ProfileDto profileDto);

    void deleteAll();

    ProfileDto getProfileById(long profileId);

    void deleteProfileById(long profileId);

}
