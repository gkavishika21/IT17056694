package com.sliit.paf.product.repository;

import org.hibernate.Session;

public interface SuperRepository {

    Session getSession();

}
