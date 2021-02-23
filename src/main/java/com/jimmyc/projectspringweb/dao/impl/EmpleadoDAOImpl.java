/**
 * 
 */
package com.jimmyc.projectspringweb.dao.impl;

import org.springframework.stereotype.Repository;

import com.jimmyc.projectspringweb.dao.EmpleadoDAO;

/**
 * @author JimmyC
 *
 */

@Repository
public class EmpleadoDAOImpl implements EmpleadoDAO {

	@Override
	public String consultarNombreEmpleado() {
		return "Jimmy Calle Peña";
	}

}
