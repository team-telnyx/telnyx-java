# NotificationsApi

All URIs are relative to *https://api.telnyx.com/v2*

Method | HTTP request | Description
------------- | ------------- | -------------
[**createNotificationChannels**](NotificationsApi.md#createNotificationChannels) | **POST** /notification_channels | Create a notification channel
[**createNotificationProfile**](NotificationsApi.md#createNotificationProfile) | **POST** /notification_profiles | Create a notification profile
[**createNotificationSetting**](NotificationsApi.md#createNotificationSetting) | **POST** /notification_settings | Add a Notification Setting
[**deleteNotificationChannel**](NotificationsApi.md#deleteNotificationChannel) | **DELETE** /notification_channels/{id} | Delete a notification channel
[**deleteNotificationProfile**](NotificationsApi.md#deleteNotificationProfile) | **DELETE** /notification_profiles/{id} | Delete a notification profile
[**deleteNotificationSetting**](NotificationsApi.md#deleteNotificationSetting) | **DELETE** /notification_settings/{id} | Delete a notification setting
[**findNotificationsEvents**](NotificationsApi.md#findNotificationsEvents) | **GET** /notification_events | List all Notifications Events
[**findNotificationsEventsConditions**](NotificationsApi.md#findNotificationsEventsConditions) | **GET** /notification_event_conditions | List all Notifications Events Conditions
[**findNotificationsProfiles**](NotificationsApi.md#findNotificationsProfiles) | **GET** /notification_profiles | List all Notifications Profiles
[**listNotificationChannels**](NotificationsApi.md#listNotificationChannels) | **GET** /notification_channels | List notification channels
[**listNotificationSettings**](NotificationsApi.md#listNotificationSettings) | **GET** /notification_settings | List notification settings
[**retrieveNotificationChannel**](NotificationsApi.md#retrieveNotificationChannel) | **GET** /notification_channels/{id} | Retrieve a notification channel
[**retrieveNotificationProfile**](NotificationsApi.md#retrieveNotificationProfile) | **GET** /notification_profiles/{id} | Retrieve a notification profile
[**retrieveNotificationSetting**](NotificationsApi.md#retrieveNotificationSetting) | **GET** /notification_settings/{id} | Retrieve a notification setting
[**updateNotificationChannel**](NotificationsApi.md#updateNotificationChannel) | **PATCH** /notification_channels/{id} | Update a notification channel
[**updateNotificationProfile**](NotificationsApi.md#updateNotificationProfile) | **PATCH** /notification_profiles/{id} | Update a notification profile



## createNotificationChannels

> CreateNotificationChannel createNotificationChannels(notificationChannel)

Create a notification channel

Create a notification channel.

### Example

```java
// Import classes:
import com.telnyx.sdk.ApiClient;
import com.telnyx.sdk.ApiException;
import com.telnyx.sdk.Configuration;
import com.telnyx.sdk.auth.*;
import com.telnyx.sdk.model.*;
import com.telnyx.sdk.api.NotificationsApi;

public class Example {
    public static void main(String[] args) {
        ApiClient defaultClient = Configuration.getDefaultApiClient();
        defaultClient.setBasePath("https://api.telnyx.com/v2");
        
        // Configure HTTP bearer authorization: bearerAuth
        HttpBearerAuth bearerAuth = (HttpBearerAuth) defaultClient.getAuthentication("bearerAuth");
        bearerAuth.setBearerToken("BEARER TOKEN");

        NotificationsApi apiInstance = new NotificationsApi(defaultClient);
        NotificationChannel notificationChannel = new NotificationChannel(); // NotificationChannel | Add a Notification Channel
        try {
            CreateNotificationChannel result = apiInstance.createNotificationChannels(notificationChannel);
            System.out.println(result);
        } catch (ApiException e) {
            System.err.println("Exception when calling NotificationsApi#createNotificationChannels");
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
 **notificationChannel** | [**NotificationChannel**](NotificationChannel.md)| Add a Notification Channel | [optional]

### Return type

[**CreateNotificationChannel**](CreateNotificationChannel.md)

### Authorization

[bearerAuth](../README.md#bearerAuth)

### HTTP request headers

- **Content-Type**: application/json
- **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | A Notification Channel response |  -  |
| **0** | Unexpected error |  -  |


## createNotificationProfile

> CreateNotificationProfile createNotificationProfile(notificationProfile)

Create a notification profile

Create a notification profile.

### Example

```java
// Import classes:
import com.telnyx.sdk.ApiClient;
import com.telnyx.sdk.ApiException;
import com.telnyx.sdk.Configuration;
import com.telnyx.sdk.auth.*;
import com.telnyx.sdk.model.*;
import com.telnyx.sdk.api.NotificationsApi;

public class Example {
    public static void main(String[] args) {
        ApiClient defaultClient = Configuration.getDefaultApiClient();
        defaultClient.setBasePath("https://api.telnyx.com/v2");
        
        // Configure HTTP bearer authorization: bearerAuth
        HttpBearerAuth bearerAuth = (HttpBearerAuth) defaultClient.getAuthentication("bearerAuth");
        bearerAuth.setBearerToken("BEARER TOKEN");

        NotificationsApi apiInstance = new NotificationsApi(defaultClient);
        NotificationProfile notificationProfile = new NotificationProfile(); // NotificationProfile | Add a Notification Profile
        try {
            CreateNotificationProfile result = apiInstance.createNotificationProfile(notificationProfile);
            System.out.println(result);
        } catch (ApiException e) {
            System.err.println("Exception when calling NotificationsApi#createNotificationProfile");
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
 **notificationProfile** | [**NotificationProfile**](NotificationProfile.md)| Add a Notification Profile | [optional]

### Return type

[**CreateNotificationProfile**](CreateNotificationProfile.md)

### Authorization

[bearerAuth](../README.md#bearerAuth)

### HTTP request headers

- **Content-Type**: application/json
- **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | A Notification Profile response |  -  |
| **0** | Unexpected error |  -  |


## createNotificationSetting

> CreateNotificationSetting createNotificationSetting(notificationSetting)

Add a Notification Setting

Add a notification setting.

### Example

```java
// Import classes:
import com.telnyx.sdk.ApiClient;
import com.telnyx.sdk.ApiException;
import com.telnyx.sdk.Configuration;
import com.telnyx.sdk.auth.*;
import com.telnyx.sdk.model.*;
import com.telnyx.sdk.api.NotificationsApi;

public class Example {
    public static void main(String[] args) {
        ApiClient defaultClient = Configuration.getDefaultApiClient();
        defaultClient.setBasePath("https://api.telnyx.com/v2");
        
        // Configure HTTP bearer authorization: bearerAuth
        HttpBearerAuth bearerAuth = (HttpBearerAuth) defaultClient.getAuthentication("bearerAuth");
        bearerAuth.setBearerToken("BEARER TOKEN");

        NotificationsApi apiInstance = new NotificationsApi(defaultClient);
        NotificationSetting notificationSetting = new NotificationSetting(); // NotificationSetting | 
        try {
            CreateNotificationSetting result = apiInstance.createNotificationSetting(notificationSetting);
            System.out.println(result);
        } catch (ApiException e) {
            System.err.println("Exception when calling NotificationsApi#createNotificationSetting");
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
 **notificationSetting** | [**NotificationSetting**](NotificationSetting.md)|  | [optional]

### Return type

[**CreateNotificationSetting**](CreateNotificationSetting.md)

### Authorization

[bearerAuth](../README.md#bearerAuth)

### HTTP request headers

- **Content-Type**: application/json
- **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | A Notification Setting response |  -  |
| **201** | A Notification Setting response - async |  -  |
| **0** | Unexpected error |  -  |


## deleteNotificationChannel

> DeleteNotificationChannel deleteNotificationChannel(id)

Delete a notification channel

Delete a notification channel.

### Example

```java
import java.util.UUID;
// Import classes:
import com.telnyx.sdk.ApiClient;
import com.telnyx.sdk.ApiException;
import com.telnyx.sdk.Configuration;
import com.telnyx.sdk.auth.*;
import com.telnyx.sdk.model.*;
import com.telnyx.sdk.api.NotificationsApi;

public class Example {
    public static void main(String[] args) {
        ApiClient defaultClient = Configuration.getDefaultApiClient();
        defaultClient.setBasePath("https://api.telnyx.com/v2");
        
        // Configure HTTP bearer authorization: bearerAuth
        HttpBearerAuth bearerAuth = (HttpBearerAuth) defaultClient.getAuthentication("bearerAuth");
        bearerAuth.setBearerToken("BEARER TOKEN");

        NotificationsApi apiInstance = new NotificationsApi(defaultClient);
        UUID id = UUID.fromString("6a09cdc3-8948-47f0-aa62-74ac943d6c58"); // UUID | Identifies the resource.
        try {
            DeleteNotificationChannel result = apiInstance.deleteNotificationChannel(id);
            System.out.println(result);
        } catch (ApiException e) {
            System.err.println("Exception when calling NotificationsApi#deleteNotificationChannel");
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
 **id** | **UUID**| Identifies the resource. |

### Return type

[**DeleteNotificationChannel**](DeleteNotificationChannel.md)

### Authorization

[bearerAuth](../README.md#bearerAuth)

### HTTP request headers

- **Content-Type**: Not defined
- **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | A Notification Channel response |  -  |
| **0** | Unexpected error |  -  |


## deleteNotificationProfile

> DeleteNotificationProfiles deleteNotificationProfile(id)

Delete a notification profile

Delete a notification profile.

### Example

```java
import java.util.UUID;
// Import classes:
import com.telnyx.sdk.ApiClient;
import com.telnyx.sdk.ApiException;
import com.telnyx.sdk.Configuration;
import com.telnyx.sdk.auth.*;
import com.telnyx.sdk.model.*;
import com.telnyx.sdk.api.NotificationsApi;

public class Example {
    public static void main(String[] args) {
        ApiClient defaultClient = Configuration.getDefaultApiClient();
        defaultClient.setBasePath("https://api.telnyx.com/v2");
        
        // Configure HTTP bearer authorization: bearerAuth
        HttpBearerAuth bearerAuth = (HttpBearerAuth) defaultClient.getAuthentication("bearerAuth");
        bearerAuth.setBearerToken("BEARER TOKEN");

        NotificationsApi apiInstance = new NotificationsApi(defaultClient);
        UUID id = UUID.fromString("6a09cdc3-8948-47f0-aa62-74ac943d6c58"); // UUID | Identifies the resource.
        try {
            DeleteNotificationProfiles result = apiInstance.deleteNotificationProfile(id);
            System.out.println(result);
        } catch (ApiException e) {
            System.err.println("Exception when calling NotificationsApi#deleteNotificationProfile");
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
 **id** | **UUID**| Identifies the resource. |

### Return type

[**DeleteNotificationProfiles**](DeleteNotificationProfiles.md)

### Authorization

[bearerAuth](../README.md#bearerAuth)

### HTTP request headers

- **Content-Type**: Not defined
- **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | A Notification Profile response |  -  |
| **0** | Unexpected error |  -  |


## deleteNotificationSetting

> DeleteNotificationSetting deleteNotificationSetting(id)

Delete a notification setting

Delete a notification setting.

### Example

```java
import java.util.UUID;
// Import classes:
import com.telnyx.sdk.ApiClient;
import com.telnyx.sdk.ApiException;
import com.telnyx.sdk.Configuration;
import com.telnyx.sdk.auth.*;
import com.telnyx.sdk.model.*;
import com.telnyx.sdk.api.NotificationsApi;

public class Example {
    public static void main(String[] args) {
        ApiClient defaultClient = Configuration.getDefaultApiClient();
        defaultClient.setBasePath("https://api.telnyx.com/v2");
        
        // Configure HTTP bearer authorization: bearerAuth
        HttpBearerAuth bearerAuth = (HttpBearerAuth) defaultClient.getAuthentication("bearerAuth");
        bearerAuth.setBearerToken("BEARER TOKEN");

        NotificationsApi apiInstance = new NotificationsApi(defaultClient);
        UUID id = UUID.fromString("6a09cdc3-8948-47f0-aa62-74ac943d6c58"); // UUID | Identifies the resource.
        try {
            DeleteNotificationSetting result = apiInstance.deleteNotificationSetting(id);
            System.out.println(result);
        } catch (ApiException e) {
            System.err.println("Exception when calling NotificationsApi#deleteNotificationSetting");
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
 **id** | **UUID**| Identifies the resource. |

### Return type

[**DeleteNotificationSetting**](DeleteNotificationSetting.md)

### Authorization

[bearerAuth](../README.md#bearerAuth)

### HTTP request headers

- **Content-Type**: Not defined
- **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | A Notification Setting response |  -  |
| **201** | A Notification Setting response - async |  -  |
| **0** | Unexpected error |  -  |


## findNotificationsEvents

> ListNotificationEvents findNotificationsEvents(pageNumber, pageSize)

List all Notifications Events

Returns a list of your notifications events.

### Example

```java
// Import classes:
import com.telnyx.sdk.ApiClient;
import com.telnyx.sdk.ApiException;
import com.telnyx.sdk.Configuration;
import com.telnyx.sdk.auth.*;
import com.telnyx.sdk.model.*;
import com.telnyx.sdk.api.NotificationsApi;

public class Example {
    public static void main(String[] args) {
        ApiClient defaultClient = Configuration.getDefaultApiClient();
        defaultClient.setBasePath("https://api.telnyx.com/v2");
        
        // Configure HTTP bearer authorization: bearerAuth
        HttpBearerAuth bearerAuth = (HttpBearerAuth) defaultClient.getAuthentication("bearerAuth");
        bearerAuth.setBearerToken("BEARER TOKEN");

        NotificationsApi apiInstance = new NotificationsApi(defaultClient);
        Integer pageNumber = 1; // Integer | The page number to load
        Integer pageSize = 20; // Integer | The size of the page
        try {
            ListNotificationEvents result = apiInstance.findNotificationsEvents(pageNumber, pageSize);
            System.out.println(result);
        } catch (ApiException e) {
            System.err.println("Exception when calling NotificationsApi#findNotificationsEvents");
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

### Return type

[**ListNotificationEvents**](ListNotificationEvents.md)

### Authorization

[bearerAuth](../README.md#bearerAuth)

### HTTP request headers

- **Content-Type**: Not defined
- **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | Returns a list of notification events available. |  -  |
| **0** | Unexpected error |  -  |


## findNotificationsEventsConditions

> ListNotificationEvenConditions findNotificationsEventsConditions(pageNumber, pageSize, filterAssociatedRecordTypeEq)

List all Notifications Events Conditions

Returns a list of your notifications events conditions.

### Example

```java
// Import classes:
import com.telnyx.sdk.ApiClient;
import com.telnyx.sdk.ApiException;
import com.telnyx.sdk.Configuration;
import com.telnyx.sdk.auth.*;
import com.telnyx.sdk.model.*;
import com.telnyx.sdk.api.NotificationsApi;

public class Example {
    public static void main(String[] args) {
        ApiClient defaultClient = Configuration.getDefaultApiClient();
        defaultClient.setBasePath("https://api.telnyx.com/v2");
        
        // Configure HTTP bearer authorization: bearerAuth
        HttpBearerAuth bearerAuth = (HttpBearerAuth) defaultClient.getAuthentication("bearerAuth");
        bearerAuth.setBearerToken("BEARER TOKEN");

        NotificationsApi apiInstance = new NotificationsApi(defaultClient);
        Integer pageNumber = 1; // Integer | The page number to load
        Integer pageSize = 20; // Integer | The size of the page
        String filterAssociatedRecordTypeEq = "account"; // String | Filter by the associated record type
        try {
            ListNotificationEvenConditions result = apiInstance.findNotificationsEventsConditions(pageNumber, pageSize, filterAssociatedRecordTypeEq);
            System.out.println(result);
        } catch (ApiException e) {
            System.err.println("Exception when calling NotificationsApi#findNotificationsEventsConditions");
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
 **filterAssociatedRecordTypeEq** | **String**| Filter by the associated record type | [optional] [enum: account, phone_number]

### Return type

[**ListNotificationEvenConditions**](ListNotificationEvenConditions.md)

### Authorization

[bearerAuth](../README.md#bearerAuth)

### HTTP request headers

- **Content-Type**: Not defined
- **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | Returns a list of notification event conditions available. |  -  |
| **0** | Unexpected error |  -  |


## findNotificationsProfiles

> ListNotificationProfiles findNotificationsProfiles(pageNumber, pageSize)

List all Notifications Profiles

Returns a list of your notifications profiles.

### Example

```java
// Import classes:
import com.telnyx.sdk.ApiClient;
import com.telnyx.sdk.ApiException;
import com.telnyx.sdk.Configuration;
import com.telnyx.sdk.auth.*;
import com.telnyx.sdk.model.*;
import com.telnyx.sdk.api.NotificationsApi;

public class Example {
    public static void main(String[] args) {
        ApiClient defaultClient = Configuration.getDefaultApiClient();
        defaultClient.setBasePath("https://api.telnyx.com/v2");
        
        // Configure HTTP bearer authorization: bearerAuth
        HttpBearerAuth bearerAuth = (HttpBearerAuth) defaultClient.getAuthentication("bearerAuth");
        bearerAuth.setBearerToken("BEARER TOKEN");

        NotificationsApi apiInstance = new NotificationsApi(defaultClient);
        Integer pageNumber = 1; // Integer | The page number to load
        Integer pageSize = 20; // Integer | The size of the page
        try {
            ListNotificationProfiles result = apiInstance.findNotificationsProfiles(pageNumber, pageSize);
            System.out.println(result);
        } catch (ApiException e) {
            System.err.println("Exception when calling NotificationsApi#findNotificationsProfiles");
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

### Return type

[**ListNotificationProfiles**](ListNotificationProfiles.md)

### Authorization

[bearerAuth](../README.md#bearerAuth)

### HTTP request headers

- **Content-Type**: Not defined
- **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | Returns a list of notification profiles. |  -  |
| **0** | Unexpected error |  -  |


## listNotificationChannels

> ListNotificationChannels listNotificationChannels(pageNumber, pageSize, filterChannelTypeIdEq)

List notification channels

List notification channels.

### Example

```java
// Import classes:
import com.telnyx.sdk.ApiClient;
import com.telnyx.sdk.ApiException;
import com.telnyx.sdk.Configuration;
import com.telnyx.sdk.auth.*;
import com.telnyx.sdk.model.*;
import com.telnyx.sdk.api.NotificationsApi;

public class Example {
    public static void main(String[] args) {
        ApiClient defaultClient = Configuration.getDefaultApiClient();
        defaultClient.setBasePath("https://api.telnyx.com/v2");
        
        // Configure HTTP bearer authorization: bearerAuth
        HttpBearerAuth bearerAuth = (HttpBearerAuth) defaultClient.getAuthentication("bearerAuth");
        bearerAuth.setBearerToken("BEARER TOKEN");

        NotificationsApi apiInstance = new NotificationsApi(defaultClient);
        Integer pageNumber = 1; // Integer | The page number to load
        Integer pageSize = 20; // Integer | The size of the page
        String filterChannelTypeIdEq = "webhook"; // String | Filter by the id of a channel type
        try {
            ListNotificationChannels result = apiInstance.listNotificationChannels(pageNumber, pageSize, filterChannelTypeIdEq);
            System.out.println(result);
        } catch (ApiException e) {
            System.err.println("Exception when calling NotificationsApi#listNotificationChannels");
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
 **filterChannelTypeIdEq** | **String**| Filter by the id of a channel type | [optional] [enum: webhook, sms, email, voice]

### Return type

[**ListNotificationChannels**](ListNotificationChannels.md)

### Authorization

[bearerAuth](../README.md#bearerAuth)

### HTTP request headers

- **Content-Type**: Not defined
- **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | Returns a list of notification channels. |  -  |
| **0** | Unexpected error |  -  |


## listNotificationSettings

> ListNotificationSettings listNotificationSettings(pageNumber, pageSize, filterNotificationProfileIdEq, filterNotificationChannelEq, filterNotificationEventConditionIdEq, filterAssociatedRecordTypeEq, filterStatusEq)

List notification settings

List notification settings.

### Example

```java
// Import classes:
import com.telnyx.sdk.ApiClient;
import com.telnyx.sdk.ApiException;
import com.telnyx.sdk.Configuration;
import com.telnyx.sdk.auth.*;
import com.telnyx.sdk.model.*;
import com.telnyx.sdk.api.NotificationsApi;

public class Example {
    public static void main(String[] args) {
        ApiClient defaultClient = Configuration.getDefaultApiClient();
        defaultClient.setBasePath("https://api.telnyx.com/v2");
        
        // Configure HTTP bearer authorization: bearerAuth
        HttpBearerAuth bearerAuth = (HttpBearerAuth) defaultClient.getAuthentication("bearerAuth");
        bearerAuth.setBearerToken("BEARER TOKEN");

        NotificationsApi apiInstance = new NotificationsApi(defaultClient);
        Integer pageNumber = 1; // Integer | The page number to load
        Integer pageSize = 20; // Integer | The size of the page
        String filterNotificationProfileIdEq = "12455643-3cf1-4683-ad23-1cd32f7d5e0a"; // String | Filter by the id of a notification profile
        String filterNotificationChannelEq = "12455643-3cf1-4683-ad23-1cd32f7d5e0a"; // String | Filter by the id of a notification channel
        String filterNotificationEventConditionIdEq = "12455643-3cf1-4683-ad23-1cd32f7d5e0a"; // String | Filter by the id of a notification channel
        String filterAssociatedRecordTypeEq = "account"; // String | Filter by the associated record type
        String filterStatusEq = "enabled"; // String | The status of a notification setting
        try {
            ListNotificationSettings result = apiInstance.listNotificationSettings(pageNumber, pageSize, filterNotificationProfileIdEq, filterNotificationChannelEq, filterNotificationEventConditionIdEq, filterAssociatedRecordTypeEq, filterStatusEq);
            System.out.println(result);
        } catch (ApiException e) {
            System.err.println("Exception when calling NotificationsApi#listNotificationSettings");
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
 **filterNotificationProfileIdEq** | **String**| Filter by the id of a notification profile | [optional]
 **filterNotificationChannelEq** | **String**| Filter by the id of a notification channel | [optional]
 **filterNotificationEventConditionIdEq** | **String**| Filter by the id of a notification channel | [optional]
 **filterAssociatedRecordTypeEq** | **String**| Filter by the associated record type | [optional] [enum: account, phone_number]
 **filterStatusEq** | **String**| The status of a notification setting | [optional] [enum: enabled, enable-received, enable-pending, enable-submtited, delete-received, delete-pending, delete-submitted, deleted]

### Return type

[**ListNotificationSettings**](ListNotificationSettings.md)

### Authorization

[bearerAuth](../README.md#bearerAuth)

### HTTP request headers

- **Content-Type**: Not defined
- **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | Returns a list of notification settings. |  -  |
| **0** | Unexpected error |  -  |


## retrieveNotificationChannel

> RetrieveNotificationChannel retrieveNotificationChannel(id)

Retrieve a notification channel

Retrieve a notification channel.

### Example

```java
import java.util.UUID;
// Import classes:
import com.telnyx.sdk.ApiClient;
import com.telnyx.sdk.ApiException;
import com.telnyx.sdk.Configuration;
import com.telnyx.sdk.auth.*;
import com.telnyx.sdk.model.*;
import com.telnyx.sdk.api.NotificationsApi;

public class Example {
    public static void main(String[] args) {
        ApiClient defaultClient = Configuration.getDefaultApiClient();
        defaultClient.setBasePath("https://api.telnyx.com/v2");
        
        // Configure HTTP bearer authorization: bearerAuth
        HttpBearerAuth bearerAuth = (HttpBearerAuth) defaultClient.getAuthentication("bearerAuth");
        bearerAuth.setBearerToken("BEARER TOKEN");

        NotificationsApi apiInstance = new NotificationsApi(defaultClient);
        UUID id = UUID.fromString("6a09cdc3-8948-47f0-aa62-74ac943d6c58"); // UUID | Identifies the resource.
        try {
            RetrieveNotificationChannel result = apiInstance.retrieveNotificationChannel(id);
            System.out.println(result);
        } catch (ApiException e) {
            System.err.println("Exception when calling NotificationsApi#retrieveNotificationChannel");
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
 **id** | **UUID**| Identifies the resource. |

### Return type

[**RetrieveNotificationChannel**](RetrieveNotificationChannel.md)

### Authorization

[bearerAuth](../README.md#bearerAuth)

### HTTP request headers

- **Content-Type**: Not defined
- **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | A Notification Channel response |  -  |
| **0** | Unexpected error |  -  |


## retrieveNotificationProfile

> RetrieveNotificationProfile retrieveNotificationProfile(id)

Retrieve a notification profile

Retrieve a notification profile.

### Example

```java
import java.util.UUID;
// Import classes:
import com.telnyx.sdk.ApiClient;
import com.telnyx.sdk.ApiException;
import com.telnyx.sdk.Configuration;
import com.telnyx.sdk.auth.*;
import com.telnyx.sdk.model.*;
import com.telnyx.sdk.api.NotificationsApi;

public class Example {
    public static void main(String[] args) {
        ApiClient defaultClient = Configuration.getDefaultApiClient();
        defaultClient.setBasePath("https://api.telnyx.com/v2");
        
        // Configure HTTP bearer authorization: bearerAuth
        HttpBearerAuth bearerAuth = (HttpBearerAuth) defaultClient.getAuthentication("bearerAuth");
        bearerAuth.setBearerToken("BEARER TOKEN");

        NotificationsApi apiInstance = new NotificationsApi(defaultClient);
        UUID id = UUID.fromString("6a09cdc3-8948-47f0-aa62-74ac943d6c58"); // UUID | Identifies the resource.
        try {
            RetrieveNotificationProfile result = apiInstance.retrieveNotificationProfile(id);
            System.out.println(result);
        } catch (ApiException e) {
            System.err.println("Exception when calling NotificationsApi#retrieveNotificationProfile");
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
 **id** | **UUID**| Identifies the resource. |

### Return type

[**RetrieveNotificationProfile**](RetrieveNotificationProfile.md)

### Authorization

[bearerAuth](../README.md#bearerAuth)

### HTTP request headers

- **Content-Type**: Not defined
- **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | A Notification Profile response |  -  |
| **0** | Unexpected error |  -  |


## retrieveNotificationSetting

> RetrieveNotificationSetting retrieveNotificationSetting(id)

Retrieve a notification setting

Retrieve a notification setting.

### Example

```java
import java.util.UUID;
// Import classes:
import com.telnyx.sdk.ApiClient;
import com.telnyx.sdk.ApiException;
import com.telnyx.sdk.Configuration;
import com.telnyx.sdk.auth.*;
import com.telnyx.sdk.model.*;
import com.telnyx.sdk.api.NotificationsApi;

public class Example {
    public static void main(String[] args) {
        ApiClient defaultClient = Configuration.getDefaultApiClient();
        defaultClient.setBasePath("https://api.telnyx.com/v2");
        
        // Configure HTTP bearer authorization: bearerAuth
        HttpBearerAuth bearerAuth = (HttpBearerAuth) defaultClient.getAuthentication("bearerAuth");
        bearerAuth.setBearerToken("BEARER TOKEN");

        NotificationsApi apiInstance = new NotificationsApi(defaultClient);
        UUID id = UUID.fromString("6a09cdc3-8948-47f0-aa62-74ac943d6c58"); // UUID | Identifies the resource.
        try {
            RetrieveNotificationSetting result = apiInstance.retrieveNotificationSetting(id);
            System.out.println(result);
        } catch (ApiException e) {
            System.err.println("Exception when calling NotificationsApi#retrieveNotificationSetting");
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
 **id** | **UUID**| Identifies the resource. |

### Return type

[**RetrieveNotificationSetting**](RetrieveNotificationSetting.md)

### Authorization

[bearerAuth](../README.md#bearerAuth)

### HTTP request headers

- **Content-Type**: Not defined
- **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | A Notification Setting response |  -  |
| **0** | Unexpected error |  -  |


## updateNotificationChannel

> UpdateNotificationChannel updateNotificationChannel(id, notificationChannel)

Update a notification channel

Update a notification channel.

### Example

```java
import java.util.UUID;
// Import classes:
import com.telnyx.sdk.ApiClient;
import com.telnyx.sdk.ApiException;
import com.telnyx.sdk.Configuration;
import com.telnyx.sdk.auth.*;
import com.telnyx.sdk.model.*;
import com.telnyx.sdk.api.NotificationsApi;

public class Example {
    public static void main(String[] args) {
        ApiClient defaultClient = Configuration.getDefaultApiClient();
        defaultClient.setBasePath("https://api.telnyx.com/v2");
        
        // Configure HTTP bearer authorization: bearerAuth
        HttpBearerAuth bearerAuth = (HttpBearerAuth) defaultClient.getAuthentication("bearerAuth");
        bearerAuth.setBearerToken("BEARER TOKEN");

        NotificationsApi apiInstance = new NotificationsApi(defaultClient);
        UUID id = UUID.fromString("6a09cdc3-8948-47f0-aa62-74ac943d6c58"); // UUID | Identifies the resource.
        NotificationChannel notificationChannel = new NotificationChannel(); // NotificationChannel | Update notification channel object
        try {
            UpdateNotificationChannel result = apiInstance.updateNotificationChannel(id, notificationChannel);
            System.out.println(result);
        } catch (ApiException e) {
            System.err.println("Exception when calling NotificationsApi#updateNotificationChannel");
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
 **id** | **UUID**| Identifies the resource. |
 **notificationChannel** | [**NotificationChannel**](NotificationChannel.md)| Update notification channel object |

### Return type

[**UpdateNotificationChannel**](UpdateNotificationChannel.md)

### Authorization

[bearerAuth](../README.md#bearerAuth)

### HTTP request headers

- **Content-Type**: application/json
- **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | A Notification Channel response |  -  |
| **0** | Unexpected error |  -  |


## updateNotificationProfile

> UpdateNotificationProfile updateNotificationProfile(id, notificationProfile)

Update a notification profile

Update a notification profile.

### Example

```java
import java.util.UUID;
// Import classes:
import com.telnyx.sdk.ApiClient;
import com.telnyx.sdk.ApiException;
import com.telnyx.sdk.Configuration;
import com.telnyx.sdk.auth.*;
import com.telnyx.sdk.model.*;
import com.telnyx.sdk.api.NotificationsApi;

public class Example {
    public static void main(String[] args) {
        ApiClient defaultClient = Configuration.getDefaultApiClient();
        defaultClient.setBasePath("https://api.telnyx.com/v2");
        
        // Configure HTTP bearer authorization: bearerAuth
        HttpBearerAuth bearerAuth = (HttpBearerAuth) defaultClient.getAuthentication("bearerAuth");
        bearerAuth.setBearerToken("BEARER TOKEN");

        NotificationsApi apiInstance = new NotificationsApi(defaultClient);
        UUID id = UUID.fromString("6a09cdc3-8948-47f0-aa62-74ac943d6c58"); // UUID | Identifies the resource.
        NotificationProfile notificationProfile = new NotificationProfile(); // NotificationProfile | Update notification profile object
        try {
            UpdateNotificationProfile result = apiInstance.updateNotificationProfile(id, notificationProfile);
            System.out.println(result);
        } catch (ApiException e) {
            System.err.println("Exception when calling NotificationsApi#updateNotificationProfile");
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
 **id** | **UUID**| Identifies the resource. |
 **notificationProfile** | [**NotificationProfile**](NotificationProfile.md)| Update notification profile object |

### Return type

[**UpdateNotificationProfile**](UpdateNotificationProfile.md)

### Authorization

[bearerAuth](../README.md#bearerAuth)

### HTTP request headers

- **Content-Type**: application/json
- **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | A Notification Profile response |  -  |
| **0** | Unexpected error |  -  |

