# WdrDetailReportsApi

All URIs are relative to *https://api.telnyx.com/v2*

Method | HTTP request | Description
------------- | ------------- | -------------
[**getPaginatedWdrs**](WdrDetailReportsApi.md#getPaginatedWdrs) | **GET** /reports/wdrs | Get Report WDRs



## getPaginatedWdrs

> ExternalWdrGetDetailResponse getPaginatedWdrs(startDate, endDate, id, mcc, mnc, imsi, simGroupName, simGroupId, simCardId, phoneNumber, pageNumber, pageSize, sort)

Get Report WDRs

Fetch all Wdr records 

### Example

```java
// Import classes:
import com.telnyx.sdk.ApiClient;
import com.telnyx.sdk.ApiException;
import com.telnyx.sdk.Configuration;
import com.telnyx.sdk.auth.*;
import com.telnyx.sdk.model.*;
import com.telnyx.sdk.api.WdrDetailReportsApi;

public class Example {
    public static void main(String[] args) {
        ApiClient defaultClient = Configuration.getDefaultApiClient();
        defaultClient.setBasePath("https://api.telnyx.com/v2");
        
        // Configure HTTP bearer authorization: bearerAuth
        HttpBearerAuth bearerAuth = (HttpBearerAuth) defaultClient.getAuthentication("bearerAuth");
        bearerAuth.setBearerToken("BEARER TOKEN");

        WdrDetailReportsApi apiInstance = new WdrDetailReportsApi(defaultClient);
        String startDate = "2021-05-01T00:00:00Z"; // String | Start date
        String endDate = "2021-06-01T00:00:00Z"; // String | End date
        String id = "e093fbe0-5bde-11eb-ae93-0242ac130002"; // String | 
        String mcc = "204"; // String | 
        String mnc = "01"; // String | 
        String imsi = "123456"; // String | 
        String simGroupName = "sim name"; // String | 
        String simGroupId = "f05a189f-7c46-4531-ac56-1460dc465a42"; // String | 
        String simCardId = "877f80a6-e5b2-4687-9a04-88076265720f"; // String | 
        String phoneNumber = "+12345678910"; // String | 
        Integer pageNumber = 1; // Integer | Page number
        Integer pageSize = 20; // Integer | Size of the page
        List<String> sort = Arrays.asList(); // List<String> | 
        try {
            ExternalWdrGetDetailResponse result = apiInstance.getPaginatedWdrs(startDate, endDate, id, mcc, mnc, imsi, simGroupName, simGroupId, simCardId, phoneNumber, pageNumber, pageSize, sort);
            System.out.println(result);
        } catch (ApiException e) {
            System.err.println("Exception when calling WdrDetailReportsApi#getPaginatedWdrs");
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
 **startDate** | **String**| Start date | [optional]
 **endDate** | **String**| End date | [optional]
 **id** | **String**|  | [optional]
 **mcc** | **String**|  | [optional]
 **mnc** | **String**|  | [optional]
 **imsi** | **String**|  | [optional]
 **simGroupName** | **String**|  | [optional]
 **simGroupId** | **String**|  | [optional]
 **simCardId** | **String**|  | [optional]
 **phoneNumber** | **String**|  | [optional]
 **pageNumber** | **Integer**| Page number | [optional] [default to 1]
 **pageSize** | **Integer**| Size of the page | [optional] [default to 20]
 **sort** | **List&lt;String&gt;**|  | [optional]

### Return type

[**ExternalWdrGetDetailResponse**](ExternalWdrGetDetailResponse.md)

### Authorization

[bearerAuth](../README.md#bearerAuth)

### HTTP request headers

- **Content-Type**: Not defined
- **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | Successful |  -  |

