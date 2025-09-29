// File generated from our OpenAPI spec by Stainless.

package com.telnyx.api.models.portingorders.phonenumberconfigurations

import com.fasterxml.jackson.annotation.JsonAnyGetter
import com.fasterxml.jackson.annotation.JsonAnySetter
import com.fasterxml.jackson.annotation.JsonCreator
import com.fasterxml.jackson.annotation.JsonProperty
import com.telnyx.api.core.ExcludeMissing
import com.telnyx.api.core.JsonField
import com.telnyx.api.core.JsonMissing
import com.telnyx.api.core.JsonValue
import com.telnyx.api.core.Params
import com.telnyx.api.core.checkKnown
import com.telnyx.api.core.checkRequired
import com.telnyx.api.core.http.Headers
import com.telnyx.api.core.http.QueryParams
import com.telnyx.api.core.toImmutable
import com.telnyx.api.errors.TelnyxInvalidDataException
import java.util.Collections
import java.util.Objects
import java.util.Optional
import kotlin.jvm.optionals.getOrNull

/** Creates a list of phone number configurations. */
class PhoneNumberConfigurationCreateParams
private constructor(
    private val body: Body,
    private val additionalHeaders: Headers,
    private val additionalQueryParams: QueryParams,
) : Params {

    /**
     * @throws TelnyxInvalidDataException if the JSON field has an unexpected type (e.g. if the
     *   server responded with an unexpected value).
     */
    fun phoneNumberConfigurations(): Optional<List<PhoneNumberConfiguration>> =
        body.phoneNumberConfigurations()

    /**
     * Returns the raw JSON value of [phoneNumberConfigurations].
     *
     * Unlike [phoneNumberConfigurations], this method doesn't throw if the JSON field has an
     * unexpected type.
     */
    fun _phoneNumberConfigurations(): JsonField<List<PhoneNumberConfiguration>> =
        body._phoneNumberConfigurations()

    fun _additionalBodyProperties(): Map<String, JsonValue> = body._additionalProperties()

    /** Additional headers to send with the request. */
    fun _additionalHeaders(): Headers = additionalHeaders

    /** Additional query param to send with the request. */
    fun _additionalQueryParams(): QueryParams = additionalQueryParams

    fun toBuilder() = Builder().from(this)

    companion object {

        @JvmStatic fun none(): PhoneNumberConfigurationCreateParams = builder().build()

        /**
         * Returns a mutable builder for constructing an instance of
         * [PhoneNumberConfigurationCreateParams].
         */
        @JvmStatic fun builder() = Builder()
    }

    /** A builder for [PhoneNumberConfigurationCreateParams]. */
    class Builder internal constructor() {

        private var body: Body.Builder = Body.builder()
        private var additionalHeaders: Headers.Builder = Headers.builder()
        private var additionalQueryParams: QueryParams.Builder = QueryParams.builder()

        @JvmSynthetic
        internal fun from(
            phoneNumberConfigurationCreateParams: PhoneNumberConfigurationCreateParams
        ) = apply {
            body = phoneNumberConfigurationCreateParams.body.toBuilder()
            additionalHeaders = phoneNumberConfigurationCreateParams.additionalHeaders.toBuilder()
            additionalQueryParams =
                phoneNumberConfigurationCreateParams.additionalQueryParams.toBuilder()
        }

        /**
         * Sets the entire request body.
         *
         * This is generally only useful if you are already constructing the body separately.
         * Otherwise, it's more convenient to use the top-level setters instead:
         * - [phoneNumberConfigurations]
         */
        fun body(body: Body) = apply { this.body = body.toBuilder() }

        fun phoneNumberConfigurations(phoneNumberConfigurations: List<PhoneNumberConfiguration>) =
            apply {
                body.phoneNumberConfigurations(phoneNumberConfigurations)
            }

        /**
         * Sets [Builder.phoneNumberConfigurations] to an arbitrary JSON value.
         *
         * You should usually call [Builder.phoneNumberConfigurations] with a well-typed
         * `List<PhoneNumberConfiguration>` value instead. This method is primarily for setting the
         * field to an undocumented or not yet supported value.
         */
        fun phoneNumberConfigurations(
            phoneNumberConfigurations: JsonField<List<PhoneNumberConfiguration>>
        ) = apply { body.phoneNumberConfigurations(phoneNumberConfigurations) }

        /**
         * Adds a single [PhoneNumberConfiguration] to [phoneNumberConfigurations].
         *
         * @throws IllegalStateException if the field was previously set to a non-list.
         */
        fun addPhoneNumberConfiguration(phoneNumberConfiguration: PhoneNumberConfiguration) =
            apply {
                body.addPhoneNumberConfiguration(phoneNumberConfiguration)
            }

        fun additionalBodyProperties(additionalBodyProperties: Map<String, JsonValue>) = apply {
            body.additionalProperties(additionalBodyProperties)
        }

        fun putAdditionalBodyProperty(key: String, value: JsonValue) = apply {
            body.putAdditionalProperty(key, value)
        }

        fun putAllAdditionalBodyProperties(additionalBodyProperties: Map<String, JsonValue>) =
            apply {
                body.putAllAdditionalProperties(additionalBodyProperties)
            }

        fun removeAdditionalBodyProperty(key: String) = apply { body.removeAdditionalProperty(key) }

        fun removeAllAdditionalBodyProperties(keys: Set<String>) = apply {
            body.removeAllAdditionalProperties(keys)
        }

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
         * Returns an immutable instance of [PhoneNumberConfigurationCreateParams].
         *
         * Further updates to this [Builder] will not mutate the returned instance.
         */
        fun build(): PhoneNumberConfigurationCreateParams =
            PhoneNumberConfigurationCreateParams(
                body.build(),
                additionalHeaders.build(),
                additionalQueryParams.build(),
            )
    }

    fun _body(): Body = body

    override fun _headers(): Headers = additionalHeaders

    override fun _queryParams(): QueryParams = additionalQueryParams

    class Body
    @JsonCreator(mode = JsonCreator.Mode.DISABLED)
    private constructor(
        private val phoneNumberConfigurations: JsonField<List<PhoneNumberConfiguration>>,
        private val additionalProperties: MutableMap<String, JsonValue>,
    ) {

        @JsonCreator
        private constructor(
            @JsonProperty("phone_number_configurations")
            @ExcludeMissing
            phoneNumberConfigurations: JsonField<List<PhoneNumberConfiguration>> = JsonMissing.of()
        ) : this(phoneNumberConfigurations, mutableMapOf())

        /**
         * @throws TelnyxInvalidDataException if the JSON field has an unexpected type (e.g. if the
         *   server responded with an unexpected value).
         */
        fun phoneNumberConfigurations(): Optional<List<PhoneNumberConfiguration>> =
            phoneNumberConfigurations.getOptional("phone_number_configurations")

        /**
         * Returns the raw JSON value of [phoneNumberConfigurations].
         *
         * Unlike [phoneNumberConfigurations], this method doesn't throw if the JSON field has an
         * unexpected type.
         */
        @JsonProperty("phone_number_configurations")
        @ExcludeMissing
        fun _phoneNumberConfigurations(): JsonField<List<PhoneNumberConfiguration>> =
            phoneNumberConfigurations

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

            /** Returns a mutable builder for constructing an instance of [Body]. */
            @JvmStatic fun builder() = Builder()
        }

        /** A builder for [Body]. */
        class Builder internal constructor() {

            private var phoneNumberConfigurations:
                JsonField<MutableList<PhoneNumberConfiguration>>? =
                null
            private var additionalProperties: MutableMap<String, JsonValue> = mutableMapOf()

            @JvmSynthetic
            internal fun from(body: Body) = apply {
                phoneNumberConfigurations =
                    body.phoneNumberConfigurations.map { it.toMutableList() }
                additionalProperties = body.additionalProperties.toMutableMap()
            }

            fun phoneNumberConfigurations(
                phoneNumberConfigurations: List<PhoneNumberConfiguration>
            ) = phoneNumberConfigurations(JsonField.of(phoneNumberConfigurations))

            /**
             * Sets [Builder.phoneNumberConfigurations] to an arbitrary JSON value.
             *
             * You should usually call [Builder.phoneNumberConfigurations] with a well-typed
             * `List<PhoneNumberConfiguration>` value instead. This method is primarily for setting
             * the field to an undocumented or not yet supported value.
             */
            fun phoneNumberConfigurations(
                phoneNumberConfigurations: JsonField<List<PhoneNumberConfiguration>>
            ) = apply {
                this.phoneNumberConfigurations =
                    phoneNumberConfigurations.map { it.toMutableList() }
            }

            /**
             * Adds a single [PhoneNumberConfiguration] to [phoneNumberConfigurations].
             *
             * @throws IllegalStateException if the field was previously set to a non-list.
             */
            fun addPhoneNumberConfiguration(phoneNumberConfiguration: PhoneNumberConfiguration) =
                apply {
                    phoneNumberConfigurations =
                        (phoneNumberConfigurations ?: JsonField.of(mutableListOf())).also {
                            checkKnown("phoneNumberConfigurations", it)
                                .add(phoneNumberConfiguration)
                        }
                }

            fun additionalProperties(additionalProperties: Map<String, JsonValue>) = apply {
                this.additionalProperties.clear()
                putAllAdditionalProperties(additionalProperties)
            }

            fun putAdditionalProperty(key: String, value: JsonValue) = apply {
                additionalProperties.put(key, value)
            }

            fun putAllAdditionalProperties(additionalProperties: Map<String, JsonValue>) = apply {
                this.additionalProperties.putAll(additionalProperties)
            }

            fun removeAdditionalProperty(key: String) = apply { additionalProperties.remove(key) }

            fun removeAllAdditionalProperties(keys: Set<String>) = apply {
                keys.forEach(::removeAdditionalProperty)
            }

            /**
             * Returns an immutable instance of [Body].
             *
             * Further updates to this [Builder] will not mutate the returned instance.
             */
            fun build(): Body =
                Body(
                    (phoneNumberConfigurations ?: JsonMissing.of()).map { it.toImmutable() },
                    additionalProperties.toMutableMap(),
                )
        }

        private var validated: Boolean = false

        fun validate(): Body = apply {
            if (validated) {
                return@apply
            }

            phoneNumberConfigurations().ifPresent { it.forEach { it.validate() } }
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
            (phoneNumberConfigurations.asKnown().getOrNull()?.sumOf { it.validity().toInt() } ?: 0)

        override fun equals(other: Any?): Boolean {
            if (this === other) {
                return true
            }

            return other is Body &&
                phoneNumberConfigurations == other.phoneNumberConfigurations &&
                additionalProperties == other.additionalProperties
        }

        private val hashCode: Int by lazy {
            Objects.hash(phoneNumberConfigurations, additionalProperties)
        }

        override fun hashCode(): Int = hashCode

        override fun toString() =
            "Body{phoneNumberConfigurations=$phoneNumberConfigurations, additionalProperties=$additionalProperties}"
    }

    class PhoneNumberConfiguration
    @JsonCreator(mode = JsonCreator.Mode.DISABLED)
    private constructor(
        private val portingPhoneNumberId: JsonField<String>,
        private val userBundleId: JsonField<String>,
        private val additionalProperties: MutableMap<String, JsonValue>,
    ) {

        @JsonCreator
        private constructor(
            @JsonProperty("porting_phone_number_id")
            @ExcludeMissing
            portingPhoneNumberId: JsonField<String> = JsonMissing.of(),
            @JsonProperty("user_bundle_id")
            @ExcludeMissing
            userBundleId: JsonField<String> = JsonMissing.of(),
        ) : this(portingPhoneNumberId, userBundleId, mutableMapOf())

        /**
         * Identifies the porting phone number to be configured.
         *
         * @throws TelnyxInvalidDataException if the JSON field has an unexpected type or is
         *   unexpectedly missing or null (e.g. if the server responded with an unexpected value).
         */
        fun portingPhoneNumberId(): String =
            portingPhoneNumberId.getRequired("porting_phone_number_id")

        /**
         * Identifies the user bundle to be associated with the porting phone number.
         *
         * @throws TelnyxInvalidDataException if the JSON field has an unexpected type or is
         *   unexpectedly missing or null (e.g. if the server responded with an unexpected value).
         */
        fun userBundleId(): String = userBundleId.getRequired("user_bundle_id")

        /**
         * Returns the raw JSON value of [portingPhoneNumberId].
         *
         * Unlike [portingPhoneNumberId], this method doesn't throw if the JSON field has an
         * unexpected type.
         */
        @JsonProperty("porting_phone_number_id")
        @ExcludeMissing
        fun _portingPhoneNumberId(): JsonField<String> = portingPhoneNumberId

        /**
         * Returns the raw JSON value of [userBundleId].
         *
         * Unlike [userBundleId], this method doesn't throw if the JSON field has an unexpected
         * type.
         */
        @JsonProperty("user_bundle_id")
        @ExcludeMissing
        fun _userBundleId(): JsonField<String> = userBundleId

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
             * Returns a mutable builder for constructing an instance of [PhoneNumberConfiguration].
             *
             * The following fields are required:
             * ```java
             * .portingPhoneNumberId()
             * .userBundleId()
             * ```
             */
            @JvmStatic fun builder() = Builder()
        }

        /** A builder for [PhoneNumberConfiguration]. */
        class Builder internal constructor() {

            private var portingPhoneNumberId: JsonField<String>? = null
            private var userBundleId: JsonField<String>? = null
            private var additionalProperties: MutableMap<String, JsonValue> = mutableMapOf()

            @JvmSynthetic
            internal fun from(phoneNumberConfiguration: PhoneNumberConfiguration) = apply {
                portingPhoneNumberId = phoneNumberConfiguration.portingPhoneNumberId
                userBundleId = phoneNumberConfiguration.userBundleId
                additionalProperties = phoneNumberConfiguration.additionalProperties.toMutableMap()
            }

            /** Identifies the porting phone number to be configured. */
            fun portingPhoneNumberId(portingPhoneNumberId: String) =
                portingPhoneNumberId(JsonField.of(portingPhoneNumberId))

            /**
             * Sets [Builder.portingPhoneNumberId] to an arbitrary JSON value.
             *
             * You should usually call [Builder.portingPhoneNumberId] with a well-typed [String]
             * value instead. This method is primarily for setting the field to an undocumented or
             * not yet supported value.
             */
            fun portingPhoneNumberId(portingPhoneNumberId: JsonField<String>) = apply {
                this.portingPhoneNumberId = portingPhoneNumberId
            }

            /** Identifies the user bundle to be associated with the porting phone number. */
            fun userBundleId(userBundleId: String) = userBundleId(JsonField.of(userBundleId))

            /**
             * Sets [Builder.userBundleId] to an arbitrary JSON value.
             *
             * You should usually call [Builder.userBundleId] with a well-typed [String] value
             * instead. This method is primarily for setting the field to an undocumented or not yet
             * supported value.
             */
            fun userBundleId(userBundleId: JsonField<String>) = apply {
                this.userBundleId = userBundleId
            }

            fun additionalProperties(additionalProperties: Map<String, JsonValue>) = apply {
                this.additionalProperties.clear()
                putAllAdditionalProperties(additionalProperties)
            }

            fun putAdditionalProperty(key: String, value: JsonValue) = apply {
                additionalProperties.put(key, value)
            }

            fun putAllAdditionalProperties(additionalProperties: Map<String, JsonValue>) = apply {
                this.additionalProperties.putAll(additionalProperties)
            }

            fun removeAdditionalProperty(key: String) = apply { additionalProperties.remove(key) }

            fun removeAllAdditionalProperties(keys: Set<String>) = apply {
                keys.forEach(::removeAdditionalProperty)
            }

            /**
             * Returns an immutable instance of [PhoneNumberConfiguration].
             *
             * Further updates to this [Builder] will not mutate the returned instance.
             *
             * The following fields are required:
             * ```java
             * .portingPhoneNumberId()
             * .userBundleId()
             * ```
             *
             * @throws IllegalStateException if any required field is unset.
             */
            fun build(): PhoneNumberConfiguration =
                PhoneNumberConfiguration(
                    checkRequired("portingPhoneNumberId", portingPhoneNumberId),
                    checkRequired("userBundleId", userBundleId),
                    additionalProperties.toMutableMap(),
                )
        }

        private var validated: Boolean = false

        fun validate(): PhoneNumberConfiguration = apply {
            if (validated) {
                return@apply
            }

            portingPhoneNumberId()
            userBundleId()
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
            (if (portingPhoneNumberId.asKnown().isPresent) 1 else 0) +
                (if (userBundleId.asKnown().isPresent) 1 else 0)

        override fun equals(other: Any?): Boolean {
            if (this === other) {
                return true
            }

            return other is PhoneNumberConfiguration &&
                portingPhoneNumberId == other.portingPhoneNumberId &&
                userBundleId == other.userBundleId &&
                additionalProperties == other.additionalProperties
        }

        private val hashCode: Int by lazy {
            Objects.hash(portingPhoneNumberId, userBundleId, additionalProperties)
        }

        override fun hashCode(): Int = hashCode

        override fun toString() =
            "PhoneNumberConfiguration{portingPhoneNumberId=$portingPhoneNumberId, userBundleId=$userBundleId, additionalProperties=$additionalProperties}"
    }

    override fun equals(other: Any?): Boolean {
        if (this === other) {
            return true
        }

        return other is PhoneNumberConfigurationCreateParams &&
            body == other.body &&
            additionalHeaders == other.additionalHeaders &&
            additionalQueryParams == other.additionalQueryParams
    }

    override fun hashCode(): Int = Objects.hash(body, additionalHeaders, additionalQueryParams)

    override fun toString() =
        "PhoneNumberConfigurationCreateParams{body=$body, additionalHeaders=$additionalHeaders, additionalQueryParams=$additionalQueryParams}"
}
