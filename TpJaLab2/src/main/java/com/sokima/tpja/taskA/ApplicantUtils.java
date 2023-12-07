package com.sokima.tpja.taskA;

import java.util.Arrays;
import java.util.Comparator;

public final class ApplicantUtils {

    private ApplicantUtils() {
        throw new UnsupportedOperationException("Util class shouldn't be instantiated");
    }

    public static void printApplicant(final Applicant[] applicants) {
        System.out.println("Applicants : " + Arrays.toString(applicants));
    }

    public static Applicant[] getApplicantsWithBadScores(final Applicant[] applicants) {
        return Arrays.stream(applicants)
                .filter(applicant -> isBadScores(applicant.getScores()))
                .toArray(Applicant[]::new);
    }

    public static Applicant[] getApplicantsWithScoreHigherThen(final Applicant[] applicants, final Integer score) {
        return Arrays.stream(applicants)
                .filter(applicant -> isScoreHigherThen(applicant.getScores(), score))
                .toArray(Applicant[]::new);
    }

    public static Applicant[] getApplicantsWithTopScore(final Applicant[] applicants, final Integer numberApplicant) {
        return Arrays.stream(applicants)
                .sorted(
                        Comparator.<Applicant>comparingDouble(applicant -> calculateAverageScore(applicant.getScores())).reversed()
                )
                .limit(numberApplicant)
                .toArray(Applicant[]::new);
    }

    private static final Integer LOWER_BAD_SCORE = 60;

    private static boolean isBadScores(final Integer[] scores) {
        return !isScoreHigherThen(scores, LOWER_BAD_SCORE);
    }

    private static boolean isScoreHigherThen(final Integer[] scores, final Integer score) {
        return calculateAverageScore(scores) > score;
    }

    private static Double calculateAverageScore(final Integer[] scores) {
        return Arrays.stream(scores)
                .mapToInt(x -> x)
                .average()
                .orElse(0);
    }
}
