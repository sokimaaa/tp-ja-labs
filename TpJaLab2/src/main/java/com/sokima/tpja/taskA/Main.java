package com.sokima.tpja.taskA;

public class Main {
    public static void main(String[] args) {
        final Applicant[] applicants = {
                new Applicant(
                        1L,
                        "name1",
                        "surname1",
                        "address",
                        "phone",
                        new Integer[]{60, 70, 80}
                ),
                new Applicant(
                        2L,
                        "name2",
                        "surname2",
                        "address",
                        "phone",
                        new Integer[]{65, 75, 85}
                ),
                new Applicant(
                        3L,
                        "name3",
                        "surname3",
                        "address",
                        "phone",
                        new Integer[]{55, 60}
                ),
                new Applicant(
                        4L,
                        "name4",
                        "surname4",
                        "address",
                        "phone",
                        new Integer[]{30}
                )
        };

        final Applicant[] applicantsWithBadScores = ApplicantUtils.getApplicantsWithBadScores(applicants);
        final Applicant[] applicantsWithTopScore = ApplicantUtils.getApplicantsWithTopScore(applicants, 2);
        final Applicant[] applicantsWithScoreHigherThen = ApplicantUtils.getApplicantsWithScoreHigherThen(applicants, 60);

        ApplicantUtils.printApplicant(applicantsWithBadScores);
        ApplicantUtils.printApplicant(applicantsWithTopScore);
        ApplicantUtils.printApplicant(applicantsWithScoreHigherThen);
    }
}