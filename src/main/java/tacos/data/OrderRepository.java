package tacos.data;

import org.springframework.data.repository.CrudRepository;
import tacos.Order;
import tacos.TacoOrder;

public interface OrderRepository extends CrudRepository<TacoOrder, Long> {
    /*Order save(Order order);*/
}
