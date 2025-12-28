package com.dao;

import org.springframework.jdbc.core.JdbcTemplate;

public class StudentDao {
	
	private JdbcTemplate j;

	public void setJ(JdbcTemplate j) {
		this.j = j;
	}
	
}
