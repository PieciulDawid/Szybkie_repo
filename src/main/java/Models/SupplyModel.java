package Models;

import lombok.Getter;
import lombok.Setter;

import javax.persistence.*;
import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;

@Table(name = "DOSTAWA")
@Entity
@Getter
@Setter
public class SupplyModel {
	@Id
	@Column(name = "ID_DOSTAWA", nullable = false)
	private Long id;
	
	@ManyToOne
	@JoinColumn(name = "PRACOWNIK_ID_PRACOWNIK")
	private EmployeeModel responsibleEmloyee;
	
	@Column(name = "\"DATA\"")
	private LocalDate date;
	
	@ManyToMany(cascade = { CascadeType.ALL })
	@JoinTable(
			name = "PRODUKT_DOSTAWA",
			joinColumns = { @JoinColumn(name = "DOSTAWA_ID_DOSTAWA") },
			inverseJoinColumns = { @JoinColumn(name = "PRODUKT_ID_PRODUKT") }
	)
	private List<ProductModel> products = new ArrayList<>();
}