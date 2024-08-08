package az.edu.turing.userprofileapp.repository;

import az.edu.turing.userprofileapp.model.entity.ProfileEntity;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ProfileRepository extends JpaRepository<ProfileEntity, Long> {

}
