package com.tola.user.JPARepository;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import javax.persistence.Entity;
import javax.persistence.Id;

@Entity
@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
public class User {
    @Id
    private String userId;
    private String internalUserId;
    private String firstName;
    private String middleName;
    private String lastName;
    private String mobile;
    private String address1;
    private String address2;
    private String email;
    private String password;
    private String dob;
}
