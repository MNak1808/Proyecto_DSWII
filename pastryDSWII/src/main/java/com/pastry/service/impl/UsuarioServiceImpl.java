
package com.pastry.service.impl;

import com.pastry.commons.GenericServiceImpl;
import com.pastry.dao.api.UsuarioDaoAPI;
import com.pastry.model.Usuario;
import com.pastry.service.api.UsuarioServiceAPI;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Service;

@Service
public class UsuarioServiceImpl extends GenericServiceImpl<Usuario, Long> implements UsuarioServiceAPI{

    @Autowired
    private UsuarioDaoAPI UsuarioDaoAPI;
    
    @Override
    public CrudRepository<Usuario, Long> getDao() {
        return  UsuarioDaoAPI;
    }

    
}
