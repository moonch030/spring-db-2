package hello.springtx.order;

import org.springframework.data.jpa.repository.JpaRepository;

public interface OrderRepsoitory extends JpaRepository<Order, Long> {
}
