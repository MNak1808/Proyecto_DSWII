/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Interface.java to edit this template
 */
package com.pastry.dao.api;

import com.pastry.model.Usuario;
import org.springframework.data.repository.CrudRepository;

/**
 *
 * @author EQUIPO
 */
public interface UsuarioDaoAPI extends CrudRepository<Usuario, Long>{
    
    
}
