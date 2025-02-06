# PresignedObjectUrlsApi

All URIs are relative to *https://api.telnyx.com/v2*

Method | HTTP request | Description
------------- | ------------- | -------------
[**createPresignedObjectUrl**](PresignedObjectUrlsApi.md#createPresignedObjectUrl) | **POST** /storage/buckets/{bucketName}/{objectName}/presigned_url | Create Presigned Object URL



## createPresignedObjectUrl

> PresignedObjectUrl createPresignedObjectUrl(bucketName, objectName, presignedObjectUrlParams)

Create Presigned Object URL

Returns a timed and authenticated URL to get an object. This is the equivalent to AWS S3’s “presigned” URL. Please note that Telnyx performs authentication differently from AWS S3 and you MUST NOT use the presign method of AWS s3api CLI or sdk to generate the presigned URL. 

Refer to: https://developers.telnyx.com/docs/cloud-storage/presigned-urls


### Example

```java
// Import classes:
import com.telnyx.sdk.ApiClient;
import com.telnyx.sdk.ApiException;
import com.telnyx.sdk.Configuration;
import com.telnyx.sdk.auth.*;
import com.telnyx.sdk.model.*;
import com.telnyx.sdk.api.PresignedObjectUrlsApi;

public class Example {
    public static void main(String[] args) {
        ApiClient defaultClient = Configuration.getDefaultApiClient();
        defaultClient.setBasePath("https://api.telnyx.com/v2");
        
        // Configure HTTP bearer authorization: bearerAuth
        HttpBearerAuth bearerAuth = (HttpBearerAuth) defaultClient.getAuthentication("bearerAuth");
        bearerAuth.setBearerToken("BEARER TOKEN");

        PresignedObjectUrlsApi apiInstance = new PresignedObjectUrlsApi(defaultClient);
        String bucketName = "bucketName_example"; // String | The name of the bucket
        String objectName = "objectName_example"; // String | The name of the object
        PresignedObjectUrlParams presignedObjectUrlParams = new PresignedObjectUrlParams(); // PresignedObjectUrlParams | 
        try {
            PresignedObjectUrl result = apiInstance.createPresignedObjectUrl(bucketName, objectName, presignedObjectUrlParams);
            System.out.println(result);
        } catch (ApiException e) {
            System.err.println("Exception when calling PresignedObjectUrlsApi#createPresignedObjectUrl");
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
 **bucketName** | **String**| The name of the bucket |
 **objectName** | **String**| The name of the object |
 **presignedObjectUrlParams** | [**PresignedObjectUrlParams**](PresignedObjectUrlParams.md)|  | [optional]

### Return type

[**PresignedObjectUrl**](PresignedObjectUrl.md)

### Authorization

[bearerAuth](../README.md#bearerAuth)

### HTTP request headers

- **Content-Type**: application/json
- **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | Presigned URL Object Response |  -  |

