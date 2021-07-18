package com.krypton.service.impl;

import com.krypton.commons.GenericServiceImpl;
import com.krypton.dao.api.PersonaRepository;
import com.krypton.model.Persona;
import com.krypton.service.api.PersonaServiceAPI;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Service;

@Service
public class PersonaServiceImpl extends GenericServiceImpl<Persona, Long> implements PersonaServiceAPI {

    @Autowired
    private PersonaRepository personaRepository;

    @Override
    public CrudRepository<Persona, Long> getDao() {
        return personaRepository;
    }
}
