package com.example.OneToOneMapping;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Entity
@Data
@AllArgsConstructor
@NoArgsConstructor
@Table(name="USER_TABLE")
public class User {
    @Id
    @GeneratedValue(strategy= GenerationType.AUTO)
    private Long userId;
    private String userName;
    private String email;
    @OneToOne(cascade=CascadeType.ALL,fetch=FetchType.EAGER,orphanRemoval =true)
    @JoinColumn(name="user_userInfo")
    private UserInfo userInfo;

}

