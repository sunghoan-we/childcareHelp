package com.example.childcareHelp.DAO;

import com.example.childcareHelp.entity.Child;
import org.springframework.data.mongodb.repository.MongoRepository;

import java.util.Collection;


public interface ChildRepository extends MongoRepository<Child, Integer> {
    public default Collection<Child> findAllByFamilyId(Integer familyId) {
        return null;
    }
}
