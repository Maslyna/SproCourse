package ua.nure.spro.course.util.mapper;

import org.springframework.security.core.userdetails.User;
import org.springframework.security.core.userdetails.UserDetails;
import ua.nure.spro.course.model.entity.UserEntity;

public interface UserEntityMapper {
    default UserDetails toUserDetails(UserEntity entity) {
        return User.withUsername(entity.getLogin())
                .password(entity.getPassword())
                .authorities(entity.getAuthorities())
                .build();
    }
}
