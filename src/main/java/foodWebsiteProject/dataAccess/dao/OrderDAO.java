package foodWebsiteProject.dataAccess.dao;


import foodWebsiteProject.dataAccess.entity.OrderEntity;
import foodWebsiteProject.dataAccess.repository.OrderRepository;
import foodWebsiteProject.dataAccess.util.ProviderConverter;
import foodWebsiteProject.model.Order;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import javax.transaction.Transactional;

@Service
@Transactional
public class OrderDAO implements OrderDataAccess {

    private ProviderConverter orderConverter;

    private OrderRepository orderRepository;

    @Autowired
    public OrderDAO(ProviderConverter orderConverter, OrderRepository orderRepository){
        this.orderConverter = orderConverter;
        this.orderRepository = orderRepository;
    }

    public Order save(Order order){
        OrderEntity orderEntity = orderConverter.orderModelToOrderEntity(order);
        orderEntity  = orderRepository.save(orderEntity);
        return orderConverter.orderEntityToOrderModel(orderEntity);
    }
}
