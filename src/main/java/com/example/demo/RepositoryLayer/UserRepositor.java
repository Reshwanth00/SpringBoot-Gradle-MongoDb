package com.example.demo.RepositoryLayer;
import com.example.demo.Model.User;
import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface UserRepositor extends MongoRepository<User,Integer> {
}
