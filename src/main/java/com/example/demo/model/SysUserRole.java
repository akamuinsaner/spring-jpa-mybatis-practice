package com.example.demo.model;

import jakarta.persistence.*;
import lombok.Data;

@Table(name = "sys_user_role")
@Entity
@Data
public class SysUserRole {

    public SysUserRole() {

    }

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column(name = "user_id")
    private Long user_id;

    @Column(name = "role_id")
    private Long role_id;
}
