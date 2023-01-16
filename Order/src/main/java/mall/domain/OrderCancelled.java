package mall.domain;

import mall.domain.*;
import mall.infra.AbstractEvent;
import java.util.*;
import lombok.*;


@Data
@ToString
public class OrderCancelled extends AbstractEvent {

    private Long id;
    private String customerId;
    private String productName;
    private Long productId;
    private Integer qty;

    public OrderCancelled(Order aggregate){
        super(aggregate);
    }
    public OrderCancelled(){
        super();
    }
}
