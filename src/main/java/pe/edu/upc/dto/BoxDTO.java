package pe.edu.upc.dto;

import java.util.List;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
public class BoxDTO {

	private int idBox;
	private double price;
	private boolean personalized;
	private String name;
	private List<ProductDTO> products;
}
