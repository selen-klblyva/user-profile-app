package az.edu.turing.userprofileapp.repository;

import az.edu.turing.userprofileapp.model.entity.UserEntity;
import org.springframework.data.jpa.repository.JpaRepository;

public interface UserRepository extends JpaRepository<UserEntity, Long>{

}
