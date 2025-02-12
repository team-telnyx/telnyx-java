# AuditLogsApi

All URIs are relative to *https://api.telnyx.com/v2*

Method | HTTP request | Description
------------- | ------------- | -------------
[**listAuditLogs**](AuditLogsApi.md#listAuditLogs) | **GET** /audit_events | List Audit Logs



## listAuditLogs

> AuditLogList listAuditLogs(pageNumber, pageSize, filterCreatedBefore, filterCreatedAfter, sort)

List Audit Logs

Retrieve a list of audit log entries. Audit logs are a best-effort, eventually consistent record of significant account-related changes.

### Example

```java
import java.time.OffsetDateTime;
// Import classes:
import com.telnyx.sdk.ApiClient;
import com.telnyx.sdk.ApiException;
import com.telnyx.sdk.Configuration;
import com.telnyx.sdk.auth.*;
import com.telnyx.sdk.model.*;
import com.telnyx.sdk.api.AuditLogsApi;

public class Example {
    public static void main(String[] args) {
        ApiClient defaultClient = Configuration.getDefaultApiClient();
        defaultClient.setBasePath("https://api.telnyx.com/v2");
        
        // Configure HTTP bearer authorization: bearerAuth
        HttpBearerAuth bearerAuth = (HttpBearerAuth) defaultClient.getAuthentication("bearerAuth");
        bearerAuth.setBearerToken("BEARER TOKEN");

        AuditLogsApi apiInstance = new AuditLogsApi(defaultClient);
        Integer pageNumber = 1; // Integer | The page number to load
        Integer pageSize = 20; // Integer | The size of the page
        OffsetDateTime filterCreatedBefore = OffsetDateTime.parse("2021-01-01T00:00Z"); // OffsetDateTime | Filter for audit events created before a specific date.
        OffsetDateTime filterCreatedAfter = OffsetDateTime.parse("2021-01-01T00:00Z"); // OffsetDateTime | Filter for audit events created after a specific date.
        String sort = "asc"; // String | Set the order of the results by the creation date.
        try {
            AuditLogList result = apiInstance.listAuditLogs(pageNumber, pageSize, filterCreatedBefore, filterCreatedAfter, sort);
            System.out.println(result);
        } catch (ApiException e) {
            System.err.println("Exception when calling AuditLogsApi#listAuditLogs");
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
 **pageNumber** | **Integer**| The page number to load | [optional] [default to 1]
 **pageSize** | **Integer**| The size of the page | [optional] [default to 20]
 **filterCreatedBefore** | **OffsetDateTime**| Filter for audit events created before a specific date. | [optional]
 **filterCreatedAfter** | **OffsetDateTime**| Filter for audit events created after a specific date. | [optional]
 **sort** | **String**| Set the order of the results by the creation date. | [optional] [enum: asc, desc]

### Return type

[**AuditLogList**](AuditLogList.md)

### Authorization

[bearerAuth](../README.md#bearerAuth)

### HTTP request headers

- **Content-Type**: Not defined
- **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | A list of audit log entries. |  -  |
| **0** | Unexpected error |  -  |

