public class Main {
    public static void main(String[] args) {
        UserReader ilia = new UserReader("Илья");
        UserLibrarian ivan = new UserLibrarian("Иван");
        UserSupplier dima = new UserSupplier("Дима");
        UserAdministrator kolia = new UserAdministrator("Коля");
        UserSupplierReader timur = new UserSupplierReader("Тимур");
        UserLibrarianAdministrator olha = new UserLibrarianAdministrator("Оля");

        ilia.takesBook("\"Чайка\"");
        ilia.returnsBook("\"Чайка\"");
        ivan.ordersBook(dima, "\"Герой нашего времени\"");
        dima.bringsBook("\"Шинель\"");
        kolia.findsAndGiveBook(ilia, "\"Капитанская дочка\"");
        kolia.deadlineNotice(ilia, "\"Игра перстолов\"");
        ilia.takesBook("\"Преступление и наказание\"");
        timur.bringsBook("\"Последний лист\"");
        timur.takesBook("\"Евгений Онегин\"");
        olha.ordersBook(timur, "\"Ревизор\"");
    }
}