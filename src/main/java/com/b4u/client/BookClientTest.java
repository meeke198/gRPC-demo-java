package com.b4u.client;

import com.b4u.grpc.book.model.Book;
import com.b4u.grpc.book.model.BookServiceGrpc;
import com.b4u.grpc.book.model.Books;
import com.b4u.grpc.book.model.SearchRequest;
import io.grpc.ManagedChannel;
import io.grpc.ManagedChannelBuilder;
import io.grpc.stub.StreamObserver;

import java.util.concurrent.CountDownLatch;

public class BookClientTest {

    public static void main(String[] args) throws InterruptedException {
        ManagedChannel managedChannel = ManagedChannelBuilder
                .forAddress("localhost", 9000)
                .usePlaintext()
                .build();

        searchBookAsync(managedChannel);
//        getListBookAsync(managedChannel);
    }

    private static void searchBookAsync(ManagedChannel managedChannel) throws InterruptedException {
        BookServiceGrpc.BookServiceStub bookServiceStub = BookServiceGrpc.newStub(managedChannel);
        SearchRequest searchRequest = SearchRequest
                .newBuilder().setAuthor("Harper Lee").build();

        CountDownLatch latch = new CountDownLatch(1);
        bookServiceStub.searchByAuthor(searchRequest, new StreamObserver<Book>() {
            @Override
            public void onNext(Book book) {
                System.out.println("Received : " + book);
            }

            @Override
            public void onError(Throwable throwable) {
                throwable.printStackTrace();
                latch.countDown();
            }

            @Override
            public void onCompleted() {
                System.out.println("Server is done!!");
                latch.countDown();
            }
        });
        latch.await();
    }

    private static void getListBookAsync(ManagedChannel managedChannel) throws InterruptedException {
        BookServiceGrpc.BookServiceStub bookServiceStub = BookServiceGrpc.newStub(managedChannel);

        SearchRequest searchRequest = SearchRequest.newBuilder()
                .setAuthor("Scott")
                .build();
        CountDownLatch latch = new CountDownLatch(1);

        bookServiceStub.getListBook(searchRequest, new StreamObserver<Books>() {
            @Override
            public void onNext(Books books) {
                System.out.println("Final Book : " + books.getBookList());
            }

            @Override
            public void onError(Throwable throwable) {
                latch.countDown();
            }

            @Override
            public void onCompleted() {
                System.out.println("Server is done!");
                latch.countDown();
            }
        });
        latch.await();
    }

}