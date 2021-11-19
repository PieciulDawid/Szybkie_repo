package Models;

import lombok.Getter;
import lombok.Setter;

import javax.persistence.*;
import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;

@Table(name = "ZAMOWIENIE")
@Entity
@Getter
@Setter
public class OrderModel {
	@Id
	@Column(name = "ID_ZAMOWIENIE", nullable = false)
	private Long id;
	
	@Column(name = "DATA_ZLOZENIA", nullable = false)
	private LocalDate startDate;
	
	@ManyToOne
	@JoinColumn(name = "PRACOWNIK_ID_PRACOWNIK")
	private EmployeeModel responsibleEmloyee;
	
	@ManyToOne
	@JoinColumn(name = "KLIENT_ID_KLIENT")
	private ClientModel client;
	
	@Column(name = "DATA_REALIZACJI", nullable = false)
	private LocalDate endDate;
	
	@Enumerated
	@Column(name = "STAN")
	private StateType state;
	
	@ManyToMany(cascade = { CascadeType.ALL })
	@JoinTable(
			name = "ZAMOWIENIA_PRODUKT",
			joinColumns = { @JoinColumn(name = "ZAMOWIENIE_ID_ZAMOWIENIE") },
			inverseJoinColumns = { @JoinColumn(name = "PRODUKT_ID_PRODUKT") }
	)
	private List<ProductModel> products = new ArrayList<>();
}