package com.online.library.user.application.port.in;

import com.online.library.user.domain.model.User;

public interface RegisterUserUseCase {
    User register(String email, String firstName, String lastName);
}
