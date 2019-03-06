package com.ecust.xgp.IO.fileIO;

import java.io.File;

import org.junit.Test;

public class FilePath {
	@Test
	public void test() throws Exception {
		try {
			File fileCreateByNo1=new File("");
	        System.out.println("fileCreateByNo=="+fileCreateByNo1);
	        System.out.println("getpath=="+fileCreateByNo1.getPath());
	        System.out.println("getAbsolutePath=="+fileCreateByNo1.getAbsolutePath());
	        System.out.println("fileCreateByNo=="+fileCreateByNo1.getCanonicalPath());
	        System.out.println("-----------------------------");
	        //没有参数
	        
	        //一个点的参数
	        File fileCreateByPoint=new File(".");
	        System.out.println("fileCreateByPoint=="+fileCreateByPoint);
	        System.out.println("fileCreateByPoint=="+fileCreateByPoint.getCanonicalPath());
	        System.out.println("-----------------------------");
	        //两个点的参数
	        File fileTwoPoint = new File("..");  
	        System.out.println("fileTwoPoint=="+fileTwoPoint);
	        System.out.println("fileTwoPoint=="+fileTwoPoint.getCanonicalPath());
	        System.out.println("-----------------------------");
	        //一个点两条斜线的参数
	        File filePLL = new File(".\\");  
	        System.out.println("filePLL=="+filePLL);
	        System.out.println("filePLL=="+filePLL.getCanonicalPath());
	        System.out.println("-----------------------------");
	        //当前工作目录
	        String currentWorkPath=System.getProperty("user.dir");
	        System.out.println("currentWorkPath=="+currentWorkPath);
	        System.out.println("\n\n");
	        File fileCreateByNo=new File(currentWorkPath+"\\src\\com\\ecust\\xgp\\IO\\file\\from.txt");
	        System.out.println("fileCreateByNo=="+fileCreateByNo);
	        System.out.println("getpath=="+fileCreateByNo.getPath());
	        System.out.println("getAbsolutePath=="+fileCreateByNo.getAbsolutePath());
	        System.out.println("fileCreateByNo=="+fileCreateByNo.getCanonicalPath());
	        System.out.println("-----------------------------");
	        }catch(Exception e){
	            System.out.println("IOException....出问题咯");
	        }
	}
}
