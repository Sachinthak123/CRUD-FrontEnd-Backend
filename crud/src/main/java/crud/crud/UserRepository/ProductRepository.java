package crud.crud.UserRepository;

import org.springframework.data.jpa.repository.JpaRepository;

import crud.crud.Entities.User;

public interface ProductRepository extends JpaRepository<User,Long>{
  
}
