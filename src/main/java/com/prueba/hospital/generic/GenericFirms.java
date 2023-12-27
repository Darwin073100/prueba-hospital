package com.prueba.hospital.generic;

import java.util.List;
import java.util.Optional;

public interface GenericFirms <T>{
    Optional<T> findById(int id);
    List<T> findAll();
    T save (T t);

    T update(T t);
    void delete(int id);
}
