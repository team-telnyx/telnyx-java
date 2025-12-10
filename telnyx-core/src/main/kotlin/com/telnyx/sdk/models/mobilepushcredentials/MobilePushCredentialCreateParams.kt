// File generated from our OpenAPI spec by Stainless.

package com.telnyx.sdk.models.mobilepushcredentials

import com.fasterxml.jackson.annotation.JsonAnyGetter
import com.fasterxml.jackson.annotation.JsonAnySetter
import com.fasterxml.jackson.annotation.JsonCreator
import com.fasterxml.jackson.annotation.JsonProperty
import com.fasterxml.jackson.core.JsonGenerator
import com.fasterxml.jackson.core.ObjectCodec
import com.fasterxml.jackson.databind.JsonNode
import com.fasterxml.jackson.databind.SerializerProvider
import com.fasterxml.jackson.databind.annotation.JsonDeserialize
import com.fasterxml.jackson.databind.annotation.JsonSerialize
import com.fasterxml.jackson.module.kotlin.jacksonTypeRef
import com.telnyx.sdk.core.BaseDeserializer
import com.telnyx.sdk.core.BaseSerializer
import com.telnyx.sdk.core.ExcludeMissing
import com.telnyx.sdk.core.JsonField
import com.telnyx.sdk.core.JsonMissing
import com.telnyx.sdk.core.JsonValue
import com.telnyx.sdk.core.Params
import com.telnyx.sdk.core.checkRequired
import com.telnyx.sdk.core.getOrThrow
import com.telnyx.sdk.core.http.Headers
import com.telnyx.sdk.core.http.QueryParams
import com.telnyx.sdk.core.toImmutable
import com.telnyx.sdk.errors.TelnyxInvalidDataException
import java.util.Collections
import java.util.Objects
import java.util.Optional
import kotlin.jvm.optionals.getOrNull

/** Creates a new mobile push credential */
class MobilePushCredentialCreateParams
private constructor(
    private val createMobilePushCredentialRequest: CreateMobilePushCredentialRequest,
    private val additionalHeaders: Headers,
    private val additionalQueryParams: QueryParams,
) : Params {

    fun createMobilePushCredentialRequest(): CreateMobilePushCredentialRequest =
        createMobilePushCredentialRequest

    /** Additional headers to send with the request. */
    fun _additionalHeaders(): Headers = additionalHeaders

    /** Additional query param to send with the request. */
    fun _additionalQueryParams(): QueryParams = additionalQueryParams

    fun toBuilder() = Builder().from(this)

    companion object {

        /**
         * Returns a mutable builder for constructing an instance of
         * [MobilePushCredentialCreateParams].
         *
         * The following fields are required:
         * ```java
         * .createMobilePushCredentialRequest()
         * ```
         */
        @JvmStatic fun builder() = Builder()
    }

    /** A builder for [MobilePushCredentialCreateParams]. */
    class Builder internal constructor() {

        private var createMobilePushCredentialRequest: CreateMobilePushCredentialRequest? = null
        private var additionalHeaders: Headers.Builder = Headers.builder()
        private var additionalQueryParams: QueryParams.Builder = QueryParams.builder()

        @JvmSynthetic
        internal fun from(mobilePushCredentialCreateParams: MobilePushCredentialCreateParams) =
            apply {
                createMobilePushCredentialRequest =
                    mobilePushCredentialCreateParams.createMobilePushCredentialRequest
                additionalHeaders = mobilePushCredentialCreateParams.additionalHeaders.toBuilder()
                additionalQueryParams =
                    mobilePushCredentialCreateParams.additionalQueryParams.toBuilder()
            }

        fun createMobilePushCredentialRequest(
            createMobilePushCredentialRequest: CreateMobilePushCredentialRequest
        ) = apply { this.createMobilePushCredentialRequest = createMobilePushCredentialRequest }

        /**
         * Alias for calling [createMobilePushCredentialRequest] with
         * `CreateMobilePushCredentialRequest.ofIos(ios)`.
         */
        fun createMobilePushCredentialRequest(ios: CreateMobilePushCredentialRequest.Ios) =
            createMobilePushCredentialRequest(CreateMobilePushCredentialRequest.ofIos(ios))

        /**
         * Alias for calling [createMobilePushCredentialRequest] with
         * `CreateMobilePushCredentialRequest.ofAndroid(android)`.
         */
        fun createMobilePushCredentialRequest(android: CreateMobilePushCredentialRequest.Android) =
            createMobilePushCredentialRequest(CreateMobilePushCredentialRequest.ofAndroid(android))

        fun additionalHeaders(additionalHeaders: Headers) = apply {
            this.additionalHeaders.clear()
            putAllAdditionalHeaders(additionalHeaders)
        }

        fun additionalHeaders(additionalHeaders: Map<String, Iterable<String>>) = apply {
            this.additionalHeaders.clear()
            putAllAdditionalHeaders(additionalHeaders)
        }

        fun putAdditionalHeader(name: String, value: String) = apply {
            additionalHeaders.put(name, value)
        }

        fun putAdditionalHeaders(name: String, values: Iterable<String>) = apply {
            additionalHeaders.put(name, values)
        }

        fun putAllAdditionalHeaders(additionalHeaders: Headers) = apply {
            this.additionalHeaders.putAll(additionalHeaders)
        }

        fun putAllAdditionalHeaders(additionalHeaders: Map<String, Iterable<String>>) = apply {
            this.additionalHeaders.putAll(additionalHeaders)
        }

        fun replaceAdditionalHeaders(name: String, value: String) = apply {
            additionalHeaders.replace(name, value)
        }

        fun replaceAdditionalHeaders(name: String, values: Iterable<String>) = apply {
            additionalHeaders.replace(name, values)
        }

        fun replaceAllAdditionalHeaders(additionalHeaders: Headers) = apply {
            this.additionalHeaders.replaceAll(additionalHeaders)
        }

        fun replaceAllAdditionalHeaders(additionalHeaders: Map<String, Iterable<String>>) = apply {
            this.additionalHeaders.replaceAll(additionalHeaders)
        }

        fun removeAdditionalHeaders(name: String) = apply { additionalHeaders.remove(name) }

        fun removeAllAdditionalHeaders(names: Set<String>) = apply {
            additionalHeaders.removeAll(names)
        }

        fun additionalQueryParams(additionalQueryParams: QueryParams) = apply {
            this.additionalQueryParams.clear()
            putAllAdditionalQueryParams(additionalQueryParams)
        }

        fun additionalQueryParams(additionalQueryParams: Map<String, Iterable<String>>) = apply {
            this.additionalQueryParams.clear()
            putAllAdditionalQueryParams(additionalQueryParams)
        }

        fun putAdditionalQueryParam(key: String, value: String) = apply {
            additionalQueryParams.put(key, value)
        }

        fun putAdditionalQueryParams(key: String, values: Iterable<String>) = apply {
            additionalQueryParams.put(key, values)
        }

        fun putAllAdditionalQueryParams(additionalQueryParams: QueryParams) = apply {
            this.additionalQueryParams.putAll(additionalQueryParams)
        }

        fun putAllAdditionalQueryParams(additionalQueryParams: Map<String, Iterable<String>>) =
            apply {
                this.additionalQueryParams.putAll(additionalQueryParams)
            }

        fun replaceAdditionalQueryParams(key: String, value: String) = apply {
            additionalQueryParams.replace(key, value)
        }

        fun replaceAdditionalQueryParams(key: String, values: Iterable<String>) = apply {
            additionalQueryParams.replace(key, values)
        }

        fun replaceAllAdditionalQueryParams(additionalQueryParams: QueryParams) = apply {
            this.additionalQueryParams.replaceAll(additionalQueryParams)
        }

        fun replaceAllAdditionalQueryParams(additionalQueryParams: Map<String, Iterable<String>>) =
            apply {
                this.additionalQueryParams.replaceAll(additionalQueryParams)
            }

        fun removeAdditionalQueryParams(key: String) = apply { additionalQueryParams.remove(key) }

        fun removeAllAdditionalQueryParams(keys: Set<String>) = apply {
            additionalQueryParams.removeAll(keys)
        }

        /**
         * Returns an immutable instance of [MobilePushCredentialCreateParams].
         *
         * Further updates to this [Builder] will not mutate the returned instance.
         *
         * The following fields are required:
         * ```java
         * .createMobilePushCredentialRequest()
         * ```
         *
         * @throws IllegalStateException if any required field is unset.
         */
        fun build(): MobilePushCredentialCreateParams =
            MobilePushCredentialCreateParams(
                checkRequired(
                    "createMobilePushCredentialRequest",
                    createMobilePushCredentialRequest,
                ),
                additionalHeaders.build(),
                additionalQueryParams.build(),
            )
    }

    fun _body(): CreateMobilePushCredentialRequest = createMobilePushCredentialRequest

    override fun _headers(): Headers = additionalHeaders

    override fun _queryParams(): QueryParams = additionalQueryParams

    @JsonDeserialize(using = CreateMobilePushCredentialRequest.Deserializer::class)
    @JsonSerialize(using = CreateMobilePushCredentialRequest.Serializer::class)
    class CreateMobilePushCredentialRequest
    private constructor(
        private val ios: Ios? = null,
        private val android: Android? = null,
        private val _json: JsonValue? = null,
    ) {

        fun ios(): Optional<Ios> = Optional.ofNullable(ios)

        fun android(): Optional<Android> = Optional.ofNullable(android)

        fun isIos(): Boolean = ios != null

        fun isAndroid(): Boolean = android != null

        fun asIos(): Ios = ios.getOrThrow("ios")

        fun asAndroid(): Android = android.getOrThrow("android")

        fun _json(): Optional<JsonValue> = Optional.ofNullable(_json)

        fun <T> accept(visitor: Visitor<T>): T =
            when {
                ios != null -> visitor.visitIos(ios)
                android != null -> visitor.visitAndroid(android)
                else -> visitor.unknown(_json)
            }

        private var validated: Boolean = false

        fun validate(): CreateMobilePushCredentialRequest = apply {
            if (validated) {
                return@apply
            }

            accept(
                object : Visitor<Unit> {
                    override fun visitIos(ios: Ios) {
                        ios.validate()
                    }

                    override fun visitAndroid(android: Android) {
                        android.validate()
                    }
                }
            )
            validated = true
        }

        fun isValid(): Boolean =
            try {
                validate()
                true
            } catch (e: TelnyxInvalidDataException) {
                false
            }

        /**
         * Returns a score indicating how many valid values are contained in this object
         * recursively.
         *
         * Used for best match union deserialization.
         */
        @JvmSynthetic
        internal fun validity(): Int =
            accept(
                object : Visitor<Int> {
                    override fun visitIos(ios: Ios) = ios.validity()

                    override fun visitAndroid(android: Android) = android.validity()

                    override fun unknown(json: JsonValue?) = 0
                }
            )

        override fun equals(other: Any?): Boolean {
            if (this === other) {
                return true
            }

            return other is CreateMobilePushCredentialRequest &&
                ios == other.ios &&
                android == other.android
        }

        override fun hashCode(): Int = Objects.hash(ios, android)

        override fun toString(): String =
            when {
                ios != null -> "CreateMobilePushCredentialRequest{ios=$ios}"
                android != null -> "CreateMobilePushCredentialRequest{android=$android}"
                _json != null -> "CreateMobilePushCredentialRequest{_unknown=$_json}"
                else -> throw IllegalStateException("Invalid CreateMobilePushCredentialRequest")
            }

        companion object {

            @JvmStatic fun ofIos(ios: Ios) = CreateMobilePushCredentialRequest(ios = ios)

            @JvmStatic
            fun ofAndroid(android: Android) = CreateMobilePushCredentialRequest(android = android)
        }

        /**
         * An interface that defines how to map each variant of [CreateMobilePushCredentialRequest]
         * to a value of type [T].
         */
        interface Visitor<out T> {

            fun visitIos(ios: Ios): T

            fun visitAndroid(android: Android): T

            /**
             * Maps an unknown variant of [CreateMobilePushCredentialRequest] to a value of type
             * [T].
             *
             * An instance of [CreateMobilePushCredentialRequest] can contain an unknown variant if
             * it was deserialized from data that doesn't match any known variant. For example, if
             * the SDK is on an older version than the API, then the API may respond with new
             * variants that the SDK is unaware of.
             *
             * @throws TelnyxInvalidDataException in the default implementation.
             */
            fun unknown(json: JsonValue?): T {
                throw TelnyxInvalidDataException("Unknown CreateMobilePushCredentialRequest: $json")
            }
        }

        internal class Deserializer :
            BaseDeserializer<CreateMobilePushCredentialRequest>(
                CreateMobilePushCredentialRequest::class
            ) {

            override fun ObjectCodec.deserialize(
                node: JsonNode
            ): CreateMobilePushCredentialRequest {
                val json = JsonValue.fromJsonNode(node)
                val type = json.asObject().getOrNull()?.get("type")?.asString()?.getOrNull()

                when (type) {
                    "ios" -> {
                        return tryDeserialize(node, jacksonTypeRef<Ios>())?.let {
                            CreateMobilePushCredentialRequest(ios = it, _json = json)
                        } ?: CreateMobilePushCredentialRequest(_json = json)
                    }
                    "android" -> {
                        return tryDeserialize(node, jacksonTypeRef<Android>())?.let {
                            CreateMobilePushCredentialRequest(android = it, _json = json)
                        } ?: CreateMobilePushCredentialRequest(_json = json)
                    }
                }

                return CreateMobilePushCredentialRequest(_json = json)
            }
        }

        internal class Serializer :
            BaseSerializer<CreateMobilePushCredentialRequest>(
                CreateMobilePushCredentialRequest::class
            ) {

            override fun serialize(
                value: CreateMobilePushCredentialRequest,
                generator: JsonGenerator,
                provider: SerializerProvider,
            ) {
                when {
                    value.ios != null -> generator.writeObject(value.ios)
                    value.android != null -> generator.writeObject(value.android)
                    value._json != null -> generator.writeObject(value._json)
                    else -> throw IllegalStateException("Invalid CreateMobilePushCredentialRequest")
                }
            }
        }

        class Ios
        @JsonCreator(mode = JsonCreator.Mode.DISABLED)
        private constructor(
            private val alias: JsonField<String>,
            private val certificate: JsonField<String>,
            private val privateKey: JsonField<String>,
            private val type: JsonValue,
            private val additionalProperties: MutableMap<String, JsonValue>,
        ) {

            @JsonCreator
            private constructor(
                @JsonProperty("alias") @ExcludeMissing alias: JsonField<String> = JsonMissing.of(),
                @JsonProperty("certificate")
                @ExcludeMissing
                certificate: JsonField<String> = JsonMissing.of(),
                @JsonProperty("private_key")
                @ExcludeMissing
                privateKey: JsonField<String> = JsonMissing.of(),
                @JsonProperty("type") @ExcludeMissing type: JsonValue = JsonMissing.of(),
            ) : this(alias, certificate, privateKey, type, mutableMapOf())

            /**
             * Alias to uniquely identify the credential
             *
             * @throws TelnyxInvalidDataException if the JSON field has an unexpected type or is
             *   unexpectedly missing or null (e.g. if the server responded with an unexpected
             *   value).
             */
            fun alias(): String = alias.getRequired("alias")

            /**
             * Certificate as received from APNs
             *
             * @throws TelnyxInvalidDataException if the JSON field has an unexpected type or is
             *   unexpectedly missing or null (e.g. if the server responded with an unexpected
             *   value).
             */
            fun certificate(): String = certificate.getRequired("certificate")

            /**
             * Corresponding private key to the certificate as received from APNs
             *
             * @throws TelnyxInvalidDataException if the JSON field has an unexpected type or is
             *   unexpectedly missing or null (e.g. if the server responded with an unexpected
             *   value).
             */
            fun privateKey(): String = privateKey.getRequired("private_key")

            /**
             * Type of mobile push credential. Should be <code>ios</code> here
             *
             * Expected to always return the following:
             * ```java
             * JsonValue.from("ios")
             * ```
             *
             * However, this method can be useful for debugging and logging (e.g. if the server
             * responded with an unexpected value).
             */
            @JsonProperty("type") @ExcludeMissing fun _type(): JsonValue = type

            /**
             * Returns the raw JSON value of [alias].
             *
             * Unlike [alias], this method doesn't throw if the JSON field has an unexpected type.
             */
            @JsonProperty("alias") @ExcludeMissing fun _alias(): JsonField<String> = alias

            /**
             * Returns the raw JSON value of [certificate].
             *
             * Unlike [certificate], this method doesn't throw if the JSON field has an unexpected
             * type.
             */
            @JsonProperty("certificate")
            @ExcludeMissing
            fun _certificate(): JsonField<String> = certificate

            /**
             * Returns the raw JSON value of [privateKey].
             *
             * Unlike [privateKey], this method doesn't throw if the JSON field has an unexpected
             * type.
             */
            @JsonProperty("private_key")
            @ExcludeMissing
            fun _privateKey(): JsonField<String> = privateKey

            @JsonAnySetter
            private fun putAdditionalProperty(key: String, value: JsonValue) {
                additionalProperties.put(key, value)
            }

            @JsonAnyGetter
            @ExcludeMissing
            fun _additionalProperties(): Map<String, JsonValue> =
                Collections.unmodifiableMap(additionalProperties)

            fun toBuilder() = Builder().from(this)

            companion object {

                /**
                 * Returns a mutable builder for constructing an instance of [Ios].
                 *
                 * The following fields are required:
                 * ```java
                 * .alias()
                 * .certificate()
                 * .privateKey()
                 * ```
                 */
                @JvmStatic fun builder() = Builder()
            }

            /** A builder for [Ios]. */
            class Builder internal constructor() {

                private var alias: JsonField<String>? = null
                private var certificate: JsonField<String>? = null
                private var privateKey: JsonField<String>? = null
                private var type: JsonValue = JsonValue.from("ios")
                private var additionalProperties: MutableMap<String, JsonValue> = mutableMapOf()

                @JvmSynthetic
                internal fun from(ios: Ios) = apply {
                    alias = ios.alias
                    certificate = ios.certificate
                    privateKey = ios.privateKey
                    type = ios.type
                    additionalProperties = ios.additionalProperties.toMutableMap()
                }

                /** Alias to uniquely identify the credential */
                fun alias(alias: String) = alias(JsonField.of(alias))

                /**
                 * Sets [Builder.alias] to an arbitrary JSON value.
                 *
                 * You should usually call [Builder.alias] with a well-typed [String] value instead.
                 * This method is primarily for setting the field to an undocumented or not yet
                 * supported value.
                 */
                fun alias(alias: JsonField<String>) = apply { this.alias = alias }

                /** Certificate as received from APNs */
                fun certificate(certificate: String) = certificate(JsonField.of(certificate))

                /**
                 * Sets [Builder.certificate] to an arbitrary JSON value.
                 *
                 * You should usually call [Builder.certificate] with a well-typed [String] value
                 * instead. This method is primarily for setting the field to an undocumented or not
                 * yet supported value.
                 */
                fun certificate(certificate: JsonField<String>) = apply {
                    this.certificate = certificate
                }

                /** Corresponding private key to the certificate as received from APNs */
                fun privateKey(privateKey: String) = privateKey(JsonField.of(privateKey))

                /**
                 * Sets [Builder.privateKey] to an arbitrary JSON value.
                 *
                 * You should usually call [Builder.privateKey] with a well-typed [String] value
                 * instead. This method is primarily for setting the field to an undocumented or not
                 * yet supported value.
                 */
                fun privateKey(privateKey: JsonField<String>) = apply {
                    this.privateKey = privateKey
                }

                /**
                 * Sets the field to an arbitrary JSON value.
                 *
                 * It is usually unnecessary to call this method because the field defaults to the
                 * following:
                 * ```java
                 * JsonValue.from("ios")
                 * ```
                 *
                 * This method is primarily for setting the field to an undocumented or not yet
                 * supported value.
                 */
                fun type(type: JsonValue) = apply { this.type = type }

                fun additionalProperties(additionalProperties: Map<String, JsonValue>) = apply {
                    this.additionalProperties.clear()
                    putAllAdditionalProperties(additionalProperties)
                }

                fun putAdditionalProperty(key: String, value: JsonValue) = apply {
                    additionalProperties.put(key, value)
                }

                fun putAllAdditionalProperties(additionalProperties: Map<String, JsonValue>) =
                    apply {
                        this.additionalProperties.putAll(additionalProperties)
                    }

                fun removeAdditionalProperty(key: String) = apply {
                    additionalProperties.remove(key)
                }

                fun removeAllAdditionalProperties(keys: Set<String>) = apply {
                    keys.forEach(::removeAdditionalProperty)
                }

                /**
                 * Returns an immutable instance of [Ios].
                 *
                 * Further updates to this [Builder] will not mutate the returned instance.
                 *
                 * The following fields are required:
                 * ```java
                 * .alias()
                 * .certificate()
                 * .privateKey()
                 * ```
                 *
                 * @throws IllegalStateException if any required field is unset.
                 */
                fun build(): Ios =
                    Ios(
                        checkRequired("alias", alias),
                        checkRequired("certificate", certificate),
                        checkRequired("privateKey", privateKey),
                        type,
                        additionalProperties.toMutableMap(),
                    )
            }

            private var validated: Boolean = false

            fun validate(): Ios = apply {
                if (validated) {
                    return@apply
                }

                alias()
                certificate()
                privateKey()
                _type().let {
                    if (it != JsonValue.from("ios")) {
                        throw TelnyxInvalidDataException("'type' is invalid, received $it")
                    }
                }
                validated = true
            }

            fun isValid(): Boolean =
                try {
                    validate()
                    true
                } catch (e: TelnyxInvalidDataException) {
                    false
                }

            /**
             * Returns a score indicating how many valid values are contained in this object
             * recursively.
             *
             * Used for best match union deserialization.
             */
            @JvmSynthetic
            internal fun validity(): Int =
                (if (alias.asKnown().isPresent) 1 else 0) +
                    (if (certificate.asKnown().isPresent) 1 else 0) +
                    (if (privateKey.asKnown().isPresent) 1 else 0) +
                    type.let { if (it == JsonValue.from("ios")) 1 else 0 }

            override fun equals(other: Any?): Boolean {
                if (this === other) {
                    return true
                }

                return other is Ios &&
                    alias == other.alias &&
                    certificate == other.certificate &&
                    privateKey == other.privateKey &&
                    type == other.type &&
                    additionalProperties == other.additionalProperties
            }

            private val hashCode: Int by lazy {
                Objects.hash(alias, certificate, privateKey, type, additionalProperties)
            }

            override fun hashCode(): Int = hashCode

            override fun toString() =
                "Ios{alias=$alias, certificate=$certificate, privateKey=$privateKey, type=$type, additionalProperties=$additionalProperties}"
        }

        class Android
        @JsonCreator(mode = JsonCreator.Mode.DISABLED)
        private constructor(
            private val alias: JsonField<String>,
            private val projectAccountJsonFile: JsonField<ProjectAccountJsonFile>,
            private val type: JsonValue,
            private val additionalProperties: MutableMap<String, JsonValue>,
        ) {

            @JsonCreator
            private constructor(
                @JsonProperty("alias") @ExcludeMissing alias: JsonField<String> = JsonMissing.of(),
                @JsonProperty("project_account_json_file")
                @ExcludeMissing
                projectAccountJsonFile: JsonField<ProjectAccountJsonFile> = JsonMissing.of(),
                @JsonProperty("type") @ExcludeMissing type: JsonValue = JsonMissing.of(),
            ) : this(alias, projectAccountJsonFile, type, mutableMapOf())

            /**
             * Alias to uniquely identify the credential
             *
             * @throws TelnyxInvalidDataException if the JSON field has an unexpected type or is
             *   unexpectedly missing or null (e.g. if the server responded with an unexpected
             *   value).
             */
            fun alias(): String = alias.getRequired("alias")

            /**
             * Private key file in JSON format
             *
             * @throws TelnyxInvalidDataException if the JSON field has an unexpected type or is
             *   unexpectedly missing or null (e.g. if the server responded with an unexpected
             *   value).
             */
            fun projectAccountJsonFile(): ProjectAccountJsonFile =
                projectAccountJsonFile.getRequired("project_account_json_file")

            /**
             * Type of mobile push credential. Should be <code>android</code> here
             *
             * Expected to always return the following:
             * ```java
             * JsonValue.from("android")
             * ```
             *
             * However, this method can be useful for debugging and logging (e.g. if the server
             * responded with an unexpected value).
             */
            @JsonProperty("type") @ExcludeMissing fun _type(): JsonValue = type

            /**
             * Returns the raw JSON value of [alias].
             *
             * Unlike [alias], this method doesn't throw if the JSON field has an unexpected type.
             */
            @JsonProperty("alias") @ExcludeMissing fun _alias(): JsonField<String> = alias

            /**
             * Returns the raw JSON value of [projectAccountJsonFile].
             *
             * Unlike [projectAccountJsonFile], this method doesn't throw if the JSON field has an
             * unexpected type.
             */
            @JsonProperty("project_account_json_file")
            @ExcludeMissing
            fun _projectAccountJsonFile(): JsonField<ProjectAccountJsonFile> =
                projectAccountJsonFile

            @JsonAnySetter
            private fun putAdditionalProperty(key: String, value: JsonValue) {
                additionalProperties.put(key, value)
            }

            @JsonAnyGetter
            @ExcludeMissing
            fun _additionalProperties(): Map<String, JsonValue> =
                Collections.unmodifiableMap(additionalProperties)

            fun toBuilder() = Builder().from(this)

            companion object {

                /**
                 * Returns a mutable builder for constructing an instance of [Android].
                 *
                 * The following fields are required:
                 * ```java
                 * .alias()
                 * .projectAccountJsonFile()
                 * ```
                 */
                @JvmStatic fun builder() = Builder()
            }

            /** A builder for [Android]. */
            class Builder internal constructor() {

                private var alias: JsonField<String>? = null
                private var projectAccountJsonFile: JsonField<ProjectAccountJsonFile>? = null
                private var type: JsonValue = JsonValue.from("android")
                private var additionalProperties: MutableMap<String, JsonValue> = mutableMapOf()

                @JvmSynthetic
                internal fun from(android: Android) = apply {
                    alias = android.alias
                    projectAccountJsonFile = android.projectAccountJsonFile
                    type = android.type
                    additionalProperties = android.additionalProperties.toMutableMap()
                }

                /** Alias to uniquely identify the credential */
                fun alias(alias: String) = alias(JsonField.of(alias))

                /**
                 * Sets [Builder.alias] to an arbitrary JSON value.
                 *
                 * You should usually call [Builder.alias] with a well-typed [String] value instead.
                 * This method is primarily for setting the field to an undocumented or not yet
                 * supported value.
                 */
                fun alias(alias: JsonField<String>) = apply { this.alias = alias }

                /** Private key file in JSON format */
                fun projectAccountJsonFile(projectAccountJsonFile: ProjectAccountJsonFile) =
                    projectAccountJsonFile(JsonField.of(projectAccountJsonFile))

                /**
                 * Sets [Builder.projectAccountJsonFile] to an arbitrary JSON value.
                 *
                 * You should usually call [Builder.projectAccountJsonFile] with a well-typed
                 * [ProjectAccountJsonFile] value instead. This method is primarily for setting the
                 * field to an undocumented or not yet supported value.
                 */
                fun projectAccountJsonFile(
                    projectAccountJsonFile: JsonField<ProjectAccountJsonFile>
                ) = apply { this.projectAccountJsonFile = projectAccountJsonFile }

                /**
                 * Sets the field to an arbitrary JSON value.
                 *
                 * It is usually unnecessary to call this method because the field defaults to the
                 * following:
                 * ```java
                 * JsonValue.from("android")
                 * ```
                 *
                 * This method is primarily for setting the field to an undocumented or not yet
                 * supported value.
                 */
                fun type(type: JsonValue) = apply { this.type = type }

                fun additionalProperties(additionalProperties: Map<String, JsonValue>) = apply {
                    this.additionalProperties.clear()
                    putAllAdditionalProperties(additionalProperties)
                }

                fun putAdditionalProperty(key: String, value: JsonValue) = apply {
                    additionalProperties.put(key, value)
                }

                fun putAllAdditionalProperties(additionalProperties: Map<String, JsonValue>) =
                    apply {
                        this.additionalProperties.putAll(additionalProperties)
                    }

                fun removeAdditionalProperty(key: String) = apply {
                    additionalProperties.remove(key)
                }

                fun removeAllAdditionalProperties(keys: Set<String>) = apply {
                    keys.forEach(::removeAdditionalProperty)
                }

                /**
                 * Returns an immutable instance of [Android].
                 *
                 * Further updates to this [Builder] will not mutate the returned instance.
                 *
                 * The following fields are required:
                 * ```java
                 * .alias()
                 * .projectAccountJsonFile()
                 * ```
                 *
                 * @throws IllegalStateException if any required field is unset.
                 */
                fun build(): Android =
                    Android(
                        checkRequired("alias", alias),
                        checkRequired("projectAccountJsonFile", projectAccountJsonFile),
                        type,
                        additionalProperties.toMutableMap(),
                    )
            }

            private var validated: Boolean = false

            fun validate(): Android = apply {
                if (validated) {
                    return@apply
                }

                alias()
                projectAccountJsonFile().validate()
                _type().let {
                    if (it != JsonValue.from("android")) {
                        throw TelnyxInvalidDataException("'type' is invalid, received $it")
                    }
                }
                validated = true
            }

            fun isValid(): Boolean =
                try {
                    validate()
                    true
                } catch (e: TelnyxInvalidDataException) {
                    false
                }

            /**
             * Returns a score indicating how many valid values are contained in this object
             * recursively.
             *
             * Used for best match union deserialization.
             */
            @JvmSynthetic
            internal fun validity(): Int =
                (if (alias.asKnown().isPresent) 1 else 0) +
                    (projectAccountJsonFile.asKnown().getOrNull()?.validity() ?: 0) +
                    type.let { if (it == JsonValue.from("android")) 1 else 0 }

            /** Private key file in JSON format */
            class ProjectAccountJsonFile
            @JsonCreator
            private constructor(
                @com.fasterxml.jackson.annotation.JsonValue
                private val additionalProperties: Map<String, JsonValue>
            ) {

                @JsonAnyGetter
                @ExcludeMissing
                fun _additionalProperties(): Map<String, JsonValue> = additionalProperties

                fun toBuilder() = Builder().from(this)

                companion object {

                    /**
                     * Returns a mutable builder for constructing an instance of
                     * [ProjectAccountJsonFile].
                     */
                    @JvmStatic fun builder() = Builder()
                }

                /** A builder for [ProjectAccountJsonFile]. */
                class Builder internal constructor() {

                    private var additionalProperties: MutableMap<String, JsonValue> = mutableMapOf()

                    @JvmSynthetic
                    internal fun from(projectAccountJsonFile: ProjectAccountJsonFile) = apply {
                        additionalProperties =
                            projectAccountJsonFile.additionalProperties.toMutableMap()
                    }

                    fun additionalProperties(additionalProperties: Map<String, JsonValue>) = apply {
                        this.additionalProperties.clear()
                        putAllAdditionalProperties(additionalProperties)
                    }

                    fun putAdditionalProperty(key: String, value: JsonValue) = apply {
                        additionalProperties.put(key, value)
                    }

                    fun putAllAdditionalProperties(additionalProperties: Map<String, JsonValue>) =
                        apply {
                            this.additionalProperties.putAll(additionalProperties)
                        }

                    fun removeAdditionalProperty(key: String) = apply {
                        additionalProperties.remove(key)
                    }

                    fun removeAllAdditionalProperties(keys: Set<String>) = apply {
                        keys.forEach(::removeAdditionalProperty)
                    }

                    /**
                     * Returns an immutable instance of [ProjectAccountJsonFile].
                     *
                     * Further updates to this [Builder] will not mutate the returned instance.
                     */
                    fun build(): ProjectAccountJsonFile =
                        ProjectAccountJsonFile(additionalProperties.toImmutable())
                }

                private var validated: Boolean = false

                fun validate(): ProjectAccountJsonFile = apply {
                    if (validated) {
                        return@apply
                    }

                    validated = true
                }

                fun isValid(): Boolean =
                    try {
                        validate()
                        true
                    } catch (e: TelnyxInvalidDataException) {
                        false
                    }

                /**
                 * Returns a score indicating how many valid values are contained in this object
                 * recursively.
                 *
                 * Used for best match union deserialization.
                 */
                @JvmSynthetic
                internal fun validity(): Int =
                    additionalProperties.count { (_, value) ->
                        !value.isNull() && !value.isMissing()
                    }

                override fun equals(other: Any?): Boolean {
                    if (this === other) {
                        return true
                    }

                    return other is ProjectAccountJsonFile &&
                        additionalProperties == other.additionalProperties
                }

                private val hashCode: Int by lazy { Objects.hash(additionalProperties) }

                override fun hashCode(): Int = hashCode

                override fun toString() =
                    "ProjectAccountJsonFile{additionalProperties=$additionalProperties}"
            }

            override fun equals(other: Any?): Boolean {
                if (this === other) {
                    return true
                }

                return other is Android &&
                    alias == other.alias &&
                    projectAccountJsonFile == other.projectAccountJsonFile &&
                    type == other.type &&
                    additionalProperties == other.additionalProperties
            }

            private val hashCode: Int by lazy {
                Objects.hash(alias, projectAccountJsonFile, type, additionalProperties)
            }

            override fun hashCode(): Int = hashCode

            override fun toString() =
                "Android{alias=$alias, projectAccountJsonFile=$projectAccountJsonFile, type=$type, additionalProperties=$additionalProperties}"
        }
    }

    override fun equals(other: Any?): Boolean {
        if (this === other) {
            return true
        }

        return other is MobilePushCredentialCreateParams &&
            createMobilePushCredentialRequest == other.createMobilePushCredentialRequest &&
            additionalHeaders == other.additionalHeaders &&
            additionalQueryParams == other.additionalQueryParams
    }

    override fun hashCode(): Int =
        Objects.hash(createMobilePushCredentialRequest, additionalHeaders, additionalQueryParams)

    override fun toString() =
        "MobilePushCredentialCreateParams{createMobilePushCredentialRequest=$createMobilePushCredentialRequest, additionalHeaders=$additionalHeaders, additionalQueryParams=$additionalQueryParams}"
}
