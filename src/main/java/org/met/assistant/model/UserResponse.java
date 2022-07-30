package org.met.assistant.model;

import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.*;

import java.util.Map;

@Builder
@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
public class UserResponse {
    private boolean verificationRequired = true;
    private String clientRedirectionUrl = "https://www.toyota.co.uk";
    private Map<String, String> urls = Map.ofEntries(Map.entry("marketing",
                    "https://www.toyota.co.uk/#/my-toyota"),
            Map.entry("profile",
                    "https://www.toyota.co.uk/#/publish/my_toyota_userprofile"));
    private Map<String, String> plugins = Map.ofEntries(Map.entry("ppm",
            "https://www.toyota.co.uk/scripts/postalPostMessage"),
            Map.entry("reponsiveIframe", "https://www.toyota.co.uk/scripts/responsiveiframe"));
    @JsonProperty("isVOT2Enabled")
    private boolean isVOT2Enabled = true;
}
