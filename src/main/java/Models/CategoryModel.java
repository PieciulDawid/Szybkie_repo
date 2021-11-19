package Models;

import lombok.Getter;
import lombok.Setter;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Table(name = "KATEGORIA")
@Entity
@Getter
@Setter
public class CategoryModel {
	@Id
	@Column(name = "ID_KATEGORA", nullable = false)
	private Long id;
	
	@Column(name = "NAZWA", nullable = false, length = 50)
	private String name;
	
}