public class Library {
    private Book[] books;

    public Library(int size) {
        this.books = new Book[size];
    }

    void addBook(Book newBook) {
        for (int i = 0; i < books.length; i++) {
            if (books[i] == null) {
                books[i] = newBook;
                break;
            }
        }
    }

    void toPrint() {
        for (Book b : this.books) {
            if (b != null) {
                System.out.printf("%s %s: %s: %s", b.author.getFirstName(), b.author.getLastName(), b.nameOfBook, b.yearOfPublication);
                System.out.println();
            }
        }
    }

    void toPrintForNameOfBook(String name) {
        for (Book b :
                this.books) {
            if (b != null && b.nameOfBook.equals(name)) {
                System.out.printf("%s by %s %s was published in %s", b.nameOfBook, b.author.getFirstName(), b.author.getLastName(), b.yearOfPublication);
                System.out.println();
            }
        }
    }

    void changeYearForNameOfBook(String nameOfBook, int newYearOfPublic) {
        for (Book b :
                this.books) {
            if (b != null && b.nameOfBook.equals(nameOfBook)) {
                b.yearOfPublication = newYearOfPublic;
            }
        }
    }

}
