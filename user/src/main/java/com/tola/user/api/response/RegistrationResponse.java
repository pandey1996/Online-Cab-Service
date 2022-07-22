package com.tola.user.api.response;

import com.sun.istack.NotNull;
import lombok.*;

@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@ToString
public class RegistrationResponse extends BaseResponse{
    @NotNull
    private String userId;
    @NotNull
    private String internalUserId;
}
