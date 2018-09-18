# RemovelastUpdated
删除指定文件夹下的含有响应文件名的文件
private static void func(File file){
		File[] fs = file.listFiles();
		for(File f:fs){
			if(f.isDirectory())	//判断是否为文件夹，如果是文件将爱则继续递归
				func(f);
            //判断是否为文件，如果是文件，则判断该文件名是否包含“lastUpdated”，如果包含了则删除，并输出。
			if(f.isFile()&&f.getAbsolutePath().contains("lastUpdated"))
			{	
				f.delete();
				System.out.println(f);
			}
			
		}
	}
