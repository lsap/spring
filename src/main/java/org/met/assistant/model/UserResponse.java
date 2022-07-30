package org.met.assistant.model;

import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.*;

@Builder
@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
public class UserResponse {
    private boolean verificationRequired = true;
    private String clientRedirectionUrl = "https://www.toyota.co.uk";
    private String marketing = "https://www.toyota.co.uk/#/my-toyota";
    private String profile = "https://www.toyota.co.uk/#/publish/my_toyota_userprofile";
    private String reponsiveIframe = "https://www.toyota.co.uk/scripts/responsiveiframe";
    private String ppm = "https://www.toyota.co.uk/scripts/postalPostMessage";
    @JsonProperty("isVOT2Enabled")
    private boolean isVOT2Enabled = true;
}
