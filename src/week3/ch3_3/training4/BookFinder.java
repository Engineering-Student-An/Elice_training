package week3.ch3_3.training4;

import java.util.List;
import java.util.stream.Collectors;


public class BookFinder {

    public static List<Book> findBooksPublishedAfter(List<Book> books, int year) {
        // 지시 사항을 참고하여 코드를 작성하세요.
        return books.stream()
                .filter(b -> b.getYearOfPublication() > year)
                .collect(Collectors.toList());
    }

    public static List<Book> findBooksWithMorePagesThan(List<Book> books, int numberOfPages) {
        // 지시 사항을 참고하여 코드를 작성하세요.
        return books.stream()
                .filter(b -> b.getNumberOfPages() > numberOfPages)
                .collect(Collectors.toList());
    }
}
