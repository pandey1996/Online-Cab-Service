package com.tola.user.api.response;

import com.sun.istack.NotNull;
import lombok.*;

@Getter
@Setter
@ToString
@AllArgsConstructor
public class AuthenticationResponse extends BaseResponse{
    @NotNull
    private String userId;
    @NotNull
    private String sessionKey;
    @Builder
    public AuthenticationResponse(String status, String userId, String sessionKey){
        super(status, null, null);
        this.userId=userId;
        this.sessionKey=sessionKey;
    }
}
