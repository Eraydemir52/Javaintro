
public class Main {

	public static void main(String[] args) {
		Student student = new Student();
		student.id=1;
		student.lesson="Java1";
		student.name="Eray";
		student.surName="Demir";
		student.viewRate=30;
		
		
		StudentManager studentManager= new StudentManager();
		studentManager.register(student);

	}

}
