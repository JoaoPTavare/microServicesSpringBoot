package ms_work.respository;

import ms_work.entites.Worker;
import org.springframework.data.jpa.repository.JpaRepository;


public interface  WorkRepository extends JpaRepository<Worker, Long> {
}
