package com.duy.thesisManagement.thesis.service;

import com.duy.thesisManagement.thesis.dto.*;
import com.duy.thesisManagement.thesis.model.AppRole;
import com.duy.thesisManagement.thesis.model.User;

import java.util.List;

public interface UserService {

		List<UserDTO> getAllUsers();

		UserDTO getUserById(Integer id);

		User getUserByID(Integer id);

		UserDTO createUser(UserCreationDTO userCreationDTO);

		UserDTO updateUser(Integer id, UserUpdatingDTO userUpdatingDTO);

		void deleteUser(Integer id);

//		void changePassword(Integer id, PasswordChangingDTO passwordChangingDTO);
		void changePassword(Integer id, String newPassword);

		void putAvatar(Integer id, PutAvatarDTO putAvatarDTO);




//		List<UserDTO> getAllAssociate();
		List<UserDTO> getUsersByRoleName(AppRole roleName);
}
