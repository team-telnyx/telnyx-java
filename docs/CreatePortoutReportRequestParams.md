

# CreatePortoutReportRequestParams

## oneOf schemas
* [ExportPortoutsCSVReport](ExportPortoutsCSVReport.md)

## Example
```java
// Import classes:
import com.telnyx.sdk.model.CreatePortoutReportRequestParams;
import com.telnyx.sdk.model.ExportPortoutsCSVReport;

public class Example {
    public static void main(String[] args) {
        CreatePortoutReportRequestParams exampleCreatePortoutReportRequestParams = new CreatePortoutReportRequestParams();

        // create a new ExportPortoutsCSVReport
        ExportPortoutsCSVReport exampleExportPortoutsCSVReport = new ExportPortoutsCSVReport();
        // set CreatePortoutReportRequestParams to ExportPortoutsCSVReport
        exampleCreatePortoutReportRequestParams.setActualInstance(exampleExportPortoutsCSVReport);
        // to get back the ExportPortoutsCSVReport set earlier
        ExportPortoutsCSVReport testExportPortoutsCSVReport = (ExportPortoutsCSVReport) exampleCreatePortoutReportRequestParams.getActualInstance();
    }
}
```


