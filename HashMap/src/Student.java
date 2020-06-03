

public class Student {
	
	private String nume;
	private String prenume;
	private double noterom;
	private double notemate;
	
	public Student(String nume, String prenume, double noterom, double notemate){
		this.nume=nume;
		this.prenume=prenume;
		this.noterom=noterom;
		this.notemate=notemate;
	}
	
	@Override
	public String toString() {
		return "Nume:" + nume + ", Prenume: " + prenume + ", noteromana:[" + noterom + "] ,notemate:[" + notemate + "]";
	}

	public String getNume(){
		return nume;
	}
	
	public String getPrenume(){
		return prenume;
	}
	
	public double getNoterom(){
		return noterom;
	}
	
	public double getNotemate(){
		return notemate;
	}
}

