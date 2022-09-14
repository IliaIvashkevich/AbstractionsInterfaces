public class UserLibrarian extends User implements Librarian {
    public UserLibrarian(String name) {
        super(name);
    }

    @Override
    public void ordersBook(UserSupplier supplier, String bookName) {
        System.out.println("Библиотекарь " + getName() + " заказал у поставщика " + supplier.getName() + " книгу " + bookName);
    }
}