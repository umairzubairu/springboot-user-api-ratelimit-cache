package com.uzu.user.api.user;

import com.uzu.user.api.user.dto.UserProfile;
import com.uzu.user.api.user.service.UserProfileService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.http.ResponseEntity;

@RestController
@RequestMapping("/api/v1/user/profiles")
public class UserProfileController {

    @Autowired
    private UserProfileService userProfileService;

    /**
     * Retrieves the user profile for the given user ID.
     * @param userId The ID of the user.
     * @return ResponseEntity with user profile details or error message.
     */
    @GetMapping("/{userId}")
    public ResponseEntity<?> getUserProfile(@PathVariable String userId) {
        try {
            UserProfile userProfile = userProfileService.getUserProfile(userId);
            return ResponseEntity.ok(userProfile);
        } catch (Exception e) {
            return ResponseEntity.status(500).body("An error occurred while fetching user profile: " + e.getMessage());
        }
    }
}
