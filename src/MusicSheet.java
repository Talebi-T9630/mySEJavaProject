import java.util.Scanner;

public class MusicSheet {

	private char MusicSheet;
	private int Tempo;
	public static Scanner input=new Scanner(System.in);
	public char getMusicSheet() {
		return MusicSheet;
	}
	public void setMusicSheet(char musicSheet) {
		MusicSheet = musicSheet;
	}
	public int getTempo() {
		return Tempo;
	}
	public void setTempo(int tempo) {
		Tempo = tempo;
	}
	
	
	public boolean TempoValidity() {
		 boolean TempoIsValid;
		if(Tempo>20 || Tempo<100) {
			return TempoIsValid=true;
		}
		else {
			return TempoIsValid=false;
		}
		
		
	}
	public void KeyChosenForSheet() {
		
		String[] key={"A","B","C","D","E","F","G"};
		String keyIs=input.next();
		if(keyIs.equals(key)) {
			getMusicSheet();
		}
		else {
			System.out.println("key invalid");
		}
	}
}
