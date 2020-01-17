package fn3s.java.spring.limitsservice.repositories;

import fn3s.java.spring.limitsservice.bean.VolatilityBoundaryBean;
import org.springframework.data.jpa.repository.JpaRepository;

public interface VolatilityBoundaryRepository extends JpaRepository<VolatilityBoundaryBean, String> {

    VolatilityBoundaryBean findByCurrency(String Currency);

}
