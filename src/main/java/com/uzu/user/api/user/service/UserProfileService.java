package com.uzu.user.api.user.service;

import com.uzu.user.api.user.dto.UserProfile;
import org.springframework.stereotype.Service;
import org.springframework.cache.annotation.Cacheable;

@Service
public class UserProfileService {

    @Cacheable(cacheNames="userProfiles", sync=true)
    public UserProfile getUserProfile(String userId) {
        // Simulate a time-consuming operation (e.g., database call)
        // simulateSlowService();
        return new UserProfile(userId, "John Doe");
    }

    private void simulateSlowService() {
        try {
            Thread.sleep(3000); // Simulate delay
        } catch (InterruptedException e) {
            Thread.currentThread().interrupt();
        }
    }
}
