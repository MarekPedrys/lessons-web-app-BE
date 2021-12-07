package pl.marekpedrys.lessons.domain.user.ports;

import pl.marekpedrys.lessons.domain.user.User;

public interface UserRepository {
    User saveUser(User user);
}
