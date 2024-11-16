package dio.cloud.service;

import dio.cloud.domain.model.User;

public interface UserService {
    User findbyId(Long id);

    User create(User userToCreate);
}
