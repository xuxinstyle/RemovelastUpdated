package com.xuxin.demo1;
import java.io.File;
import java.io.FileFilter;
 
public class demo1 {
	public static void main(String[] args) {
		String path = "E:\\maven\\repository";		//Ҫ������·��
		File file = new File(path);		//��ȡ��file����
		func(file);
	}
	
	private static void func(File file){
		File[] fs = file.listFiles();
		for(File f:fs){
			if(f.isDirectory())	//����Ŀ¼����ݹ��ӡ��Ŀ¼�µ��ļ�
				func(f);
			if(f.isFile()&&f.getAbsolutePath().contains("lastUpdated"))	//�����ļ���ֱ�Ӵ�ӡ
			{	
				f.delete();
				System.out.println(f);
			}
			
		}
	}
}

