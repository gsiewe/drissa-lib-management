package com.online.library.user.application.port.in;

import com.online.library.user.domain.model.User;
import com.online.library.user.domain.model.UserStatus;

public interface UpdateUserUseCase {
    User updateUser(String userId, String email, String firstName, String lastName, UserStatus userStatus);
}
