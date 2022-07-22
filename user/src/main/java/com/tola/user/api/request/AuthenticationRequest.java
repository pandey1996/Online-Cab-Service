package com.tola.user.api.request;

import com.sun.istack.NotNull;
import lombok.*;

@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
@ToString
public class AuthenticationRequest {
    @NotNull
    private String email;
    @NotNull
    private String password;
    private String sessionKey;
}
