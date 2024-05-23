package com.se.riddaradb.dtos;

public class BibDto {
        int id;
        String authors;
        String title;
        String editors;
        String book;

        String bookSeries;
        String placeOfPublication;
        String publisher;
        String publicationDate;
        String pageNumbers;

        protected BibDto(){

        }

    public BibDto(int id, String authors, String title, String editors, String book, String bookSeries, String placeOfPublication, String publisher, String publicationDate, String pageNumbers) {
        this.id = id;
        this.authors = authors;
        this.title = title;
        this.editors = editors;
        this.book = book;
        this.bookSeries = bookSeries;
        this.placeOfPublication = placeOfPublication;
        this.publisher = publisher;
        this.publicationDate = publicationDate;
        this.pageNumbers = pageNumbers;
    }

    public int getId() {
            return id;
        }

        public void setId(int id) {
            this.id = id;
        }

        public String getAuthors() {
            return authors;
        }

        public void setAuthors(String authors) {
            this.authors = authors;
        }

        public String getTitle() {
            return title;
        }

        public void setTitle(String title) {
            this.title = title;
        }

        public String getBook() {
        return book;
    }
        public void setBook(String book) {
        this.book = book;
    }

        public String getBookSeries() {
        return bookSeries;
    }

        public void setBookSeries(String bookSeries) {
        this.bookSeries = bookSeries;
    }

        public String getEditors() {
        return editors;
    }

        public void setEditors(String editors) {
        this.editors = editors;
    }

        public String getPlaceOfPublication() {
            return placeOfPublication;
        }

        public void setPlaceOfPublication(String placeOfPublication) {
            this.placeOfPublication = placeOfPublication;
        }

        public String getPublisher() {
            return publisher;
        }

        public void setPublisher(String publisher) {
            this.publisher = publisher;
        }

        public String getPublicationDate() {
            return publicationDate;
        }

        public void setPublicationDate(String publicationDate) {
            this.publicationDate = publicationDate;
        }

        public String getPageNumbers() {
            return pageNumbers;
        }

        public void setPageNumbers(String pageNumbers) {
            this.pageNumbers = pageNumbers;
        }

    }
