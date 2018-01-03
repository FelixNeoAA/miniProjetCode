package controlleur;

import java.io.File;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.nio.file.StandardCopyOption;

public class FileManager 
{
	public void copierEtEnregister(String origineChemin, String desChemin) {
		Path origine = Paths.get(origineChemin);
		Path des = Paths.get(desChemin);
		if(!verifierDocument(desChemin))
		{
			try {
				Files.copy(origine, des, StandardCopyOption.COPY_ATTRIBUTES);
				System.out.println("-----拷贝成功 -----");
			} catch (IOException e) {
				e.printStackTrace();
			}
		}		
	}
	
	public boolean verifierDocument(String chemin) 
	{
		File file = new File(chemin);
		boolean verifier = false;
		if (file.exists()) 
		{
			verifier = true;
		}
		return verifier;
	}
	
	public boolean verifierTousLesDocuments(String chemin,String nomDeDocument)
	{
		File file = new File(chemin);
		boolean verifier = false;
		if (file.exists()) 
		{
			File[] fileLists=file.listFiles();
			if(fileLists==null || fileLists.length==0)
			{
				System.out.println("空文件夹");
			}
			for(File subFile:fileLists)
			{
				if(subFile.isDirectory())
				{
					try 
					{
						String cheminSub=subFile.getCanonicalPath();
						verifierTousLesDocuments(cheminSub, nomDeDocument);
					} 
					catch (IOException e) 
					{
						e.printStackTrace();
					}		
				}
				else
				{
					if(subFile.getName().substring(0, subFile.getName().indexOf(".")).equals(nomDeDocument))
					{
						System.out.println("该文件已存在");
						verifier=true;
						break;
					}
				}
			}
		}
		else
		{
			System.out.println("该文件夹不存在");
		}
		return verifier;
	}

	public void creerDir(String dirChemin) {
		File dir = new File(dirChemin);
		if (dir.exists()) {
			System.out.println("创建目录" + dirChemin + " 目标目录已经存在");
		}
		if (!dirChemin.endsWith(File.separator)) {
			dirChemin = dirChemin + File.separator;
		}
		// 创建目录
		if (dir.mkdirs()) {
			System.out.println("创建目录" + dirChemin + "成功！");
		} else {
			System.out.println("创建目录" + dirChemin + "失败！");
		}	
		
	}
}
