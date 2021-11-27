package com.notenow.models;

import java.sql.Timestamp;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Entity
@Table(name= "liste")
@Data
@NoArgsConstructor
@AllArgsConstructor
public class Liste {
	
	@Id
	@GeneratedValue(strategy= GenerationType.AUTO)
	private Long id;	

	@Column(name="create_time")
	private Timestamp createTime;
	
	@Column(name="titre")
	private String titre;
	
	@Column(name="liste")
	private String liste;
	
}
