// File generated from our OpenAPI spec by Stainless.

package com.telnyx.sdk.models.dir

import com.fasterxml.jackson.annotation.JsonAnyGetter
import com.fasterxml.jackson.annotation.JsonAnySetter
import com.fasterxml.jackson.annotation.JsonCreator
import com.fasterxml.jackson.annotation.JsonProperty
import com.telnyx.sdk.core.ExcludeMissing
import com.telnyx.sdk.core.JsonField
import com.telnyx.sdk.core.JsonMissing
import com.telnyx.sdk.core.JsonValue
import com.telnyx.sdk.core.Params
import com.telnyx.sdk.core.checkKnown
import com.telnyx.sdk.core.checkRequired
import com.telnyx.sdk.core.http.Headers
import com.telnyx.sdk.core.http.QueryParams
import com.telnyx.sdk.core.toImmutable
import com.telnyx.sdk.errors.TelnyxInvalidDataException
import com.telnyx.sdk.models.enterprises.reputation.loa.AgentInput
import java.util.Collections
import java.util.Objects
import java.util.Optional
import kotlin.jvm.optionals.getOrNull

/**
 * Generate a pre-filled Letter of Authorization (LOA) PDF for a DIR. Enterprise identity (legal
 * name, DBA, address, contact, website, tax id) and the DIR display name are read server-side; the
 * caller supplies the telephone numbers to authorize, an optional Authorized Agent block, and an
 * optional drawn signature.
 *
 * When `signature` is omitted the PDF is returned unsigned so the customer can sign it externally
 * and upload it via the Documents API. When `signature` is present the PDF embeds the supplied
 * image, printed name, and signed-at date.
 *
 * Returns `application/pdf`.
 */
class DirLoaParams
private constructor(
    private val dirId: String?,
    private val body: Body,
    private val additionalHeaders: Headers,
    private val additionalQueryParams: QueryParams,
) : Params {

    fun dirId(): Optional<String> = Optional.ofNullable(dirId)

    /**
     * Telephone numbers to authorize on the DIR, in `+E164` format (`+` followed by 10-15 digits).
     * Max 15 per request.
     *
     * @throws TelnyxInvalidDataException if the JSON field has an unexpected type or is
     *   unexpectedly missing or null (e.g. if the server responded with an unexpected value).
     */
    fun phoneNumbers(): List<String> = body.phoneNumbers()

    /**
     * Third-party reseller / partner managing the enterprise's phone numbers. Omit when the
     * enterprise works directly with Telnyx.
     *
     * @throws TelnyxInvalidDataException if the JSON field has an unexpected type (e.g. if the
     *   server responded with an unexpected value).
     */
    fun agent(): Optional<AgentInput> = body.agent()

    /**
     * Optional. When provided the rendered PDF embeds the signature image, printed name, and
     * signed-at date. When absent the PDF is returned unsigned so the customer can sign externally
     * and upload it via the Documents API.
     *
     * @throws TelnyxInvalidDataException if the JSON field has an unexpected type (e.g. if the
     *   server responded with an unexpected value).
     */
    fun signature(): Optional<Signature> = body.signature()

    /**
     * Returns the raw JSON value of [phoneNumbers].
     *
     * Unlike [phoneNumbers], this method doesn't throw if the JSON field has an unexpected type.
     */
    fun _phoneNumbers(): JsonField<List<String>> = body._phoneNumbers()

    /**
     * Returns the raw JSON value of [agent].
     *
     * Unlike [agent], this method doesn't throw if the JSON field has an unexpected type.
     */
    fun _agent(): JsonField<AgentInput> = body._agent()

    /**
     * Returns the raw JSON value of [signature].
     *
     * Unlike [signature], this method doesn't throw if the JSON field has an unexpected type.
     */
    fun _signature(): JsonField<Signature> = body._signature()

    fun _additionalBodyProperties(): Map<String, JsonValue> = body._additionalProperties()

    /** Additional headers to send with the request. */
    fun _additionalHeaders(): Headers = additionalHeaders

    /** Additional query param to send with the request. */
    fun _additionalQueryParams(): QueryParams = additionalQueryParams

    fun toBuilder() = Builder().from(this)

    companion object {

        /**
         * Returns a mutable builder for constructing an instance of [DirLoaParams].
         *
         * The following fields are required:
         * ```java
         * .phoneNumbers()
         * ```
         */
        @JvmStatic fun builder() = Builder()
    }

    /** A builder for [DirLoaParams]. */
    class Builder internal constructor() {

        private var dirId: String? = null
        private var body: Body.Builder = Body.builder()
        private var additionalHeaders: Headers.Builder = Headers.builder()
        private var additionalQueryParams: QueryParams.Builder = QueryParams.builder()

        @JvmSynthetic
        internal fun from(dirLoaParams: DirLoaParams) = apply {
            dirId = dirLoaParams.dirId
            body = dirLoaParams.body.toBuilder()
            additionalHeaders = dirLoaParams.additionalHeaders.toBuilder()
            additionalQueryParams = dirLoaParams.additionalQueryParams.toBuilder()
        }

        fun dirId(dirId: String?) = apply { this.dirId = dirId }

        /** Alias for calling [Builder.dirId] with `dirId.orElse(null)`. */
        fun dirId(dirId: Optional<String>) = dirId(dirId.getOrNull())

        /**
         * Sets the entire request body.
         *
         * This is generally only useful if you are already constructing the body separately.
         * Otherwise, it's more convenient to use the top-level setters instead:
         * - [phoneNumbers]
         * - [agent]
         * - [signature]
         */
        fun body(body: Body) = apply { this.body = body.toBuilder() }

        /**
         * Telephone numbers to authorize on the DIR, in `+E164` format (`+` followed by 10-15
         * digits). Max 15 per request.
         */
        fun phoneNumbers(phoneNumbers: List<String>) = apply { body.phoneNumbers(phoneNumbers) }

        /**
         * Sets [Builder.phoneNumbers] to an arbitrary JSON value.
         *
         * You should usually call [Builder.phoneNumbers] with a well-typed `List<String>` value
         * instead. This method is primarily for setting the field to an undocumented or not yet
         * supported value.
         */
        fun phoneNumbers(phoneNumbers: JsonField<List<String>>) = apply {
            body.phoneNumbers(phoneNumbers)
        }

        /**
         * Adds a single [String] to [phoneNumbers].
         *
         * @throws IllegalStateException if the field was previously set to a non-list.
         */
        fun addPhoneNumber(phoneNumber: String) = apply { body.addPhoneNumber(phoneNumber) }

        /**
         * Third-party reseller / partner managing the enterprise's phone numbers. Omit when the
         * enterprise works directly with Telnyx.
         */
        fun agent(agent: AgentInput) = apply { body.agent(agent) }

        /**
         * Sets [Builder.agent] to an arbitrary JSON value.
         *
         * You should usually call [Builder.agent] with a well-typed [AgentInput] value instead.
         * This method is primarily for setting the field to an undocumented or not yet supported
         * value.
         */
        fun agent(agent: JsonField<AgentInput>) = apply { body.agent(agent) }

        /**
         * Optional. When provided the rendered PDF embeds the signature image, printed name, and
         * signed-at date. When absent the PDF is returned unsigned so the customer can sign
         * externally and upload it via the Documents API.
         */
        fun signature(signature: Signature) = apply { body.signature(signature) }

        /**
         * Sets [Builder.signature] to an arbitrary JSON value.
         *
         * You should usually call [Builder.signature] with a well-typed [Signature] value instead.
         * This method is primarily for setting the field to an undocumented or not yet supported
         * value.
         */
        fun signature(signature: JsonField<Signature>) = apply { body.signature(signature) }

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
         * Returns an immutable instance of [DirLoaParams].
         *
         * Further updates to this [Builder] will not mutate the returned instance.
         *
         * The following fields are required:
         * ```java
         * .phoneNumbers()
         * ```
         *
         * @throws IllegalStateException if any required field is unset.
         */
        fun build(): DirLoaParams =
            DirLoaParams(
                dirId,
                body.build(),
                additionalHeaders.build(),
                additionalQueryParams.build(),
            )
    }

    fun _body(): Body = body

    fun _pathParam(index: Int): String =
        when (index) {
            0 -> dirId ?: ""
            else -> ""
        }

    override fun _headers(): Headers = additionalHeaders

    override fun _queryParams(): QueryParams = additionalQueryParams

    class Body
    @JsonCreator(mode = JsonCreator.Mode.DISABLED)
    private constructor(
        private val phoneNumbers: JsonField<List<String>>,
        private val agent: JsonField<AgentInput>,
        private val signature: JsonField<Signature>,
        private val additionalProperties: MutableMap<String, JsonValue>,
    ) {

        @JsonCreator
        private constructor(
            @JsonProperty("phone_numbers")
            @ExcludeMissing
            phoneNumbers: JsonField<List<String>> = JsonMissing.of(),
            @JsonProperty("agent") @ExcludeMissing agent: JsonField<AgentInput> = JsonMissing.of(),
            @JsonProperty("signature")
            @ExcludeMissing
            signature: JsonField<Signature> = JsonMissing.of(),
        ) : this(phoneNumbers, agent, signature, mutableMapOf())

        /**
         * Telephone numbers to authorize on the DIR, in `+E164` format (`+` followed by 10-15
         * digits). Max 15 per request.
         *
         * @throws TelnyxInvalidDataException if the JSON field has an unexpected type or is
         *   unexpectedly missing or null (e.g. if the server responded with an unexpected value).
         */
        fun phoneNumbers(): List<String> = phoneNumbers.getRequired("phone_numbers")

        /**
         * Third-party reseller / partner managing the enterprise's phone numbers. Omit when the
         * enterprise works directly with Telnyx.
         *
         * @throws TelnyxInvalidDataException if the JSON field has an unexpected type (e.g. if the
         *   server responded with an unexpected value).
         */
        fun agent(): Optional<AgentInput> = agent.getOptional("agent")

        /**
         * Optional. When provided the rendered PDF embeds the signature image, printed name, and
         * signed-at date. When absent the PDF is returned unsigned so the customer can sign
         * externally and upload it via the Documents API.
         *
         * @throws TelnyxInvalidDataException if the JSON field has an unexpected type (e.g. if the
         *   server responded with an unexpected value).
         */
        fun signature(): Optional<Signature> = signature.getOptional("signature")

        /**
         * Returns the raw JSON value of [phoneNumbers].
         *
         * Unlike [phoneNumbers], this method doesn't throw if the JSON field has an unexpected
         * type.
         */
        @JsonProperty("phone_numbers")
        @ExcludeMissing
        fun _phoneNumbers(): JsonField<List<String>> = phoneNumbers

        /**
         * Returns the raw JSON value of [agent].
         *
         * Unlike [agent], this method doesn't throw if the JSON field has an unexpected type.
         */
        @JsonProperty("agent") @ExcludeMissing fun _agent(): JsonField<AgentInput> = agent

        /**
         * Returns the raw JSON value of [signature].
         *
         * Unlike [signature], this method doesn't throw if the JSON field has an unexpected type.
         */
        @JsonProperty("signature")
        @ExcludeMissing
        fun _signature(): JsonField<Signature> = signature

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
             * Returns a mutable builder for constructing an instance of [Body].
             *
             * The following fields are required:
             * ```java
             * .phoneNumbers()
             * ```
             */
            @JvmStatic fun builder() = Builder()
        }

        /** A builder for [Body]. */
        class Builder internal constructor() {

            private var phoneNumbers: JsonField<MutableList<String>>? = null
            private var agent: JsonField<AgentInput> = JsonMissing.of()
            private var signature: JsonField<Signature> = JsonMissing.of()
            private var additionalProperties: MutableMap<String, JsonValue> = mutableMapOf()

            @JvmSynthetic
            internal fun from(body: Body) = apply {
                phoneNumbers = body.phoneNumbers.map { it.toMutableList() }
                agent = body.agent
                signature = body.signature
                additionalProperties = body.additionalProperties.toMutableMap()
            }

            /**
             * Telephone numbers to authorize on the DIR, in `+E164` format (`+` followed by 10-15
             * digits). Max 15 per request.
             */
            fun phoneNumbers(phoneNumbers: List<String>) = phoneNumbers(JsonField.of(phoneNumbers))

            /**
             * Sets [Builder.phoneNumbers] to an arbitrary JSON value.
             *
             * You should usually call [Builder.phoneNumbers] with a well-typed `List<String>` value
             * instead. This method is primarily for setting the field to an undocumented or not yet
             * supported value.
             */
            fun phoneNumbers(phoneNumbers: JsonField<List<String>>) = apply {
                this.phoneNumbers = phoneNumbers.map { it.toMutableList() }
            }

            /**
             * Adds a single [String] to [phoneNumbers].
             *
             * @throws IllegalStateException if the field was previously set to a non-list.
             */
            fun addPhoneNumber(phoneNumber: String) = apply {
                phoneNumbers =
                    (phoneNumbers ?: JsonField.of(mutableListOf())).also {
                        checkKnown("phoneNumbers", it).add(phoneNumber)
                    }
            }

            /**
             * Third-party reseller / partner managing the enterprise's phone numbers. Omit when the
             * enterprise works directly with Telnyx.
             */
            fun agent(agent: AgentInput) = agent(JsonField.of(agent))

            /**
             * Sets [Builder.agent] to an arbitrary JSON value.
             *
             * You should usually call [Builder.agent] with a well-typed [AgentInput] value instead.
             * This method is primarily for setting the field to an undocumented or not yet
             * supported value.
             */
            fun agent(agent: JsonField<AgentInput>) = apply { this.agent = agent }

            /**
             * Optional. When provided the rendered PDF embeds the signature image, printed name,
             * and signed-at date. When absent the PDF is returned unsigned so the customer can sign
             * externally and upload it via the Documents API.
             */
            fun signature(signature: Signature) = signature(JsonField.of(signature))

            /**
             * Sets [Builder.signature] to an arbitrary JSON value.
             *
             * You should usually call [Builder.signature] with a well-typed [Signature] value
             * instead. This method is primarily for setting the field to an undocumented or not yet
             * supported value.
             */
            fun signature(signature: JsonField<Signature>) = apply { this.signature = signature }

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
             *
             * The following fields are required:
             * ```java
             * .phoneNumbers()
             * ```
             *
             * @throws IllegalStateException if any required field is unset.
             */
            fun build(): Body =
                Body(
                    checkRequired("phoneNumbers", phoneNumbers).map { it.toImmutable() },
                    agent,
                    signature,
                    additionalProperties.toMutableMap(),
                )
        }

        private var validated: Boolean = false

        /**
         * Validates that the types of all values in this object match their expected types
         * recursively.
         *
         * This method is _not_ forwards compatible with new types from the API for existing fields.
         *
         * @throws TelnyxInvalidDataException if any value type in this object doesn't match its
         *   expected type.
         */
        fun validate(): Body = apply {
            if (validated) {
                return@apply
            }

            phoneNumbers()
            agent().ifPresent { it.validate() }
            signature().ifPresent { it.validate() }
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
            (phoneNumbers.asKnown().getOrNull()?.size ?: 0) +
                (agent.asKnown().getOrNull()?.validity() ?: 0) +
                (signature.asKnown().getOrNull()?.validity() ?: 0)

        override fun equals(other: Any?): Boolean {
            if (this === other) {
                return true
            }

            return other is Body &&
                phoneNumbers == other.phoneNumbers &&
                agent == other.agent &&
                signature == other.signature &&
                additionalProperties == other.additionalProperties
        }

        private val hashCode: Int by lazy {
            Objects.hash(phoneNumbers, agent, signature, additionalProperties)
        }

        override fun hashCode(): Int = hashCode

        override fun toString() =
            "Body{phoneNumbers=$phoneNumbers, agent=$agent, signature=$signature, additionalProperties=$additionalProperties}"
    }

    /**
     * Optional. When provided the rendered PDF embeds the signature image, printed name, and
     * signed-at date. When absent the PDF is returned unsigned so the customer can sign externally
     * and upload it via the Documents API.
     */
    class Signature
    @JsonCreator(mode = JsonCreator.Mode.DISABLED)
    private constructor(
        private val imageBase64: JsonField<String>,
        private val signerName: JsonField<String>,
        private val additionalProperties: MutableMap<String, JsonValue>,
    ) {

        @JsonCreator
        private constructor(
            @JsonProperty("image_base64")
            @ExcludeMissing
            imageBase64: JsonField<String> = JsonMissing.of(),
            @JsonProperty("signer_name")
            @ExcludeMissing
            signerName: JsonField<String> = JsonMissing.of(),
        ) : this(imageBase64, signerName, mutableMapOf())

        /**
         * PNG image, base64-encoded.
         *
         * @throws TelnyxInvalidDataException if the JSON field has an unexpected type or is
         *   unexpectedly missing or null (e.g. if the server responded with an unexpected value).
         */
        fun imageBase64(): String = imageBase64.getRequired("image_base64")

        /**
         * Optional. When absent the rendered PDF falls back to the enterprise contact's legal name.
         *
         * @throws TelnyxInvalidDataException if the JSON field has an unexpected type (e.g. if the
         *   server responded with an unexpected value).
         */
        fun signerName(): Optional<String> = signerName.getOptional("signer_name")

        /**
         * Returns the raw JSON value of [imageBase64].
         *
         * Unlike [imageBase64], this method doesn't throw if the JSON field has an unexpected type.
         */
        @JsonProperty("image_base64")
        @ExcludeMissing
        fun _imageBase64(): JsonField<String> = imageBase64

        /**
         * Returns the raw JSON value of [signerName].
         *
         * Unlike [signerName], this method doesn't throw if the JSON field has an unexpected type.
         */
        @JsonProperty("signer_name")
        @ExcludeMissing
        fun _signerName(): JsonField<String> = signerName

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
             * Returns a mutable builder for constructing an instance of [Signature].
             *
             * The following fields are required:
             * ```java
             * .imageBase64()
             * ```
             */
            @JvmStatic fun builder() = Builder()
        }

        /** A builder for [Signature]. */
        class Builder internal constructor() {

            private var imageBase64: JsonField<String>? = null
            private var signerName: JsonField<String> = JsonMissing.of()
            private var additionalProperties: MutableMap<String, JsonValue> = mutableMapOf()

            @JvmSynthetic
            internal fun from(signature: Signature) = apply {
                imageBase64 = signature.imageBase64
                signerName = signature.signerName
                additionalProperties = signature.additionalProperties.toMutableMap()
            }

            /** PNG image, base64-encoded. */
            fun imageBase64(imageBase64: String) = imageBase64(JsonField.of(imageBase64))

            /**
             * Sets [Builder.imageBase64] to an arbitrary JSON value.
             *
             * You should usually call [Builder.imageBase64] with a well-typed [String] value
             * instead. This method is primarily for setting the field to an undocumented or not yet
             * supported value.
             */
            fun imageBase64(imageBase64: JsonField<String>) = apply {
                this.imageBase64 = imageBase64
            }

            /**
             * Optional. When absent the rendered PDF falls back to the enterprise contact's legal
             * name.
             */
            fun signerName(signerName: String?) = signerName(JsonField.ofNullable(signerName))

            /** Alias for calling [Builder.signerName] with `signerName.orElse(null)`. */
            fun signerName(signerName: Optional<String>) = signerName(signerName.getOrNull())

            /**
             * Sets [Builder.signerName] to an arbitrary JSON value.
             *
             * You should usually call [Builder.signerName] with a well-typed [String] value
             * instead. This method is primarily for setting the field to an undocumented or not yet
             * supported value.
             */
            fun signerName(signerName: JsonField<String>) = apply { this.signerName = signerName }

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
             * Returns an immutable instance of [Signature].
             *
             * Further updates to this [Builder] will not mutate the returned instance.
             *
             * The following fields are required:
             * ```java
             * .imageBase64()
             * ```
             *
             * @throws IllegalStateException if any required field is unset.
             */
            fun build(): Signature =
                Signature(
                    checkRequired("imageBase64", imageBase64),
                    signerName,
                    additionalProperties.toMutableMap(),
                )
        }

        private var validated: Boolean = false

        /**
         * Validates that the types of all values in this object match their expected types
         * recursively.
         *
         * This method is _not_ forwards compatible with new types from the API for existing fields.
         *
         * @throws TelnyxInvalidDataException if any value type in this object doesn't match its
         *   expected type.
         */
        fun validate(): Signature = apply {
            if (validated) {
                return@apply
            }

            imageBase64()
            signerName()
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
            (if (imageBase64.asKnown().isPresent) 1 else 0) +
                (if (signerName.asKnown().isPresent) 1 else 0)

        override fun equals(other: Any?): Boolean {
            if (this === other) {
                return true
            }

            return other is Signature &&
                imageBase64 == other.imageBase64 &&
                signerName == other.signerName &&
                additionalProperties == other.additionalProperties
        }

        private val hashCode: Int by lazy {
            Objects.hash(imageBase64, signerName, additionalProperties)
        }

        override fun hashCode(): Int = hashCode

        override fun toString() =
            "Signature{imageBase64=$imageBase64, signerName=$signerName, additionalProperties=$additionalProperties}"
    }

    override fun equals(other: Any?): Boolean {
        if (this === other) {
            return true
        }

        return other is DirLoaParams &&
            dirId == other.dirId &&
            body == other.body &&
            additionalHeaders == other.additionalHeaders &&
            additionalQueryParams == other.additionalQueryParams
    }

    override fun hashCode(): Int =
        Objects.hash(dirId, body, additionalHeaders, additionalQueryParams)

    override fun toString() =
        "DirLoaParams{dirId=$dirId, body=$body, additionalHeaders=$additionalHeaders, additionalQueryParams=$additionalQueryParams}"
}
