//package jp03.part05;

import java.io.*;

/*
	==>FileCopy �ϴ� Application�� �ۼ�
	1. Keyboard �� FileName�� �Է�
	2. File�� ������ read() ==> FileReader
	3. File�� ������ write() ==> FileWriter
*/

public class FileWriterTestFilter01{

	//main
	public static void main(String[] args) throws IOException{
		
		//�ʿ䰴ü Stream/String �ν��Ͻ� declaration
		BufferedReader br = null;
		BufferedReader bw = null;
		String fileName = "";
		String copyFileName = "";
		
		int readCount = 0; //read �� Count�ϱ� ���� ����

		System.out.println("copy�� file�̸��� �Է��ϼ��� : ");
		//copy�� FileName�� �Է¹ޱ�
		fileName = new BufferedReader(new InputStreamReader(System.in)).readLine();

		//==> ���� ���� Data�� read�� �� �ִ� BufferedReader ����
		br = new BufferedReader( new FileReader(fileName));


		//==> �纻���� �̸� �����
		copyFileName = fileName + "_copy";
		//==> Data�� Write�� �� �ִ� BufferedWriter ����
		bw = new BufferedWriter(new FileWriter(copyFileName));

		// read / writer�ϴ� while��
		String source = null;
		while( (source = br.readLine() ) != null ){
			bw.write(source);
			readCount++;
		}
		bw.flush();

		//Stream close()
		bw.close();
		br.close();

		System.out.println("=============================================");
		System.out.println("=========> read Ƚ�� read Count: " + readCount);
		System.out.println("=============================================");

	}//end of main

} // end of class