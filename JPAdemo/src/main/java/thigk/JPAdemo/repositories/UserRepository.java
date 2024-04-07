package thigk.JPAdemo.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

import thigk.JPAdemo.models.User;

@Repository
public class UserRepository extends Jparepository<User, Long> {

}
