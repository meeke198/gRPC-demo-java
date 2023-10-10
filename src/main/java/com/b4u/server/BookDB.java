package com.b4u.server;
import java.util.Map;
import java.util.HashMap;
import com.b4u.grpc.book.model.Book;
public class BookDB {
    static Map<String, Book> bookMap = new HashMap<>();
    static{
        bookMap.put("Great Gatsby1",Book.newBuilder().setName("Great Gatsby1")
                .setAuthor("Scott")
                .setPrice(100)
                .build());
        bookMap.put("Great Gatsby2",Book.newBuilder().setName("Great Gatsby2")
                .setAuthor("Scott")
                .setPrice(400)
                .build());
        bookMap.put("Great Gatsby3",Book.newBuilder().setName("Great Gatsby3")
                .setAuthor("Scott")
                .setPrice(500)
                .build());
        bookMap.put("Great Gatsby4",Book.newBuilder().setName("Great Gatsby4")
                .setAuthor("Smith")
                .setPrice(200)
                .build());
        bookMap.put("Great Gatsby5",Book.newBuilder().setName("Great Gatsby5")
                .setAuthor("Smith")
                .setPrice(300)
                .build());
    }

}