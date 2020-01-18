package fn3s.java.spring.limitsservice.repositories;

import fn3s.java.spring.limitsservice.bean.AmountBoundaryBean;
import org.springframework.data.jpa.repository.JpaRepository;

public interface AmountBoundaryRepository extends JpaRepository<AmountBoundaryBean, String> {

    AmountBoundaryBean findByCurrency(String Currency);

}

