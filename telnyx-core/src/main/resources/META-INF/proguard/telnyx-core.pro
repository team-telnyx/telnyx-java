# Jackson uses reflection and depends heavily on runtime attributes.
-keepattributes Exceptions,InnerClasses,Signature,Deprecated,*Annotation*

# Jackson uses Kotlin reflection utilities, which themselves use reflection to access things.
-keep class kotlin.reflect.** { *; }
-keep class kotlin.Metadata { *; }

# Jackson uses reflection to access enum members (e.g. via `java.lang.Class.getEnumConstants()`).
-keepclassmembers class com.fasterxml.jackson.** extends java.lang.Enum {
    <fields>;
    public static **[] values();
    public static ** valueOf(java.lang.String);
}

# Jackson uses reflection to access annotation members.
-keepclassmembers @interface com.fasterxml.jackson.annotation.** {
    *;
}

# Jackson uses reified type information to serialize and deserialize our classes (via `TypeReference`).
-keep class com.fasterxml.jackson.core.type.TypeReference { *; }
-keep class * extends com.fasterxml.jackson.core.type.TypeReference { *; }

# Jackson uses reflection to access our class serializers and deserializers.
-keep @com.fasterxml.jackson.databind.annotation.JsonSerialize class com.telnyx.sdk.** { *; }
-keep @com.fasterxml.jackson.databind.annotation.JsonDeserialize class com.telnyx.sdk.** { *; }

# Jackson uses reflection to serialize and deserialize our classes based on their constructors and annotated members.
-keepclassmembers class com.telnyx.sdk.** {
    <init>(...);
    @com.fasterxml.jackson.annotation.* *;
}

# Keep model classes entirely so R8 preserves Kotlin metadata needed for default parameter values.
-keep class com.telnyx.sdk.models.** { *; }

# The @ExcludeMissing annotation uses @JsonInclude(CUSTOM, valueFilter = JsonField.IsMissing::class)
# to skip missing fields. The annotation interface must be kept so Jackson can read the
# @JsonInclude meta-annotation inside it. Without this, ProGuard strips @ExcludeMissing,
# Jackson can't find the valueFilter, and JsonMissing values reach the serializer →
# "JsonMissing cannot be serialized" at runtime.
-keep @interface com.telnyx.sdk.core.ExcludeMissing { *; }

# Keep core JSON value classes and their inner classes (used by Jackson at runtime).
# Under ProGuard, these are not reachable from @JsonSerialize/@JsonDeserialize classes,
# so they get stripped, causing "JsonMissing cannot be serialized" at runtime.
-keep class com.telnyx.sdk.core.JsonField { *; }
-keep class com.telnyx.sdk.core.JsonField$* { *; }
-keep class com.telnyx.sdk.core.JsonValue { *; }
-keep class com.telnyx.sdk.core.JsonValue$* { *; }
-keep class com.telnyx.sdk.core.JsonMissing { *; }
-keep class com.telnyx.sdk.core.JsonMissing$* { *; }
-keep class com.telnyx.sdk.core.JsonNull { *; }
-keep class com.telnyx.sdk.core.JsonNull$* { *; }
