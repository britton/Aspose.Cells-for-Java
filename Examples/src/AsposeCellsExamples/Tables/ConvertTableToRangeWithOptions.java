package AsposeCellsExamples.Tables;

import com.aspose.cells.TableToRangeOptions;
import com.aspose.cells.Workbook;
import AsposeCellsExamples.Utils;

public class ConvertTableToRangeWithOptions {
	public static void main(String[] args) throws Exception {
		// ExStart:1
		// The path to the documents directory.
		String dataDir = Utils.getSharedDataDir(ConvertTableToRangeWithOptions.class) + "Tables/";
		// Open an existing file that contains a table/list object in it
		Workbook wb = new Workbook(dataDir + "book1.xlsx");
		
		TableToRangeOptions options = new TableToRangeOptions();
        options.setLastRow(5);

		// Convert the first table/list object (from the first worksheet) to normal range
		wb.getWorksheets().get(0).getListObjects().get(0).convertToRange(options);

		// Save the file
		wb.save(dataDir + "ConvertTableToRange_out.xlsx");
		// ExStart:1
		
		System.out.println("ConvertTableToRangeWithOptions executed successfully.");
	}
}
