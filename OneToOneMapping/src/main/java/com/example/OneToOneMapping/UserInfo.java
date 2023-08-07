package com.example.OneToOneMapping;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Entity
@Data
@AllArgsConstructor
@NoArgsConstructor
public class UserInfo {
    @Id
    @GeneratedValue(strategy=GenerationType.AUTO)
    private Long userInfoId;
    private Long mobile;
    @Enumerated(EnumType.STRING)
    private Gender gender;
    private String nationality;
}
