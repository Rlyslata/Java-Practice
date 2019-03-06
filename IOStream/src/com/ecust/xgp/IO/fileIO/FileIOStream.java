package com.ecust.xgp.IO.fileIO;

import java.io.BufferedInputStream;
import java.io.BufferedOutputStream;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;

import org.junit.Test;

/**
 * 复制from.txt 到  to.txt
 * @author acer
 *
 */
public class FileIOStream {
	@Test
	public static void main(String args[]) throws Exception {
		File from=null;
		FileInputStream fin=null;
		BufferedInputStream  bin=null;
		File to=null;
		FileOutputStream fos=null;
		BufferedOutputStream bos=null;
		try {
			from=new File("/src/com/ecust/xgp/IO/file/from.txt");
//			from=new File("D:\\Ecplise\\JavaProject\\IOStream\\src\\com\\ecust\\xgp\\IO\\file\\from.txt");
			
			if(!from.exists())
			{
				System.out.println("没找到from文件");
				from.createNewFile();
			}
			else {
				System.out.println(from.getPath());
			}
			fin=new FileInputStream(from);
			bin=new BufferedInputStream(fin);
			
			to =new File("../file/to.txt");
//			to =new File("D:\\Ecplise\\JavaProject\\IOStream\\src\\com\\ecust\\xgp\\IO\\file\\to.txt");
			if(!to.exists())
			{
				System.out.println("没找到to.txt");
				to.createNewFile();
			}else {
				System.out.println(to.getPath());
			}
			fos=new FileOutputStream(to);
			bos=new BufferedOutputStream(fos);
			
			int len;
			
			while((len=bin.read())!=-1) {
				bos.write(len);
			}
		}catch(Exception e) {
			e.printStackTrace();
		}finally {
			
//			fin.close();
			bin.close();
//			fos.close();
			bos.close();
		}
	}
}
