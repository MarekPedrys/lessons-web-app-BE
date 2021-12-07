package pl.marekpedrys.lessons.domain.user;

import lombok.AllArgsConstructor;
import org.springframework.stereotype.Component;
import pl.marekpedrys.lessons.domain.user.ports.UserRepository;

@Component
@AllArgsConstructor
public class UserFacade {
    private final UserRepository userRepository;

    public User saveUser(User user) {
        return userRepository.saveUser(user);
    }
}
