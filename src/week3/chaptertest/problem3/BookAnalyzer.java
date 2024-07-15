package week3.chaptertest.problem3;


import java.util.List;
import java.util.stream.Collectors;

public class BookAnalyzer {

    public static double calculateAverageRating(List<Book> books) {
        // 지시 사항을 참고하여 코드를 작성해 보세요.
        return books.stream()
                .flatMap(book -> book.getReviews().stream())
                .mapToInt(Review::getRating)
                .average().getAsDouble();
    }

    public static List<Book> findBooksWithRatingAbove(List<Book> books, int rating) {
        // 지시 사항을 참고하여 코드를 작성해 보세요.
        return books.stream()
                .filter(book -> book.getReviews().stream()
                        .mapToInt(Review::getRating)
                        .average().orElse(0) >= rating)
                .collect(Collectors.toList());
    }
}
