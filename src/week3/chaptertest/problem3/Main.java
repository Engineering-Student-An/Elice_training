package week3.chaptertest.problem3;

import java.util.Arrays;
import java.util.List;

import static week3.chaptertest.problem3.BookAnalyzer.calculateAverageRating;
import static week3.chaptertest.problem3.BookAnalyzer.findBooksWithRatingAbove;


public class Main {
    public static void main(String[] args) {
        // 책 및 리뷰 데이터 초기화
        Book book1 = new Book("Harry Potter", "J.K. Rowling", Arrays.asList(new Review(5, "Amazing!"), new Review(4, "Great!")));
        Book book2 = new Book("The Hobbit", "J.R.R. Tolkien", Arrays.asList(new Review(5, "Excellent!"), new Review(3, "Good!")));
        Book book3 = new Book("1984", "George Orwell", Arrays.asList(new Review(3, "Thought-provoking"), new Review(4, "Interesting")));
        List<Book> books = Arrays.asList(book1, book2, book3);

        // 평균 평점 계산
        double averageRating = calculateAverageRating(books);
        System.out.printf("🎯 전체 책 평점: %.2f\n", averageRating);

        // 특정 평점 이상의 책 찾기
        int ratingThreshold = 4;
        List<Book> highRatedBooks = findBooksWithRatingAbove(books, ratingThreshold);
        System.out.println("\n📌 " + ratingThreshold + "점 이상의 책 목록:");
        highRatedBooks.forEach(book -> System.out.println(book.getTitle() + " - " + book.getAuthor()));
    }
}
