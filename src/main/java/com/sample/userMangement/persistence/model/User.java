package com.sample.userMangement.persistence.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "USER")
public class User {
	
	 @Id
	    @GeneratedValue(strategy = GenerationType.AUTO)
	    private Long id;

	    private String firstName;

	    private String lastName;

	    private String email;

	    @Column(length = 60)
	    private String password;

	    private boolean enabled;

	    private boolean isUsing2FA;

	    private String secret;


}
