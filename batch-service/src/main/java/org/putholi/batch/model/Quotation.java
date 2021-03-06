package org.putholi.batch.model;

import lombok.Data;
import org.springframework.data.jpa.domain.support.AuditingEntityListener;

import javax.persistence.*;
import java.io.Serializable;

/**
 * The persistent class for the quotation database table.
 * 
 */
@Entity
@EntityListeners(AuditingEntityListener.class)
@Table(name = "quotation")
@Data
public class Quotation implements Serializable {
	private static final long serialVersionUID = 1L;

	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	@Column(name = "quotation_id")
	private long quotationId;
	
	    
	@Column(name = "school_id")
	private long schoolId;

	@Column(name = "requirement_id")
	private long requirementId;
	
	@Column(name = "quotation_validity_date")
	private String quotationValidityDate;
	
	@Column(name="quotation_status")
	private String quotationStatus;
	
}