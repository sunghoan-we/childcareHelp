package com.example.childcareHelp.controller;

import com.example.childcareHelp.entity.Contract;
import com.example.childcareHelp.service.BabysitterService;
import com.example.childcareHelp.service.ChildService;
import com.example.childcareHelp.service.ContractService;
import com.example.childcareHelp.service.FamilyService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("/contract")
public class ContractController {

    @Autowired
    private ContractService contractService;
    @Autowired
    private ChildService childService;
    @Autowired
    private FamilyService familyService;
    @Autowired
    private BabysitterService babysitterService;

    /*
     * show the detail information of a contract selected
     */
    @RequestMapping("/detailOfAcceptContract")
    public String getAcceptContract(Contract contract, Model model) {
//        model.addAttribute(familyService.getFamily(contract.getFamilyID()));
//        model.addAttribute(childService.getAllChildByFamilyId(contract.getFamilyID()));
//        model.addAttribute(contractService.getContract(contract.getContractID()));
        return "contract/detailOfAcceptContract";
    }

    /*
     * show the detail information of a contract selected
     */
    @RequestMapping("/detailOfRequestContract")
    public String getRequestContract(Contract contract, Model model) {
//        model.addAttribute(babysitterService.getBabysitter(contract.getSnn()));
//        model.addAttribute(contractService.getContract(contract.getContractID()));
        return "contract/detailOfRequestContract";
    }

    /*
     * register a contract between family and a babysitter
     */
    @RequestMapping("/registerContract")
    public String registerContract(Contract contract, Model model) {
//        model.addAttribute(contractService.createContract(contract));
        return "contract/listOfRequestContracts";
    }

    /*
     * update the status of a contract accepted
     */
    @RequestMapping("/updateContract")
    public String updateContract(Contract contract, Model model) {
//        model.addAttribute(contractService.updateContract(contract));
        return "contract/listOfAcceptContracts";
    }

    /*
     * cancel the status of a contract requested
     */
    @RequestMapping("/cancelContract")
    public String cancelContract(Contract contract, Model model) {
//        model.addAttribute(contractService.updateContract(contract));
        return "contract/listOfRequestContracts";
    }

    /*
     * show the list of the request contracts by oneself (for family)
     */
    @RequestMapping("/listOfRequestContracts")
    public String getListContractByFamilyId(Contract contract, Model model) {
        model.addAttribute(contractService.getAllContractsByFamilyId(contract.getFamilyID()));
        return "contract/listOfRequestContracts";
    }

    /*
     * show the list of the accepted contracts by family (for babysitter)
     */
    @RequestMapping("/listOfAccecptContracts")
    public String getListContractByBabysitterId(Contract contract, Model model) {
        model.addAttribute(contractService.getAllContractsByBabysitterId(contract.getSnn()));
        return "contract/listOfAcceptContracts";
    }

}
