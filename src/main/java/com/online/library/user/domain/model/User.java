package com.online.library.user.domain.model;

import jakarta.persistence.Entity;

import java.time.Instant;
import java.util.UUID;

public class User {
    private final UUID id;
    private final String email;
    private final String firstName;
    private final String lastName;
    private final UserStatus status;
    private final Instant createdAt;

    public User(UUID id, String email, String firstName, String lastName, UserStatus status, Instant createdAt) {
        this.id = id;
        this.email = email;
        this.firstName = firstName;
        this.lastName = lastName;
        this.status = status;
        this.createdAt = createdAt;
    }

}
