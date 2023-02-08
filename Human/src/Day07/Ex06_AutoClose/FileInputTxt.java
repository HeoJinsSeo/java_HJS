package Day07.Ex06_AutoClose;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

public class FileInputTxt {

	public static void main(String[] args) {
		
		//스트림
		// : 실제입력이나 출력이 표현된 데이터 흐름
		
		// 입력 받을 수 있는 데이터
		// : 키보드로부터 입력한 키, 파일 등
		
		//[프로그램]<--[스트림]<--(키보드),(파일)
		
		
		//입력 스트림 클래스 : InputStream
		//파일 입력 스트림 클래스 : FileInputStream
		
		FileInputStream fis = null;
		
		try {
			fis = new FileInputStream("test.txt");
			
			int read = 0;
			
			while ((read = fis.read())!=-1) {
				
				System.out.print((char)read);
			}
		} catch(FileNotFoundException e) {
			
			
			e.printStackTrace();
			System.err.println("파일을 찾을 수 없습니다.");
				
		} catch(IOException e) {
			
			//FileNotFoundException : 파일이 없을 때 발생하는 예외
			// 예외 발생 원인을 찾아 단계별로 예외 메시지를 출력
			
			e.printStackTrace();
			System.err.println("입출력 관련 예외 발생");
		}
		
		finally {
			
			if(fis != null) {
				
				try {
					fis.close();
				}catch(IOException e) {
					e.printStackTrace();
				}
			}
			
		}
		
		
	}
	
	
}
