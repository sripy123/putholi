package com.revamp.core.model;

import javax.persistence.*;

import lombok.ToString;
import org.hibernate.annotations.Proxy;
import org.springframework.data.jpa.domain.support.AuditingEntityListener;

import lombok.Data;
import lombok.EqualsAndHashCode;

@Entity
@Table(name = "schoolinfo")
@Proxy(lazy = false)
@EntityListeners(AuditingEntityListener.class)
@Data
@ToString
public class SchoolInfo extends AuditableEntity{

	private static final long serialVersionUID = 6787703655405276366L;

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name = "school_info_id", nullable = false)
	private long schoolInfoId;

	@Column(name = "school_reg_number")
	private String schoolRegNo;

	@Column(name = "school_name")
	private String schoolName;

	@Column(name = "school_type")
	private String schoolType;

	@Column(name = "number_of_students")
	private int numberOfStudents;

	@Column(name = "number_of_teachers")
	private int numberOfTeachers;

}
