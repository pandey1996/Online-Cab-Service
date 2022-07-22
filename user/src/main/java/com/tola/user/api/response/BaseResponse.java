package com.tola.user.api.response;

import lombok.*;

@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@ToString
public class BaseResponse {
    private String errorId;
    private String errorCode;
    private String errorDescription;
}
