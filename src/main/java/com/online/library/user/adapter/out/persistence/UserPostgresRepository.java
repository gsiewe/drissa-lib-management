package com.online.library.user.adapter.out.persistence;

import com.online.library.user.application.port.out.UserRepository;
import com.online.library.user.domain.model.User;
import org.springframework.stereotype.Component;

import java.util.Optional;
import java.util.UUID;

@Component
public class UserPostgresRepository implements UserRepository {

    private final UserJpaRepository userJpaRepository;

    public UserPostgresRepository(UserJpaRepository userJpaRepository) {
        this.userJpaRepository = userJpaRepository;
    }

    @Override
    public User save(User user) {
        return userJpaRepository.save(user);
    }

    @Override
    public Optional<User> findById(UUID userId) {
        return userJpaRepository.findById(userId);
    }
}
