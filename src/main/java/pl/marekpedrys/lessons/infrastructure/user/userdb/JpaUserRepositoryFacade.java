package pl.marekpedrys.lessons.infrastructure.user.userdb;

import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;
import pl.marekpedrys.lessons.domain.user.User;
import pl.marekpedrys.lessons.domain.user.ports.UserRepository;

@Service
@RequiredArgsConstructor
public class JpaUserRepositoryFacade implements UserRepository {

    private final JpaUserRepository jpaUserRepository;

    @Override
    public User saveUser(User user) {
        UserEntity userEntity = UserEntity.mapToEntity(user);
        userEntity = jpaUserRepository.save(userEntity);
        return userEntity.mapToDomain();
    }
}
