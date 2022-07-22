package com.tola.user.api.request;
import com.sun.istack.NotNull;
import lombok.*;

@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@ToString
public class RegistrationRequest {
    @NotNull
    private String firstName;
    @NotNull
    private String middleName;
    @NotNull
    private String lastName;
    @NotNull
    private String mobile;
    @NotNull
    private String address1;
    @NotNull
    private String address2;
    @NotNull
    private String email;
    @NotNull
    private String password;
    @NotNull
    private String dob;
}
