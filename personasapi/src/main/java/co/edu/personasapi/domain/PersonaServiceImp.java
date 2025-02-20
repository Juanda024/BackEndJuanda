/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package co.edu.personasapi.domain;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
/**
*
* @author nixod
*/
@Service
public class PersonaServiceImp implements PersonaService{
    @Autowired
    private PersonaRepository repositorio;

    @Override
    public List<Persona> listar() {
        return repositorio.findAll();
    }
    @Override
    public Persona listarId(int id) {
        return repositorio.findById(id);
    }
    @Override
    public Persona add(Persona p) {
        return repositorio.save(p);
    }
    @Override
    public Persona edit(Persona p) {
        return repositorio.save(p);
    }
    @Override
    public Persona delete(int id) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

}