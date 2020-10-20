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
  -i ./openapi-configuration/spec3.json \
  -c ./openapi-configuration/open-api_java_sdk_config.json \
  -t ./openapi-configuration/jersey2
```
