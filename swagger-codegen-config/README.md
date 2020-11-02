## Build

The v1.x java sdk uses swagger-codegen to generate the SDK.

Using the `spec3.json` & `java_sdk_config.json` files run the command

```bash
swagger-codegen generate -i spec3.json -l java -c java_sdk_config.json
```

To generate the SDK.