package com.example.childcareHelp.DAO;

import com.example.childcareHelp.entity.Contract;
import org.springframework.data.mongodb.repository.MongoRepository;

import java.util.Collection;


public interface ContractRepository extends MongoRepository<Contract, Integer> {

    public default Collection<Contract> findAllByFamilyId(Integer familyId) {
        return null;
    }
    public default Collection<Contract> findAllByBabysitterId(Integer snn) {
        return null;
    }

}
