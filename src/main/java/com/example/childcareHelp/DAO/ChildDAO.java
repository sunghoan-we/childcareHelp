package com.example.childcareHelp.DAO;

import com.example.childcareHelp.entity.Child;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import java.util.Collection;

@Component
public class ChildDAO {

    @Autowired
    private ChildRepository childRepository;

    public Collection<Child> getAllChildByFamilyId(Integer familyId) {
        return childRepository.findAllByFamilyId(familyId);
    }

    public Child createChild(Child child){
        return childRepository.insert(child);
    }
}

