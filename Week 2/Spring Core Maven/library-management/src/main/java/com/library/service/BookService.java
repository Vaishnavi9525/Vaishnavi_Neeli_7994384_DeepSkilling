package com.library.service;

import org.springframework.stereotype.Service;

@Service
public class BookService {

    public void showBook() {
        System.out.println("Book Service Called");
    }
}