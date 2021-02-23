/**
 * 
 */
package com.jimmyc.projectspringweb.services.impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.jimmyc.projectspringweb.dao.EmpleadoDAO;
import com.jimmyc.projectspringweb.services.SpringService;

/**
 * @author JimmyC
 *
 */

@Service
public class SpringServiceImpl implements SpringService {

	@Autowired
	private EmpleadoDAO empleadoDAOImpl;
	
	@Override
	public String mostrarNombreEmpresa() {
		return "Anotaciones con Spring y JSF";
	}

	@Override
	public String mostrarNombreEmpleado() {
		return this.empleadoDAOImpl.consultarNombreEmpleado();
	}

}
