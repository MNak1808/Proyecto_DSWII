
package com.pastry.model;

import java.io.Serializable;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;


@Entity
@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
@Table(name="tb_usuario")
public class Usuario implements Serializable{

@Id
@GeneratedValue(strategy = GenerationType.IDENTITY)
private Long codigo;
private String nombre;
private String apellido;
private String usuario;
private String pass;
private String correo;
private int id_tipo;


    
}
