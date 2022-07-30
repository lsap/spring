package org.met.assistant.api;

import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RequiredArgsConstructor
@RestController
public class MetController {

    @GetMapping("/customerportal")
    public String getUser() {
        return "{\"success\":1}";
    }
}
