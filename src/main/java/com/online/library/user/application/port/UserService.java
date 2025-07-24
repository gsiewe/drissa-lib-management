package com.online.library.user.application.port;

import com.online.library.user.application.port.in.RegisterUserUseCase;
import com.online.library.user.application.port.in.FetchUserUseCase;
import com.online.library.user.application.port.in.SuspendUserUseCase;
import com.online.library.user.application.port.in.UpdateUserUseCase;
import com.online.library.user.application.port.out.UserEventPublisher;
import com.online.library.user.application.port.out.UserRepository;
import com.online.library.user.domain.model.User;
import com.online.library.user.domain.model.UserStatus;

import java.time.Instant;
import java.util.UUID;

public class UserService implements RegisterUserUseCase, SuspendUserUseCase, FetchUserUseCase, UpdateUserUseCase {

    private final UserRepository userRepository;
    private final UserEventPublisher userEventPublisher;

    public UserService(UserRepository userRepository, UserEventPublisher userEventPublisher) {
        this.userRepository = userRepository;
        this.userEventPublisher = userEventPublisher;
    }

    @Override
    public User register(String email, String firstName, String lastName) {
        UUID userId = UUID.randomUUID();
        User user = new User(userId, email, firstName, lastName, UserStatus.ACTIVE, Instant.now());
        return userRepository.save(user);
    }

    @Override
    public User fetchUser(String userId) {
        return null;
    }

    @Override
    public User suspendUser(String userId) {
        return null;
    }

    @Override
    public User updateUser(String userId, String email, String firstName, String lastName, UserStatus userStatus) {
        return null;
    }
}
