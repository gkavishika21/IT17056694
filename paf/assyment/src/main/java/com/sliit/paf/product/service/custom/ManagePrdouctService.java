package com.sliit.paf.product.service.custom;



import com.sliit.paf.product.dto.PrdouctDTO;
import com.sliit.paf.product.service.SuperService;

import java.util.List;

public interface ManagePrdouctService extends SuperService {

    List<PrdouctDTO> getCustomers();

    void createCustomer(PrdouctDTO dto);

    void updateCustomer(PrdouctDTO dto);

    void deleteCustomer(String customerID);

    PrdouctDTO findCustomer(String id);


}
