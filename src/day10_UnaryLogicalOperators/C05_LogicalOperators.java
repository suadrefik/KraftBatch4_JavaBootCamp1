package day10_UnaryLogicalOperators;

public class C05_LogicalOperators {
    public static void main(String[] args) {

        String name = "Ayse";
        int age = 34;
        String  citizen = "Turkey";

        boolean isEligibleVote = age>=18 && citizen == "Turkey";

        System.out.println(name + " is eligible to vote: "+isEligibleVote );

        System.out.println("---------------");

        String name2 = "Umit";
        int findexScore = 800;
        int age2 = 43;
        int income = 40000;
        boolean isEligibleForLoan = findexScore>=1500 && age2 >=18 && income>=30000;
        System.out.println(name2+" isEligibleForLoan = " + isEligibleForLoan);

        String name3 = "Hatice";
        int age3 = 21;
        char gender = 'F';
        boolean isEligible = age3>=18 && (gender =='M'|| gender =='F');

        System.out.println(name+ " is eligible for xxx: "+isEligible);

        String student = "Ali";
        double gpa = 2.5;
        int familyIncome = 15000;

        boolean isEligibleForScholarship = gpa >=3.5||familyIncome<=20000;
        System.out.println(student+" is eligible for scholarship: "+isEligibleForScholarship);

        boolean result = true;
        System.out.println("result = " + result);
        boolean result1 = !result;
        System.out.println("result1 = " + result1);


        int score = 55;

        boolean passed = score>=60;
        boolean failed = !passed;
        System.out.println("passed = " + passed);
        System.out.println("failed = " + failed);










    }
}
