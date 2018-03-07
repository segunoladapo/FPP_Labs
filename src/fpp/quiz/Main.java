package fpp.quiz;

import java.time.LocalDate;
import java.util.Arrays;

public class Main {
    //String name, LocalDate gradDate, float gpa, int rank
    public static void main(String[] args) {
        ApplicantForGradSchool[] applicants = new ApplicantForGradSchool[10];
        applicants[0] = new ApplicantForGradSchool("Joe", LocalDate.of(2014, 6, 15), 3.6f, 3);
        applicants[1] = new ApplicantForGradSchool("Tom", LocalDate.of(2014, 7, 15), 3.2f, 9);
        applicants[2] = new ApplicantForGradSchool("Alice", LocalDate.of(2016, 6, 15), 3.5f, 12);
        applicants[3] = new ApplicantForGradSchool("Rebecca", LocalDate.of(2017, 7, 15), 3.46f, 5);
        applicants[4] = new ApplicantForGradSchool("Rick", LocalDate.of(2012, 1, 15), 3.9f, 2);
        applicants[5] = new ApplicantForGradSchool("Darlene", LocalDate.of(2017, 6, 15), 3.1f, 35);
        applicants[6] = new ApplicantForGradSchool("May", LocalDate.of(2013, 1, 15), 3.5f, 10);
        applicants[7] = new ApplicantForGradSchool("Richard", LocalDate.of(2013, 6, 15), 3.6f, 15);
        applicants[8] = new ApplicantForGradSchool("Mohammed", LocalDate.of(2014, 1, 15), 3.55f, 8);
        applicants[9] = new ApplicantForGradSchool("Sal", LocalDate.of(2016, 6, 15), 3.7f, 9);
        AppAssessor aa = new AppAssessor(applicants);
        ApplicantForGradSchool[] accepted = aa.getAccepted();
        ApplicantForGradSchool[] rejected = aa.getRejected();
        System.out.println("Accepted: " + Arrays.toString(accepted));
        System.out.println("Rejected: " + Arrays.toString(rejected));

    }

}
