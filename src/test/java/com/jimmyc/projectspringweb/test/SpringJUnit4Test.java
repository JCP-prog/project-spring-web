/**
 * 
 */
package com.jimmyc.projectspringweb.test;

import static org.junit.Assert.*;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringRunner;

import com.jimmyc.projectspringweb.services.SpringService;

/**
 * @author JimmyC
 * Clase de prueba unitaria con Spring y JUnit 4
 * NOTA: No tiene soporte Spring Test para JUnit 5
 */

@RunWith(SpringRunner.class)
@ContextConfiguration(locations = {"classpath:applicationContext-test.xml"})
public class SpringJUnit4Test {

	@Autowired
	private SpringService springServiceImpl;
	
	@Test
	public void test() {
		assertNotNull(this.springServiceImpl);
		System.out.println(this.springServiceImpl.mostrarNombreEmpleado()); 
	}

}
