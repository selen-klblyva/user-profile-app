package az.edu.turing.userprofileapp.model.entity;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@Builder
@Data
@AllArgsConstructor
@NoArgsConstructor
@Entity
public class ProfileEntity {
    @Id
    @GeneratedValue(strategy= GenerationType.IDENTITY )
    private Long profileId;
    private String email;
    private String phoneNumber;
    private String address;
}
