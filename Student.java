public class Student extends Person{

	int studentId;
	int marks [];
	static ArrayList<Student> ;

	public Student(int studentId, int marks [], int listOfStudents){
		this.studentId = studentId;
		this.marks = marks;
		this.listOfStudents;
	}

	public int getFinalMark(){
		for(i = 0; i < marks.length; i++){
			marks = marks++;
		}
		marks = marks/marks.length;
		return marks;
	}

	public String getGrade(){
		if(this.getFinalMark() >= 70){
			return "A";
		}
		if(this.getFinalMark() >= 60 && this.getFinalMark() <70){
			return "B";
		}
		if(this.getFinalMark() >=50 &&this.getFinalMark() <60){
			return "D";
		}
		if(this.getFinalMark() <50){
			return "F";
		}
	}

	public String toString(){
		for(i = 0; i < listOfStudents.length; i++){
			return "Name: " + this.name + " , Age: " + this.ageStudent + ", ID: "+ studentId + "Final Mark: " + getFinalMark + "Grade: " + getGrade;
		} 
	}
}
