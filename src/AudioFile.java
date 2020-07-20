import java.util.Scanner;

public class AudioFile {
	Scanner input=new Scanner(System.in);
	private String AttachAudio;
	private String RecordAudio;
	private  boolean Satisfied;
	
	
	public String getAttachAudio() {
		return AttachAudio;
	}
	public void setAttachAudio(String attachAudio) {
		AttachAudio = attachAudio;
	}
	public String getRecordAudio() {
		return RecordAudio;
	}
	public void setRecordAudio(String recordAudio) {
		RecordAudio = recordAudio;
	}
	
	public void ValidateFormat() {
		if(AttachAudio.equals(".Midi") || AttachAudio.equals(".Mw4")) {
			getAttachAudio();
		}
		else {
			System.out.println("The Audio Format is not valid please input a file ending in 'Midi' or 'Mw4' ");
		}
	}
	
	public void QualityReadable() {
		if(AttachAudio.equals("GoodQuality") || RecordAudio.contentEquals("GoodQuality")) {
			getAttachAudio();
			getRecordAudio();
		}
		else {
			System.out.println("Please Re-Record or Re-Attach the same file or a new file.");
		}
	}
	
	public void RenderAudio() {
		String Rendering=input.next();
		if(Rendering.equals("You did great")) {
			
		String musicRequest=input.next();
		
		}
		else {
			System.out.println("Please Re-Record or Re-Attach the same file or a new file.");

		}
	}
	
	public void ReRecord() {
		
		if(Satisfied) {
			System.out.println("Let's create the music sheet! yay");

		}
		else {
			System.out.println("Re-Record or Re-Attach the same file or a new file.");

		}
	}
	
	

 
	
}


