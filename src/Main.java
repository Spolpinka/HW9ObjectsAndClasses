public class Main {


    public static void main(String[] args) {
        Author author1 = new Author("Терри", "Пратчет");
        Author author2 = new Author("Джоан", "Роулинг");

        Book harryPotter = new Book("Harry Potter", author2, 2000);
        Book guardians = new Book("Guardians", author1, 1997);
        // меняем год публикации
        guardians.setYearOfPublication(1994);
        // проверяем, изменился ли год публикации
        System.out.println(guardians.yearOfPublication);

        //создаем новый объект Library и задаем размер массива
        Library lib = new Library(5);
        //добавляем в новый объект lib (в новую библиотеку) класса Library ранее созданные книги
        lib.addBook(harryPotter);
        lib.addBook(guardians);
        //печатаем библиотеку (проверяем метод печати всей lib
        lib.toPrint();
        // печатаем по названию книги (проверяем соответствующий метод)
        lib.toPrintForNameOfBook(harryPotter.nameOfBook);
        //меняем год публикации по названию и печатаем книгу для проверки работы соответствующего метода
        lib.changeYearForNameOfBook(guardians.nameOfBook, 2000);
        lib.toPrintForNameOfBook(guardians.nameOfBook);
        System.out.println("--------------------");
        //печатаем переопределенным методом toString()
        System.out.println(guardians);
        System.out.println(author1);
        //проверяем работу переопределенного метода equals()
        System.out.println(author1.equals(author2));
        System.out.println(harryPotter.equals(harryPotter));
        //проверяем работу переопределенного метода hashCode
        System.out.println("Сравниваем автора 1 и автора 2 через hashCode :" + (author1.hashCode() == author2.hashCode()));
        System.out.println("Сравниваем книгу 1 и книгу 1 через hashCode :" + (guardians.hashCode() == guardians.hashCode()));

    }

}