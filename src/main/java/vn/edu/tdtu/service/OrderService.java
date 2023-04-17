package vn.edu.tdtu.service;

import vn.edu.tdtu.entity.Order;
import vn.edu.tdtu.model.dto.OrderDetailDTO;
import vn.edu.tdtu.model.dto.OrderInfoDTO;
import vn.edu.tdtu.model.request.CreateOrderRequest;
import vn.edu.tdtu.model.request.UpdateDetailOrder;
import vn.edu.tdtu.model.request.UpdateStatusOrderRequest;
import org.springframework.data.domain.Page;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public interface OrderService {
    Page<Order> adminGetListOrders(String id, String name, String phone, String status, String product, int page);

    Order createOrder(CreateOrderRequest createOrderRequest, long userId);

    void updateDetailOrder(UpdateDetailOrder updateDetailOrder, long id, long userId);

    Order findOrderById(long id);

    void updateStatusOrder(UpdateStatusOrderRequest updateStatusOrderRequest, long orderId, long userId);

    List<OrderInfoDTO> getListOrderOfPersonByStatus(int status, long userId);

    OrderDetailDTO userGetDetailById(long id, long userId);

    void userCancelOrder(long id, long userId);

    //Đếm số lượng đơn hàng
    long getCountOrder();

}
