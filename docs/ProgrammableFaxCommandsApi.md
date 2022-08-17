# ProgrammableFaxCommandsApi

All URIs are relative to *https://api.telnyx.com/v2*

Method | HTTP request | Description
------------- | ------------- | -------------
[**cancelFax**](ProgrammableFaxCommandsApi.md#cancelFax) | **POST** /faxes/{id}/actions/cancel | Cancel a fax
[**deleteFax**](ProgrammableFaxCommandsApi.md#deleteFax) | **DELETE** /faxes/{id} | Delete a fax
[**listFaxes**](ProgrammableFaxCommandsApi.md#listFaxes) | **GET** /faxes | View a list of faxes
[**refreshFax**](ProgrammableFaxCommandsApi.md#refreshFax) | **POST** /faxes/{id}/actions/refresh | Refresh a fax
[**sendFax**](ProgrammableFaxCommandsApi.md#sendFax) | **POST** /faxes | Send a fax
[**viewFax**](ProgrammableFaxCommandsApi.md#viewFax) | **GET** /faxes/{id} | View a fax



## cancelFax

> SuccessfulResponseUponAcceptingCancelFaxCommand cancelFax(id)

Cancel a fax

Cancel the outbound fax that is in one of the following states: `queued`, `media.processed`, `originated` or `sending` 

### Example

```java
import java.util.UUID;
// Import classes:
import com.telnyx.sdk.ApiClient;
import com.telnyx.sdk.ApiException;
import com.telnyx.sdk.Configuration;
import com.telnyx.sdk.auth.*;
import com.telnyx.sdk.model.*;
import com.telnyx.sdk.api.ProgrammableFaxCommandsApi;

public class Example {
    public static void main(String[] args) {
        ApiClient defaultClient = Configuration.getDefaultApiClient();
        defaultClient.setBasePath("https://api.telnyx.com/v2");
        
        // Configure HTTP bearer authorization: bearerAuth
        HttpBearerAuth bearerAuth = (HttpBearerAuth) defaultClient.getAuthentication("bearerAuth");
        bearerAuth.setBearerToken("BEARER TOKEN");

        ProgrammableFaxCommandsApi apiInstance = new ProgrammableFaxCommandsApi(defaultClient);
        UUID id = UUID.randomUUID(); // UUID | The unique identifier of a fax.
        try {
            SuccessfulResponseUponAcceptingCancelFaxCommand result = apiInstance.cancelFax(id);
            System.out.println(result);
        } catch (ApiException e) {
            System.err.println("Exception when calling ProgrammableFaxCommandsApi#cancelFax");
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
 **id** | **UUID**| The unique identifier of a fax. |

### Return type

[**SuccessfulResponseUponAcceptingCancelFaxCommand**](SuccessfulResponseUponAcceptingCancelFaxCommand.md)

### Authorization

[bearerAuth](../README.md#bearerAuth)

### HTTP request headers

- **Content-Type**: Not defined
- **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **202** | Successful response upon accepting cancel fax command |  -  |
| **404** | Fax does not exist |  -  |
| **422** | Unprocessable entity |  -  |
| **0** | Unexpected error |  -  |


## deleteFax

> deleteFax(id)

Delete a fax

### Example

```java
import java.util.UUID;
// Import classes:
import com.telnyx.sdk.ApiClient;
import com.telnyx.sdk.ApiException;
import com.telnyx.sdk.Configuration;
import com.telnyx.sdk.auth.*;
import com.telnyx.sdk.model.*;
import com.telnyx.sdk.api.ProgrammableFaxCommandsApi;

public class Example {
    public static void main(String[] args) {
        ApiClient defaultClient = Configuration.getDefaultApiClient();
        defaultClient.setBasePath("https://api.telnyx.com/v2");
        
        // Configure HTTP bearer authorization: bearerAuth
        HttpBearerAuth bearerAuth = (HttpBearerAuth) defaultClient.getAuthentication("bearerAuth");
        bearerAuth.setBearerToken("BEARER TOKEN");

        ProgrammableFaxCommandsApi apiInstance = new ProgrammableFaxCommandsApi(defaultClient);
        UUID id = UUID.randomUUID(); // UUID | The unique identifier of a fax.
        try {
            apiInstance.deleteFax(id);
        } catch (ApiException e) {
            System.err.println("Exception when calling ProgrammableFaxCommandsApi#deleteFax");
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
 **id** | **UUID**| The unique identifier of a fax. |

### Return type

null (empty response body)

### Authorization

[bearerAuth](../README.md#bearerAuth)

### HTTP request headers

- **Content-Type**: Not defined
- **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **204** | The resource was deleted successfully. |  -  |
| **0** | Unexpected error |  -  |


## listFaxes

> ListFaxesResponse listFaxes(filterCreatedAtGte, filterCreatedAtGt, filterCreatedAtLte, filterCreatedAtLt, filterDirectionEq, filterFromEq, pageSize, pageNumber)

View a list of faxes



### Example

```java
import java.time.OffsetDateTime;
// Import classes:
import com.telnyx.sdk.ApiClient;
import com.telnyx.sdk.ApiException;
import com.telnyx.sdk.Configuration;
import com.telnyx.sdk.auth.*;
import com.telnyx.sdk.model.*;
import com.telnyx.sdk.api.ProgrammableFaxCommandsApi;

public class Example {
    public static void main(String[] args) {
        ApiClient defaultClient = Configuration.getDefaultApiClient();
        defaultClient.setBasePath("https://api.telnyx.com/v2");
        
        // Configure HTTP bearer authorization: bearerAuth
        HttpBearerAuth bearerAuth = (HttpBearerAuth) defaultClient.getAuthentication("bearerAuth");
        bearerAuth.setBearerToken("BEARER TOKEN");

        ProgrammableFaxCommandsApi apiInstance = new ProgrammableFaxCommandsApi(defaultClient);
        OffsetDateTime filterCreatedAtGte = OffsetDateTime.parse("2020-02-02T22:25:27.521992Z"); // OffsetDateTime | ISO 8601 date time for filtering faxes created after or on that date
        OffsetDateTime filterCreatedAtGt = OffsetDateTime.parse("2020-02-02T22:25:27.521992Z"); // OffsetDateTime | ISO 8601 date time for filtering faxes created after that date
        OffsetDateTime filterCreatedAtLte = OffsetDateTime.parse("2020-02-02T22:25:27.521992Z"); // OffsetDateTime | ISO 8601 formatted date time for filtering faxes created on or before that date
        OffsetDateTime filterCreatedAtLt = OffsetDateTime.parse("2020-02-02T22:25:27.521992Z"); // OffsetDateTime | ISO 8601 formatted date time for filtering faxes created before that date
        String filterDirectionEq = "inbound"; // String | The direction, inbound or outbound, for filtering faxes sent from this account
        String filterFromEq = "+13127367276"; // String | The phone number, in E.164 format for filtering faxes sent from this number
        Integer pageSize = 2; // Integer | Number of fax resourcxes for the single page returned
        Integer pageNumber = 2; // Integer | Number of the page to be retrieved
        try {
            ListFaxesResponse result = apiInstance.listFaxes(filterCreatedAtGte, filterCreatedAtGt, filterCreatedAtLte, filterCreatedAtLt, filterDirectionEq, filterFromEq, pageSize, pageNumber);
            System.out.println(result);
        } catch (ApiException e) {
            System.err.println("Exception when calling ProgrammableFaxCommandsApi#listFaxes");
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
 **filterCreatedAtGte** | **OffsetDateTime**| ISO 8601 date time for filtering faxes created after or on that date | [optional]
 **filterCreatedAtGt** | **OffsetDateTime**| ISO 8601 date time for filtering faxes created after that date | [optional]
 **filterCreatedAtLte** | **OffsetDateTime**| ISO 8601 formatted date time for filtering faxes created on or before that date | [optional]
 **filterCreatedAtLt** | **OffsetDateTime**| ISO 8601 formatted date time for filtering faxes created before that date | [optional]
 **filterDirectionEq** | **String**| The direction, inbound or outbound, for filtering faxes sent from this account | [optional]
 **filterFromEq** | **String**| The phone number, in E.164 format for filtering faxes sent from this number | [optional]
 **pageSize** | **Integer**| Number of fax resourcxes for the single page returned | [optional]
 **pageNumber** | **Integer**| Number of the page to be retrieved | [optional]

### Return type

[**ListFaxesResponse**](ListFaxesResponse.md)

### Authorization

[bearerAuth](../README.md#bearerAuth)

### HTTP request headers

- **Content-Type**: Not defined
- **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | List faxes response |  -  |
| **0** | Unexpected error |  -  |


## refreshFax

> RefreshFaxResponse refreshFax(id)

Refresh a fax

Refreshes the inbound fax's media_url when it has expired

### Example

```java
import java.util.UUID;
// Import classes:
import com.telnyx.sdk.ApiClient;
import com.telnyx.sdk.ApiException;
import com.telnyx.sdk.Configuration;
import com.telnyx.sdk.auth.*;
import com.telnyx.sdk.model.*;
import com.telnyx.sdk.api.ProgrammableFaxCommandsApi;

public class Example {
    public static void main(String[] args) {
        ApiClient defaultClient = Configuration.getDefaultApiClient();
        defaultClient.setBasePath("https://api.telnyx.com/v2");
        
        // Configure HTTP bearer authorization: bearerAuth
        HttpBearerAuth bearerAuth = (HttpBearerAuth) defaultClient.getAuthentication("bearerAuth");
        bearerAuth.setBearerToken("BEARER TOKEN");

        ProgrammableFaxCommandsApi apiInstance = new ProgrammableFaxCommandsApi(defaultClient);
        UUID id = UUID.randomUUID(); // UUID | The unique identifier of a fax.
        try {
            RefreshFaxResponse result = apiInstance.refreshFax(id);
            System.out.println(result);
        } catch (ApiException e) {
            System.err.println("Exception when calling ProgrammableFaxCommandsApi#refreshFax");
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
 **id** | **UUID**| The unique identifier of a fax. |

### Return type

[**RefreshFaxResponse**](RefreshFaxResponse.md)

### Authorization

[bearerAuth](../README.md#bearerAuth)

### HTTP request headers

- **Content-Type**: Not defined
- **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | Refresh fax response |  -  |
| **404** | Fax does not exist |  -  |
| **0** | Unexpected error |  -  |


## sendFax

> SendFaxResponse sendFax(sendFaxRequest)

Send a fax

Send a fax. Files have size limits and page count limit validations. If a file is bigger than 50MB or has more than 350 pages it will fail with `file_size_limit_exceeded` and `page_count_limit_exceeded` respectively. 

**Expected Webhooks:**

- `fax.queued`
- `fax.media.processed`
- `fax.sending.started`
- `fax.delivered`
- `fax.failed`


### Example

```java
// Import classes:
import com.telnyx.sdk.ApiClient;
import com.telnyx.sdk.ApiException;
import com.telnyx.sdk.Configuration;
import com.telnyx.sdk.auth.*;
import com.telnyx.sdk.model.*;
import com.telnyx.sdk.api.ProgrammableFaxCommandsApi;

public class Example {
    public static void main(String[] args) {
        ApiClient defaultClient = Configuration.getDefaultApiClient();
        defaultClient.setBasePath("https://api.telnyx.com/v2");
        
        // Configure HTTP bearer authorization: bearerAuth
        HttpBearerAuth bearerAuth = (HttpBearerAuth) defaultClient.getAuthentication("bearerAuth");
        bearerAuth.setBearerToken("BEARER TOKEN");

        ProgrammableFaxCommandsApi apiInstance = new ProgrammableFaxCommandsApi(defaultClient);
        SendFaxRequest sendFaxRequest = new SendFaxRequest(); // SendFaxRequest | Send fax request
        try {
            SendFaxResponse result = apiInstance.sendFax(sendFaxRequest);
            System.out.println(result);
        } catch (ApiException e) {
            System.err.println("Exception when calling ProgrammableFaxCommandsApi#sendFax");
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
 **sendFaxRequest** | [**SendFaxRequest**](SendFaxRequest.md)| Send fax request |

### Return type

[**SendFaxResponse**](SendFaxResponse.md)

### Authorization

[bearerAuth](../README.md#bearerAuth)

### HTTP request headers

- **Content-Type**: application/json, multipart/form-data
- **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **202** | Send fax response |  -  |
| **0** | Unexpected error |  -  |


## viewFax

> GetFaxResponse viewFax(id)

View a fax

### Example

```java
import java.util.UUID;
// Import classes:
import com.telnyx.sdk.ApiClient;
import com.telnyx.sdk.ApiException;
import com.telnyx.sdk.Configuration;
import com.telnyx.sdk.auth.*;
import com.telnyx.sdk.model.*;
import com.telnyx.sdk.api.ProgrammableFaxCommandsApi;

public class Example {
    public static void main(String[] args) {
        ApiClient defaultClient = Configuration.getDefaultApiClient();
        defaultClient.setBasePath("https://api.telnyx.com/v2");
        
        // Configure HTTP bearer authorization: bearerAuth
        HttpBearerAuth bearerAuth = (HttpBearerAuth) defaultClient.getAuthentication("bearerAuth");
        bearerAuth.setBearerToken("BEARER TOKEN");

        ProgrammableFaxCommandsApi apiInstance = new ProgrammableFaxCommandsApi(defaultClient);
        UUID id = UUID.randomUUID(); // UUID | The unique identifier of a fax.
        try {
            GetFaxResponse result = apiInstance.viewFax(id);
            System.out.println(result);
        } catch (ApiException e) {
            System.err.println("Exception when calling ProgrammableFaxCommandsApi#viewFax");
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
 **id** | **UUID**| The unique identifier of a fax. |

### Return type

[**GetFaxResponse**](GetFaxResponse.md)

### Authorization

[bearerAuth](../README.md#bearerAuth)

### HTTP request headers

- **Content-Type**: Not defined
- **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | Get fax response |  -  |
| **0** | Unexpected error |  -  |

