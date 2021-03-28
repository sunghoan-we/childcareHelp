package com.example.childcareHelp.service;

import com.example.childcareHelp.DAO.ChildDAO;
import com.example.childcareHelp.entity.Child;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.Collection;

@Service
public class ChildService {

    @Autowired
    private ChildDAO childDAO;

    public Child createChild(Child child) {
        return childDAO.createChild(child);
    }

    public Collection<Child> getAllChildByFamilyId(Integer familyId) {
        return childDAO.getAllChildByFamilyId(familyId);
    }
}
