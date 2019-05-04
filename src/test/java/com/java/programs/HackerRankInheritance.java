import java.util.*;

class Person {
	protected String firstName;
	protected String lastName;
	protected int idNumber;
	
	// Constructor
	Person(String firstName, String lastName, int identification){
		this.firstName = firstName;
		this.lastName = lastName;
		this.idNumber = identification;
	}
	
	// Print person data
	public void printPerson(){
		 System.out.println(
				"Name: " + lastName + ", " + firstName 
			+ 	"\nID: " + idNumber); 
	}
	 
}

class Student extends Person{
	private int[] testScores;

    /*	
    *   Class Constructor
    *   
    *   @param firstName - A string denoting the Person's first name.
    *   @param lastName - A string denoting the Person's last name.
    *   @param id - An integer denoting the Person's ID number.
    *   @param scores - An array of integers denoting the Person's test scores.
    */
    // Write your constructor here

    /*	
    *   Method Name: calculate
    *   @return A character denoting the grade.
    */
    // Write your method here

    int[] scores;

    public Student(String firstName, String lastName, int id, int[] scores) {
        super(firstName,lastName,id);
        this.scores = scores;
    }

    public char calculate() {
        int totalScore  = 0;
        int average     = 0;
        int id = String.valueOf(idNumber).length();
        for(int i = 0; i < scores.length; i++) {
            totalScore += scores[i];
        }

        average = totalScore/scores.length;

        if(firstName.length() >= 1 && 
            lastName.length() <=10 && 
            id == 7 && 
            totalScore >=0 &&
            average <= 100) 
        {
                if (average >= 90 && average <= 100)
                    return 'O';
                else if (average >= 80 && average <= 90)
                    return 'E';
                else if (average >= 70 && average <= 80)
                    return 'A';
                else if (average >= 55 && average <= 70)
                    return 'P';
                else if (average >= 40 && average <= 55)
                    return 'D';
                else 
                    return 'T';
        } else {
            return Character.MIN_VALUE;
        }
        
    }
}

class Solution {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		String firstName = scan.next();
		String lastName = scan.next();
		int id = scan.nextInt();
		int numScores = scan.nextInt();
		int[] testScores = new int[numScores];
		for(int i = 0; i < numScores; i++){
			testScores[i] = scan.nextInt();
		}
		scan.close();
		
		Student s = new Student(firstName, lastName, id, testScores);
		s.printPerson();
		System.out.println("Grade: " + s.calculate() );
	}
}
