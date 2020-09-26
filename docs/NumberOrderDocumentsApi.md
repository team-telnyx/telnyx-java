# NumberOrderDocumentsApi

All URIs are relative to *https://api.telnyx.com/v2*

Method | HTTP request | Description
------------- | ------------- | -------------
[**createNumberOrderDocument**](NumberOrderDocumentsApi.md#createNumberOrderDocument) | **POST** /number_order_documents | Create a number order document
[**listNumberOrderDocuments**](NumberOrderDocumentsApi.md#listNumberOrderDocuments) | **GET** /number_order_documents | List number order documents
[**retrieveNumberOrderDocument**](NumberOrderDocumentsApi.md#retrieveNumberOrderDocument) | **GET** /number_order_documents/{number_order_document_id} | Retrieve a number order document
[**updateNumberOrderDocument**](NumberOrderDocumentsApi.md#updateNumberOrderDocument) | **PATCH** /number_order_documents/{number_order_document_id} | Update a number order document

<a name="createNumberOrderDocument"></a>
# **createNumberOrderDocument**
> NumberOrderDocumentResponse createNumberOrderDocument(body)

Create a number order document

Upload a phone number order document.

### Example
```java
// Import classes:
//import com.telnyx.sdk.ApiClient;
//import com.telnyx.sdk.ApiException;
//import com.telnyx.sdk.Configuration;
//import com.telnyx.sdk.auth.*;
//import com.telnyx.sdk.apis.NumberOrderDocumentsApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();


NumberOrderDocumentsApi apiInstance = new NumberOrderDocumentsApi();
CreateNumberOrderDocumentRequest body = new CreateNumberOrderDocumentRequest(); // CreateNumberOrderDocumentRequest | 
try {
    NumberOrderDocumentResponse result = apiInstance.createNumberOrderDocument(body);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling NumberOrderDocumentsApi#createNumberOrderDocument");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **body** | [**CreateNumberOrderDocumentRequest**](CreateNumberOrderDocumentRequest.md)|  |

### Return type

[**NumberOrderDocumentResponse**](NumberOrderDocumentResponse.md)

### Authorization

[bearerAuth](../README.md#bearerAuth)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a name="listNumberOrderDocuments"></a>
# **listNumberOrderDocuments**
> ListNumberOrderDocumentsResponse listNumberOrderDocuments(filterRequirementId, filterCreatedAtGt, filterCreatedAtLt)

List number order documents

Gets a paginated list of number order documents.

### Example
```java
// Import classes:
//import com.telnyx.sdk.ApiClient;
//import com.telnyx.sdk.ApiException;
//import com.telnyx.sdk.Configuration;
//import com.telnyx.sdk.auth.*;
//import com.telnyx.sdk.apis.NumberOrderDocumentsApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();


NumberOrderDocumentsApi apiInstance = new NumberOrderDocumentsApi();
String filterRequirementId = "filterRequirementId_example"; // String | Filter number order documents by `requirement_id`.
String filterCreatedAtGt = "filterCreatedAtGt_example"; // String | Filter number order documents after this datetime.
String filterCreatedAtLt = "filterCreatedAtLt_example"; // String | Filter number order documents from before this datetime.
try {
    ListNumberOrderDocumentsResponse result = apiInstance.listNumberOrderDocuments(filterRequirementId, filterCreatedAtGt, filterCreatedAtLt);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling NumberOrderDocumentsApi#listNumberOrderDocuments");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **filterRequirementId** | **String**| Filter number order documents by &#x60;requirement_id&#x60;. | [optional]
 **filterCreatedAtGt** | **String**| Filter number order documents after this datetime. | [optional]
 **filterCreatedAtLt** | **String**| Filter number order documents from before this datetime. | [optional]

### Return type

[**ListNumberOrderDocumentsResponse**](ListNumberOrderDocumentsResponse.md)

### Authorization

[bearerAuth](../README.md#bearerAuth)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a name="retrieveNumberOrderDocument"></a>
# **retrieveNumberOrderDocument**
> NumberOrderDocumentResponse retrieveNumberOrderDocument(numberOrderDocumentId)

Retrieve a number order document

Gets a single number order document.

### Example
```java
// Import classes:
//import com.telnyx.sdk.ApiClient;
//import com.telnyx.sdk.ApiException;
//import com.telnyx.sdk.Configuration;
//import com.telnyx.sdk.auth.*;
//import com.telnyx.sdk.apis.NumberOrderDocumentsApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();


NumberOrderDocumentsApi apiInstance = new NumberOrderDocumentsApi();
String numberOrderDocumentId = "numberOrderDocumentId_example"; // String | The number order document ID.
try {
    NumberOrderDocumentResponse result = apiInstance.retrieveNumberOrderDocument(numberOrderDocumentId);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling NumberOrderDocumentsApi#retrieveNumberOrderDocument");
    e.printStackTrace();
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

<a name="updateNumberOrderDocument"></a>
# **updateNumberOrderDocument**
> NumberOrderDocumentResponse updateNumberOrderDocument(body, numberOrderDocumentId)

Update a number order document

Updates a number order document.

### Example
```java
// Import classes:
//import com.telnyx.sdk.ApiClient;
//import com.telnyx.sdk.ApiException;
//import com.telnyx.sdk.Configuration;
//import com.telnyx.sdk.auth.*;
//import com.telnyx.sdk.apis.NumberOrderDocumentsApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();


NumberOrderDocumentsApi apiInstance = new NumberOrderDocumentsApi();
UpdateNumberOrderDocumentRequest body = new UpdateNumberOrderDocumentRequest(); // UpdateNumberOrderDocumentRequest | 
String numberOrderDocumentId = "numberOrderDocumentId_example"; // String | The number order document ID.
try {
    NumberOrderDocumentResponse result = apiInstance.updateNumberOrderDocument(body, numberOrderDocumentId);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling NumberOrderDocumentsApi#updateNumberOrderDocument");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **body** | [**UpdateNumberOrderDocumentRequest**](UpdateNumberOrderDocumentRequest.md)|  |
 **numberOrderDocumentId** | **String**| The number order document ID. |

### Return type

[**NumberOrderDocumentResponse**](NumberOrderDocumentResponse.md)

### Authorization

[bearerAuth](../README.md#bearerAuth)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

