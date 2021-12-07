package pl.marekpedrys.lessons.infrastructure.user.userdb;

import lombok.Builder;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import pl.marekpedrys.lessons.domain.user.User;

import javax.persistence.*;

@Entity
@Table(name = "users")
@Getter
@Setter
@NoArgsConstructor
public class UserEntity {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long userId;
    private String username;
    private String email;
    private String role;
    private String password;

    @Builder
    public UserEntity(String username, String email, String role, String password) {
        this.username = username;
        this.email = email;
        this.role = role;
        this.password = password;
    }

    public static UserEntity mapToEntity(User user) {
        return UserEntity
                .builder()
                .username(user.getUsername())
                .email(user.getEmail())
                .role(user.getRole())
                .password(user.getPassword())
                .build();
    }

    public User mapToDomain() {
        return User
                .builder()
                .userId(this.getUserId())
                .username(this.getUsername())
                .email(this.getEmail())
                .role(this.getRole())
                .password(this.getPassword())
                .build();
    }

}
