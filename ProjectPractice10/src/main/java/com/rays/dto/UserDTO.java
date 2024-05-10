package com.rays.dto;

import java.util.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Table;

import com.rays.common.BaseDTO;

@Entity
@Table(name = "ST_USER")
public class UserDTO extends BaseDTO {
	@Column(name = "FIRST_NAME", length = 50)
	private String firstName;
	@Column(name = "LAST_NAME", length = 50)
	private String lastName;
	@Column(name = "LOGIN_ID", length = 50)
	private String loginId;
	@Column(name = "password", length = 50)
	private String password;
	private Date dob;

}
