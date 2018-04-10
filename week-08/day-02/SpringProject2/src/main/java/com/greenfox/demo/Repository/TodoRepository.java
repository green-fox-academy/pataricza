package com.greenfox.demo.Repository;

import com.greenfox.demo.Model.Todo;
import org.springframework.data.repository.CrudRepository;

import java.util.Optional;

public interface TodoRepository extends CrudRepository<Todo, Long> {
  Todo findAllByDone(boolean done);
}
