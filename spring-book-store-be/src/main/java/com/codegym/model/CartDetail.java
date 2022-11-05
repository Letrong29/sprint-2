package com.codegym.model;

import com.codegym.model.composite.CartDetailKey;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import javax.persistence.*;
import java.util.Set;

@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
@Entity
public class CartDetail {

    @EmbeddedId
    private CartDetailKey id;

    @ManyToOne
    @JoinColumn(name = "cart_id", referencedColumnName = "id")
    @MapsId("cartId")
    private Cart cartId;

    @ManyToOne
    @JoinColumn(name = "book_id", referencedColumnName = "id")
    @MapsId("bookId")
    private Book bookId;
}
