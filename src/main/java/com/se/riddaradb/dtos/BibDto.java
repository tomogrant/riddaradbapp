package com.se.riddaradb.dtos;

public class BibDto {
        int id;
        String authors;
        String title;
        String placeOfPublication;
        String publisher;
        String publicationDate;
        String pageNumbers;

        protected BibDto(){

        }

    public BibDto(int id, String authors, String title, String placeOfPublication, String publisher, String publicationDate, String pageNumbers) {
        this.id = id;
        this.authors = authors;
        this.title = title;
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
