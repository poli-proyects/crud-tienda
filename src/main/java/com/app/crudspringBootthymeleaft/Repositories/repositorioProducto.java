package com.app.crudspringBootthymeleaft.Repositories;

import com.app.crudspringBootthymeleaft.Entidaddb.product;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

public interface repositorioProducto extends JpaRepository<product,Integer> {

}
