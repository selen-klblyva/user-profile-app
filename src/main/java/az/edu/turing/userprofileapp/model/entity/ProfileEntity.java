package az.edu.turing.userprofileapp.model.entity;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@Builder
@Data
@AllArgsConstructor
@NoArgsConstructor
@Entity
@Table(name="profile")
public class ProfileEntity {
    @Id
    @GeneratedValue(strategy= GenerationType.IDENTITY )
    private Long profileId;
    private String email;
    private String phoneNumber;
    private String address;
}
