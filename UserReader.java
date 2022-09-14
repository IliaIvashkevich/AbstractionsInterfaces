public class UserReader extends User implements Reader {
    public UserReader(String name) {
        super(name);
    }

    @Override
    public void takesBook(String bookName) {
        System.out.println("Читатель " + getName() + " взял книгу " + bookName + " в библиотеке");
    }

    @Override
    public void returnsBook(String bookName) {
        System.out.println("Читатель " + getName() + " вернул книгу " + bookName + " в библиотеку");
    }
}