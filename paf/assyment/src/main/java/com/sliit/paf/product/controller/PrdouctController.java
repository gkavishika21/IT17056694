package com.sliit.paf.product.controller;

import com.sliit.paf.product.dto.PrdouctDTO;
import com.sliit.paf.product.service.custom.ManagePrdouctService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpHeaders;
import org.springframework.http.HttpStatus;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@CrossOrigin
@RestController
@RequestMapping("api/v1/customers")
public class PrdouctController {

    @Autowired
    private ManagePrdouctService customersService;

    @GetMapping
    public ResponseEntity<List<PrdouctDTO>> findAllCustomers(){
        System.out.println("sssssssssssssssssssssssssssssssssssssssssssss");
        List<PrdouctDTO> customers = customersService.getCustomers();
        HttpHeaders httpHeaders = new HttpHeaders();
        httpHeaders.add("X-Count",customers.size() + "");
        System.out.println(customers);
        return new ResponseEntity<List<PrdouctDTO>>(customers,httpHeaders, HttpStatus.OK);
    }

    @GetMapping("/{id:C\\d{3}}")
    public PrdouctDTO findCustomer(@PathVariable("id") String cId){
        PrdouctDTO customer = customersService.findCustomer(cId);
        return customer;
    }

    @DeleteMapping("/{id:C\\d{3}}")
    @ResponseStatus(HttpStatus.OK)
    public void deleteCustomer(@PathVariable("id") String cId){
       customersService.deleteCustomer(cId);
    }

    @PostMapping(consumes = MediaType.APPLICATION_JSON_VALUE)
    @ResponseStatus(HttpStatus.CREATED)
    public String saveCustomer(@RequestBody PrdouctDTO prdouctDTO){
        customersService.createCustomer(prdouctDTO);
        return prdouctDTO.getCodeNo();
    }

    @PutMapping(value = "/{id:C\\d{3}}",consumes = MediaType.APPLICATION_JSON_VALUE)
    public ResponseEntity updateCustomer(@PathVariable("id") String cId, @RequestBody PrdouctDTO prdouctDTO){
       if (cId.equals(prdouctDTO.getCodeNo())){
           customersService.updateCustomer(prdouctDTO);
           return new ResponseEntity(HttpStatus.OK);
       }else {
           return new ResponseEntity(HttpStatus.BAD_REQUEST);
       }
    }

}
