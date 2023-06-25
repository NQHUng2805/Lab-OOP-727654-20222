public class Book extends media{
 
   private List<String> authors = new ArrayList<String>();

   public void addAuthor(String AuthorName){ 
            if (!this.authors.contains(authorName)) {
                this.authors.add(authorName);
            }
   }

   public void addAuthor(String AuthorName){ 
            if (this.authors.contains(authorName)) {
                this.authors.remove(authorName);
            }
   }

   public Book() {
   }