package com.online.library.user.domain.event;

import com.online.library.user.domain.model.UserStatus;

import java.time.Instant;
import java.util.UUID;

public class UserUpdated extends UserDomainEvent {
    private final String email;
    private final String firstName;
    private final String lastName;
    private final UserStatus status;
    private final Instant createdAt;
    private final Instant updatedAt;

    public UserUpdated(UUID userId,
                       UUID eventId,
                       Instant occurredAt,
                       String email,
                       String firstName,
                       String lastName,
                       UserStatus status,
                       Instant createdAt,
                       Instant updatedAt) {
        super(userId, eventId, occurredAt);
        this.email = email;
        this.firstName = firstName;
        this.lastName = lastName;
        this.status = status;
        this.createdAt = createdAt;
        this.updatedAt = updatedAt;
    }
}
