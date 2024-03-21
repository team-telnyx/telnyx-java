

# CreatePortingReportRequestParams

## oneOf schemas
* [ExportPortingOrdersCSVReport](ExportPortingOrdersCSVReport.md)

## Example
```java
// Import classes:
import com.telnyx.sdk.model.CreatePortingReportRequestParams;
import com.telnyx.sdk.model.ExportPortingOrdersCSVReport;

public class Example {
    public static void main(String[] args) {
        CreatePortingReportRequestParams exampleCreatePortingReportRequestParams = new CreatePortingReportRequestParams();

        // create a new ExportPortingOrdersCSVReport
        ExportPortingOrdersCSVReport exampleExportPortingOrdersCSVReport = new ExportPortingOrdersCSVReport();
        // set CreatePortingReportRequestParams to ExportPortingOrdersCSVReport
        exampleCreatePortingReportRequestParams.setActualInstance(exampleExportPortingOrdersCSVReport);
        // to get back the ExportPortingOrdersCSVReport set earlier
        ExportPortingOrdersCSVReport testExportPortingOrdersCSVReport = (ExportPortingOrdersCSVReport) exampleCreatePortingReportRequestParams.getActualInstance();
    }
}
```


