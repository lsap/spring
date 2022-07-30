package org.met.assistant.api;

import lombok.RequiredArgsConstructor;
import org.met.assistant.model.UserResponse;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RequiredArgsConstructor
@RestController
public class MetController {

    @GetMapping("/tme")
    public UserResponse getUser() {
        return new UserResponse();
    }
}
