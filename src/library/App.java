/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package library;

import entety.Author;
import entety.Book;
import java.util.Arrays;
import java.util.Scanner;
import managers.BookManager;

/**
 *
 * @author pupil
 */
public class App {
    private Book[] books;

    public App() {
        this.books = new Book[0];
    }
    
    public void run(){
        boolean repeat = true;
        Scanner scanner = new Scanner(System.in);
        do{
            System.out.println("List of exercises");
            System.out.println("0. Close the App");
            System.out.println("1. Add a book");
            System.out.println("2. Add a reader");
            System.out.println("3. Give a book");
            System.out.println("4. Return book");
            System.out.println("5. List of books");
            System.out.print("Choose number of exercise:");
            int task = scanner.nextInt();
            scanner.nextLine();
            System.out.println("-----------------");
            switch(task){
                case 0:
                    repeat = false;
                    break;
                case 1:
                    System.out.println("1. Add a book");
                    BookManager bookManager = new BookManager();
                    this.books = Arrays.copyOf(this.books, this.books.length +1);
                    this.books[this.books.length -1] = bookManager.createBook();
                    break;
                case 2:
                    System.out.println("2. Add a reader ");
                    break;
                case 3:
                    System.out.println("3. give a book");
                    break;
                case 4:
                    System.out.println("Return a book.");
                    break;
                case 5:
                    System.out.println("5. List of books");
                    for (int i = 0; i < books.length; i++){
                        Book book = books[i];
                        System.out.printf( i +1+" Book{title =%s%n ", book.getTitle());
                        System.out.print("\tAuthors = [%n");
                        for (int j = 0; j<book.getAuthor().length; j++){
                            Author author = book.getAuthor()[j];
                            System.out.printf("%s %s%n", author.getFirstname(), author.getLastname());
                        }
                        System.out.println("\t]");
                    }
                    System.out.println("}");
                    System.out.println(Arrays.toString(books));
                    break;
                default:
                    System.out.println("Choose a Exercise from list");
            }
            System.out.println(" ======---------======= ");
        }while(repeat);
        System.out.println("Goodbye, guys !!!");
    }
}
