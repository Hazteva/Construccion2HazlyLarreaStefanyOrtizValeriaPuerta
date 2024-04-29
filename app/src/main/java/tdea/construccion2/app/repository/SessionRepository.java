package tdea.construccion2.app.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import tdea.construccion2.app.models.Session;

public interface SessionRepository extends JpaRepository<Session, Long>{
	public Session findSessionById(long id);
}
