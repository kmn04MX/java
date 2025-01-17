package med.voll.api.direccion;

import jakarta.persistence.Embeddable;
import lombok.*;

@Embeddable
@Getter
@NoArgsConstructor
@AllArgsConstructor
public class Direccion {
	private String calle;
	private String numero;
	private String complemento;
	private String distrito;
	private String ciudad;
	
	
	
	public Direccion(DatosDireccion direccion) {
		this.calle = direccion.calle();
		this.numero = direccion.numero();
		this.complemento = direccion.complemento();
		this.distrito = direccion.distrito();
		this.ciudad = direccion.ciudad();
	}

}
