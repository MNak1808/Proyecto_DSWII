
package com.pastry.controller;

import com.pastry.model.Usuario;
import com.pastry.service.api.UsuarioServiceAPI;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;


@RestController
@RequestMapping(value="/apiU")
public class UsuarioRestController {
    
    @Autowired
    private UsuarioServiceAPI usuarioService;
    
    @GetMapping(value="/all")
    public List<Usuario> getAll(){
    return usuarioService.getAll();
    }
    
    @PostMapping(value="/save")
    public ResponseEntity<Usuario>save(@RequestBody Usuario usuario){
//    Usuario objeUsuario= usuarioService.guardar(usuario);
    
Usuario objeUsuario= usuarioService.save(usuario);
    return new ResponseEntity<Usuario>(objeUsuario,HttpStatus.OK);
    
    }
    @PostMapping(value="/delete/{id}")    
    public ResponseEntity<Usuario>delete(@PathVariable Long id){
    Usuario usuario=usuarioService.get(id);
    if (usuario != null){
    usuarioService.delete(id);
    }
    else{
        return new ResponseEntity<Usuario>(usuario,HttpStatus.INTERNAL_SERVER_ERROR);
    }
    return new ResponseEntity<Usuario>(usuario,HttpStatus.OK);
    
    }
     @PostMapping(value="/update")
    public ResponseEntity<Usuario>update(@RequestBody Usuario usuario){
//    Usuario objeUsuario= usuarioService.guardar(usuario);
    


Usuario objeUsuario= usuarioService.save(usuario);
    return new ResponseEntity<Usuario>(objeUsuario,HttpStatus.OK);
    
    }
    
    
    
}
