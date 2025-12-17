package repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import ru.ifmo.entities.Result;
import ru.ifmo.entities.User;
import java.util.List;
import java.util.UUID;

@Repository
public interface ResultRepository extends JpaRepository<CheckResult, UUID> {
    List<CheckResult> findByUserOrderByCreatedAtDesc(User user);
}