package week3.ch3_3.training5;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

import static java.util.Arrays.stream;

public class MovieAnalyzer {

    public static double calculateAverageRating(List<Movie> movies) {
        // 지시 사항을 참고하여 코드를 작성해 보세요.
        return movies.stream()
                .flatMap(movie -> movie.getReviews().stream())
                .mapToInt(Review::getRating)
                .average().getAsDouble();
    }

    public static List<Movie> findMoviesWithRatingAbove(List<Movie> movies, int rating) {
        // 지시 사항을 참고하여 코드를 작성해 보세요.
        return movies.stream()
                .filter(movie -> movie.getReviews().stream()
                        .mapToInt(review -> review.getRating())
                        .average().orElse(0) > rating)
                .collect(Collectors.toList());
    }
}
