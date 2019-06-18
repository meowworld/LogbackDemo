package com.example.demo.user;

import lombok.Data;

import java.io.Serializable;

@Data
public class User implements Serializable {
 
	private static final long serialVersionUID = 1L;
	
	/** 自增主键  */
	private Integer id;
	
	/** 员工工号  */
	private String userId;
	
	/** 员工姓名 */
	private String userName;
 

}