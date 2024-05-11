package tdea.construccion2.app.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import tdea.construccion2.app.models.Person;

@Repository
public interface PersonRepository extends JpaRepository<Person, Long>{
	public Person findByUserName(String username);
        public boolean existsByUserName(String username);
        public Person findById(long id);
	public boolean existsById(long id);
}
