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
    @Override
    public String toString (){
        return this.author.toString() + ":" + this.getNameOfBook() + ":" + this.getYearOfPublication();
    }
    public boolean equals(Book book){
        if (this == book) return true;
        if (book == null || getClass() != book.getClass()) return false;
        Book book1 = (Book) book;
        return (getNameOfBook() == book1.getNameOfBook()) &&
                (getAuthor().equals(book1.getAuthor())) &&
                (getYearOfPublication() == book.getYearOfPublication());
    }
@Override
    public int hashCode (){
        int result = nameOfBook == null ? 0 : nameOfBook.hashCode();
        result = result * 31 + (author == null ? 0 : author.hashCode());
        result = result * 31 + (yearOfPublication);
        return result;
    }
}
