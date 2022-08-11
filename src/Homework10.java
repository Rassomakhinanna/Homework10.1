public class Homework10 {
    public static void main(String[] args) {
        Author Author = new Author("Victor Hugo");
        Book LM = new Book ("Les Miserables", 1862, Author);
        LM.setYearPublish(1888);
        System.out.println(Author);
        System.out.println(LM);
    }
}
