package com.greenfox.demo.Repository;

import com.greenfox.demo.Model.Todo;
import org.springframework.data.repository.CrudRepository;

public interface TodoRepository extends CrudRepository<Todo, Long> {
}
