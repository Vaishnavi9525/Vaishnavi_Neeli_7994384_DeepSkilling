
package com.library.controller;

import com.library.service.LibraryService;

public class LibraryController {

    private LibraryService libraryService;

    public LibraryController() {
        libraryService = new LibraryService();
    }

    public void processBook() {
        libraryService.issueBook();
    }

    public static void main(String[] args) {
        LibraryController controller = new LibraryController();
        controller.processBook();
    }
}