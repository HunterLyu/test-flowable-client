package com.prudential.epos.demo.entity;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import lombok.*;
import lombok.extern.slf4j.Slf4j;

/**
 * @author Oliver Gierke
 */
@Entity
@Slf4j
@Data
@Builder
public class Employee {
	@Id
	private String id;
	private String name;
 	private int remainingHolidays;
}