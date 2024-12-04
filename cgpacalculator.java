import java.util.*;
public class cgpacalculator {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int dcmCredits = 4;
        int cnCredits = 3;
        int dbmsCredits = 3;
        int idsCredits = 3;
        int javaCredits = 3;
        int agileCredits = 4;
        int javaLabCredits = 2;
        int dbmsLabCredits = 2;
        int ssCredits = 1;// this is a comment
        System.out.print("Enter grade point for DCM: ");
        double dcmGradePoint = scanner.nextDouble();
        
        System.out.print("Enter grade point for CN: ");
        double cnGradePoint = scanner.nextDouble();
        
        System.out.print("Enter grade point for DBMS: ");
        double dbmsGradePoint = scanner.nextDouble();
        
        System.out.print("Enter grade point for IDS: ");
        double idsGradePoint = scanner.nextDouble();
        
        System.out.print("Enter grade point for Java: ");
        double javaGradePoint = scanner.nextDouble();
        
        System.out.print("Enter grade point for Agile: ");
        double agileGradePoint = scanner.nextDouble();
        
        System.out.print("Enter grade point for Java Lab: ");
        double javaLabGradePoint = scanner.nextDouble();
        
        System.out.print("Enter grade point for DBMS Lab: ");
        double dbmsLabGradePoint = scanner.nextDouble();
        
        System.out.print("Enter grade point for SS: ");
        double ssGradePoint = scanner.nextDouble();

        double totalGradePoints = (dcmGradePoint * dcmCredits) +
                                   (cnGradePoint * cnCredits) +
                                   (dbmsGradePoint * dbmsCredits) +
                                   (idsGradePoint * idsCredits) +
                                   (javaGradePoint * javaCredits) +
                                   (agileGradePoint * agileCredits) +
                                   (javaLabGradePoint * javaLabCredits) +
                                   (dbmsLabGradePoint * dbmsLabCredits) +
                                   (ssGradePoint * ssCredits);

        int totalCredits = dcmCredits + cnCredits + dbmsCredits + idsCredits + javaCredits + agileCredits + javaLabCredits + dbmsLabCredits + ssCredits;
        System.out.printf("Your CGPA is: "+totalGradePoints / totalCredits);

    }
}
