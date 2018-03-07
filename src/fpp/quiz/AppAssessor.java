package fpp.quiz;

import java.time.LocalDate;

/**
 * Evaluates applications for graduate school.
 * Separates applications into groups "accepted" and "rejected"
 */
public final class AppAssessor {
    private final ApplicantForGradSchool[] applicants;
    private ApplicantForGradSchool[] accepted;
    private ApplicantForGradSchool[] rejected;
    public AppAssessor(ApplicantForGradSchool[] applicants) {
        this.applicants = applicants;
        evaluateApplicants();
    }

    private void evaluateApplicants() {
        ApplicantForGradSchool[] acceptedTemp = new ApplicantForGradSchool[applicants.length];
        ApplicantForGradSchool[] rejectedTemp = new ApplicantForGradSchool[applicants.length];
        int acceptedLength = 0;
        int rejectedLength = 0;
        for(int i = 0; i < applicants.length; ++i) {
            ApplicantForGradSchool a = applicants[i];
            LocalDate graduationDate = a.getBachelorsGraduationDate();
            float gpa = a.getGpa();
            int rank = a.getClassRank();
            if(graduationDate.getYear() > AppConstants.MINIMUM_YEAR_OF_GRADUATION
                    && gpa > AppConstants.ACCEPTABLE_CGPA
                    && AppConstants.MINIMUM_RANK < rank && rank < AppConstants.MINIMUM_RANK) {
                acceptedTemp[acceptedLength++] = a;
            } else {
                rejectedTemp[rejectedLength++] = a;
            }
        }
        accepted = new ApplicantForGradSchool[acceptedLength];
        rejected = new ApplicantForGradSchool[rejectedLength];
        System.arraycopy(acceptedTemp, 0, accepted, 0, acceptedLength);
        System.arraycopy(rejectedTemp, 0, rejected, 0, rejectedLength);
    }

    public ApplicantForGradSchool[] getApplicants() {
        return applicants.clone();
    }

    public ApplicantForGradSchool[] getAccepted() {
        return accepted.clone();
    }

    public ApplicantForGradSchool[] getRejected() {
        return rejected.clone();
    }

}
