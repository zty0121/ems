package com.zty.entity;

import com.fasterxml.jackson.annotation.JsonFormat;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.Id;
import javax.persistence.Table;
import javax.persistence.Transient;
import java.io.Serializable;
import java.util.Date;

@Data
@AllArgsConstructor
@NoArgsConstructor
@Table(name="Emp")
public class Emp implements Serializable{
	@Id
	private Integer id;
	private String name;
	private Double salary;
	private Integer age;
	@Transient
    @JsonFormat(pattern = "yyyy-MM-dd")
    private Date birthday;
}
