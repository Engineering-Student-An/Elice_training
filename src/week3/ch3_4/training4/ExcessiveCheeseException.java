package week3.ch3_4.training4;

class ExcessiveCheeseException extends Exception {
    private int maxCheeseAllowed;
    private int requestedCheeseAmount;

    // 지시 사항을 참고하여 코드를 작성해 보세요.
    ExcessiveCheeseException(int maxCheeseAllowed, int requestedCheeseAmount, String message) {
        super(message);
        this.maxCheeseAllowed = maxCheeseAllowed;
        this.requestedCheeseAmount = requestedCheeseAmount;
    }

    public String getDetails() {
        return "요청하신 치즈의 양: " +
                this.getRequestedCheeseAmount() + "g, 주문 가능한 최대 치즈의 양: " +
                this.getMaxCheeseAllowed() + " g";
    }

    public int getMaxCheeseAllowed() {
        return maxCheeseAllowed;
    }

    public int getRequestedCheeseAmount() {
        return requestedCheeseAmount;
    }
}
