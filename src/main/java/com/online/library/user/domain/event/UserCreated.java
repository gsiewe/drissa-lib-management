package com.online.library.user.domain.event;

import com.online.library.user.domain.model.UserStatus;

import java.time.Instant;
import java.util.UUID;

public class UserCreated extends UserDomainEvent {
    private final String email;
    private final String firstName;
    private final String lastName;
    private final UserStatus status;
    private final Instant createdAt;

    public UserCreated(UUID userId,
                       UUID eventId,
                       Instant occurredAt,
                       String email,
                       String firstName,
                       String lastName,
                       UserStatus status,
                       Instant createdAt) {
        super(eventId, userId, occurredAt);
        this.email = email;
        this.firstName = firstName;
        this.lastName = lastName;
        this.status = status;
        this.createdAt = createdAt;
    }
}
