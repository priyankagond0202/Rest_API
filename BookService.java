package com.api.book.bootrestbook.services;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import com.api.book.bootrestbook.dao.BookRepository;
import com.api.book.bootrestbook.entities.Book;
@Component
public class BookService {
    @Autowired
    private BookRepository bookRepository;

   // private static List<Book> list = new ArrayList<>();
   // static{
   //     list.add(new Book(12,"java coplete Reference ","james goslin"));
     //   list.add(new Book(36,"head first to java ","james goslin team"));
       // list.add(new Book(23,"think in java ","james"));
   // }
    public List<Book> getAllBooks(){
       List<Book> list = (List<Book>) this.bookRepository.findAll();
        return list ;
    }
    
    public Book getBookById(int id){
        Book book = null;
      book= this.bookRepository.findById(id);
        return book;
    }
    public Book addBook(Book b){
     Book result = bookRepository.save(b);
     return result;
    }

    public void deleteBook(int bid){
        bookRepository.deleteById(bid);
       // list.stream().filter(book->{
         //   if(book.getId()!= bid){
           //     return true;
          //  }//else{
               // return false;
         //   }
       // }).collect(Collectors.toList());
    }

    public void updateBook(Book book , int bookId){
        //list.stream().map(b->{
          //  if(b.getId()== bookId){
            //    b.setTitle(book.getTitle());
              //  b.setAuthor(book.getAuthor());
           // }
        //    return b;
      //  }).collect(Collectors.toList());
      book.setId(bookId);
      bookRepository.save(book);
    }
}
