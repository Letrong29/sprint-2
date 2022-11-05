package com.codegym.model;

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
public class Book {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;

    private String title;

    private String author;

    private String descriptions;

    @Column(columnDefinition = "double")
    private String price;

    @Column(columnDefinition = "int")
    private String quantity;

    @OneToMany(mappedBy = "bookId")
    private Set<CartDetail> cartDetails;

    @OneToMany(mappedBy = "bookId")
    private Set<BookDetail> bookDetails;
}
