# UsageReportsBetaApi

All URIs are relative to *https://api.telnyx.com/v2*

Method | HTTP request | Description
------------- | ------------- | -------------
[**getUsageReport**](UsageReportsBetaApi.md#getUsageReport) | **GET** /usage_reports | Get Telnyx product usage data (BETA)
[**listUsageReportsOptions**](UsageReportsBetaApi.md#listUsageReportsOptions) | **GET** /usage_reports/options | Get Usage Reports query options (BETA)



## getUsageReport

> UsageReportsResponse getUsageReport(product, dimensions, metrics, startDate, endDate, dateRange, filter, managedAccounts, pageNumber, pageSize, sort, format, authorizationBearerLessThanTOKENGreaterThan)

Get Telnyx product usage data (BETA)

Get Telnyx usage data by product, broken out by the specified dimensions

### Example

```java
// Import classes:
import com.telnyx.sdk.ApiClient;
import com.telnyx.sdk.ApiException;
import com.telnyx.sdk.Configuration;
import com.telnyx.sdk.auth.*;
import com.telnyx.sdk.model.*;
import com.telnyx.sdk.api.UsageReportsBetaApi;

public class Example {
    public static void main(String[] args) {
        ApiClient defaultClient = Configuration.getDefaultApiClient();
        defaultClient.setBasePath("https://api.telnyx.com/v2");
        
        // Configure HTTP bearer authorization: bearerAuth
        HttpBearerAuth bearerAuth = (HttpBearerAuth) defaultClient.getAuthentication("bearerAuth");
        bearerAuth.setBearerToken("BEARER TOKEN");

        UsageReportsBetaApi apiInstance = new UsageReportsBetaApi(defaultClient);
        String product = "wireless"; // String | Telnyx product
        List<String> dimensions = Arrays.asList(); // List<String> | Breakout by specified product dimensions
        List<String> metrics = Arrays.asList(); // List<String> | Specified product usage values
        String startDate = "2024-02-01T00:00:00Z"; // String | The start date for the time range you are interested in. The maximum time range is 31 days. Format: YYYY-MM-DDTHH:mm:ssZ
        String endDate = "2024-03-01T00:00:00Z"; // String | The end date for the time range you are interested in. The maximum time range is 31 days. Format: YYYY-MM-DDTHH:mm:ssZ
        String dateRange = "today"; // String | A more user-friendly way to specify the timespan you want to filter by. More options can be found in the Telnyx API Reference docs.
        String filter = "filter[currency]=USD"; // String | Filter records on dimensions
        Boolean managedAccounts = false; // Boolean | Return the aggregations for all Managed Accounts under the user making the request.
        Integer pageNumber = 1; // Integer | 
        Integer pageSize = 20; // Integer | 
        List<String> sort = Arrays.asList(); // List<String> | Specifies the sort order for results
        String format = "csv"; // String | Specify the response format (csv or json). JSON is returned by default, even if not specified.
        String authorizationBearerLessThanTOKENGreaterThan = "authorizationBearerLessThanTOKENGreaterThan_example"; // String | 
        try {
            UsageReportsResponse result = apiInstance.getUsageReport(product, dimensions, metrics, startDate, endDate, dateRange, filter, managedAccounts, pageNumber, pageSize, sort, format, authorizationBearerLessThanTOKENGreaterThan);
            System.out.println(result);
        } catch (ApiException e) {
            System.err.println("Exception when calling UsageReportsBetaApi#getUsageReport");
            System.err.println("Status code: " + e.getCode());
            System.err.println("Reason: " + e.getResponseBody());
            System.err.println("Response headers: " + e.getResponseHeaders());
            e.printStackTrace();
        }
    }
}
```

### Parameters


Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **product** | **String**| Telnyx product |
 **dimensions** | **List&lt;String&gt;**| Breakout by specified product dimensions |
 **metrics** | **List&lt;String&gt;**| Specified product usage values |
 **startDate** | **String**| The start date for the time range you are interested in. The maximum time range is 31 days. Format: YYYY-MM-DDTHH:mm:ssZ | [optional]
 **endDate** | **String**| The end date for the time range you are interested in. The maximum time range is 31 days. Format: YYYY-MM-DDTHH:mm:ssZ | [optional]
 **dateRange** | **String**| A more user-friendly way to specify the timespan you want to filter by. More options can be found in the Telnyx API Reference docs. | [optional]
 **filter** | **String**| Filter records on dimensions | [optional]
 **managedAccounts** | **Boolean**| Return the aggregations for all Managed Accounts under the user making the request. | [optional]
 **pageNumber** | **Integer**|  | [optional] [default to 1]
 **pageSize** | **Integer**|  | [optional] [default to 20]
 **sort** | **List&lt;String&gt;**| Specifies the sort order for results | [optional]
 **format** | **String**| Specify the response format (csv or json). JSON is returned by default, even if not specified. | [optional] [enum: csv, json]
 **authorizationBearerLessThanTOKENGreaterThan** | **String**|  | [optional]

### Return type

[**UsageReportsResponse**](UsageReportsResponse.md)

### Authorization

[bearerAuth](../README.md#bearerAuth)

### HTTP request headers

- **Content-Type**: Not defined
- **Accept**: application/json, text/csv

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | Successful |  -  |
| **400** | Bad Request |  -  |
| **500** | Internal Server Error |  -  |


## listUsageReportsOptions

> UsageReportsOptionsResponse listUsageReportsOptions(product, authorizationBearerLessThanTOKENGreaterThan)

Get Usage Reports query options (BETA)

Get the Usage Reports options for querying usage, including the products available and their respective metrics and dimensions

### Example

```java
// Import classes:
import com.telnyx.sdk.ApiClient;
import com.telnyx.sdk.ApiException;
import com.telnyx.sdk.Configuration;
import com.telnyx.sdk.auth.*;
import com.telnyx.sdk.model.*;
import com.telnyx.sdk.api.UsageReportsBetaApi;

public class Example {
    public static void main(String[] args) {
        ApiClient defaultClient = Configuration.getDefaultApiClient();
        defaultClient.setBasePath("https://api.telnyx.com/v2");
        
        // Configure HTTP bearer authorization: bearerAuth
        HttpBearerAuth bearerAuth = (HttpBearerAuth) defaultClient.getAuthentication("bearerAuth");
        bearerAuth.setBearerToken("BEARER TOKEN");

        UsageReportsBetaApi apiInstance = new UsageReportsBetaApi(defaultClient);
        String product = "wireless"; // String | Options (dimensions and metrics) for a given product. If none specified, all products will be returned.
        String authorizationBearerLessThanTOKENGreaterThan = "authorizationBearerLessThanTOKENGreaterThan_example"; // String | 
        try {
            UsageReportsOptionsResponse result = apiInstance.listUsageReportsOptions(product, authorizationBearerLessThanTOKENGreaterThan);
            System.out.println(result);
        } catch (ApiException e) {
            System.err.println("Exception when calling UsageReportsBetaApi#listUsageReportsOptions");
            System.err.println("Status code: " + e.getCode());
            System.err.println("Reason: " + e.getResponseBody());
            System.err.println("Response headers: " + e.getResponseHeaders());
            e.printStackTrace();
        }
    }
}
```

### Parameters


Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **product** | **String**| Options (dimensions and metrics) for a given product. If none specified, all products will be returned. | [optional]
 **authorizationBearerLessThanTOKENGreaterThan** | **String**|  | [optional]

### Return type

[**UsageReportsOptionsResponse**](UsageReportsOptionsResponse.md)

### Authorization

[bearerAuth](../README.md#bearerAuth)

### HTTP request headers

- **Content-Type**: Not defined
- **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | Successful |  -  |
| **400** | Bad Request |  -  |
| **500** | Internal Server Error |  -  |

