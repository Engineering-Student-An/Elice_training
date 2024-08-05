package week6.chaptertest.problem1;

public interface DiscountCondition {

    void checkDiscountCondition();
    int applyDiscount(int price);
    boolean isSatisfied();
}
