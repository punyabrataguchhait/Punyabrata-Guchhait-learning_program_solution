public interface BookRepository extends JpaRepository<Book, Long> {

    //  HQL (JPQL) - find books by title
    @Query("SELECT b FROM Book b WHERE b.title LIKE %:keyword%")
    List<Book> searchByTitle(@Param("keyword") String keyword);

    //  HQL - fetch join with author
    @Query("SELECT b FROM Book b JOIN FETCH b.author WHERE b.title = :title")
    Book findBookWithAuthor(@Param("title") String title);

    //  HQL - aggregate function (AVG)
    @Query("SELECT AVG(b.price) FROM Book b")
    Double getAverageBookPrice();

    //  HQL - books published after a date
    @Query("SELECT b FROM Book b WHERE b.publishedDate > :date")
    List<Book> findPublishedAfter(@Param("date") Date date);

    //  Native SQL - get books under a price
    @Query(value = "SELECT * FROM book WHERE price < :maxPrice", nativeQuery = true)
    List<Book> findBooksCheaperThan(@Param("maxPrice") double price);

    //  Native SQL - get count
    @Query(value = "SELECT COUNT(*) FROM book", nativeQuery = true)
    long getBookCountNative();
}
