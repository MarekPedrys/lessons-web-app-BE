package pl.marekpedrys.lessons.infrastructure.user.api;

import lombok.Builder;
import lombok.Value;
import pl.marekpedrys.lessons.domain.user.User;

@Value
@Builder
public class UserSaveResponse {

    Long userId;
    String username;

    public static UserSaveResponse mapToUserSaveResponse(User user){
        return UserSaveResponse
                .builder()
                .userId(user.getUserId())
                .username(user.getUsername())
                .build();
    }
}
