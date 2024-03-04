package lotto.model

class LottoNumber(val number: Int) {
    init {
        require(number in MIN_LOTTO_NUMBER..MAX_LOTTO_NUMBER) {
            throw IllegalArgumentException(INVALID_LOTTO_NUMBER_OUT_OF_RANGE)
        }
    }

    override fun equals(other: Any?): Boolean {
        if (this === other) return true
        if (other !is LottoNumber) return false
        return this.number == other.number
    }

    override fun hashCode(): Int {
        return number.hashCode()
    }

    override fun toString(): String {
        return number.toString()
    }

    companion object {
        private const val MIN_LOTTO_NUMBER = 1
        private const val MAX_LOTTO_NUMBER = 45
        const val INVALID_LOTTO_NUMBER_OUT_OF_RANGE =
            ("로또 번호가 $MIN_LOTTO_NUMBER~$MAX_LOTTO_NUMBER 사이의 숫자가 아닌 경우 예외처리한다.")
    }
}
