
import java.util.ArrayList;
import java.util.List;
public class Database {

	public static List<String> processedFiles= new ArrayList<String>();
	
	public static void addProcessedFile (String File) {		
		processedFiles.add(File);
	}
}

	
