package africa.semicolon.marketPlace.dtos.requests;

import lombok.Data;

@Data
public class RegisterListerRequest {
    private String fullName;
    private String location;
    private String phoneNumber;
    private String email;

}
