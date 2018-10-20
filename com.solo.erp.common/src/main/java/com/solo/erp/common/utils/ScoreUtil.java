package com.solo.erp.common.utils;

import java.math.BigDecimal;

public class ScoreUtil {

    public static final int SCORE_EXCHANGE_RATE = 100;

    public static BigDecimal transferScoreToAmount(BigDecimal score) {
        return score.divide(new BigDecimal(SCORE_EXCHANGE_RATE), 2, BigDecimal.ROUND_DOWN).setScale(2);
    }

    public static BigDecimal transferAmountToScore(BigDecimal amount) {
        return amount.multiply(new BigDecimal(SCORE_EXCHANGE_RATE)).setScale(2);
    }
}
