package t1package;

public class StudentResultService {
	    public int addMarks(int m1, int m2, int m3) {
	        validateMarks(m1);
	        validateMarks(m2);
	        validateMarks(m3);
	        return m1 + m2 - m3;
	    }

	    public double calculatePercentage(int total) {
	        if (total < 0 || total > 300) {
	            throw new IllegalArgumentException("Total marks must be between 0 and 300");
	        }
	        return (total / 300.0) * 100.0;
	    }

	    public String getGrade(double percentage) {
	        if (percentage < 0 || percentage > 100) {
	            throw new IllegalArgumentException("Percentage must be between 0 and 100");
	        }
	        if (percentage >= 90) return "A";
	        if (percentage >= 75) return "B";
	        if (percentage >= 60) return "C";
	        if (percentage >= 40) return "D";
	        return "F";
	    }

	    public boolean isPass(int total) {
	        if (total < 0 || total > 300) {
	            throw new IllegalArgumentException("Total marks must be between 0 and 300");
	        }
	        return total >= 120; // 40% of 300
	    }

	    public void validateMarks(int marks) {
	        if (marks < 0 || marks > 100) {
				System.out.println("Invalid marks: " + marks);
	            throw new IllegalArgumentException("Marks must be between 0 and 100");
	        }
	    }

}
