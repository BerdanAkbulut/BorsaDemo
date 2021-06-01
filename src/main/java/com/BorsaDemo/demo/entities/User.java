package com.BorsaDemo.demo.entities;

import javax.persistence.*;
import javax.validation.constraints.Email;
import javax.validation.constraints.NotBlank;
import javax.validation.constraints.NotEmpty;


import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.List;

@Data
@Entity
@AllArgsConstructor
@NoArgsConstructor
@Table(name = "users")
public class User {
	
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	@Column(name = "user_id")
	private int userId;

	@NotBlank
	@NotEmpty
	@Column(name = "first_name")
	private String firstName;

	@NotBlank
	@NotEmpty
	@Column(name = "last_name")
	private String lastName;

	@Email
	@NotBlank
	@NotEmpty
	@Column(name = "email")
	private String email;

	@NotBlank
	@NotEmpty
	@Column(name = "password")
	private String password;


	@ManyToOne
	@JoinColumn(name = "claim_id")
	private Claim claim;


}
