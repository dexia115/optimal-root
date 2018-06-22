package com.optimal.kdm.common.data.entity;

import java.io.Serializable;
import javax.persistence.Column;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.MappedSuperclass;
import lombok.Data;

@Data
@MappedSuperclass
public abstract class BaseEntity implements Serializable{

	/**
	 * 
	 */
	private static final long serialVersionUID = 6785315177111491171L;


	@Id
	@GeneratedValue
	@Column(name = "id")
	protected Long id;
	
	
	/**
	 * 可用性
	 * 默认为true
	 */
	@Column(name = "enable")
	protected Boolean enable = true;

}
