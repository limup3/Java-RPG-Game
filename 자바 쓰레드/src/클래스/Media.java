package Ŭ����;

import java.io.File;

import javax.sound.sampled.AudioFormat;
import javax.sound.sampled.AudioInputStream;
import javax.sound.sampled.AudioSystem;
import javax.sound.sampled.Clip;
import javax.sound.sampled.DataLine;
import javax.sound.sampled.FloatControl;

public class Media extends Thread {
	

	
File bgm;
AudioInputStream stream;
AudioFormat format;
DataLine.Info info;
Clip clip;

	public void Music(String Song) {
		
//		bgm = new File("C:/Users/KM-notebook/Desktop/�����/5���� �ڹ� ������/wav/Adventure-Master-Title.wav"); // ���ÿ��� ���� ������ ������ ��
		bgm = new File(Song);
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
	public void One(String Song)
	{
//		bgm = new File("C:/Users/KM-notebook/Desktop/�����/5���� �ڹ� ������/wav/Adventure-Master-Title.wav"); // ���ÿ��� ���� ������ ������ ��
		bgm = new File(Song);
		try {
			stream = AudioSystem.getAudioInputStream(bgm);
			format = stream.getFormat();
			info = new DataLine.Info(Clip.class, format);
			clip = (Clip)AudioSystem.getLine(info);
			clip.open(stream);
			clip.start();

		} catch (Exception e) {
			System.out.println("err : " + e);
			}
		
	}
	
	public void Volume(String Song, float i)
	{
		bgm = new File(Song);
		try {
			stream = AudioSystem.getAudioInputStream(bgm);
			format = stream.getFormat();
			info = new DataLine.Info(Clip.class, format);
			clip = (Clip)AudioSystem.getLine(info);
			clip.open(stream);
			FloatControl gainControl = (FloatControl) clip.getControl(FloatControl.Type.MASTER_GAIN);
			gainControl.setValue(i);
			clip.start();
			

		} catch (Exception e) {
			System.out.println("err : " + e);
			}
		
	}
	
	
	public void run() {
		Media test = new Media();
		
		
		
	}		
	public void Stop(){
		clip.stop();
		clip.close();
		}
	
	



}

//public void abc() {
//	
//	File bgm;
//	AudioInputStream stream;
//	AudioFormat format;
//	DataLine.Info info;
//	Clip clip;
//	bgm = new File("C:/Users/KM-notebook/Desktop/�����/5���� �ڹ� ������/wav/Adventure-Master-Title.wav"); // ���ÿ��� ���� ������ ������ ��
//	
//	
//	
//	try {
//		stream = AudioSystem.getAudioInputStream(bgm);
//		format = stream.getFormat();
//		info = new DataLine.Info(Clip.class, format);
//		clip = (Clip)AudioSystem.getLine(info);
//		clip.open(stream);
//		clip.start();
//		clip.loop(Clip.LOOP_CONTINUOUSLY);
//
//	} catch (Exception e) {
//		System.out.println("err : " + e);
//		}
//	
//}
//
//public void run() {
//	MediaTitle test = new MediaTitle();
//	
//		try {
//			test.abc();
//			 
//		} catch(Exception e) {
//			
//		}
//	}
