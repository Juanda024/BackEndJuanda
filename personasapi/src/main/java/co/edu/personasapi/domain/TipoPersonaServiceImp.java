/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package co.edu.personasapi.domain;

import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service

public class TipoPersonaServiceImp implements TipoPersonaService {

    @Autowired
    private TipoPersonaRepository tp_repositorio;

    @Override
    public List<TipoPersona> listar() {
        return tp_repositorio.findAll();
    }

}
