package com.sliit.paf.product.service;


import com.sliit.paf.product.dto.PrdouctDTO;
import com.sliit.paf.product.dto.SuperDTO;
import com.sliit.paf.product.entity.Prdouct;
import com.sliit.paf.product.entity.SuperEntity;

import java.util.List;
import java.util.stream.Collectors;

public class Converter {

    public static <T extends SuperDTO> T getDTO(SuperEntity entity) {
        if (entity instanceof Prdouct) {
            Prdouct p = (Prdouct) entity;
            return (T) new PrdouctDTO(p.getCodeNo(), p.getProductName(), p.getUnitPrice(),p.getQtyOnHand(),p.getRAM(),p.getMemory(),p.getDescription());
        }else {
            throw new RuntimeException("This entity can't be converted to a DTO");
        }
    }

    public static <T extends SuperEntity> T getEntity(SuperDTO dto) {
        if (dto instanceof PrdouctDTO) {
            PrdouctDTO p = (PrdouctDTO) dto;
            return (T) new Prdouct(p.getCodeNo(), p.getProductName(), p.getUnitPrice(),p.getQtyOnHand(),p.getRAM(),p.getMemory(),p.getDescription());
        }else {
            throw new RuntimeException("This DTO can't be converted to an entity");
        }
    }

    public static <T extends SuperDTO> List<T> getDTOList(List<? extends SuperEntity> entities) {
        return entities.stream().map(Converter::<T>getDTO).collect(Collectors.toList());
    }

    public static <T extends SuperEntity> List<T> getEntityList(List<? extends SuperDTO> dtos) {
        return dtos.stream().map(Converter::<T>getEntity).collect(Collectors.toList());

    }

//    public static <T extends SuperDTO> List<T> getDTOList(List<CustomEntity> list, Class<T> dtoClass) {
//        return list.stream().map(c -> getDTO(c, dtoClass)).collect(Collectors.toList());
//    }

}
