package br.com.codenation.challenge.service.interfaces;

import java.util.List;

public interface ServiceInterface<T> {
    T save(T object);
    List<T> findAll();
}
