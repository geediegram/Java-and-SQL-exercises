package africa.semicolon.marketPlace.dtos.responses;

import lombok.Data;

import java.time.LocalDateTime;

@Data
public class RegisterListerResponse {
    private String dbId;
    private String dateRegistered;
}
