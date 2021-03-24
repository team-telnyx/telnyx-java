# NumberOrderDocumentsApi

All URIs are relative to *https://api.telnyx.com/v2*

Method | HTTP request | Description
------------- | ------------- | -------------
[**createNumberOrderDocument**](NumberOrderDocumentsApi.md#createNumberOrderDocument) | **POST** /number_order_documents | Create a number order document
[**listNumberOrderDocuments**](NumberOrderDocumentsApi.md#listNumberOrderDocuments) | **GET** /number_order_documents | List number order documents
[**retrieveNumberOrderDocument**](NumberOrderDocumentsApi.md#retrieveNumberOrderDocument) | **GET** /number_order_documents/{number_order_document_id} | Retrieve a number order document
[**updateNumberOrderDocument**](NumberOrderDocumentsApi.md#updateNumberOrderDocument) | **PATCH** /number_order_documents/{number_order_document_id} | Update a number order document



## createNumberOrderDocument

> NumberOrderDocumentResponse createNumberOrderDocument(createNumberOrderDocumentRequest)

Create a number order document

Upload a phone number order document.

### Example

```java
// Import classes:
import com.telnyx.sdk.ApiClient;
import com.telnyx.sdk.ApiException;
import com.telnyx.sdk.Configuration;
import com.telnyx.sdk.auth.*;
import com.telnyx.sdk.model.*;
import com.telnyx.sdk.api.NumberOrderDocumentsApi;

public class Example {
    public static void main(String[] args) {
        ApiClient defaultClient = Configuration.getDefaultApiClient();
        defaultClient.setBasePath("https://api.telnyx.com/v2");
        
        // Configure HTTP bearer authorization: bearerAuth
        HttpBearerAuth bearerAuth = (HttpBearerAuth) defaultClient.getAuthentication("bearerAuth");
        bearerAuth.setBearerToken("BEARER TOKEN");

        NumberOrderDocumentsApi apiInstance = new NumberOrderDocumentsApi(defaultClient);
        CreateNumberOrderDocumentRequest createNumberOrderDocumentRequest = new CreateNumberOrderDocumentRequest(); // CreateNumberOrderDocumentRequest | 
        try {
            NumberOrderDocumentResponse result = apiInstance.createNumberOrderDocument(createNumberOrderDocumentRequest);
            System.out.println(result);
        } catch (ApiException e) {
            System.err.println("Exception when calling NumberOrderDocumentsApi#createNumberOrderDocument");
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
 **createNumberOrderDocumentRequest** | [**CreateNumberOrderDocumentRequest**](CreateNumberOrderDocumentRequest.md)|  |

### Return type

[**NumberOrderDocumentResponse**](NumberOrderDocumentResponse.md)

### Authorization

[bearerAuth](../README.md#bearerAuth)

### HTTP request headers

- **Content-Type**: application/json
- **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | Successful response with details about a number order document. |  -  |
| **0** | Unexpected error |  -  |


## listNumberOrderDocuments

> ListNumberOrderDocumentsResponse listNumberOrderDocuments().filterRequirementId(filterRequirementId).filterCreatedAtGt(filterCreatedAtGt).filterCreatedAtLt(filterCreatedAtLt).pageNumber(pageNumber).pageSize(pageSize).execute();

List number order documents

Gets a paginated list of number order documents.

### Example

```java
// Import classes:
import com.telnyx.sdk.ApiClient;
import com.telnyx.sdk.ApiException;
import com.telnyx.sdk.Configuration;
import com.telnyx.sdk.auth.*;
import com.telnyx.sdk.model.*;
import com.telnyx.sdk.api.NumberOrderDocumentsApi;

public class Example {
    public static void main(String[] args) {
        ApiClient defaultClient = Configuration.getDefaultApiClient();
        defaultClient.setBasePath("https://api.telnyx.com/v2");
        
        // Configure HTTP bearer authorization: bearerAuth
        HttpBearerAuth bearerAuth = (HttpBearerAuth) defaultClient.getAuthentication("bearerAuth");
        bearerAuth.setBearerToken("BEARER TOKEN");

        NumberOrderDocumentsApi apiInstance = new NumberOrderDocumentsApi(defaultClient);
        String filterRequirementId = "filterRequirementId_example"; // String | Filter number order documents by `requirement_id`.
        String filterCreatedAtGt = "filterCreatedAtGt_example"; // String | Filter number order documents after this datetime.
        String filterCreatedAtLt = "filterCreatedAtLt_example"; // String | Filter number order documents from before this datetime.
        Integer pageNumber = 1; // Integer | The page number to load
        Integer pageSize = 250; // Integer | The size of the page
        try {
            ListNumberOrderDocumentsResponse result = api.listNumberOrderDocuments()
                .filterRequirementId(filterRequirementId)
                .filterCreatedAtGt(filterCreatedAtGt)
                .filterCreatedAtLt(filterCreatedAtLt)
                .pageNumber(pageNumber)
                .pageSize(pageSize)
                .execute();
            System.out.println(result);
        } catch (ApiException e) {
            System.err.println("Exception when calling NumberOrderDocumentsApi#listNumberOrderDocuments");
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
 **filterRequirementId** | **String**| Filter number order documents by &#x60;requirement_id&#x60;. | [optional]
 **filterCreatedAtGt** | **String**| Filter number order documents after this datetime. | [optional]
 **filterCreatedAtLt** | **String**| Filter number order documents from before this datetime. | [optional]
 **pageNumber** | **Integer**| The page number to load | [optional] [default to 1]
 **pageSize** | **Integer**| The size of the page | [optional] [default to 250]

### Return type

[**ListNumberOrderDocumentsResponse**](ListNumberOrderDocumentsResponse.md)

### Authorization

[bearerAuth](../README.md#bearerAuth)

### HTTP request headers

- **Content-Type**: Not defined
- **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | Successful response with a list of number order documents. |  -  |
| **0** | Unexpected error |  -  |


## retrieveNumberOrderDocument

> NumberOrderDocumentResponse retrieveNumberOrderDocument(numberOrderDocumentId)

Retrieve a number order document

Gets a single number order document.

### Example

```java
// Import classes:
import com.telnyx.sdk.ApiClient;
import com.telnyx.sdk.ApiException;
import com.telnyx.sdk.Configuration;
import com.telnyx.sdk.auth.*;
import com.telnyx.sdk.model.*;
import com.telnyx.sdk.api.NumberOrderDocumentsApi;

public class Example {
    public static void main(String[] args) {
        ApiClient defaultClient = Configuration.getDefaultApiClient();
        defaultClient.setBasePath("https://api.telnyx.com/v2");
        
        // Configure HTTP bearer authorization: bearerAuth
        HttpBearerAuth bearerAuth = (HttpBearerAuth) defaultClient.getAuthentication("bearerAuth");
        bearerAuth.setBearerToken("BEARER TOKEN");

        NumberOrderDocumentsApi apiInstance = new NumberOrderDocumentsApi(defaultClient);
        String numberOrderDocumentId = "numberOrderDocumentId_example"; // String | The number order document ID.
        try {
            NumberOrderDocumentResponse result = apiInstance.retrieveNumberOrderDocument(numberOrderDocumentId);
            System.out.println(result);
        } catch (ApiException e) {
            System.err.println("Exception when calling NumberOrderDocumentsApi#retrieveNumberOrderDocument");
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
 **numberOrderDocumentId** | **String**| The number order document ID. |

### Return type

[**NumberOrderDocumentResponse**](NumberOrderDocumentResponse.md)

### Authorization

[bearerAuth](../README.md#bearerAuth)

### HTTP request headers

- **Content-Type**: Not defined
- **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | Successful response with details about a number order document. |  -  |
| **0** | Unexpected error |  -  |


## updateNumberOrderDocument

> NumberOrderDocumentResponse updateNumberOrderDocument(numberOrderDocumentId, updateNumberOrderDocumentRequest)

Update a number order document

Updates a number order document.

### Example

```java
// Import classes:
import com.telnyx.sdk.ApiClient;
import com.telnyx.sdk.ApiException;
import com.telnyx.sdk.Configuration;
import com.telnyx.sdk.auth.*;
import com.telnyx.sdk.model.*;
import com.telnyx.sdk.api.NumberOrderDocumentsApi;

public class Example {
    public static void main(String[] args) {
        ApiClient defaultClient = Configuration.getDefaultApiClient();
        defaultClient.setBasePath("https://api.telnyx.com/v2");
        
        // Configure HTTP bearer authorization: bearerAuth
        HttpBearerAuth bearerAuth = (HttpBearerAuth) defaultClient.getAuthentication("bearerAuth");
        bearerAuth.setBearerToken("BEARER TOKEN");

        NumberOrderDocumentsApi apiInstance = new NumberOrderDocumentsApi(defaultClient);
        String numberOrderDocumentId = "numberOrderDocumentId_example"; // String | The number order document ID.
        UpdateNumberOrderDocumentRequest updateNumberOrderDocumentRequest = new UpdateNumberOrderDocumentRequest(); // UpdateNumberOrderDocumentRequest | 
        try {
            NumberOrderDocumentResponse result = apiInstance.updateNumberOrderDocument(numberOrderDocumentId, updateNumberOrderDocumentRequest);
            System.out.println(result);
        } catch (ApiException e) {
            System.err.println("Exception when calling NumberOrderDocumentsApi#updateNumberOrderDocument");
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
 **numberOrderDocumentId** | **String**| The number order document ID. |
 **updateNumberOrderDocumentRequest** | [**UpdateNumberOrderDocumentRequest**](UpdateNumberOrderDocumentRequest.md)|  |

### Return type

[**NumberOrderDocumentResponse**](NumberOrderDocumentResponse.md)

### Authorization

[bearerAuth](../README.md#bearerAuth)

### HTTP request headers

- **Content-Type**: application/json
- **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | Successful response with details about a number order document. |  -  |
| **0** | Unexpected error |  -  |

