@Component
public class DataLoader implements CommandLineRunner {
    private final BookRepository bookRepo;
    private final AuthorRepository authorRepo;

    public DataLoader(BookRepository bookRepo, AuthorRepository authorRepo) {
        this.bookRepo = bookRepo;
        this.authorRepo = authorRepo;
    }

    @Override
    public void run(String... args) throws Exception {
        Author author = new Author(); author.setName("Joshua Bloch");
        authorRepo.save(author);

        Book b1 = new Book(); b1.setTitle("Effective Java"); b1.setPrice(750); b1.setAuthor(author); b1.setPublishedDate(new Date());
        Book b2 = new Book(); b2.setTitle("Java Puzzles"); b2.setPrice(350); b2.setAuthor(author); b2.setPublishedDate(new Date());

        bookRepo.saveAll(List.of(b1, b2));

        System.out.println("🔍 HQL Title Search:");
        bookRepo.searchByTitle("Java").forEach(b -> System.out.println(b.getTitle()));

        System.out.println("📚 HQL Fetch Author:");
        System.out.println(bookRepo.findBookWithAuthor("Effective Java").getAuthor().getName());

        System.out.println("📊 HQL Average Price: " + bookRepo.getAverageBookPrice());

        System.out.println("💲 Native Books < 500:");
        bookRepo.findBooksCheaperThan(500).forEach(b -> System.out.println(b.getTitle()));

        System.out.println("🧮 Native Count: " + bookRepo.getBookCountNative());
    }
}
