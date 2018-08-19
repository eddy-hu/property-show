package com.jessienwei.web.dto;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "role")
public class RoleDTO {

	enum AdminType {
		ADMIN("admin", 1L), REGISTED("registed", 2L), UNREGISTED("unregisted", 3L);

		private Long value;

		public Long getValue() {
			return value;
		}

		public void setValue(Long value) {
			this.value = value;
		}

		public String getName() {
			return name;
		}

		public void setName(String name) {
			this.name = name;
		}

		private String name;

		AdminType(String name, Long index) {
			this.value = index;
			this.name = name;
		}

		static String getName(Long index) {
			for (AdminType a : AdminType.values()) {
				if (a.getValue() == index) {
					return a.getName();
				}
			}
			return null;
		}
	}

	private Long id;
	private String type = AdminType.getName(id);

	@Id
	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}


	public String getType() {
		return type;
	}

	public void setType(String type) {

		this.type = type;
	}
}
