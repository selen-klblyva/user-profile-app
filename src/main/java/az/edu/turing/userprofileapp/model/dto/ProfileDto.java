package az.edu.turing.userprofileapp.model.dto;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class ProfileDto {
    private Long profileId;
    private String email;
    private String phoneNumber;
    private String address;
}
