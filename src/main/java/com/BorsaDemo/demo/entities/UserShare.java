package com.BorsaDemo.demo.entities;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.*;
import javax.validation.constraints.NotBlank;
import javax.validation.constraints.NotEmpty;

@Data
@Entity
@AllArgsConstructor
@NoArgsConstructor
@Table(name = "user_shares")
public class UserShare {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    @Column(name = "user_share_id")
    private int id;

    @NotBlank
    @NotEmpty
    @Column(name = "user_id")
    private int userId;

    @NotBlank
    @NotEmpty
    @Column(name = "share_id")
    private int shareId;
}
