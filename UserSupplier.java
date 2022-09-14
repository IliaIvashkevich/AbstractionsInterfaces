public class UserSupplier extends User implements Supplier {
    public UserSupplier(String name) {
        super(name);
    }

    @Override
    public void bringsBook(String bookName) {
        System.out.println("Поставщик " + getName() + " привез книгу " + bookName);
    }
}
