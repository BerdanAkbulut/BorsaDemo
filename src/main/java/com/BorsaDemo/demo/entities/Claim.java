package com.BorsaDemo.demo.entities;

import javax.persistence.*;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.List;

@Data
@Entity
@AllArgsConstructor
@NoArgsConstructor
@Table(name = "claims")
public class Claim {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name = "claim_id")
	private int claimId;
	
	@Column(name = "claim_name")
	private String claimName;

	@OneToMany(mappedBy = "claim")
	private List<User> users;

	
	
	
	
}
