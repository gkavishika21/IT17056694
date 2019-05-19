package com.sliit.paf.product.repository.custom.impl;

import com.sliit.paf.product.entity.Prdouct;
import com.sliit.paf.product.repository.CrudRepositoryImpl;
import com.sliit.paf.product.repository.custom.PrdouctRepository;
import org.springframework.stereotype.Repository;


@Repository
public class PrdouctRepositoryImpl extends CrudRepositoryImpl<Prdouct, String> implements PrdouctRepository {

}
