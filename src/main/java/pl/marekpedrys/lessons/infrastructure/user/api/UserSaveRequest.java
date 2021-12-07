package pl.marekpedrys.lessons.infrastructure.user.api;

import lombok.*;
import pl.marekpedrys.lessons.domain.user.User;

import javax.validation.constraints.Email;
import javax.validation.constraints.NotEmpty;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;


@Builder
@Getter
public class UserSaveRequest {

    @NotNull
    @Size(min = 4, max = 20)
    private String username;
    @NotNull
    @Email
    private String email;
    @NotNull
    @NotEmpty
    private String role;
    @NotNull
    @Size(min = 8, max = 40)
    private String password;

    public User mapToDomain() {
        return User
                .builder()
                .username(this.getUsername())
                .email(this.getEmail())
                .role(this.getRole())
                .password(this.getPassword())
                .build();
    }
}
