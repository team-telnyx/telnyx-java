// File generated from our OpenAPI spec by Stainless.

package com.telnyx.api.models.oauth

import com.fasterxml.jackson.annotation.JsonAnyGetter
import com.fasterxml.jackson.annotation.JsonAnySetter
import com.fasterxml.jackson.annotation.JsonCreator
import com.fasterxml.jackson.annotation.JsonProperty
import com.telnyx.api.core.ExcludeMissing
import com.telnyx.api.core.JsonField
import com.telnyx.api.core.JsonMissing
import com.telnyx.api.core.JsonValue
import com.telnyx.api.core.checkKnown
import com.telnyx.api.core.toImmutable
import com.telnyx.api.errors.TelnyxInvalidDataException
import java.util.Collections
import java.util.Objects
import java.util.Optional
import kotlin.jvm.optionals.getOrNull

class OAuthRetrieveResponse
@JsonCreator(mode = JsonCreator.Mode.DISABLED)
private constructor(
    private val data: JsonField<Data>,
    private val additionalProperties: MutableMap<String, JsonValue>,
) {

    @JsonCreator
    private constructor(
        @JsonProperty("data") @ExcludeMissing data: JsonField<Data> = JsonMissing.of()
    ) : this(data, mutableMapOf())

    /**
     * @throws TelnyxInvalidDataException if the JSON field has an unexpected type (e.g. if the
     *   server responded with an unexpected value).
     */
    fun data(): Optional<Data> = data.getOptional("data")

    /**
     * Returns the raw JSON value of [data].
     *
     * Unlike [data], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("data") @ExcludeMissing fun _data(): JsonField<Data> = data

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

        /** Returns a mutable builder for constructing an instance of [OAuthRetrieveResponse]. */
        @JvmStatic fun builder() = Builder()
    }

    /** A builder for [OAuthRetrieveResponse]. */
    class Builder internal constructor() {

        private var data: JsonField<Data> = JsonMissing.of()
        private var additionalProperties: MutableMap<String, JsonValue> = mutableMapOf()

        @JvmSynthetic
        internal fun from(oauthRetrieveResponse: OAuthRetrieveResponse) = apply {
            data = oauthRetrieveResponse.data
            additionalProperties = oauthRetrieveResponse.additionalProperties.toMutableMap()
        }

        fun data(data: Data) = data(JsonField.of(data))

        /**
         * Sets [Builder.data] to an arbitrary JSON value.
         *
         * You should usually call [Builder.data] with a well-typed [Data] value instead. This
         * method is primarily for setting the field to an undocumented or not yet supported value.
         */
        fun data(data: JsonField<Data>) = apply { this.data = data }

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
         * Returns an immutable instance of [OAuthRetrieveResponse].
         *
         * Further updates to this [Builder] will not mutate the returned instance.
         */
        fun build(): OAuthRetrieveResponse =
            OAuthRetrieveResponse(data, additionalProperties.toMutableMap())
    }

    private var validated: Boolean = false

    fun validate(): OAuthRetrieveResponse = apply {
        if (validated) {
            return@apply
        }

        data().ifPresent { it.validate() }
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
     * Returns a score indicating how many valid values are contained in this object recursively.
     *
     * Used for best match union deserialization.
     */
    @JvmSynthetic internal fun validity(): Int = (data.asKnown().getOrNull()?.validity() ?: 0)

    class Data
    @JsonCreator(mode = JsonCreator.Mode.DISABLED)
    private constructor(
        private val clientId: JsonField<String>,
        private val logoUri: JsonField<String>,
        private val name: JsonField<String>,
        private val policyUri: JsonField<String>,
        private val redirectUri: JsonField<String>,
        private val requestedScopes: JsonField<List<RequestedScope>>,
        private val tosUri: JsonField<String>,
        private val verified: JsonField<Boolean>,
        private val additionalProperties: MutableMap<String, JsonValue>,
    ) {

        @JsonCreator
        private constructor(
            @JsonProperty("client_id")
            @ExcludeMissing
            clientId: JsonField<String> = JsonMissing.of(),
            @JsonProperty("logo_uri") @ExcludeMissing logoUri: JsonField<String> = JsonMissing.of(),
            @JsonProperty("name") @ExcludeMissing name: JsonField<String> = JsonMissing.of(),
            @JsonProperty("policy_uri")
            @ExcludeMissing
            policyUri: JsonField<String> = JsonMissing.of(),
            @JsonProperty("redirect_uri")
            @ExcludeMissing
            redirectUri: JsonField<String> = JsonMissing.of(),
            @JsonProperty("requested_scopes")
            @ExcludeMissing
            requestedScopes: JsonField<List<RequestedScope>> = JsonMissing.of(),
            @JsonProperty("tos_uri") @ExcludeMissing tosUri: JsonField<String> = JsonMissing.of(),
            @JsonProperty("verified")
            @ExcludeMissing
            verified: JsonField<Boolean> = JsonMissing.of(),
        ) : this(
            clientId,
            logoUri,
            name,
            policyUri,
            redirectUri,
            requestedScopes,
            tosUri,
            verified,
            mutableMapOf(),
        )

        /**
         * Client ID
         *
         * @throws TelnyxInvalidDataException if the JSON field has an unexpected type (e.g. if the
         *   server responded with an unexpected value).
         */
        fun clientId(): Optional<String> = clientId.getOptional("client_id")

        /**
         * URL of the client logo
         *
         * @throws TelnyxInvalidDataException if the JSON field has an unexpected type (e.g. if the
         *   server responded with an unexpected value).
         */
        fun logoUri(): Optional<String> = logoUri.getOptional("logo_uri")

        /**
         * Client name
         *
         * @throws TelnyxInvalidDataException if the JSON field has an unexpected type (e.g. if the
         *   server responded with an unexpected value).
         */
        fun name(): Optional<String> = name.getOptional("name")

        /**
         * URL of the client's privacy policy
         *
         * @throws TelnyxInvalidDataException if the JSON field has an unexpected type (e.g. if the
         *   server responded with an unexpected value).
         */
        fun policyUri(): Optional<String> = policyUri.getOptional("policy_uri")

        /**
         * The redirect URI for this authorization
         *
         * @throws TelnyxInvalidDataException if the JSON field has an unexpected type (e.g. if the
         *   server responded with an unexpected value).
         */
        fun redirectUri(): Optional<String> = redirectUri.getOptional("redirect_uri")

        /**
         * @throws TelnyxInvalidDataException if the JSON field has an unexpected type (e.g. if the
         *   server responded with an unexpected value).
         */
        fun requestedScopes(): Optional<List<RequestedScope>> =
            requestedScopes.getOptional("requested_scopes")

        /**
         * URL of the client's terms of service
         *
         * @throws TelnyxInvalidDataException if the JSON field has an unexpected type (e.g. if the
         *   server responded with an unexpected value).
         */
        fun tosUri(): Optional<String> = tosUri.getOptional("tos_uri")

        /**
         * Whether the client is verified
         *
         * @throws TelnyxInvalidDataException if the JSON field has an unexpected type (e.g. if the
         *   server responded with an unexpected value).
         */
        fun verified(): Optional<Boolean> = verified.getOptional("verified")

        /**
         * Returns the raw JSON value of [clientId].
         *
         * Unlike [clientId], this method doesn't throw if the JSON field has an unexpected type.
         */
        @JsonProperty("client_id") @ExcludeMissing fun _clientId(): JsonField<String> = clientId

        /**
         * Returns the raw JSON value of [logoUri].
         *
         * Unlike [logoUri], this method doesn't throw if the JSON field has an unexpected type.
         */
        @JsonProperty("logo_uri") @ExcludeMissing fun _logoUri(): JsonField<String> = logoUri

        /**
         * Returns the raw JSON value of [name].
         *
         * Unlike [name], this method doesn't throw if the JSON field has an unexpected type.
         */
        @JsonProperty("name") @ExcludeMissing fun _name(): JsonField<String> = name

        /**
         * Returns the raw JSON value of [policyUri].
         *
         * Unlike [policyUri], this method doesn't throw if the JSON field has an unexpected type.
         */
        @JsonProperty("policy_uri") @ExcludeMissing fun _policyUri(): JsonField<String> = policyUri

        /**
         * Returns the raw JSON value of [redirectUri].
         *
         * Unlike [redirectUri], this method doesn't throw if the JSON field has an unexpected type.
         */
        @JsonProperty("redirect_uri")
        @ExcludeMissing
        fun _redirectUri(): JsonField<String> = redirectUri

        /**
         * Returns the raw JSON value of [requestedScopes].
         *
         * Unlike [requestedScopes], this method doesn't throw if the JSON field has an unexpected
         * type.
         */
        @JsonProperty("requested_scopes")
        @ExcludeMissing
        fun _requestedScopes(): JsonField<List<RequestedScope>> = requestedScopes

        /**
         * Returns the raw JSON value of [tosUri].
         *
         * Unlike [tosUri], this method doesn't throw if the JSON field has an unexpected type.
         */
        @JsonProperty("tos_uri") @ExcludeMissing fun _tosUri(): JsonField<String> = tosUri

        /**
         * Returns the raw JSON value of [verified].
         *
         * Unlike [verified], this method doesn't throw if the JSON field has an unexpected type.
         */
        @JsonProperty("verified") @ExcludeMissing fun _verified(): JsonField<Boolean> = verified

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

            /** Returns a mutable builder for constructing an instance of [Data]. */
            @JvmStatic fun builder() = Builder()
        }

        /** A builder for [Data]. */
        class Builder internal constructor() {

            private var clientId: JsonField<String> = JsonMissing.of()
            private var logoUri: JsonField<String> = JsonMissing.of()
            private var name: JsonField<String> = JsonMissing.of()
            private var policyUri: JsonField<String> = JsonMissing.of()
            private var redirectUri: JsonField<String> = JsonMissing.of()
            private var requestedScopes: JsonField<MutableList<RequestedScope>>? = null
            private var tosUri: JsonField<String> = JsonMissing.of()
            private var verified: JsonField<Boolean> = JsonMissing.of()
            private var additionalProperties: MutableMap<String, JsonValue> = mutableMapOf()

            @JvmSynthetic
            internal fun from(data: Data) = apply {
                clientId = data.clientId
                logoUri = data.logoUri
                name = data.name
                policyUri = data.policyUri
                redirectUri = data.redirectUri
                requestedScopes = data.requestedScopes.map { it.toMutableList() }
                tosUri = data.tosUri
                verified = data.verified
                additionalProperties = data.additionalProperties.toMutableMap()
            }

            /** Client ID */
            fun clientId(clientId: String) = clientId(JsonField.of(clientId))

            /**
             * Sets [Builder.clientId] to an arbitrary JSON value.
             *
             * You should usually call [Builder.clientId] with a well-typed [String] value instead.
             * This method is primarily for setting the field to an undocumented or not yet
             * supported value.
             */
            fun clientId(clientId: JsonField<String>) = apply { this.clientId = clientId }

            /** URL of the client logo */
            fun logoUri(logoUri: String?) = logoUri(JsonField.ofNullable(logoUri))

            /** Alias for calling [Builder.logoUri] with `logoUri.orElse(null)`. */
            fun logoUri(logoUri: Optional<String>) = logoUri(logoUri.getOrNull())

            /**
             * Sets [Builder.logoUri] to an arbitrary JSON value.
             *
             * You should usually call [Builder.logoUri] with a well-typed [String] value instead.
             * This method is primarily for setting the field to an undocumented or not yet
             * supported value.
             */
            fun logoUri(logoUri: JsonField<String>) = apply { this.logoUri = logoUri }

            /** Client name */
            fun name(name: String) = name(JsonField.of(name))

            /**
             * Sets [Builder.name] to an arbitrary JSON value.
             *
             * You should usually call [Builder.name] with a well-typed [String] value instead. This
             * method is primarily for setting the field to an undocumented or not yet supported
             * value.
             */
            fun name(name: JsonField<String>) = apply { this.name = name }

            /** URL of the client's privacy policy */
            fun policyUri(policyUri: String?) = policyUri(JsonField.ofNullable(policyUri))

            /** Alias for calling [Builder.policyUri] with `policyUri.orElse(null)`. */
            fun policyUri(policyUri: Optional<String>) = policyUri(policyUri.getOrNull())

            /**
             * Sets [Builder.policyUri] to an arbitrary JSON value.
             *
             * You should usually call [Builder.policyUri] with a well-typed [String] value instead.
             * This method is primarily for setting the field to an undocumented or not yet
             * supported value.
             */
            fun policyUri(policyUri: JsonField<String>) = apply { this.policyUri = policyUri }

            /** The redirect URI for this authorization */
            fun redirectUri(redirectUri: String) = redirectUri(JsonField.of(redirectUri))

            /**
             * Sets [Builder.redirectUri] to an arbitrary JSON value.
             *
             * You should usually call [Builder.redirectUri] with a well-typed [String] value
             * instead. This method is primarily for setting the field to an undocumented or not yet
             * supported value.
             */
            fun redirectUri(redirectUri: JsonField<String>) = apply {
                this.redirectUri = redirectUri
            }

            fun requestedScopes(requestedScopes: List<RequestedScope>) =
                requestedScopes(JsonField.of(requestedScopes))

            /**
             * Sets [Builder.requestedScopes] to an arbitrary JSON value.
             *
             * You should usually call [Builder.requestedScopes] with a well-typed
             * `List<RequestedScope>` value instead. This method is primarily for setting the field
             * to an undocumented or not yet supported value.
             */
            fun requestedScopes(requestedScopes: JsonField<List<RequestedScope>>) = apply {
                this.requestedScopes = requestedScopes.map { it.toMutableList() }
            }

            /**
             * Adds a single [RequestedScope] to [requestedScopes].
             *
             * @throws IllegalStateException if the field was previously set to a non-list.
             */
            fun addRequestedScope(requestedScope: RequestedScope) = apply {
                requestedScopes =
                    (requestedScopes ?: JsonField.of(mutableListOf())).also {
                        checkKnown("requestedScopes", it).add(requestedScope)
                    }
            }

            /** URL of the client's terms of service */
            fun tosUri(tosUri: String?) = tosUri(JsonField.ofNullable(tosUri))

            /** Alias for calling [Builder.tosUri] with `tosUri.orElse(null)`. */
            fun tosUri(tosUri: Optional<String>) = tosUri(tosUri.getOrNull())

            /**
             * Sets [Builder.tosUri] to an arbitrary JSON value.
             *
             * You should usually call [Builder.tosUri] with a well-typed [String] value instead.
             * This method is primarily for setting the field to an undocumented or not yet
             * supported value.
             */
            fun tosUri(tosUri: JsonField<String>) = apply { this.tosUri = tosUri }

            /** Whether the client is verified */
            fun verified(verified: Boolean) = verified(JsonField.of(verified))

            /**
             * Sets [Builder.verified] to an arbitrary JSON value.
             *
             * You should usually call [Builder.verified] with a well-typed [Boolean] value instead.
             * This method is primarily for setting the field to an undocumented or not yet
             * supported value.
             */
            fun verified(verified: JsonField<Boolean>) = apply { this.verified = verified }

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
             * Returns an immutable instance of [Data].
             *
             * Further updates to this [Builder] will not mutate the returned instance.
             */
            fun build(): Data =
                Data(
                    clientId,
                    logoUri,
                    name,
                    policyUri,
                    redirectUri,
                    (requestedScopes ?: JsonMissing.of()).map { it.toImmutable() },
                    tosUri,
                    verified,
                    additionalProperties.toMutableMap(),
                )
        }

        private var validated: Boolean = false

        fun validate(): Data = apply {
            if (validated) {
                return@apply
            }

            clientId()
            logoUri()
            name()
            policyUri()
            redirectUri()
            requestedScopes().ifPresent { it.forEach { it.validate() } }
            tosUri()
            verified()
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
            (if (clientId.asKnown().isPresent) 1 else 0) +
                (if (logoUri.asKnown().isPresent) 1 else 0) +
                (if (name.asKnown().isPresent) 1 else 0) +
                (if (policyUri.asKnown().isPresent) 1 else 0) +
                (if (redirectUri.asKnown().isPresent) 1 else 0) +
                (requestedScopes.asKnown().getOrNull()?.sumOf { it.validity().toInt() } ?: 0) +
                (if (tosUri.asKnown().isPresent) 1 else 0) +
                (if (verified.asKnown().isPresent) 1 else 0)

        class RequestedScope
        @JsonCreator(mode = JsonCreator.Mode.DISABLED)
        private constructor(
            private val id: JsonField<String>,
            private val description: JsonField<String>,
            private val name: JsonField<String>,
            private val additionalProperties: MutableMap<String, JsonValue>,
        ) {

            @JsonCreator
            private constructor(
                @JsonProperty("id") @ExcludeMissing id: JsonField<String> = JsonMissing.of(),
                @JsonProperty("description")
                @ExcludeMissing
                description: JsonField<String> = JsonMissing.of(),
                @JsonProperty("name") @ExcludeMissing name: JsonField<String> = JsonMissing.of(),
            ) : this(id, description, name, mutableMapOf())

            /**
             * Scope ID
             *
             * @throws TelnyxInvalidDataException if the JSON field has an unexpected type (e.g. if
             *   the server responded with an unexpected value).
             */
            fun id(): Optional<String> = id.getOptional("id")

            /**
             * Scope description
             *
             * @throws TelnyxInvalidDataException if the JSON field has an unexpected type (e.g. if
             *   the server responded with an unexpected value).
             */
            fun description(): Optional<String> = description.getOptional("description")

            /**
             * Scope name
             *
             * @throws TelnyxInvalidDataException if the JSON field has an unexpected type (e.g. if
             *   the server responded with an unexpected value).
             */
            fun name(): Optional<String> = name.getOptional("name")

            /**
             * Returns the raw JSON value of [id].
             *
             * Unlike [id], this method doesn't throw if the JSON field has an unexpected type.
             */
            @JsonProperty("id") @ExcludeMissing fun _id(): JsonField<String> = id

            /**
             * Returns the raw JSON value of [description].
             *
             * Unlike [description], this method doesn't throw if the JSON field has an unexpected
             * type.
             */
            @JsonProperty("description")
            @ExcludeMissing
            fun _description(): JsonField<String> = description

            /**
             * Returns the raw JSON value of [name].
             *
             * Unlike [name], this method doesn't throw if the JSON field has an unexpected type.
             */
            @JsonProperty("name") @ExcludeMissing fun _name(): JsonField<String> = name

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

                /** Returns a mutable builder for constructing an instance of [RequestedScope]. */
                @JvmStatic fun builder() = Builder()
            }

            /** A builder for [RequestedScope]. */
            class Builder internal constructor() {

                private var id: JsonField<String> = JsonMissing.of()
                private var description: JsonField<String> = JsonMissing.of()
                private var name: JsonField<String> = JsonMissing.of()
                private var additionalProperties: MutableMap<String, JsonValue> = mutableMapOf()

                @JvmSynthetic
                internal fun from(requestedScope: RequestedScope) = apply {
                    id = requestedScope.id
                    description = requestedScope.description
                    name = requestedScope.name
                    additionalProperties = requestedScope.additionalProperties.toMutableMap()
                }

                /** Scope ID */
                fun id(id: String) = id(JsonField.of(id))

                /**
                 * Sets [Builder.id] to an arbitrary JSON value.
                 *
                 * You should usually call [Builder.id] with a well-typed [String] value instead.
                 * This method is primarily for setting the field to an undocumented or not yet
                 * supported value.
                 */
                fun id(id: JsonField<String>) = apply { this.id = id }

                /** Scope description */
                fun description(description: String) = description(JsonField.of(description))

                /**
                 * Sets [Builder.description] to an arbitrary JSON value.
                 *
                 * You should usually call [Builder.description] with a well-typed [String] value
                 * instead. This method is primarily for setting the field to an undocumented or not
                 * yet supported value.
                 */
                fun description(description: JsonField<String>) = apply {
                    this.description = description
                }

                /** Scope name */
                fun name(name: String) = name(JsonField.of(name))

                /**
                 * Sets [Builder.name] to an arbitrary JSON value.
                 *
                 * You should usually call [Builder.name] with a well-typed [String] value instead.
                 * This method is primarily for setting the field to an undocumented or not yet
                 * supported value.
                 */
                fun name(name: JsonField<String>) = apply { this.name = name }

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
                 * Returns an immutable instance of [RequestedScope].
                 *
                 * Further updates to this [Builder] will not mutate the returned instance.
                 */
                fun build(): RequestedScope =
                    RequestedScope(id, description, name, additionalProperties.toMutableMap())
            }

            private var validated: Boolean = false

            fun validate(): RequestedScope = apply {
                if (validated) {
                    return@apply
                }

                id()
                description()
                name()
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
                (if (id.asKnown().isPresent) 1 else 0) +
                    (if (description.asKnown().isPresent) 1 else 0) +
                    (if (name.asKnown().isPresent) 1 else 0)

            override fun equals(other: Any?): Boolean {
                if (this === other) {
                    return true
                }

                return other is RequestedScope &&
                    id == other.id &&
                    description == other.description &&
                    name == other.name &&
                    additionalProperties == other.additionalProperties
            }

            private val hashCode: Int by lazy {
                Objects.hash(id, description, name, additionalProperties)
            }

            override fun hashCode(): Int = hashCode

            override fun toString() =
                "RequestedScope{id=$id, description=$description, name=$name, additionalProperties=$additionalProperties}"
        }

        override fun equals(other: Any?): Boolean {
            if (this === other) {
                return true
            }

            return other is Data &&
                clientId == other.clientId &&
                logoUri == other.logoUri &&
                name == other.name &&
                policyUri == other.policyUri &&
                redirectUri == other.redirectUri &&
                requestedScopes == other.requestedScopes &&
                tosUri == other.tosUri &&
                verified == other.verified &&
                additionalProperties == other.additionalProperties
        }

        private val hashCode: Int by lazy {
            Objects.hash(
                clientId,
                logoUri,
                name,
                policyUri,
                redirectUri,
                requestedScopes,
                tosUri,
                verified,
                additionalProperties,
            )
        }

        override fun hashCode(): Int = hashCode

        override fun toString() =
            "Data{clientId=$clientId, logoUri=$logoUri, name=$name, policyUri=$policyUri, redirectUri=$redirectUri, requestedScopes=$requestedScopes, tosUri=$tosUri, verified=$verified, additionalProperties=$additionalProperties}"
    }

    override fun equals(other: Any?): Boolean {
        if (this === other) {
            return true
        }

        return other is OAuthRetrieveResponse &&
            data == other.data &&
            additionalProperties == other.additionalProperties
    }

    private val hashCode: Int by lazy { Objects.hash(data, additionalProperties) }

    override fun hashCode(): Int = hashCode

    override fun toString() =
        "OAuthRetrieveResponse{data=$data, additionalProperties=$additionalProperties}"
}
