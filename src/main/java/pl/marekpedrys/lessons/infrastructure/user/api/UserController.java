package pl.marekpedrys.lessons.infrastructure.user.api;

import lombok.RequiredArgsConstructor;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.*;
import pl.marekpedrys.lessons.domain.user.User;
import pl.marekpedrys.lessons.domain.user.UserFacade;

import javax.validation.Valid;

@RestController
@RequestMapping("/users")
@RequiredArgsConstructor
public class UserController {

    private final UserFacade userFacade;

    @PostMapping
    @ResponseStatus(HttpStatus.CREATED)
    public UserSaveResponse saveUser (@Valid @RequestBody UserSaveRequest userSaveRequest) {
        User user = userSaveRequest.mapToDomain();
        user = userFacade.saveUser(user);
        return UserSaveResponse.mapToUserSaveResponse(user);
    }
}
