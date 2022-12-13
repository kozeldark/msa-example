package ch.example.microservices.core.user.service;

import ch.example.microservices.core.user.domain.User;

public interface AuthService {

    User getUserInfo(long userId);
}
