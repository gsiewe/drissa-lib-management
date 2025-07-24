package com.online.library.user.domain.event;

import java.time.Instant;
import java.util.UUID;

// product/consumer pattern
// message driven
// une des clé c'est que le producteur des events ne doit pas connaitre les consammteurs

public abstract class UserDomainEvent {
    private final UUID eventId;
    private final UUID userId;
    private final Instant occurredAt;

    protected UserDomainEvent(UUID eventId, UUID userId, Instant occurredAt) {
        this.eventId = eventId;
        this.userId = userId;
        this.occurredAt = occurredAt;
    }
}
