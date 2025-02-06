

# VideoRegion


## Properties

| Name | Type | Description | Notes |
|------------ | ------------- | ------------- | -------------|
|**xPos** | **Integer** | X axis value (in pixels) of the region&#39;s upper left corner relative to the upper left corner of the whole room composition viewport. |  [optional] |
|**yPos** | **Integer** | Y axis value (in pixels) of the region&#39;s upper left corner relative to the upper left corner of the whole room composition viewport. |  [optional] |
|**zPos** | **Integer** | Regions with higher z_pos values are stacked on top of regions with lower z_pos values |  [optional] |
|**height** | **Integer** | Height of the video region |  [optional] |
|**width** | **Integer** | Width of the video region |  [optional] |
|**maxColumns** | **Integer** | Maximum number of columns of the region&#39;s placement grid. By default, the region has as many columns as needed to layout all the specified video sources. |  [optional] |
|**maxRows** | **Integer** | Maximum number of rows of the region&#39;s placement grid. By default, the region has as many rows as needed to layout all the specified video sources. |  [optional] |
|**videoSources** | **List&lt;UUID&gt;** | Array of video recording ids to be composed in the region. Can be \&quot;*\&quot; to specify all video recordings in the session |  [optional] |



