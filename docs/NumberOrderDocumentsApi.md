# NumberOrderDocumentsApi

All URIs are relative to *https://api.telnyx.com/v2*

Method | HTTP request | Description
------------- | ------------- | -------------
[**createNumberOrderDocument**](NumberOrderDocumentsApi.md#createNumberOrderDocument) | **POST** /number_order_documents | Upload Number Order Document
[**listNumberOrderDocuments**](NumberOrderDocumentsApi.md#listNumberOrderDocuments) | **GET** /number_order_documents | Get Uploaded Number Order Documents
[**retrieveNumberOrderDocument**](NumberOrderDocumentsApi.md#retrieveNumberOrderDocument) | **GET** /number_order_documents/{number_order_document_id} | Get a Single Number Order Document
[**updateNumberOrderDocument**](NumberOrderDocumentsApi.md#updateNumberOrderDocument) | **PATCH** /number_order_documents/{number_order_document_id} | Update Number Order Document

<a name="createNumberOrderDocument"></a>
# **createNumberOrderDocument**
> CreateNumberOrderDocumentResponse createNumberOrderDocument(body)

Upload Number Order Document

Upload a Phone Number Order Document

### Example
```java
// Import classes:
//import io.swagger.client.ApiClient;
//import io.swagger.client.ApiException;
//import io.swagger.client.Configuration;
//import io.swagger.client.auth.*;
//import io.swagger.client.api.NumberOrderDocumentsApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();


NumberOrderDocumentsApi apiInstance = new NumberOrderDocumentsApi();
NumberOrderDocument body = new NumberOrderDocument(); // NumberOrderDocument | 
try {
    CreateNumberOrderDocumentResponse result = apiInstance.createNumberOrderDocument(body);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling NumberOrderDocumentsApi#createNumberOrderDocument");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **body** | [**NumberOrderDocument**](NumberOrderDocument.md)|  |

### Return type

[**CreateNumberOrderDocumentResponse**](CreateNumberOrderDocumentResponse.md)

### Authorization

[bearerAuth](../README.md#bearerAuth)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a name="listNumberOrderDocuments"></a>
# **listNumberOrderDocuments**
> ListNumberOrderDocumentsResponse listNumberOrderDocuments(filterRequirementId, filterCreatedAtGt, filterCreatedAtLt)

Get Uploaded Number Order Documents

Gets a paginated list of Number Order Documents

### Example
```java
// Import classes:
//import io.swagger.client.ApiClient;
//import io.swagger.client.ApiException;
//import io.swagger.client.Configuration;
//import io.swagger.client.auth.*;
//import io.swagger.client.api.NumberOrderDocumentsApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();


NumberOrderDocumentsApi apiInstance = new NumberOrderDocumentsApi();
String filterRequirementId = "filterRequirementId_example"; // String | Filter number order documents by requirement_id
String filterCreatedAtGt = "filterCreatedAtGt_example"; // String | Filter number order documents after this datetime
String filterCreatedAtLt = "filterCreatedAtLt_example"; // String | Filter number order documents from before this datetime
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
 **filterRequirementId** | **String**| Filter number order documents by requirement_id | [optional]
 **filterCreatedAtGt** | **String**| Filter number order documents after this datetime | [optional]
 **filterCreatedAtLt** | **String**| Filter number order documents from before this datetime | [optional]

### Return type

[**ListNumberOrderDocumentsResponse**](ListNumberOrderDocumentsResponse.md)

### Authorization

[bearerAuth](../README.md#bearerAuth)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a name="retrieveNumberOrderDocument"></a>
# **retrieveNumberOrderDocument**
> RetrieveNumberOrderDocumentResponse retrieveNumberOrderDocument(numberOrderDocumentId)

Get a Single Number Order Document

Gets a single Number Order Document

### Example
```java
// Import classes:
//import io.swagger.client.ApiClient;
//import io.swagger.client.ApiException;
//import io.swagger.client.Configuration;
//import io.swagger.client.auth.*;
//import io.swagger.client.api.NumberOrderDocumentsApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();


NumberOrderDocumentsApi apiInstance = new NumberOrderDocumentsApi();
String numberOrderDocumentId = "numberOrderDocumentId_example"; // String | The number order document id
try {
    RetrieveNumberOrderDocumentResponse result = apiInstance.retrieveNumberOrderDocument(numberOrderDocumentId);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling NumberOrderDocumentsApi#retrieveNumberOrderDocument");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **numberOrderDocumentId** | **String**| The number order document id |

### Return type

[**RetrieveNumberOrderDocumentResponse**](RetrieveNumberOrderDocumentResponse.md)

### Authorization

[bearerAuth](../README.md#bearerAuth)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a name="updateNumberOrderDocument"></a>
# **updateNumberOrderDocument**
> UpdateNumberOrderDocumentResponse updateNumberOrderDocument(body, numberOrderDocumentId)

Update Number Order Document

Updates a Number Order Document

### Example
```java
// Import classes:
//import io.swagger.client.ApiClient;
//import io.swagger.client.ApiException;
//import io.swagger.client.Configuration;
//import io.swagger.client.auth.*;
//import io.swagger.client.api.NumberOrderDocumentsApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();


NumberOrderDocumentsApi apiInstance = new NumberOrderDocumentsApi();
NumberOrderDocument body = new NumberOrderDocument(); // NumberOrderDocument | 
String numberOrderDocumentId = "numberOrderDocumentId_example"; // String | The number order document id
try {
    UpdateNumberOrderDocumentResponse result = apiInstance.updateNumberOrderDocument(body, numberOrderDocumentId);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling NumberOrderDocumentsApi#updateNumberOrderDocument");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **body** | [**NumberOrderDocument**](NumberOrderDocument.md)|  |
 **numberOrderDocumentId** | **String**| The number order document id |

### Return type

[**UpdateNumberOrderDocumentResponse**](UpdateNumberOrderDocumentResponse.md)

### Authorization

[bearerAuth](../README.md#bearerAuth)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

