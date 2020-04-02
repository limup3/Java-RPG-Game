package 클래스;

import java.io.File;

import javax.sound.sampled.AudioFormat;
import javax.sound.sampled.AudioInputStream;
import javax.sound.sampled.AudioSystem;
import javax.sound.sampled.Clip;
import javax.sound.sampled.DataLine;
public class MediaFight extends Thread {
	public void efg() {
		File bgm;
		AudioInputStream stream;
		AudioFormat format;
		DataLine.Info info;
		
		bgm = new File("C:/Users/KM-notebook/Desktop/팀노바/5주차 자바 쓰레드/wav/Dungeon-01.wav"); // 사용시에는 개별 폴더로 변경할 것
		
		Clip clip;
		
		try {
			stream = AudioSystem.getAudioInputStream(bgm);
			format = stream.getFormat();
			info = new DataLine.Info(Clip.class, format);
			clip = (Clip)AudioSystem.getLine(info);
			clip.open(stream);
			clip.start();
			clip.loop(Clip.LOOP_CONTINUOUSLY);
			
		} catch (Exception e) {
			System.out.println("err : " + e);
			}
		
	}

	public void run() {
		MediaFight test = new MediaFight();
		try {
			
			
				test.efg();
				 
			} catch(Exception e) {
				
			}
		}
}
