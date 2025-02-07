# BrandsApi

All URIs are relative to *https://api.telnyx.com/v2*

Method | HTTP request | Description
------------- | ------------- | -------------
[**createBrandPost**](BrandsApi.md#createBrandPost) | **POST** /brand | Create Brand
[**deleteBrand**](BrandsApi.md#deleteBrand) | **DELETE** /brand/{brandId} | Delete Brand
[**getBrand**](BrandsApi.md#getBrand) | **GET** /brand/{brandId} | Get Brand
[**getBrandFeedbackById**](BrandsApi.md#getBrandFeedbackById) | **GET** /brand/feedback/{brandId} | Get Brand Feedback By Id
[**getBrands**](BrandsApi.md#getBrands) | **GET** /brand | List Brands
[**listExternalVettings**](BrandsApi.md#listExternalVettings) | **GET** /brand/{brandId}/externalVetting | List External Vettings
[**postOrderExternalVetting**](BrandsApi.md#postOrderExternalVetting) | **POST** /brand/{brandId}/externalVetting | Order Brand External Vetting
[**putExternalVettingRecord**](BrandsApi.md#putExternalVettingRecord) | **PUT** /brand/{brandId}/externalVetting | Import External Vetting Record
[**resendBrand2faEmail**](BrandsApi.md#resendBrand2faEmail) | **POST** /brand/{brandId}/2faEmail | Resend brand 2FA email
[**revetBrand**](BrandsApi.md#revetBrand) | **PUT** /brand/{brandId}/revet | Revet Brand
[**updateBrand**](BrandsApi.md#updateBrand) | **PUT** /brand/{brandId} | Update Brand



## createBrandPost

> TelnyxBrand createBrandPost(createBrand)

Create Brand

This endpoint is used to create a new brand. A brand is an entity created by The Campaign Registry (TCR) that represents an organization or a company. It is this entity that TCR created campaigns will be associated with. Each brand creation will entail an upfront, non-refundable $4 expense.

### Example

```java
// Import classes:
import com.telnyx.sdk.ApiClient;
import com.telnyx.sdk.ApiException;
import com.telnyx.sdk.Configuration;
import com.telnyx.sdk.auth.*;
import com.telnyx.sdk.model.*;
import com.telnyx.sdk.api.BrandsApi;

public class Example {
    public static void main(String[] args) {
        ApiClient defaultClient = Configuration.getDefaultApiClient();
        defaultClient.setBasePath("https://api.telnyx.com/v2");
        
        // Configure HTTP bearer authorization: bearerAuth
        HttpBearerAuth bearerAuth = (HttpBearerAuth) defaultClient.getAuthentication("bearerAuth");
        bearerAuth.setBearerToken("BEARER TOKEN");

        BrandsApi apiInstance = new BrandsApi(defaultClient);
        CreateBrand createBrand = new CreateBrand(); // CreateBrand | 
        try {
            TelnyxBrand result = apiInstance.createBrandPost(createBrand);
            System.out.println(result);
        } catch (ApiException e) {
            System.err.println("Exception when calling BrandsApi#createBrandPost");
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
 **createBrand** | [**CreateBrand**](CreateBrand.md)|  |

### Return type

[**TelnyxBrand**](TelnyxBrand.md)

### Authorization

[bearerAuth](../README.md#bearerAuth)

### HTTP request headers

- **Content-Type**: application/json
- **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | Successful Response |  -  |
| **422** | Validation Error |  -  |


## deleteBrand

> Object deleteBrand(brandId)

Delete Brand

Delete Brand. This endpoint is used to delete a brand. Note the brand cannot be deleted if it contains one or more active campaigns, the campaigns need to be inactive and at least 3 months old due to billing purposes.

### Example

```java
// Import classes:
import com.telnyx.sdk.ApiClient;
import com.telnyx.sdk.ApiException;
import com.telnyx.sdk.Configuration;
import com.telnyx.sdk.auth.*;
import com.telnyx.sdk.model.*;
import com.telnyx.sdk.api.BrandsApi;

public class Example {
    public static void main(String[] args) {
        ApiClient defaultClient = Configuration.getDefaultApiClient();
        defaultClient.setBasePath("https://api.telnyx.com/v2");
        
        // Configure HTTP bearer authorization: bearerAuth
        HttpBearerAuth bearerAuth = (HttpBearerAuth) defaultClient.getAuthentication("bearerAuth");
        bearerAuth.setBearerToken("BEARER TOKEN");

        BrandsApi apiInstance = new BrandsApi(defaultClient);
        String brandId = "brandId_example"; // String | 
        try {
            Object result = apiInstance.deleteBrand(brandId);
            System.out.println(result);
        } catch (ApiException e) {
            System.err.println("Exception when calling BrandsApi#deleteBrand");
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
 **brandId** | **String**|  |

### Return type

**Object**

### Authorization

[bearerAuth](../README.md#bearerAuth)

### HTTP request headers

- **Content-Type**: Not defined
- **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | Successful Response |  -  |
| **422** | Validation Error |  -  |


## getBrand

> TelnyxBrandWithCampaignsCount getBrand(brandId)

Get Brand

Retrieve a brand by `brandId`.

### Example

```java
// Import classes:
import com.telnyx.sdk.ApiClient;
import com.telnyx.sdk.ApiException;
import com.telnyx.sdk.Configuration;
import com.telnyx.sdk.auth.*;
import com.telnyx.sdk.model.*;
import com.telnyx.sdk.api.BrandsApi;

public class Example {
    public static void main(String[] args) {
        ApiClient defaultClient = Configuration.getDefaultApiClient();
        defaultClient.setBasePath("https://api.telnyx.com/v2");
        
        // Configure HTTP bearer authorization: bearerAuth
        HttpBearerAuth bearerAuth = (HttpBearerAuth) defaultClient.getAuthentication("bearerAuth");
        bearerAuth.setBearerToken("BEARER TOKEN");

        BrandsApi apiInstance = new BrandsApi(defaultClient);
        String brandId = "brandId_example"; // String | 
        try {
            TelnyxBrandWithCampaignsCount result = apiInstance.getBrand(brandId);
            System.out.println(result);
        } catch (ApiException e) {
            System.err.println("Exception when calling BrandsApi#getBrand");
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
 **brandId** | **String**|  |

### Return type

[**TelnyxBrandWithCampaignsCount**](TelnyxBrandWithCampaignsCount.md)

### Authorization

[bearerAuth](../README.md#bearerAuth)

### HTTP request headers

- **Content-Type**: Not defined
- **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | Successful Response |  -  |
| **422** | Validation Error |  -  |


## getBrandFeedbackById

> BrandFeedback getBrandFeedbackById(brandId)

Get Brand Feedback By Id

Get feedback about a brand by ID. This endpoint can be used after creating or revetting
a brand.

Possible values for `.category[].id`:

* `TAX_ID` - Data mismatch related to tax id and its associated properties.
* `STOCK_SYMBOL` - Non public entity registered as a public for profit entity or
  the stock information mismatch.
* `GOVERNMENT_ENTITY` - Non government entity registered as a government entity.
  Must be a U.S. government entity.
* `NONPROFIT` - Not a recognized non-profit entity. No IRS tax-exempt status
  found.
* `OTHERS` - Details of the data misrepresentation if any.

### Example

```java
// Import classes:
import com.telnyx.sdk.ApiClient;
import com.telnyx.sdk.ApiException;
import com.telnyx.sdk.Configuration;
import com.telnyx.sdk.auth.*;
import com.telnyx.sdk.model.*;
import com.telnyx.sdk.api.BrandsApi;

public class Example {
    public static void main(String[] args) {
        ApiClient defaultClient = Configuration.getDefaultApiClient();
        defaultClient.setBasePath("https://api.telnyx.com/v2");
        
        // Configure HTTP bearer authorization: bearerAuth
        HttpBearerAuth bearerAuth = (HttpBearerAuth) defaultClient.getAuthentication("bearerAuth");
        bearerAuth.setBearerToken("BEARER TOKEN");

        BrandsApi apiInstance = new BrandsApi(defaultClient);
        String brandId = "brandId_example"; // String | 
        try {
            BrandFeedback result = apiInstance.getBrandFeedbackById(brandId);
            System.out.println(result);
        } catch (ApiException e) {
            System.err.println("Exception when calling BrandsApi#getBrandFeedbackById");
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
 **brandId** | **String**|  |

### Return type

[**BrandFeedback**](BrandFeedback.md)

### Authorization

[bearerAuth](../README.md#bearerAuth)

### HTTP request headers

- **Content-Type**: Not defined
- **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | Successful Response |  -  |
| **422** | Validation Error |  -  |


## getBrands

> BrandRecordSetCSP getBrands(page, recordsPerPage, sort, displayName, entityType, state, country, brandId, tcrBrandId)

List Brands

This endpoint is used to list all brands associated with your organization.

### Example

```java
// Import classes:
import com.telnyx.sdk.ApiClient;
import com.telnyx.sdk.ApiException;
import com.telnyx.sdk.Configuration;
import com.telnyx.sdk.auth.*;
import com.telnyx.sdk.model.*;
import com.telnyx.sdk.api.BrandsApi;

public class Example {
    public static void main(String[] args) {
        ApiClient defaultClient = Configuration.getDefaultApiClient();
        defaultClient.setBasePath("https://api.telnyx.com/v2");
        
        // Configure HTTP bearer authorization: bearerAuth
        HttpBearerAuth bearerAuth = (HttpBearerAuth) defaultClient.getAuthentication("bearerAuth");
        bearerAuth.setBearerToken("BEARER TOKEN");

        BrandsApi apiInstance = new BrandsApi(defaultClient);
        Integer page = 1; // Integer | 
        Integer recordsPerPage = 10; // Integer | number of records per page. maximum of 500
        String sort = "assignedCampaignsCount"; // String | Specifies the sort order for results. If not given, results are sorted by createdAt in descending order.
        String displayName = "displayName_example"; // String | 
        String entityType = "entityType_example"; // String | 
        String state = "state_example"; // String | 
        String country = "country_example"; // String | 
        String brandId = "826ef77a-348c-445b-81a5-a9b13c68fbfe"; // String | Filter results by the Telnyx Brand id
        String tcrBrandId = "BBAND1"; // String | Filter results by the TCR Brand id
        try {
            BrandRecordSetCSP result = apiInstance.getBrands(page, recordsPerPage, sort, displayName, entityType, state, country, brandId, tcrBrandId);
            System.out.println(result);
        } catch (ApiException e) {
            System.err.println("Exception when calling BrandsApi#getBrands");
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
 **page** | **Integer**|  | [optional] [default to 1]
 **recordsPerPage** | **Integer**| number of records per page. maximum of 500 | [optional] [default to 10]
 **sort** | **String**| Specifies the sort order for results. If not given, results are sorted by createdAt in descending order. | [optional] [default to -createdAt] [enum: assignedCampaignsCount, -assignedCampaignsCount, brandId, -brandId, createdAt, -createdAt, displayName, -displayName, identityStatus, -identityStatus, status, -status, tcrBrandId, -tcrBrandId]
 **displayName** | **String**|  | [optional]
 **entityType** | **String**|  | [optional]
 **state** | **String**|  | [optional]
 **country** | **String**|  | [optional]
 **brandId** | **String**| Filter results by the Telnyx Brand id | [optional]
 **tcrBrandId** | **String**| Filter results by the TCR Brand id | [optional]

### Return type

[**BrandRecordSetCSP**](BrandRecordSetCSP.md)

### Authorization

[bearerAuth](../README.md#bearerAuth)

### HTTP request headers

- **Content-Type**: Not defined
- **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | Successful Response |  -  |
| **422** | Validation Error |  -  |


## listExternalVettings

> Object listExternalVettings(brandId)

List External Vettings

Get list of valid external vetting record for a given brand

### Example

```java
// Import classes:
import com.telnyx.sdk.ApiClient;
import com.telnyx.sdk.ApiException;
import com.telnyx.sdk.Configuration;
import com.telnyx.sdk.auth.*;
import com.telnyx.sdk.model.*;
import com.telnyx.sdk.api.BrandsApi;

public class Example {
    public static void main(String[] args) {
        ApiClient defaultClient = Configuration.getDefaultApiClient();
        defaultClient.setBasePath("https://api.telnyx.com/v2");
        
        // Configure HTTP bearer authorization: bearerAuth
        HttpBearerAuth bearerAuth = (HttpBearerAuth) defaultClient.getAuthentication("bearerAuth");
        bearerAuth.setBearerToken("BEARER TOKEN");

        BrandsApi apiInstance = new BrandsApi(defaultClient);
        String brandId = "brandId_example"; // String | 
        try {
            Object result = apiInstance.listExternalVettings(brandId);
            System.out.println(result);
        } catch (ApiException e) {
            System.err.println("Exception when calling BrandsApi#listExternalVettings");
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
 **brandId** | **String**|  |

### Return type

**Object**

### Authorization

[bearerAuth](../README.md#bearerAuth)

### HTTP request headers

- **Content-Type**: Not defined
- **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | Successful Response |  -  |
| **422** | Validation Error |  -  |


## postOrderExternalVetting

> Object postOrderExternalVetting(brandId, orderExternalVetting)

Order Brand External Vetting

Order new external vetting for a brand

### Example

```java
// Import classes:
import com.telnyx.sdk.ApiClient;
import com.telnyx.sdk.ApiException;
import com.telnyx.sdk.Configuration;
import com.telnyx.sdk.auth.*;
import com.telnyx.sdk.model.*;
import com.telnyx.sdk.api.BrandsApi;

public class Example {
    public static void main(String[] args) {
        ApiClient defaultClient = Configuration.getDefaultApiClient();
        defaultClient.setBasePath("https://api.telnyx.com/v2");
        
        // Configure HTTP bearer authorization: bearerAuth
        HttpBearerAuth bearerAuth = (HttpBearerAuth) defaultClient.getAuthentication("bearerAuth");
        bearerAuth.setBearerToken("BEARER TOKEN");

        BrandsApi apiInstance = new BrandsApi(defaultClient);
        String brandId = "brandId_example"; // String | 
        OrderExternalVetting orderExternalVetting = new OrderExternalVetting(); // OrderExternalVetting | 
        try {
            Object result = apiInstance.postOrderExternalVetting(brandId, orderExternalVetting);
            System.out.println(result);
        } catch (ApiException e) {
            System.err.println("Exception when calling BrandsApi#postOrderExternalVetting");
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
 **brandId** | **String**|  |
 **orderExternalVetting** | [**OrderExternalVetting**](OrderExternalVetting.md)|  |

### Return type

**Object**

### Authorization

[bearerAuth](../README.md#bearerAuth)

### HTTP request headers

- **Content-Type**: application/json
- **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | Successful Response |  -  |
| **422** | Validation Error |  -  |


## putExternalVettingRecord

> ExternalVetting putExternalVettingRecord(brandId, importExternalVetting)

Import External Vetting Record

This operation can be used to import an external vetting record from a TCR-approved
vetting provider. If the vetting provider confirms validity of the record, it will be
saved with the brand and will be considered for future campaign qualification.

### Example

```java
// Import classes:
import com.telnyx.sdk.ApiClient;
import com.telnyx.sdk.ApiException;
import com.telnyx.sdk.Configuration;
import com.telnyx.sdk.auth.*;
import com.telnyx.sdk.model.*;
import com.telnyx.sdk.api.BrandsApi;

public class Example {
    public static void main(String[] args) {
        ApiClient defaultClient = Configuration.getDefaultApiClient();
        defaultClient.setBasePath("https://api.telnyx.com/v2");
        
        // Configure HTTP bearer authorization: bearerAuth
        HttpBearerAuth bearerAuth = (HttpBearerAuth) defaultClient.getAuthentication("bearerAuth");
        bearerAuth.setBearerToken("BEARER TOKEN");

        BrandsApi apiInstance = new BrandsApi(defaultClient);
        String brandId = "brandId_example"; // String | 
        ImportExternalVetting importExternalVetting = new ImportExternalVetting(); // ImportExternalVetting | 
        try {
            ExternalVetting result = apiInstance.putExternalVettingRecord(brandId, importExternalVetting);
            System.out.println(result);
        } catch (ApiException e) {
            System.err.println("Exception when calling BrandsApi#putExternalVettingRecord");
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
 **brandId** | **String**|  |
 **importExternalVetting** | [**ImportExternalVetting**](ImportExternalVetting.md)|  |

### Return type

[**ExternalVetting**](ExternalVetting.md)

### Authorization

[bearerAuth](../README.md#bearerAuth)

### HTTP request headers

- **Content-Type**: application/json
- **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | Successful Response |  -  |
| **422** | Validation Error |  -  |


## resendBrand2faEmail

> resendBrand2faEmail(brandId)

Resend brand 2FA email

### Example

```java
// Import classes:
import com.telnyx.sdk.ApiClient;
import com.telnyx.sdk.ApiException;
import com.telnyx.sdk.Configuration;
import com.telnyx.sdk.auth.*;
import com.telnyx.sdk.model.*;
import com.telnyx.sdk.api.BrandsApi;

public class Example {
    public static void main(String[] args) {
        ApiClient defaultClient = Configuration.getDefaultApiClient();
        defaultClient.setBasePath("https://api.telnyx.com/v2");
        
        // Configure HTTP bearer authorization: bearerAuth
        HttpBearerAuth bearerAuth = (HttpBearerAuth) defaultClient.getAuthentication("bearerAuth");
        bearerAuth.setBearerToken("BEARER TOKEN");

        BrandsApi apiInstance = new BrandsApi(defaultClient);
        String brandId = "brandId_example"; // String | 
        try {
            apiInstance.resendBrand2faEmail(brandId);
        } catch (ApiException e) {
            System.err.println("Exception when calling BrandsApi#resendBrand2faEmail");
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
 **brandId** | **String**|  |

### Return type

null (empty response body)

### Authorization

[bearerAuth](../README.md#bearerAuth)

### HTTP request headers

- **Content-Type**: Not defined
- **Accept**: Not defined

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | Successful Response |  -  |


## revetBrand

> Object revetBrand(brandId)

Revet Brand

This operation allows you to revet the brand. However, revetting is allowed once after the successful brand registration and thereafter limited to once every 3 months.

### Example

```java
// Import classes:
import com.telnyx.sdk.ApiClient;
import com.telnyx.sdk.ApiException;
import com.telnyx.sdk.Configuration;
import com.telnyx.sdk.auth.*;
import com.telnyx.sdk.model.*;
import com.telnyx.sdk.api.BrandsApi;

public class Example {
    public static void main(String[] args) {
        ApiClient defaultClient = Configuration.getDefaultApiClient();
        defaultClient.setBasePath("https://api.telnyx.com/v2");
        
        // Configure HTTP bearer authorization: bearerAuth
        HttpBearerAuth bearerAuth = (HttpBearerAuth) defaultClient.getAuthentication("bearerAuth");
        bearerAuth.setBearerToken("BEARER TOKEN");

        BrandsApi apiInstance = new BrandsApi(defaultClient);
        String brandId = "brandId_example"; // String | 
        try {
            Object result = apiInstance.revetBrand(brandId);
            System.out.println(result);
        } catch (ApiException e) {
            System.err.println("Exception when calling BrandsApi#revetBrand");
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
 **brandId** | **String**|  |

### Return type

**Object**

### Authorization

[bearerAuth](../README.md#bearerAuth)

### HTTP request headers

- **Content-Type**: Not defined
- **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | Successful Response |  -  |
| **422** | Validation Error |  -  |


## updateBrand

> TelnyxBrand updateBrand(brandId, updateBrand)

Update Brand

Update a brand's attributes by `brandId`.

### Example

```java
// Import classes:
import com.telnyx.sdk.ApiClient;
import com.telnyx.sdk.ApiException;
import com.telnyx.sdk.Configuration;
import com.telnyx.sdk.auth.*;
import com.telnyx.sdk.model.*;
import com.telnyx.sdk.api.BrandsApi;

public class Example {
    public static void main(String[] args) {
        ApiClient defaultClient = Configuration.getDefaultApiClient();
        defaultClient.setBasePath("https://api.telnyx.com/v2");
        
        // Configure HTTP bearer authorization: bearerAuth
        HttpBearerAuth bearerAuth = (HttpBearerAuth) defaultClient.getAuthentication("bearerAuth");
        bearerAuth.setBearerToken("BEARER TOKEN");

        BrandsApi apiInstance = new BrandsApi(defaultClient);
        String brandId = "brandId_example"; // String | 
        UpdateBrand updateBrand = new UpdateBrand(); // UpdateBrand | 
        try {
            TelnyxBrand result = apiInstance.updateBrand(brandId, updateBrand);
            System.out.println(result);
        } catch (ApiException e) {
            System.err.println("Exception when calling BrandsApi#updateBrand");
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
 **brandId** | **String**|  |
 **updateBrand** | [**UpdateBrand**](UpdateBrand.md)|  |

### Return type

[**TelnyxBrand**](TelnyxBrand.md)

### Authorization

[bearerAuth](../README.md#bearerAuth)

### HTTP request headers

- **Content-Type**: application/json
- **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | Successful Response |  -  |
| **422** | Validation Error |  -  |

