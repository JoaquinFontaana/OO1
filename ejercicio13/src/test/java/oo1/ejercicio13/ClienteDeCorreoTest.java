package oo1.ejercicio13;

import org.junit.jupiter.api.*;

public class ClienteDeCorreoTest {
	private ClienteDeCorreo correo;
	private Email email;
	@BeforeEach
	public void setUp() {
		correo = new ClienteDeCorreo();
		Email email2= new Email("spam","boludo");
		email = new Email("Hola","Saludo");
	}
	
}
