public interface Administrator {
    void findsAndGiveBook(UserReader reader, String bookName);

    void deadlineNotice(UserReader reader, String bookName);
}