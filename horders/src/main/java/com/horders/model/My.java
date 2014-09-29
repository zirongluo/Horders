package com.horders.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "my")
public class My {
	@Id
	@Column(name = "ID", nullable = false)
	private String id;

	@Column(name = "NAME", nullable = false)
	private String name;
	public My() {
	}

	public String getId() {
		return id;
	}

	public void setId(String id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

}
