package org.example.dao;

import org.example.model.Alien;
import org.springframework.data.repository.CrudRepository;

public interface AlienRepo extends CrudRepository<Alien,Integer>
{

}
