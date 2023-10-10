package com.b4u.server;

import com.b4u.grpc.book.model.*;
import io.grpc.stub.StreamObserver;
import io.grpc.Status;

import java.util.Collections;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

public class BookService extends BookServiceGrpc.BookServiceImplBase {
    @Override
    public void searchByAuthor(SearchRequest request, StreamObserver<Book> responseObserver) {
        for(Map.Entry<String, Book> book : BookDB.bookMap.entrySet()) {
          if(book.getValue().getAuthor().startsWith(request.getAuthor())){
              responseObserver.onNext(book.getValue());
          }
        }

        responseObserver.onCompleted();
    }
    @Override
    public void getListBook(SearchRequest request, StreamObserver<Books> responseObserver) {
        String author = request.getAuthor();
        List<Book> booksList = BookDB.bookMap.entrySet()
                .stream()
                .filter(book -> book.getValue().getAuthor().startsWith(author))
                .map(Map.Entry::getValue)
                .collect(Collectors.toList());
       Books books = Books.newBuilder()
                       .addAllBook(booksList).build();
       responseObserver.onNext(books);
        responseObserver.onCompleted();
    }
}
