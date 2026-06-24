// File generated from our OpenAPI spec by Stainless.

package com.telnyx.sdk.models.enterprises.reputation.loa

import com.fasterxml.jackson.annotation.JsonAnyGetter
import com.fasterxml.jackson.annotation.JsonAnySetter
import com.fasterxml.jackson.annotation.JsonCreator
import com.fasterxml.jackson.annotation.JsonProperty
import com.telnyx.sdk.core.ExcludeMissing
import com.telnyx.sdk.core.JsonField
import com.telnyx.sdk.core.JsonMissing
import com.telnyx.sdk.core.JsonValue
import com.telnyx.sdk.core.Params
import com.telnyx.sdk.core.checkRequired
import com.telnyx.sdk.core.http.Headers
import com.telnyx.sdk.core.http.QueryParams
import com.telnyx.sdk.errors.TelnyxInvalidDataException
import java.util.Collections
import java.util.Objects
import java.util.Optional
import kotlin.jvm.optionals.getOrNull

/**
 * Render the LOA for this enterprise as a PDF. The enterprise identity, address, and
 * authorized-representative contact are taken from the enterprise record; the optional `agent`
 * block is supplied only when a third-party partner manages the numbers. The response is the PDF
 * itself (unsigned unless a `signature` is provided). Sign it and upload it to the Telnyx Documents
 * API (`POST /v2/documents`, see https://developers.telnyx.com/api/documents) to obtain the
 * `loa_document_id` required by `POST .../reputation`.
 */
class LoaRenderParams
private constructor(
    private val enterpriseId: String?,
    private val body: Body,
    private val additionalHeaders: Headers,
    private val additionalQueryParams: QueryParams,
) : Params {

    fun enterpriseId(): Optional<String> = Optional.ofNullable(enterpriseId)

    /**
     * Third-party reseller / partner managing the enterprise's phone numbers. Omit when the
     * enterprise works directly with Telnyx.
     *
     * @throws TelnyxInvalidDataException if the JSON field has an unexpected type (e.g. if the
     *   server responded with an unexpected value).
     */
    fun agent(): Optional<AgentInput> = body.agent()

    /**
     * Optional signature embedded in the rendered PDF. When omitted the PDF is returned unsigned
     * for the customer to sign and upload.
     *
     * @throws TelnyxInvalidDataException if the JSON field has an unexpected type (e.g. if the
     *   server responded with an unexpected value).
     */
    fun signature(): Optional<Signature> = body.signature()

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

        @JvmStatic fun none(): LoaRenderParams = builder().build()

        /** Returns a mutable builder for constructing an instance of [LoaRenderParams]. */
        @JvmStatic fun builder() = Builder()
    }

    /** A builder for [LoaRenderParams]. */
    class Builder internal constructor() {

        private var enterpriseId: String? = null
        private var body: Body.Builder = Body.builder()
        private var additionalHeaders: Headers.Builder = Headers.builder()
        private var additionalQueryParams: QueryParams.Builder = QueryParams.builder()

        @JvmSynthetic
        internal fun from(loaRenderParams: LoaRenderParams) = apply {
            enterpriseId = loaRenderParams.enterpriseId
            body = loaRenderParams.body.toBuilder()
            additionalHeaders = loaRenderParams.additionalHeaders.toBuilder()
            additionalQueryParams = loaRenderParams.additionalQueryParams.toBuilder()
        }

        fun enterpriseId(enterpriseId: String?) = apply { this.enterpriseId = enterpriseId }

        /** Alias for calling [Builder.enterpriseId] with `enterpriseId.orElse(null)`. */
        fun enterpriseId(enterpriseId: Optional<String>) = enterpriseId(enterpriseId.getOrNull())

        /**
         * Sets the entire request body.
         *
         * This is generally only useful if you are already constructing the body separately.
         * Otherwise, it's more convenient to use the top-level setters instead:
         * - [agent]
         * - [signature]
         */
        fun body(body: Body) = apply { this.body = body.toBuilder() }

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
         * Optional signature embedded in the rendered PDF. When omitted the PDF is returned
         * unsigned for the customer to sign and upload.
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
         * Returns an immutable instance of [LoaRenderParams].
         *
         * Further updates to this [Builder] will not mutate the returned instance.
         */
        fun build(): LoaRenderParams =
            LoaRenderParams(
                enterpriseId,
                body.build(),
                additionalHeaders.build(),
                additionalQueryParams.build(),
            )
    }

    fun _body(): Body = body

    fun _pathParam(index: Int): String =
        when (index) {
            0 -> enterpriseId ?: ""
            else -> ""
        }

    override fun _headers(): Headers = additionalHeaders

    override fun _queryParams(): QueryParams = additionalQueryParams

    /**
     * All fields optional. The enterprise identity, address, and authorized-representative contact
     * are read from the enterprise record keyed by the path parameter.
     */
    class Body
    @JsonCreator(mode = JsonCreator.Mode.DISABLED)
    private constructor(
        private val agent: JsonField<AgentInput>,
        private val signature: JsonField<Signature>,
        private val additionalProperties: MutableMap<String, JsonValue>,
    ) {

        @JsonCreator
        private constructor(
            @JsonProperty("agent") @ExcludeMissing agent: JsonField<AgentInput> = JsonMissing.of(),
            @JsonProperty("signature")
            @ExcludeMissing
            signature: JsonField<Signature> = JsonMissing.of(),
        ) : this(agent, signature, mutableMapOf())

        /**
         * Third-party reseller / partner managing the enterprise's phone numbers. Omit when the
         * enterprise works directly with Telnyx.
         *
         * @throws TelnyxInvalidDataException if the JSON field has an unexpected type (e.g. if the
         *   server responded with an unexpected value).
         */
        fun agent(): Optional<AgentInput> = agent.getOptional("agent")

        /**
         * Optional signature embedded in the rendered PDF. When omitted the PDF is returned
         * unsigned for the customer to sign and upload.
         *
         * @throws TelnyxInvalidDataException if the JSON field has an unexpected type (e.g. if the
         *   server responded with an unexpected value).
         */
        fun signature(): Optional<Signature> = signature.getOptional("signature")

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

            /** Returns a mutable builder for constructing an instance of [Body]. */
            @JvmStatic fun builder() = Builder()
        }

        /** A builder for [Body]. */
        class Builder internal constructor() {

            private var agent: JsonField<AgentInput> = JsonMissing.of()
            private var signature: JsonField<Signature> = JsonMissing.of()
            private var additionalProperties: MutableMap<String, JsonValue> = mutableMapOf()

            @JvmSynthetic
            internal fun from(body: Body) = apply {
                agent = body.agent
                signature = body.signature
                additionalProperties = body.additionalProperties.toMutableMap()
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
             * Optional signature embedded in the rendered PDF. When omitted the PDF is returned
             * unsigned for the customer to sign and upload.
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
             */
            fun build(): Body = Body(agent, signature, additionalProperties.toMutableMap())
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
            (agent.asKnown().getOrNull()?.validity() ?: 0) +
                (signature.asKnown().getOrNull()?.validity() ?: 0)

        override fun equals(other: Any?): Boolean {
            if (this === other) {
                return true
            }

            return other is Body &&
                agent == other.agent &&
                signature == other.signature &&
                additionalProperties == other.additionalProperties
        }

        private val hashCode: Int by lazy { Objects.hash(agent, signature, additionalProperties) }

        override fun hashCode(): Int = hashCode

        override fun toString() =
            "Body{agent=$agent, signature=$signature, additionalProperties=$additionalProperties}"
    }

    /**
     * Optional signature embedded in the rendered PDF. When omitted the PDF is returned unsigned
     * for the customer to sign and upload.
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
         * Base64-encoded signature image.
         *
         * @throws TelnyxInvalidDataException if the JSON field has an unexpected type or is
         *   unexpectedly missing or null (e.g. if the server responded with an unexpected value).
         */
        fun imageBase64(): String = imageBase64.getRequired("image_base64")

        /**
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

            /** Base64-encoded signature image. */
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

        return other is LoaRenderParams &&
            enterpriseId == other.enterpriseId &&
            body == other.body &&
            additionalHeaders == other.additionalHeaders &&
            additionalQueryParams == other.additionalQueryParams
    }

    override fun hashCode(): Int =
        Objects.hash(enterpriseId, body, additionalHeaders, additionalQueryParams)

    override fun toString() =
        "LoaRenderParams{enterpriseId=$enterpriseId, body=$body, additionalHeaders=$additionalHeaders, additionalQueryParams=$additionalQueryParams}"
}
