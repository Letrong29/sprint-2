package com.codegym.model;

import com.codegym.model.composite.BookDetailKey;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import javax.persistence.*;

@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
@Entity
public class BookDetail {

    @EmbeddedId
    private BookDetailKey id;

    @ManyToOne
    @JoinColumn(name = "book_id", referencedColumnName = "id")
    @MapsId("bookId")
    private Book bookId;

    @ManyToOne
    @JoinColumn(name = "category_id", referencedColumnName = "id")
    @MapsId("categoryId")
    private Category categoryId;
}
