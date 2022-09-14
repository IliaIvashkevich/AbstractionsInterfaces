public class UserLibrarianAdministrator extends UserLibrarian implements Librarian, Administrator {
    public UserLibrarianAdministrator(String name) {
        super(name);
    }

    @Override
    public void ordersBook(UserSupplier supplier, String bookName) {
        System.out.println("Библиотекарь " + getName() + " заказал у поставщика " + supplier.getName() + " книгу " + bookName);
    }

    @Override
    public void findsAndGiveBook(UserReader reader, String bookName) {
        System.out.println("Администратор " + getName() + " нашел книгу " + bookName +
                " и выдал ее читателю " + reader.getName());
    }

    @Override
    public void deadlineNotice(UserReader reader, String bookName) {
        System.out.println("Администратор " + getName() + " уведомляет читателя " + reader.getName() +
                " о том, что тот нарушил сроки возврата книги " + bookName);
    }
}
