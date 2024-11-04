/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package co.edu.personasapi.domain;

import jakarta.persistence.*;
/**
*
* @author nixod
*/
@Entity
@Table(name = "personas")
public class Persona {
 @Id
 @Column
 @GeneratedValue(strategy = GenerationType.IDENTITY)
 private int id_p;

 @Column
 private String nombre;

 @Column
 private String apellidos;
 @Column
 private int id_tp_p;

 public int getId() {
 return id_p;
 }
  public void setId(int id) {
 this.id_p = id;
  }
  public String getNombres() {
 return nombre;
 }
 public void setNombres(String nombres) {
 this.nombre = nombres;
 }
 public String getApellidos() {
 return apellidos;
 }
 public void setApellidos(String apellidos) {
 this.apellidos = apellidos;
 }
 public int getId_tp() {
 return id_tp_p;
 }
 public void setId_tp(int id_tp) {
 this.id_tp_p = id_tp;
 }
}
