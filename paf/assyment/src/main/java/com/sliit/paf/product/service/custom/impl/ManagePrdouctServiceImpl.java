package com.sliit.paf.product.service.custom.impl;

import com.sliit.paf.product.dto.PrdouctDTO;
import com.sliit.paf.product.repository.custom.PrdouctRepository;
import com.sliit.paf.product.service.Converter;
import com.sliit.paf.product.service.custom.ManagePrdouctService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

@Service
@Transactional
public class ManagePrdouctServiceImpl implements ManagePrdouctService {

    private PrdouctRepository customerDAO;

    @Autowired
    public ManagePrdouctServiceImpl(PrdouctRepository customerDAO) {
        this.customerDAO = customerDAO;
    }

    @Transactional(readOnly = true)
    public List<PrdouctDTO> getCustomers(){
        return customerDAO.findAll().map(Converter::<PrdouctDTO>getDTOList).get();
    }

    public void createCustomer(PrdouctDTO dto) {

        customerDAO.save(Converter.getEntity(dto));
    }

    public void updateCustomer(PrdouctDTO dto) {
        customerDAO.update(Converter.getEntity(dto));
    }

    public void deleteCustomer(String customerID) {
        customerDAO.delete(customerID);
    }

    public PrdouctDTO findCustomer(String id){
        return customerDAO.find(id).map(Converter::<PrdouctDTO>getDTO).orElse(null);
    }

}
