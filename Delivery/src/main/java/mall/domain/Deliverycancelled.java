package mall.domain;

import mall.domain.*;
import mall.infra.AbstractEvent;
import java.util.*;
import lombok.*;


@Data
@ToString
public class Deliverycancelled extends AbstractEvent {

    private Long id;

    public Deliverycancelled(Delivery aggregate){
        super(aggregate);
    }
    public Deliverycancelled(){
        super();
    }
}
