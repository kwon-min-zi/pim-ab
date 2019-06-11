package model;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.Scanner;

import javafx.beans.property.SimpleStringProperty;

public class MemberFileReader {
	Scanner sc = null;
	
	
	public MemberFileReader(File f) throws FileNotFoundException {
		sc = new Scanner(f);
	}
	public ArrayList<Member> readMember() {
		ArrayList<Member> retObj = new ArrayList<Member>();
		while(sc.hasNext()) {
			Member m = new Member();
			String strArr[] = sc.nextLine().split("\t"); //\t로 구분해서 읽음
			m.setUid(strArr[0]);
			m.setUpw(strArr[1]);
			m.setUname(strArr[2]);
			retObj.add(m);			
		}
		return retObj;
	}
}