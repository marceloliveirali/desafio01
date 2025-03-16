package com.DevSuperiorDesafioI.desafio01.services;

import com.DevSuperiorDesafioI.desafio01.entities.Order;
import org.springframework.stereotype.Service;

@Service
public class ShippingService
{
    public double shipment(Order order)
    {
        double shipping = 0;

        if (order.getBasic() < 100)
        {
            shipping = 20;
        }

        if (order.getBasic() > 100 && order.getBasic() < 200)
        {
            shipping = 12;
        }

        return shipping;
    }
}
