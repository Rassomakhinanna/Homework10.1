public class Book {
        public String BookName;
        public int yearPublish;
        public String author;

        public Book (String BookName, int i, Author author) {
            this.BookName = BookName;
            this.yearPublish = yearPublish;
            this.author = this.author;
        }
        public void setYearPublish(int yearPublish){
            this.yearPublish = yearPublish;
        }

        public String getBookName() {
            return BookName;
        }

        public int getYearPublish() {
            return yearPublish;
        }

        public String getAuthor() {
            return author;
        }
    }