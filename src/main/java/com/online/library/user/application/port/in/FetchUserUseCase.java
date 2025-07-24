package com.online.library.user.application.port.in;

import com.online.library.user.domain.model.User;

public interface FetchUserUseCase {
    User fetchUser(String userId);
}
