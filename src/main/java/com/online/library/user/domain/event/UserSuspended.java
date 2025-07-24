package com.online.library.user.domain.event;

import java.time.Instant;
import java.util.UUID;

public class UserSuspended extends UserDomainEvent {
    private final String reason;
    private final String suspendedBy;
    private final Instant suspendedAt;

    public UserSuspended(UUID userId,
                         UUID eventId,
                         Instant occurredAt,
                         String reason,
                         String suspendedBy,
                         Instant suspendedAt) {
        super(userId, eventId, occurredAt);
        this.reason = reason;
        this.suspendedBy = suspendedBy;
        this.suspendedAt = suspendedAt;
    }
}
