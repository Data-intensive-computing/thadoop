package thadoop.jobtracker;

import java.net.InetAddress;
import java.util.List;
import java.util.Map;

import thadoop.s3.FileMetaData;
/*
 * Combines files according to its location
 * default size is 64MB
 */
public class CombimeFiles {
	private List<FileMetaData> fileMetaData;
	private int chuckSizeInMB = 64;
	
	public CombimeFiles(List<FileMetaData> fileMetaData){
		this.fileMetaData = fileMetaData;
	}
	public CombimeFiles(List<FileMetaData> fileMetaData,int chuckSizeInMB){
		this.fileMetaData = fileMetaData;
		this.chuckSizeInMB = chuckSizeInMB;
	}
	public Map<InetAddress,List<FileMetaData>> groupFiles(){
		return null;
	}
}
