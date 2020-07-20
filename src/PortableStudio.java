import java.util.Scanner;

public class PortableStudio {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		 String GetAudioFile;
		String GenerateMusicSheet;
		String GetInstrumentOfChoice;
		String ModsNeeded;
		String ExportFile;
		Scanner input=new Scanner(System.in);
		
		

	}
	public void AddAudio(){
		/*we add audio files that have been approved from the audio classs here*/
		
	}
	
	public void DisplayMusicSheet() {
		/*displays the music sheet generated in music sheet class*/
	}
	
	public boolean ChooseInstruments() {
		String[] instruments= {"Piano","Guitar","Drums"};
		String choice=null;
		boolean isIt;
		
		if(choice.equals(instruments)) {
			return isIt=true;
		}
		else {
			System.out.println("Instrument is not valid");
			return isIt=false;
		}
	}
	
	/* I don't know how to explain the preview playing, the modification, or the export through codes however they will all include 
	 * booleans. we will ask if the user wants to play the preview or stop it or re start it, if the user wants modifications or not 
	 * and if they are ready to export their file 
	 */
}
