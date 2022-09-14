public class UserSupplierReader extends UserSupplier implements Supplier, Reader {

    public UserSupplierReader(String name) {
        super(name);
    }

    @Override
    public void bringsBook(String bookName) {
        System.out.println("Поставщик " + getName() + " доставил книгу " + bookName);
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
