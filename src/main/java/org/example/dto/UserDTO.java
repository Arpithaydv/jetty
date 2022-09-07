package org.example.dto;

import lombok.Data;
import org.example.entity.User;

@Data
public class UserDTO {
    private int userId;
    private String lastName;
    private String firstName;
    private String address;
    private String city;


    public User toUserEntity() {
        User user = new User();
        user.setUserId(this.userId);
        user.setLastName(this.lastName);
        user.setFirstName(this.firstName);
        user.setAddress(this.address);
        user.setCity(this.city);
        return user;
    }
}
