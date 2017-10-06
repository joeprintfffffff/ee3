package ee3.demo.repositories.mongodb;

import ee3.demo.models.User;
import ee3.demo.models.UserMongo;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface UserRepository extends MongoRepository<UserMongo,String > {
    User findByName(String name);
}
