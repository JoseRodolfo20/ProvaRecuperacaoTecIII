
public class ProcessData {

	
	public static ErrorCode processFile(String filePath) {
		
		if(filePath.isEmpty()) {
			return ErrorCode.FILEDNOTFOUND;
		}
		else if(filePath.length()< 5 || filePath.length()> 5 ) {
		return ErrorCode.VALIDATION;
	}
	else {
		Database.addProcessedFile(filePath);
		return null;
	}
		
		
}}