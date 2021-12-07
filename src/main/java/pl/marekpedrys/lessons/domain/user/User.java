package pl.marekpedrys.lessons.domain.user;

import lombok.Builder;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
@Builder
public class User {
    private Long userId;
    private String username;
    private String email;
    private String role;
    private String password;
}
