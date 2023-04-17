package vn.edu.tdtu.service;


import vn.edu.tdtu.entity.User;
import vn.edu.tdtu.model.dto.UserDTO;
import vn.edu.tdtu.model.request.ChangePasswordRequest;
import vn.edu.tdtu.model.request.CreateUserRequest;
import vn.edu.tdtu.model.request.UpdateProfileRequest;
import org.springframework.data.domain.Page;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public interface UserService {
    List<UserDTO> getListUsers();

    Page<User> adminListUserPages(String fullName, String phone, String email, Integer page);

    User createUser(CreateUserRequest createUserRequest);

    void changePassword(User user, ChangePasswordRequest changePasswordRequest);

    User updateProfile(User user, UpdateProfileRequest updateProfileRequest);
}
