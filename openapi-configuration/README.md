## About

The Java-SDK is built using the [openapi-generator](https://github.com/OpenAPITools/openapi-generator) and the jersey2 library.

## Pre-reqs

* [Openapi-Generator](https://github.com/OpenAPITools/openapi-generator#1---installation) installed
* [Java 1.8](https://openjdk.java.net/install/)

## Custom Templates - Jersey2

Files Modified from [main jersey2](https://github.com/OpenAPITools/openapi-generator/tree/master/modules/openapi-generator/src/main/resources/Java/libraries/jersey2)

| File                                                         | Summary                                                                                                               |
|:-------------------------------------------------------------|:----------------------------------------------------------------------------------------------------------------------|
| [`JSON.mustache`](./jersey2/libraries/jersey2/JSON.mustache) | Set `DeserializationFeature.FAIL_ON_UNKNOWN_PROPERTIES` & `DeserializationFeature.FAIL_ON_INVALID_SUBTYPE` to `false` |
| [`pom.xml`](./jersey2/libraries/jersey2/pom.mustache)        | Include distributionManagement in pom with generation                                                                 |

## spec3.json

The [spec3.json](./spec3.json) file **should not be modified** directly. It is generated internally to Telnyx and should be updated out of band for any updates.

## Build

To generate the SDK; ensure you're at the root folder `telnyx-java` and run the following command

```
openapi-generator generate \
  -g java \
  -i ./openapi-configuration/spec4.json \
  -c ./openapi-configuration/open-api_java_sdk_config.json \
  -t ./openapi-configuration/jersey2
```

## Test

In order to run the tests, you must first have the [Telnyx Mock Server](https://github.com/team-telnyx/telnyx-mock) 
running locally with the default port (ie `http://localhost:12111/v2`). This can be changed in the TestConfiguration class.

#### Naming conventions

Test method names follow the naming convention: UnitOfWork_StateUnderTest_ExpectedBehavior 
as described [here](https://osherove.com/blog/2005/4/3/naming-standards-for-unit-tests.html)

See below for an example:

```java
    /**
     * Send a long code message
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void createLongCodeMessage_whenRequestIsValid_sendsMessage() throws ApiException {
        CreateLongCodeMessageRequest createLongCodeMessageRequest = new CreateLongCodeMessageRequest()
                .from(TestConfiguration.TEST_FROM_NUMBER)
                .to(TestConfiguration.TEST_TO_NUMBER)
                .text("Long Code Message Test")
                .useProfileWebhooks(false)
                .webhookUrl("http://webhook.com");

        MessageResponse actualResponse = api.createLongCodeMessage(createLongCodeMessageRequest);

        assertNotNull(actualResponse.getData().getId());
    }
```