package com.devansh.authify.Authentication1.service;

import com.devansh.authify.Authentication1.io.ProfileRequest;
import com.devansh.authify.Authentication1.io.ProfileResponse;

public interface ProfileService {
    ProfileResponse createProfile(ProfileRequest request);

}
