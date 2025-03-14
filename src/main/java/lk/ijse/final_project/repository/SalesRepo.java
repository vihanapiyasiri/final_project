package lk.ijse.final_project.repository;

import com.example.demo.entity.Sales;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

public interface SalesRepo extends JpaRepository<Sales,String> {

    Sales findTopByOrderByOrderIdDesc();

//    @Query(value = "SELECT * FROM orders WHERE order_date >= DATE_SUB(CURRENT_TIMESTAMP, INTERVAL 3 DAY)", nativeQuery = true)
//    List<Sales> getAllRefundOrders();

    @Query(value = "SELECT * FROM orders WHERE order_id =:orderId", nativeQuery = true)
    Sales findByOrderId(String orderId);

    Sales findOrderByOrderId(String orderId);
}
