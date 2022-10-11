/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package managers;

/**
 *
 * @author pupil
 */
import entety.Author;
import entety.Book;
import java.util.Scanner;
public class BookManager {
    private Scanner scanner;

    public BookManager() {
        this.scanner = new Scanner(System.in);
    }
    
    public Book createBook(){
        Book book = new Book();
        System.out.println("Write name of book");
        book.setTitle(scanner.nextLine());
        System.out.println("Write count authors by books:  ");
        int countAuthorsInBook = scanner.nextInt();
        scanner.nextLine(); 
        book.setAuthors(createAuthors(countAuthorsInBook));
        return book;
    }
    private Author[] createAuthors (int countAuthorsinBook){
        Author[] authors = new Author[countAuthorsinBook];
        for (int i = 0; i<countAuthorsinBook; i++){
            Author author = new Author();
            System.out.println("Name of authors " + (i+1) + ":");
            author.setFirstname(scanner.nextLine());
            System.out.println("Surname of author " + (i+1) + ": ");
            author.setLastname(scanner.nextLine());
            authors[i] = author; 
        }
        return authors;
    }
}
