package com.devansh.authify.Authentication1.controller;


import com.devansh.authify.Authentication1.io.ProfileRequest;
import com.devansh.authify.Authentication1.io.ProfileResponse;
import com.devansh.authify.Authentication1.service.ProfileService;
import jakarta.validation.Valid;
import lombok.RequiredArgsConstructor;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.*;

@RestController
@RequiredArgsConstructor
@RequestMapping("/api/v1.0")
public class ProfileController {
    private final ProfileService profileService;

    @PostMapping("/register")
    @ResponseStatus(HttpStatus.CREATED)
    public ProfileResponse register (@Valid @RequestBody ProfileRequest request){
        ProfileResponse response =profileService.createProfile(request);
        //todo email:send welcome email
        return response;

    }
}
