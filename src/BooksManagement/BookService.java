package BooksManagement;

public class BookService {
    public Book[] filterBooksByAuthor(Author author, Book[] books) {
    	
    	if (author == null || books == null) {
			return new Book[0];
		}
    	
    	int iCounter = 0;
		
    	for(Book b: books) {
    		for(Author a:b.getAuthors()) {
    		if (author.equals(a)){
    			
    			iCounter++;
    		}
}
    		
    		
    		
    	}
    	Book[] filteredBooksAuthor = new Book[iCounter];
    	int index = 0;
    	for(Book b:books) {
    	for(Author a:b.getAuthors()) {
    		if (author.equals(a)){
    			
    			filteredBooksAuthor[index++]=b;
    		}
}}
  
    	return filteredBooksAuthor;
	}

	public Book[] filterBooksByPublisher(Publisher publisher, Book[] books) {
		if (publisher == null || books == null) {
			return new Book[0];
		}

		int iCounter = 0;
    	
    	for (Book b: books) {
    		
    		if(b.getPublisher().equals(publisher))
    			iCounter++;
    		
    	}
    	int index=0;
    	Book[] filteredBooksPublisher = new Book[iCounter];
    	for (Book b: books) {
    		
    		if(b.getPublisher().equals(publisher))
    			filteredBooksPublisher[index++]=b;
    		
    	}
    		
    		
    	return filteredBooksPublisher;
		
		
	}

	public Book[] filterBooksAfterSpecifiedYear(int yearFromInclusively, Book[] books) {
		
		if (books == null) {
			return new Book[0];
		};
		int iCounter = 0;
		
		
    	for (Book b: books) {
    		
    		if(b.getPublishingYear()>=yearFromInclusively)
    			iCounter++;
    	}
    	Book[] filteredBooksPAfterYear = new Book[iCounter];
    	int index = 0;
    	for (Book b: books) {
    		
    		if(b.getPublishingYear()>=yearFromInclusively)
    			filteredBooksPAfterYear[index++]=b;
    	}
    		
    	return filteredBooksPAfterYear;

	}
	
}