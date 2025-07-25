package com.example.shop.models;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import org.springframework.data.annotation.Id;
import org.springframework.data.annotation.Transient;

import java.math.BigDecimal;

@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
public class OrderItem {

    @Id
    private Long id;

    private Long itemId;
    private Long orderId;

    private int count;

    @Transient
    private Item item;

    @Transient
    private Order order;

    public Long getId()          { return item.getId();          }
    public String getTitle()     { return item.getTitle();       }
    public String getDescription(){ return item.getDescription(); }
    public String getImgPath()   { return item.getImgPath();     }
    public BigDecimal getPrice() { return item.getPrice();       }
}
