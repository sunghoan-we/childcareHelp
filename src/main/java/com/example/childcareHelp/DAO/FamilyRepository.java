package com.example.childcareHelp.DAO;


import com.example.childcareHelp.entity.Family;
import org.springframework.data.mongodb.repository.MongoRepository;

import java.util.Collection;


public interface FamilyRepository extends MongoRepository<Family, Integer> {
    public default Family findByEmail(String email) {
        return null;
    }

    public default Collection<Family> findFamilyByCondition(Family family) {
        return null;
    }
}
