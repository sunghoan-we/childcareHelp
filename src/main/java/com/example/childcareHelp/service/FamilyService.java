package com.example.childcareHelp.service;

import com.example.childcareHelp.DAO.FamilyDAO;
import com.example.childcareHelp.entity.Babysitter;
import com.example.childcareHelp.entity.Family;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.Optional;

@Service
public class FamilyService {

    @Autowired
    private FamilyDAO familyDAO;

    public Family createFamily(Family family) {
        return familyDAO.createFamily(family);
    }

    public Optional<Family> getFamily(Integer familyId) {
        return familyDAO.getFamilyById(familyId);
    }
}
