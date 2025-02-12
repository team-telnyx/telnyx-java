

# CustomStorageConfigurationConfiguration

## oneOf schemas
* [AzureConfigurationData](AzureConfigurationData.md)
* [GCSConfigurationData](GCSConfigurationData.md)
* [S3ConfigurationData](S3ConfigurationData.md)

## Example
```java
// Import classes:
import com.telnyx.sdk.model.CustomStorageConfigurationConfiguration;
import com.telnyx.sdk.model.AzureConfigurationData;
import com.telnyx.sdk.model.GCSConfigurationData;
import com.telnyx.sdk.model.S3ConfigurationData;

public class Example {
    public static void main(String[] args) {
        CustomStorageConfigurationConfiguration exampleCustomStorageConfigurationConfiguration = new CustomStorageConfigurationConfiguration();

        // create a new AzureConfigurationData
        AzureConfigurationData exampleAzureConfigurationData = new AzureConfigurationData();
        // set CustomStorageConfigurationConfiguration to AzureConfigurationData
        exampleCustomStorageConfigurationConfiguration.setActualInstance(exampleAzureConfigurationData);
        // to get back the AzureConfigurationData set earlier
        AzureConfigurationData testAzureConfigurationData = (AzureConfigurationData) exampleCustomStorageConfigurationConfiguration.getActualInstance();

        // create a new GCSConfigurationData
        GCSConfigurationData exampleGCSConfigurationData = new GCSConfigurationData();
        // set CustomStorageConfigurationConfiguration to GCSConfigurationData
        exampleCustomStorageConfigurationConfiguration.setActualInstance(exampleGCSConfigurationData);
        // to get back the GCSConfigurationData set earlier
        GCSConfigurationData testGCSConfigurationData = (GCSConfigurationData) exampleCustomStorageConfigurationConfiguration.getActualInstance();

        // create a new S3ConfigurationData
        S3ConfigurationData exampleS3ConfigurationData = new S3ConfigurationData();
        // set CustomStorageConfigurationConfiguration to S3ConfigurationData
        exampleCustomStorageConfigurationConfiguration.setActualInstance(exampleS3ConfigurationData);
        // to get back the S3ConfigurationData set earlier
        S3ConfigurationData testS3ConfigurationData = (S3ConfigurationData) exampleCustomStorageConfigurationConfiguration.getActualInstance();
    }
}
```


