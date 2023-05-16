package com.UserAuth.Model;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
@Table(name = "userDetails", uniqueConstraints = @UniqueConstraint(columnNames = "email"))
@Entity
public class UserDetails {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private String fullName;
    private String email;
    private String address;
    private String qualification;
    private String password;

    // Constructors, getters, and setters
}
