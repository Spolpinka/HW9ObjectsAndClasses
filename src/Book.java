public class Book {
    String nameOfBook; // имя книги
    Author author; //автор книги
    int yearOfPublication; //год публикации

    public Book(String nameOfBook, Author author, int yearOfPublication) {
        this.nameOfBook = nameOfBook;
        this.author = author;
        this.yearOfPublication = yearOfPublication;
    }

    public void setYearOfPublication(int yearOfPublication) {
        this.yearOfPublication = yearOfPublication;
    }

//    public void setNameOfBook(String nameOfBook) {
//        this.nameOfBook = nameOfBook;
//    }

//    public void setAuthor(Author author) {
//        this.author = author;
//    }

    public int getYearOfPublication() {
        return yearOfPublication;
    }

    public Author getAuthor() {
        return author;
    }

    public String getNameOfBook() {
        return nameOfBook;
    }
}
