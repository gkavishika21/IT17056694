package com.sliit.paf.product.repository;

import com.sliit.paf.product.entity.SuperEntity;

import java.io.Serializable;
import java.util.List;
import java.util.Optional;

public interface CrudRepository<T extends SuperEntity, ID extends Serializable> extends SuperRepository {

    Optional<T> find(ID key);

    Optional<List<T>> findAll();

    void save(T entity);

    void update(T entity);

    void delete(ID key);

}
