  private  static final int MONTHS_IN_A_YEAR = 12;

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter the principal amount:");
        double principal = scanner.nextDouble();

        System.out.println("Enter the annual interest rate: ");
        float annualInterestRate = scanner.nextFloat();

        System.out.println("Enter the term in years: ");
        int termInYears = scanner.nextInt();

        float monthnlyInterstRate = annualInterestRate / MONTHS_IN_A_YEAR;
        int numberOfPayments = termInYears * MONTHS_IN_A_YEAR;

        double montlyPayments = principal * (
                (monthnlyInterstRate *(Math.pow(1+monthnlyInterstRate, numberOfPayments))/
                        (Math.pow(1+monthnlyInterstRate, numberOfPayments)) - 1)
        );
        System.out.println("Monthlu payment" + montlyPayments);


        
    }
}
