# DetailRecordsApi

All URIs are relative to *https://api.telnyx.com/v2*

Method | HTTP request | Description
------------- | ------------- | -------------
[**detailRecordsSearch**](DetailRecordsApi.md#detailRecordsSearch) | **GET** /detail_records | Search detail records



## detailRecordsSearch

> DetailRecordsSearchResponse detailRecordsSearch(filterRecordType, filterDateRange, filter, pageNumber, pageSize, sort)

Search detail records

Search for any detail record across the Telnyx Platform. Examples and additional information found [here](/docs/v2/debugging/detail-record-search).

### Example

```java
// Import classes:
import com.telnyx.sdk.ApiClient;
import com.telnyx.sdk.ApiException;
import com.telnyx.sdk.Configuration;
import com.telnyx.sdk.auth.*;
import com.telnyx.sdk.model.*;
import com.telnyx.sdk.api.DetailRecordsApi;

public class Example {
    public static void main(String[] args) {
        ApiClient defaultClient = Configuration.getDefaultApiClient();
        defaultClient.setBasePath("https://api.telnyx.com/v2");
        
        // Configure HTTP bearer authorization: bearerAuth
        HttpBearerAuth bearerAuth = (HttpBearerAuth) defaultClient.getAuthentication("bearerAuth");
        bearerAuth.setBearerToken("BEARER TOKEN");

        DetailRecordsApi apiInstance = new DetailRecordsApi(defaultClient);
        String filterRecordType = "amd"; // String | Filter by the given record type.
        String filterDateRange = "yesterday"; // String | Filter by the given user-friendly date range. You can specify one of the following enum values, or a dynamic one using this format: last_N_days.
        Map<String, Object> filter = new HashMap(); // Map<String, Object> | Filter records on a given record attribute and value. <br/>Example: filter[status]=delivered
        Integer pageNumber = 1; // Integer | Page number
        Integer pageSize = 20; // Integer | Page size
        List<String> sort = Arrays.asList(); // List<String> | Specifies the sort order for results. <br/>Example: sort=-created_at
        try {
            DetailRecordsSearchResponse result = apiInstance.detailRecordsSearch(filterRecordType, filterDateRange, filter, pageNumber, pageSize, sort);
            System.out.println(result);
        } catch (ApiException e) {
            System.err.println("Exception when calling DetailRecordsApi#detailRecordsSearch");
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
 **filterRecordType** | **String**| Filter by the given record type. | [enum: amd, conference, conference-participant, media_storage, messaging, verify, whatsapp, whatsapp-conversation, wireless]
 **filterDateRange** | **String**| Filter by the given user-friendly date range. You can specify one of the following enum values, or a dynamic one using this format: last_N_days. | [optional] [enum: yesterday, today, tomorrow, last_week, this_week, next_week, last_month, this_month, next_month]
 **filter** | **Map&lt;String,Object&gt;**| Filter records on a given record attribute and value. &lt;br/&gt;Example: filter[status]&#x3D;delivered | [optional]
 **pageNumber** | **Integer**| Page number | [optional] [default to 1]
 **pageSize** | **Integer**| Page size | [optional] [default to 20]
 **sort** | **List&lt;String&gt;**| Specifies the sort order for results. &lt;br/&gt;Example: sort&#x3D;-created_at | [optional]

### Return type

[**DetailRecordsSearchResponse**](DetailRecordsSearchResponse.md)

### Authorization

[bearerAuth](../README.md#bearerAuth)

### HTTP request headers

- **Content-Type**: Not defined
- **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | Successful |  -  |

