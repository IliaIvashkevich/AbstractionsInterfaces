public class UserAdministrator extends User implements Administrator{
    public UserAdministrator(String name) {
        super(name);
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