package util

enum class ErrorCode(val status: Int, private val message: String) {
    INVALID_PURCHASE_AMOUNT_RANGE(1000, "구입 금액이 1,000원 이상의 숫자가 아닌 경우 예외 처리한다."),
    INVALID_PURCHASE_AMOUNT_UNIT(1001, "구입 금액이 1,000원으로 나누어 떨어지지 않는 경우 예외 처리한다."),
    INVALID_PURCHASE_SIZE_OF_MANUAL_LOTTO(1002, "수동 로또 수가 0 이상의 숫자가 아닌 경우 예외 처리한다."),
    INVALID_PURCHASE_SIZE_OF_MANUAL_LOTTO_AMOUNT(1003, "수동 로또 수가 구입 금액보다 많은 경우 예외 처리한다."),
    INVALID_WINNING_NUMBER_RANGE(1004, "당첨 번호가 1~45사이의 숫자가 아닌 경우 예외 처리한다."),
    INVALID_WINNING_NUMBERS_SIZE(1005, "당첨 번호의 개수가 6개가 아닌 경우 예외 처리한다."),
    INVALID_WINNING_NUMBERS_DUPLICATE(1006, "당첨 숫자가 중복되는 경우 예외 처리한다."),
    INVALID_BONUS_NUMBER_RANGE(1007, "보너스 번호가 1~45사이의 숫자가 아닌 경우 예외 처리한다."),
    INVALID_BONUS_NUMBER_DUPLICATE(1008, "보너스 번호가 당첨 숫자와 중복되는 경우 예외 처리한다."),
    ;

    fun getMessage() = "[ERROR] $message"
}
