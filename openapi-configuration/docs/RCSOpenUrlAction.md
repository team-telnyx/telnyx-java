

# RCSOpenUrlAction

Opens the user's default web browser app to the specified URL.

## Properties

| Name | Type | Description | Notes |
|------------ | ------------- | ------------- | -------------|
|**url** | **String** |  |  |
|**application** | [**ApplicationEnum**](#ApplicationEnum) | URL open application, browser or webview. |  |
|**webviewViewMode** | [**WebviewViewModeEnum**](#WebviewViewModeEnum) |  |  |
|**description** | **String** | Accessbility description for webview. |  [optional] |



## Enum: ApplicationEnum

| Name | Value |
|---- | -----|
| OPEN_URL_APPLICATION_UNSPECIFIED | &quot;OPEN_URL_APPLICATION_UNSPECIFIED&quot; |
| BROWSER | &quot;BROWSER&quot; |
| WEBVIEW | &quot;WEBVIEW&quot; |



## Enum: WebviewViewModeEnum

| Name | Value |
|---- | -----|
| WEBVIEW_VIEW_MODE_UNSPECIFIED | &quot;WEBVIEW_VIEW_MODE_UNSPECIFIED&quot; |
| FULL | &quot;FULL&quot; |
| HALF | &quot;HALF&quot; |
| TALL | &quot;TALL&quot; |



