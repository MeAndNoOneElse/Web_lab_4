package dto;

import lombok.*;


import java.util.UUID;

@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@Builder
public class LoginResponse {
    private String token;
    private String username;
    private String message;
    private boolean requiresCaptcha;
    private int failedAttempts;
}
