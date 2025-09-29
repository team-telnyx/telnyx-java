// File generated from our OpenAPI spec by Stainless.

package com.telnyx.sdk.models.verifyprofiles

import com.fasterxml.jackson.annotation.JsonAnyGetter
import com.fasterxml.jackson.annotation.JsonAnySetter
import com.fasterxml.jackson.annotation.JsonCreator
import com.fasterxml.jackson.annotation.JsonProperty
import com.telnyx.sdk.core.Enum
import com.telnyx.sdk.core.ExcludeMissing
import com.telnyx.sdk.core.JsonField
import com.telnyx.sdk.core.JsonMissing
import com.telnyx.sdk.core.JsonValue
import com.telnyx.sdk.core.checkKnown
import com.telnyx.sdk.core.toImmutable
import com.telnyx.sdk.errors.TelnyxInvalidDataException
import java.util.Collections
import java.util.Objects
import java.util.Optional
import kotlin.jvm.optionals.getOrNull

class VerifyProfile
@JsonCreator(mode = JsonCreator.Mode.DISABLED)
private constructor(
    private val id: JsonField<String>,
    private val call: JsonField<Call>,
    private val createdAt: JsonField<String>,
    private val flashcall: JsonField<Flashcall>,
    private val language: JsonField<String>,
    private val name: JsonField<String>,
    private val recordType: JsonField<RecordType>,
    private val sms: JsonField<Sms>,
    private val updatedAt: JsonField<String>,
    private val webhookFailoverUrl: JsonField<String>,
    private val webhookUrl: JsonField<String>,
    private val additionalProperties: MutableMap<String, JsonValue>,
) {

    @JsonCreator
    private constructor(
        @JsonProperty("id") @ExcludeMissing id: JsonField<String> = JsonMissing.of(),
        @JsonProperty("call") @ExcludeMissing call: JsonField<Call> = JsonMissing.of(),
        @JsonProperty("created_at") @ExcludeMissing createdAt: JsonField<String> = JsonMissing.of(),
        @JsonProperty("flashcall")
        @ExcludeMissing
        flashcall: JsonField<Flashcall> = JsonMissing.of(),
        @JsonProperty("language") @ExcludeMissing language: JsonField<String> = JsonMissing.of(),
        @JsonProperty("name") @ExcludeMissing name: JsonField<String> = JsonMissing.of(),
        @JsonProperty("record_type")
        @ExcludeMissing
        recordType: JsonField<RecordType> = JsonMissing.of(),
        @JsonProperty("sms") @ExcludeMissing sms: JsonField<Sms> = JsonMissing.of(),
        @JsonProperty("updated_at") @ExcludeMissing updatedAt: JsonField<String> = JsonMissing.of(),
        @JsonProperty("webhook_failover_url")
        @ExcludeMissing
        webhookFailoverUrl: JsonField<String> = JsonMissing.of(),
        @JsonProperty("webhook_url")
        @ExcludeMissing
        webhookUrl: JsonField<String> = JsonMissing.of(),
    ) : this(
        id,
        call,
        createdAt,
        flashcall,
        language,
        name,
        recordType,
        sms,
        updatedAt,
        webhookFailoverUrl,
        webhookUrl,
        mutableMapOf(),
    )

    /**
     * @throws TelnyxInvalidDataException if the JSON field has an unexpected type (e.g. if the
     *   server responded with an unexpected value).
     */
    fun id(): Optional<String> = id.getOptional("id")

    /**
     * @throws TelnyxInvalidDataException if the JSON field has an unexpected type (e.g. if the
     *   server responded with an unexpected value).
     */
    fun call(): Optional<Call> = call.getOptional("call")

    /**
     * @throws TelnyxInvalidDataException if the JSON field has an unexpected type (e.g. if the
     *   server responded with an unexpected value).
     */
    fun createdAt(): Optional<String> = createdAt.getOptional("created_at")

    /**
     * @throws TelnyxInvalidDataException if the JSON field has an unexpected type (e.g. if the
     *   server responded with an unexpected value).
     */
    fun flashcall(): Optional<Flashcall> = flashcall.getOptional("flashcall")

    /**
     * @throws TelnyxInvalidDataException if the JSON field has an unexpected type (e.g. if the
     *   server responded with an unexpected value).
     */
    fun language(): Optional<String> = language.getOptional("language")

    /**
     * @throws TelnyxInvalidDataException if the JSON field has an unexpected type (e.g. if the
     *   server responded with an unexpected value).
     */
    fun name(): Optional<String> = name.getOptional("name")

    /**
     * The possible verification profile record types.
     *
     * @throws TelnyxInvalidDataException if the JSON field has an unexpected type (e.g. if the
     *   server responded with an unexpected value).
     */
    fun recordType(): Optional<RecordType> = recordType.getOptional("record_type")

    /**
     * @throws TelnyxInvalidDataException if the JSON field has an unexpected type (e.g. if the
     *   server responded with an unexpected value).
     */
    fun sms(): Optional<Sms> = sms.getOptional("sms")

    /**
     * @throws TelnyxInvalidDataException if the JSON field has an unexpected type (e.g. if the
     *   server responded with an unexpected value).
     */
    fun updatedAt(): Optional<String> = updatedAt.getOptional("updated_at")

    /**
     * @throws TelnyxInvalidDataException if the JSON field has an unexpected type (e.g. if the
     *   server responded with an unexpected value).
     */
    fun webhookFailoverUrl(): Optional<String> =
        webhookFailoverUrl.getOptional("webhook_failover_url")

    /**
     * @throws TelnyxInvalidDataException if the JSON field has an unexpected type (e.g. if the
     *   server responded with an unexpected value).
     */
    fun webhookUrl(): Optional<String> = webhookUrl.getOptional("webhook_url")

    /**
     * Returns the raw JSON value of [id].
     *
     * Unlike [id], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("id") @ExcludeMissing fun _id(): JsonField<String> = id

    /**
     * Returns the raw JSON value of [call].
     *
     * Unlike [call], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("call") @ExcludeMissing fun _call(): JsonField<Call> = call

    /**
     * Returns the raw JSON value of [createdAt].
     *
     * Unlike [createdAt], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("created_at") @ExcludeMissing fun _createdAt(): JsonField<String> = createdAt

    /**
     * Returns the raw JSON value of [flashcall].
     *
     * Unlike [flashcall], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("flashcall") @ExcludeMissing fun _flashcall(): JsonField<Flashcall> = flashcall

    /**
     * Returns the raw JSON value of [language].
     *
     * Unlike [language], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("language") @ExcludeMissing fun _language(): JsonField<String> = language

    /**
     * Returns the raw JSON value of [name].
     *
     * Unlike [name], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("name") @ExcludeMissing fun _name(): JsonField<String> = name

    /**
     * Returns the raw JSON value of [recordType].
     *
     * Unlike [recordType], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("record_type")
    @ExcludeMissing
    fun _recordType(): JsonField<RecordType> = recordType

    /**
     * Returns the raw JSON value of [sms].
     *
     * Unlike [sms], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("sms") @ExcludeMissing fun _sms(): JsonField<Sms> = sms

    /**
     * Returns the raw JSON value of [updatedAt].
     *
     * Unlike [updatedAt], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("updated_at") @ExcludeMissing fun _updatedAt(): JsonField<String> = updatedAt

    /**
     * Returns the raw JSON value of [webhookFailoverUrl].
     *
     * Unlike [webhookFailoverUrl], this method doesn't throw if the JSON field has an unexpected
     * type.
     */
    @JsonProperty("webhook_failover_url")
    @ExcludeMissing
    fun _webhookFailoverUrl(): JsonField<String> = webhookFailoverUrl

    /**
     * Returns the raw JSON value of [webhookUrl].
     *
     * Unlike [webhookUrl], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("webhook_url") @ExcludeMissing fun _webhookUrl(): JsonField<String> = webhookUrl

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

        /** Returns a mutable builder for constructing an instance of [VerifyProfile]. */
        @JvmStatic fun builder() = Builder()
    }

    /** A builder for [VerifyProfile]. */
    class Builder internal constructor() {

        private var id: JsonField<String> = JsonMissing.of()
        private var call: JsonField<Call> = JsonMissing.of()
        private var createdAt: JsonField<String> = JsonMissing.of()
        private var flashcall: JsonField<Flashcall> = JsonMissing.of()
        private var language: JsonField<String> = JsonMissing.of()
        private var name: JsonField<String> = JsonMissing.of()
        private var recordType: JsonField<RecordType> = JsonMissing.of()
        private var sms: JsonField<Sms> = JsonMissing.of()
        private var updatedAt: JsonField<String> = JsonMissing.of()
        private var webhookFailoverUrl: JsonField<String> = JsonMissing.of()
        private var webhookUrl: JsonField<String> = JsonMissing.of()
        private var additionalProperties: MutableMap<String, JsonValue> = mutableMapOf()

        @JvmSynthetic
        internal fun from(verifyProfile: VerifyProfile) = apply {
            id = verifyProfile.id
            call = verifyProfile.call
            createdAt = verifyProfile.createdAt
            flashcall = verifyProfile.flashcall
            language = verifyProfile.language
            name = verifyProfile.name
            recordType = verifyProfile.recordType
            sms = verifyProfile.sms
            updatedAt = verifyProfile.updatedAt
            webhookFailoverUrl = verifyProfile.webhookFailoverUrl
            webhookUrl = verifyProfile.webhookUrl
            additionalProperties = verifyProfile.additionalProperties.toMutableMap()
        }

        fun id(id: String) = id(JsonField.of(id))

        /**
         * Sets [Builder.id] to an arbitrary JSON value.
         *
         * You should usually call [Builder.id] with a well-typed [String] value instead. This
         * method is primarily for setting the field to an undocumented or not yet supported value.
         */
        fun id(id: JsonField<String>) = apply { this.id = id }

        fun call(call: Call) = call(JsonField.of(call))

        /**
         * Sets [Builder.call] to an arbitrary JSON value.
         *
         * You should usually call [Builder.call] with a well-typed [Call] value instead. This
         * method is primarily for setting the field to an undocumented or not yet supported value.
         */
        fun call(call: JsonField<Call>) = apply { this.call = call }

        fun createdAt(createdAt: String) = createdAt(JsonField.of(createdAt))

        /**
         * Sets [Builder.createdAt] to an arbitrary JSON value.
         *
         * You should usually call [Builder.createdAt] with a well-typed [String] value instead.
         * This method is primarily for setting the field to an undocumented or not yet supported
         * value.
         */
        fun createdAt(createdAt: JsonField<String>) = apply { this.createdAt = createdAt }

        fun flashcall(flashcall: Flashcall) = flashcall(JsonField.of(flashcall))

        /**
         * Sets [Builder.flashcall] to an arbitrary JSON value.
         *
         * You should usually call [Builder.flashcall] with a well-typed [Flashcall] value instead.
         * This method is primarily for setting the field to an undocumented or not yet supported
         * value.
         */
        fun flashcall(flashcall: JsonField<Flashcall>) = apply { this.flashcall = flashcall }

        fun language(language: String) = language(JsonField.of(language))

        /**
         * Sets [Builder.language] to an arbitrary JSON value.
         *
         * You should usually call [Builder.language] with a well-typed [String] value instead. This
         * method is primarily for setting the field to an undocumented or not yet supported value.
         */
        fun language(language: JsonField<String>) = apply { this.language = language }

        fun name(name: String) = name(JsonField.of(name))

        /**
         * Sets [Builder.name] to an arbitrary JSON value.
         *
         * You should usually call [Builder.name] with a well-typed [String] value instead. This
         * method is primarily for setting the field to an undocumented or not yet supported value.
         */
        fun name(name: JsonField<String>) = apply { this.name = name }

        /** The possible verification profile record types. */
        fun recordType(recordType: RecordType) = recordType(JsonField.of(recordType))

        /**
         * Sets [Builder.recordType] to an arbitrary JSON value.
         *
         * You should usually call [Builder.recordType] with a well-typed [RecordType] value
         * instead. This method is primarily for setting the field to an undocumented or not yet
         * supported value.
         */
        fun recordType(recordType: JsonField<RecordType>) = apply { this.recordType = recordType }

        fun sms(sms: Sms) = sms(JsonField.of(sms))

        /**
         * Sets [Builder.sms] to an arbitrary JSON value.
         *
         * You should usually call [Builder.sms] with a well-typed [Sms] value instead. This method
         * is primarily for setting the field to an undocumented or not yet supported value.
         */
        fun sms(sms: JsonField<Sms>) = apply { this.sms = sms }

        fun updatedAt(updatedAt: String) = updatedAt(JsonField.of(updatedAt))

        /**
         * Sets [Builder.updatedAt] to an arbitrary JSON value.
         *
         * You should usually call [Builder.updatedAt] with a well-typed [String] value instead.
         * This method is primarily for setting the field to an undocumented or not yet supported
         * value.
         */
        fun updatedAt(updatedAt: JsonField<String>) = apply { this.updatedAt = updatedAt }

        fun webhookFailoverUrl(webhookFailoverUrl: String) =
            webhookFailoverUrl(JsonField.of(webhookFailoverUrl))

        /**
         * Sets [Builder.webhookFailoverUrl] to an arbitrary JSON value.
         *
         * You should usually call [Builder.webhookFailoverUrl] with a well-typed [String] value
         * instead. This method is primarily for setting the field to an undocumented or not yet
         * supported value.
         */
        fun webhookFailoverUrl(webhookFailoverUrl: JsonField<String>) = apply {
            this.webhookFailoverUrl = webhookFailoverUrl
        }

        fun webhookUrl(webhookUrl: String) = webhookUrl(JsonField.of(webhookUrl))

        /**
         * Sets [Builder.webhookUrl] to an arbitrary JSON value.
         *
         * You should usually call [Builder.webhookUrl] with a well-typed [String] value instead.
         * This method is primarily for setting the field to an undocumented or not yet supported
         * value.
         */
        fun webhookUrl(webhookUrl: JsonField<String>) = apply { this.webhookUrl = webhookUrl }

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
         * Returns an immutable instance of [VerifyProfile].
         *
         * Further updates to this [Builder] will not mutate the returned instance.
         */
        fun build(): VerifyProfile =
            VerifyProfile(
                id,
                call,
                createdAt,
                flashcall,
                language,
                name,
                recordType,
                sms,
                updatedAt,
                webhookFailoverUrl,
                webhookUrl,
                additionalProperties.toMutableMap(),
            )
    }

    private var validated: Boolean = false

    fun validate(): VerifyProfile = apply {
        if (validated) {
            return@apply
        }

        id()
        call().ifPresent { it.validate() }
        createdAt()
        flashcall().ifPresent { it.validate() }
        language()
        name()
        recordType().ifPresent { it.validate() }
        sms().ifPresent { it.validate() }
        updatedAt()
        webhookFailoverUrl()
        webhookUrl()
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
    @JvmSynthetic
    internal fun validity(): Int =
        (if (id.asKnown().isPresent) 1 else 0) +
            (call.asKnown().getOrNull()?.validity() ?: 0) +
            (if (createdAt.asKnown().isPresent) 1 else 0) +
            (flashcall.asKnown().getOrNull()?.validity() ?: 0) +
            (if (language.asKnown().isPresent) 1 else 0) +
            (if (name.asKnown().isPresent) 1 else 0) +
            (recordType.asKnown().getOrNull()?.validity() ?: 0) +
            (sms.asKnown().getOrNull()?.validity() ?: 0) +
            (if (updatedAt.asKnown().isPresent) 1 else 0) +
            (if (webhookFailoverUrl.asKnown().isPresent) 1 else 0) +
            (if (webhookUrl.asKnown().isPresent) 1 else 0)

    class Call
    @JsonCreator(mode = JsonCreator.Mode.DISABLED)
    private constructor(
        private val appName: JsonField<String>,
        private val codeLength: JsonField<Long>,
        private val defaultVerificationTimeoutSecs: JsonField<Long>,
        private val messagingTemplateId: JsonField<String>,
        private val whitelistedDestinations: JsonField<List<String>>,
        private val additionalProperties: MutableMap<String, JsonValue>,
    ) {

        @JsonCreator
        private constructor(
            @JsonProperty("app_name") @ExcludeMissing appName: JsonField<String> = JsonMissing.of(),
            @JsonProperty("code_length")
            @ExcludeMissing
            codeLength: JsonField<Long> = JsonMissing.of(),
            @JsonProperty("default_verification_timeout_secs")
            @ExcludeMissing
            defaultVerificationTimeoutSecs: JsonField<Long> = JsonMissing.of(),
            @JsonProperty("messaging_template_id")
            @ExcludeMissing
            messagingTemplateId: JsonField<String> = JsonMissing.of(),
            @JsonProperty("whitelisted_destinations")
            @ExcludeMissing
            whitelistedDestinations: JsonField<List<String>> = JsonMissing.of(),
        ) : this(
            appName,
            codeLength,
            defaultVerificationTimeoutSecs,
            messagingTemplateId,
            whitelistedDestinations,
            mutableMapOf(),
        )

        /**
         * The name that identifies the application requesting 2fa in the verification message.
         *
         * @throws TelnyxInvalidDataException if the JSON field has an unexpected type (e.g. if the
         *   server responded with an unexpected value).
         */
        fun appName(): Optional<String> = appName.getOptional("app_name")

        /**
         * The length of the verify code to generate.
         *
         * @throws TelnyxInvalidDataException if the JSON field has an unexpected type (e.g. if the
         *   server responded with an unexpected value).
         */
        fun codeLength(): Optional<Long> = codeLength.getOptional("code_length")

        /**
         * For every request that is initiated via this Verify profile, this sets the number of
         * seconds before a verification request code expires. Once the verification request
         * expires, the user cannot use the code to verify their identity.
         *
         * @throws TelnyxInvalidDataException if the JSON field has an unexpected type (e.g. if the
         *   server responded with an unexpected value).
         */
        fun defaultVerificationTimeoutSecs(): Optional<Long> =
            defaultVerificationTimeoutSecs.getOptional("default_verification_timeout_secs")

        /**
         * The message template identifier selected from /verify_profiles/templates
         *
         * @throws TelnyxInvalidDataException if the JSON field has an unexpected type (e.g. if the
         *   server responded with an unexpected value).
         */
        fun messagingTemplateId(): Optional<String> =
            messagingTemplateId.getOptional("messaging_template_id")

        /**
         * Enabled country destinations to send verification codes. The elements in the list must be
         * valid ISO 3166-1 alpha-2 country codes. If set to `["*"]`, all destinations will be
         * allowed.
         *
         * @throws TelnyxInvalidDataException if the JSON field has an unexpected type (e.g. if the
         *   server responded with an unexpected value).
         */
        fun whitelistedDestinations(): Optional<List<String>> =
            whitelistedDestinations.getOptional("whitelisted_destinations")

        /**
         * Returns the raw JSON value of [appName].
         *
         * Unlike [appName], this method doesn't throw if the JSON field has an unexpected type.
         */
        @JsonProperty("app_name") @ExcludeMissing fun _appName(): JsonField<String> = appName

        /**
         * Returns the raw JSON value of [codeLength].
         *
         * Unlike [codeLength], this method doesn't throw if the JSON field has an unexpected type.
         */
        @JsonProperty("code_length") @ExcludeMissing fun _codeLength(): JsonField<Long> = codeLength

        /**
         * Returns the raw JSON value of [defaultVerificationTimeoutSecs].
         *
         * Unlike [defaultVerificationTimeoutSecs], this method doesn't throw if the JSON field has
         * an unexpected type.
         */
        @JsonProperty("default_verification_timeout_secs")
        @ExcludeMissing
        fun _defaultVerificationTimeoutSecs(): JsonField<Long> = defaultVerificationTimeoutSecs

        /**
         * Returns the raw JSON value of [messagingTemplateId].
         *
         * Unlike [messagingTemplateId], this method doesn't throw if the JSON field has an
         * unexpected type.
         */
        @JsonProperty("messaging_template_id")
        @ExcludeMissing
        fun _messagingTemplateId(): JsonField<String> = messagingTemplateId

        /**
         * Returns the raw JSON value of [whitelistedDestinations].
         *
         * Unlike [whitelistedDestinations], this method doesn't throw if the JSON field has an
         * unexpected type.
         */
        @JsonProperty("whitelisted_destinations")
        @ExcludeMissing
        fun _whitelistedDestinations(): JsonField<List<String>> = whitelistedDestinations

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

            /** Returns a mutable builder for constructing an instance of [Call]. */
            @JvmStatic fun builder() = Builder()
        }

        /** A builder for [Call]. */
        class Builder internal constructor() {

            private var appName: JsonField<String> = JsonMissing.of()
            private var codeLength: JsonField<Long> = JsonMissing.of()
            private var defaultVerificationTimeoutSecs: JsonField<Long> = JsonMissing.of()
            private var messagingTemplateId: JsonField<String> = JsonMissing.of()
            private var whitelistedDestinations: JsonField<MutableList<String>>? = null
            private var additionalProperties: MutableMap<String, JsonValue> = mutableMapOf()

            @JvmSynthetic
            internal fun from(call: Call) = apply {
                appName = call.appName
                codeLength = call.codeLength
                defaultVerificationTimeoutSecs = call.defaultVerificationTimeoutSecs
                messagingTemplateId = call.messagingTemplateId
                whitelistedDestinations = call.whitelistedDestinations.map { it.toMutableList() }
                additionalProperties = call.additionalProperties.toMutableMap()
            }

            /**
             * The name that identifies the application requesting 2fa in the verification message.
             */
            fun appName(appName: String) = appName(JsonField.of(appName))

            /**
             * Sets [Builder.appName] to an arbitrary JSON value.
             *
             * You should usually call [Builder.appName] with a well-typed [String] value instead.
             * This method is primarily for setting the field to an undocumented or not yet
             * supported value.
             */
            fun appName(appName: JsonField<String>) = apply { this.appName = appName }

            /** The length of the verify code to generate. */
            fun codeLength(codeLength: Long) = codeLength(JsonField.of(codeLength))

            /**
             * Sets [Builder.codeLength] to an arbitrary JSON value.
             *
             * You should usually call [Builder.codeLength] with a well-typed [Long] value instead.
             * This method is primarily for setting the field to an undocumented or not yet
             * supported value.
             */
            fun codeLength(codeLength: JsonField<Long>) = apply { this.codeLength = codeLength }

            /**
             * For every request that is initiated via this Verify profile, this sets the number of
             * seconds before a verification request code expires. Once the verification request
             * expires, the user cannot use the code to verify their identity.
             */
            fun defaultVerificationTimeoutSecs(defaultVerificationTimeoutSecs: Long) =
                defaultVerificationTimeoutSecs(JsonField.of(defaultVerificationTimeoutSecs))

            /**
             * Sets [Builder.defaultVerificationTimeoutSecs] to an arbitrary JSON value.
             *
             * You should usually call [Builder.defaultVerificationTimeoutSecs] with a well-typed
             * [Long] value instead. This method is primarily for setting the field to an
             * undocumented or not yet supported value.
             */
            fun defaultVerificationTimeoutSecs(defaultVerificationTimeoutSecs: JsonField<Long>) =
                apply {
                    this.defaultVerificationTimeoutSecs = defaultVerificationTimeoutSecs
                }

            /** The message template identifier selected from /verify_profiles/templates */
            fun messagingTemplateId(messagingTemplateId: String) =
                messagingTemplateId(JsonField.of(messagingTemplateId))

            /**
             * Sets [Builder.messagingTemplateId] to an arbitrary JSON value.
             *
             * You should usually call [Builder.messagingTemplateId] with a well-typed [String]
             * value instead. This method is primarily for setting the field to an undocumented or
             * not yet supported value.
             */
            fun messagingTemplateId(messagingTemplateId: JsonField<String>) = apply {
                this.messagingTemplateId = messagingTemplateId
            }

            /**
             * Enabled country destinations to send verification codes. The elements in the list
             * must be valid ISO 3166-1 alpha-2 country codes. If set to `["*"]`, all destinations
             * will be allowed.
             */
            fun whitelistedDestinations(whitelistedDestinations: List<String>) =
                whitelistedDestinations(JsonField.of(whitelistedDestinations))

            /**
             * Sets [Builder.whitelistedDestinations] to an arbitrary JSON value.
             *
             * You should usually call [Builder.whitelistedDestinations] with a well-typed
             * `List<String>` value instead. This method is primarily for setting the field to an
             * undocumented or not yet supported value.
             */
            fun whitelistedDestinations(whitelistedDestinations: JsonField<List<String>>) = apply {
                this.whitelistedDestinations = whitelistedDestinations.map { it.toMutableList() }
            }

            /**
             * Adds a single [String] to [whitelistedDestinations].
             *
             * @throws IllegalStateException if the field was previously set to a non-list.
             */
            fun addWhitelistedDestination(whitelistedDestination: String) = apply {
                whitelistedDestinations =
                    (whitelistedDestinations ?: JsonField.of(mutableListOf())).also {
                        checkKnown("whitelistedDestinations", it).add(whitelistedDestination)
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
             * Returns an immutable instance of [Call].
             *
             * Further updates to this [Builder] will not mutate the returned instance.
             */
            fun build(): Call =
                Call(
                    appName,
                    codeLength,
                    defaultVerificationTimeoutSecs,
                    messagingTemplateId,
                    (whitelistedDestinations ?: JsonMissing.of()).map { it.toImmutable() },
                    additionalProperties.toMutableMap(),
                )
        }

        private var validated: Boolean = false

        fun validate(): Call = apply {
            if (validated) {
                return@apply
            }

            appName()
            codeLength()
            defaultVerificationTimeoutSecs()
            messagingTemplateId()
            whitelistedDestinations()
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
            (if (appName.asKnown().isPresent) 1 else 0) +
                (if (codeLength.asKnown().isPresent) 1 else 0) +
                (if (defaultVerificationTimeoutSecs.asKnown().isPresent) 1 else 0) +
                (if (messagingTemplateId.asKnown().isPresent) 1 else 0) +
                (whitelistedDestinations.asKnown().getOrNull()?.size ?: 0)

        override fun equals(other: Any?): Boolean {
            if (this === other) {
                return true
            }

            return other is Call &&
                appName == other.appName &&
                codeLength == other.codeLength &&
                defaultVerificationTimeoutSecs == other.defaultVerificationTimeoutSecs &&
                messagingTemplateId == other.messagingTemplateId &&
                whitelistedDestinations == other.whitelistedDestinations &&
                additionalProperties == other.additionalProperties
        }

        private val hashCode: Int by lazy {
            Objects.hash(
                appName,
                codeLength,
                defaultVerificationTimeoutSecs,
                messagingTemplateId,
                whitelistedDestinations,
                additionalProperties,
            )
        }

        override fun hashCode(): Int = hashCode

        override fun toString() =
            "Call{appName=$appName, codeLength=$codeLength, defaultVerificationTimeoutSecs=$defaultVerificationTimeoutSecs, messagingTemplateId=$messagingTemplateId, whitelistedDestinations=$whitelistedDestinations, additionalProperties=$additionalProperties}"
    }

    class Flashcall
    @JsonCreator(mode = JsonCreator.Mode.DISABLED)
    private constructor(
        private val defaultVerificationTimeoutSecs: JsonField<Long>,
        private val additionalProperties: MutableMap<String, JsonValue>,
    ) {

        @JsonCreator
        private constructor(
            @JsonProperty("default_verification_timeout_secs")
            @ExcludeMissing
            defaultVerificationTimeoutSecs: JsonField<Long> = JsonMissing.of()
        ) : this(defaultVerificationTimeoutSecs, mutableMapOf())

        /**
         * For every request that is initiated via this Verify profile, this sets the number of
         * seconds before a verification request code expires. Once the verification request
         * expires, the user cannot use the code to verify their identity.
         *
         * @throws TelnyxInvalidDataException if the JSON field has an unexpected type (e.g. if the
         *   server responded with an unexpected value).
         */
        fun defaultVerificationTimeoutSecs(): Optional<Long> =
            defaultVerificationTimeoutSecs.getOptional("default_verification_timeout_secs")

        /**
         * Returns the raw JSON value of [defaultVerificationTimeoutSecs].
         *
         * Unlike [defaultVerificationTimeoutSecs], this method doesn't throw if the JSON field has
         * an unexpected type.
         */
        @JsonProperty("default_verification_timeout_secs")
        @ExcludeMissing
        fun _defaultVerificationTimeoutSecs(): JsonField<Long> = defaultVerificationTimeoutSecs

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

            /** Returns a mutable builder for constructing an instance of [Flashcall]. */
            @JvmStatic fun builder() = Builder()
        }

        /** A builder for [Flashcall]. */
        class Builder internal constructor() {

            private var defaultVerificationTimeoutSecs: JsonField<Long> = JsonMissing.of()
            private var additionalProperties: MutableMap<String, JsonValue> = mutableMapOf()

            @JvmSynthetic
            internal fun from(flashcall: Flashcall) = apply {
                defaultVerificationTimeoutSecs = flashcall.defaultVerificationTimeoutSecs
                additionalProperties = flashcall.additionalProperties.toMutableMap()
            }

            /**
             * For every request that is initiated via this Verify profile, this sets the number of
             * seconds before a verification request code expires. Once the verification request
             * expires, the user cannot use the code to verify their identity.
             */
            fun defaultVerificationTimeoutSecs(defaultVerificationTimeoutSecs: Long) =
                defaultVerificationTimeoutSecs(JsonField.of(defaultVerificationTimeoutSecs))

            /**
             * Sets [Builder.defaultVerificationTimeoutSecs] to an arbitrary JSON value.
             *
             * You should usually call [Builder.defaultVerificationTimeoutSecs] with a well-typed
             * [Long] value instead. This method is primarily for setting the field to an
             * undocumented or not yet supported value.
             */
            fun defaultVerificationTimeoutSecs(defaultVerificationTimeoutSecs: JsonField<Long>) =
                apply {
                    this.defaultVerificationTimeoutSecs = defaultVerificationTimeoutSecs
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
             * Returns an immutable instance of [Flashcall].
             *
             * Further updates to this [Builder] will not mutate the returned instance.
             */
            fun build(): Flashcall =
                Flashcall(defaultVerificationTimeoutSecs, additionalProperties.toMutableMap())
        }

        private var validated: Boolean = false

        fun validate(): Flashcall = apply {
            if (validated) {
                return@apply
            }

            defaultVerificationTimeoutSecs()
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
            (if (defaultVerificationTimeoutSecs.asKnown().isPresent) 1 else 0)

        override fun equals(other: Any?): Boolean {
            if (this === other) {
                return true
            }

            return other is Flashcall &&
                defaultVerificationTimeoutSecs == other.defaultVerificationTimeoutSecs &&
                additionalProperties == other.additionalProperties
        }

        private val hashCode: Int by lazy {
            Objects.hash(defaultVerificationTimeoutSecs, additionalProperties)
        }

        override fun hashCode(): Int = hashCode

        override fun toString() =
            "Flashcall{defaultVerificationTimeoutSecs=$defaultVerificationTimeoutSecs, additionalProperties=$additionalProperties}"
    }

    /** The possible verification profile record types. */
    class RecordType @JsonCreator private constructor(private val value: JsonField<String>) : Enum {

        /**
         * Returns this class instance's raw value.
         *
         * This is usually only useful if this instance was deserialized from data that doesn't
         * match any known member, and you want to know that value. For example, if the SDK is on an
         * older version than the API, then the API may respond with new members that the SDK is
         * unaware of.
         */
        @com.fasterxml.jackson.annotation.JsonValue fun _value(): JsonField<String> = value

        companion object {

            @JvmField val VERIFICATION_PROFILE = of("verification_profile")

            @JvmStatic fun of(value: String) = RecordType(JsonField.of(value))
        }

        /** An enum containing [RecordType]'s known values. */
        enum class Known {
            VERIFICATION_PROFILE
        }

        /**
         * An enum containing [RecordType]'s known values, as well as an [_UNKNOWN] member.
         *
         * An instance of [RecordType] can contain an unknown value in a couple of cases:
         * - It was deserialized from data that doesn't match any known member. For example, if the
         *   SDK is on an older version than the API, then the API may respond with new members that
         *   the SDK is unaware of.
         * - It was constructed with an arbitrary value using the [of] method.
         */
        enum class Value {
            VERIFICATION_PROFILE,
            /**
             * An enum member indicating that [RecordType] was instantiated with an unknown value.
             */
            _UNKNOWN,
        }

        /**
         * Returns an enum member corresponding to this class instance's value, or [Value._UNKNOWN]
         * if the class was instantiated with an unknown value.
         *
         * Use the [known] method instead if you're certain the value is always known or if you want
         * to throw for the unknown case.
         */
        fun value(): Value =
            when (this) {
                VERIFICATION_PROFILE -> Value.VERIFICATION_PROFILE
                else -> Value._UNKNOWN
            }

        /**
         * Returns an enum member corresponding to this class instance's value.
         *
         * Use the [value] method instead if you're uncertain the value is always known and don't
         * want to throw for the unknown case.
         *
         * @throws TelnyxInvalidDataException if this class instance's value is a not a known
         *   member.
         */
        fun known(): Known =
            when (this) {
                VERIFICATION_PROFILE -> Known.VERIFICATION_PROFILE
                else -> throw TelnyxInvalidDataException("Unknown RecordType: $value")
            }

        /**
         * Returns this class instance's primitive wire representation.
         *
         * This differs from the [toString] method because that method is primarily for debugging
         * and generally doesn't throw.
         *
         * @throws TelnyxInvalidDataException if this class instance's value does not have the
         *   expected primitive type.
         */
        fun asString(): String =
            _value().asString().orElseThrow { TelnyxInvalidDataException("Value is not a String") }

        private var validated: Boolean = false

        fun validate(): RecordType = apply {
            if (validated) {
                return@apply
            }

            known()
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
        @JvmSynthetic internal fun validity(): Int = if (value() == Value._UNKNOWN) 0 else 1

        override fun equals(other: Any?): Boolean {
            if (this === other) {
                return true
            }

            return other is RecordType && value == other.value
        }

        override fun hashCode() = value.hashCode()

        override fun toString() = value.toString()
    }

    class Sms
    @JsonCreator(mode = JsonCreator.Mode.DISABLED)
    private constructor(
        private val alphaSender: JsonField<String>,
        private val appName: JsonField<String>,
        private val codeLength: JsonField<Long>,
        private val defaultVerificationTimeoutSecs: JsonField<Long>,
        private val messagingTemplateId: JsonField<String>,
        private val whitelistedDestinations: JsonField<List<String>>,
        private val additionalProperties: MutableMap<String, JsonValue>,
    ) {

        @JsonCreator
        private constructor(
            @JsonProperty("alpha_sender")
            @ExcludeMissing
            alphaSender: JsonField<String> = JsonMissing.of(),
            @JsonProperty("app_name") @ExcludeMissing appName: JsonField<String> = JsonMissing.of(),
            @JsonProperty("code_length")
            @ExcludeMissing
            codeLength: JsonField<Long> = JsonMissing.of(),
            @JsonProperty("default_verification_timeout_secs")
            @ExcludeMissing
            defaultVerificationTimeoutSecs: JsonField<Long> = JsonMissing.of(),
            @JsonProperty("messaging_template_id")
            @ExcludeMissing
            messagingTemplateId: JsonField<String> = JsonMissing.of(),
            @JsonProperty("whitelisted_destinations")
            @ExcludeMissing
            whitelistedDestinations: JsonField<List<String>> = JsonMissing.of(),
        ) : this(
            alphaSender,
            appName,
            codeLength,
            defaultVerificationTimeoutSecs,
            messagingTemplateId,
            whitelistedDestinations,
            mutableMapOf(),
        )

        /**
         * The alphanumeric sender ID to use when sending to destinations that require an
         * alphanumeric sender ID.
         *
         * @throws TelnyxInvalidDataException if the JSON field has an unexpected type (e.g. if the
         *   server responded with an unexpected value).
         */
        fun alphaSender(): Optional<String> = alphaSender.getOptional("alpha_sender")

        /**
         * The name that identifies the application requesting 2fa in the verification message.
         *
         * @throws TelnyxInvalidDataException if the JSON field has an unexpected type (e.g. if the
         *   server responded with an unexpected value).
         */
        fun appName(): Optional<String> = appName.getOptional("app_name")

        /**
         * The length of the verify code to generate.
         *
         * @throws TelnyxInvalidDataException if the JSON field has an unexpected type (e.g. if the
         *   server responded with an unexpected value).
         */
        fun codeLength(): Optional<Long> = codeLength.getOptional("code_length")

        /**
         * For every request that is initiated via this Verify profile, this sets the number of
         * seconds before a verification request code expires. Once the verification request
         * expires, the user cannot use the code to verify their identity.
         *
         * @throws TelnyxInvalidDataException if the JSON field has an unexpected type (e.g. if the
         *   server responded with an unexpected value).
         */
        fun defaultVerificationTimeoutSecs(): Optional<Long> =
            defaultVerificationTimeoutSecs.getOptional("default_verification_timeout_secs")

        /**
         * The message template identifier selected from /verify_profiles/templates
         *
         * @throws TelnyxInvalidDataException if the JSON field has an unexpected type (e.g. if the
         *   server responded with an unexpected value).
         */
        fun messagingTemplateId(): Optional<String> =
            messagingTemplateId.getOptional("messaging_template_id")

        /**
         * Enabled country destinations to send verification codes. The elements in the list must be
         * valid ISO 3166-1 alpha-2 country codes. If set to `["*"]`, all destinations will be
         * allowed.
         *
         * @throws TelnyxInvalidDataException if the JSON field has an unexpected type (e.g. if the
         *   server responded with an unexpected value).
         */
        fun whitelistedDestinations(): Optional<List<String>> =
            whitelistedDestinations.getOptional("whitelisted_destinations")

        /**
         * Returns the raw JSON value of [alphaSender].
         *
         * Unlike [alphaSender], this method doesn't throw if the JSON field has an unexpected type.
         */
        @JsonProperty("alpha_sender")
        @ExcludeMissing
        fun _alphaSender(): JsonField<String> = alphaSender

        /**
         * Returns the raw JSON value of [appName].
         *
         * Unlike [appName], this method doesn't throw if the JSON field has an unexpected type.
         */
        @JsonProperty("app_name") @ExcludeMissing fun _appName(): JsonField<String> = appName

        /**
         * Returns the raw JSON value of [codeLength].
         *
         * Unlike [codeLength], this method doesn't throw if the JSON field has an unexpected type.
         */
        @JsonProperty("code_length") @ExcludeMissing fun _codeLength(): JsonField<Long> = codeLength

        /**
         * Returns the raw JSON value of [defaultVerificationTimeoutSecs].
         *
         * Unlike [defaultVerificationTimeoutSecs], this method doesn't throw if the JSON field has
         * an unexpected type.
         */
        @JsonProperty("default_verification_timeout_secs")
        @ExcludeMissing
        fun _defaultVerificationTimeoutSecs(): JsonField<Long> = defaultVerificationTimeoutSecs

        /**
         * Returns the raw JSON value of [messagingTemplateId].
         *
         * Unlike [messagingTemplateId], this method doesn't throw if the JSON field has an
         * unexpected type.
         */
        @JsonProperty("messaging_template_id")
        @ExcludeMissing
        fun _messagingTemplateId(): JsonField<String> = messagingTemplateId

        /**
         * Returns the raw JSON value of [whitelistedDestinations].
         *
         * Unlike [whitelistedDestinations], this method doesn't throw if the JSON field has an
         * unexpected type.
         */
        @JsonProperty("whitelisted_destinations")
        @ExcludeMissing
        fun _whitelistedDestinations(): JsonField<List<String>> = whitelistedDestinations

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

            /** Returns a mutable builder for constructing an instance of [Sms]. */
            @JvmStatic fun builder() = Builder()
        }

        /** A builder for [Sms]. */
        class Builder internal constructor() {

            private var alphaSender: JsonField<String> = JsonMissing.of()
            private var appName: JsonField<String> = JsonMissing.of()
            private var codeLength: JsonField<Long> = JsonMissing.of()
            private var defaultVerificationTimeoutSecs: JsonField<Long> = JsonMissing.of()
            private var messagingTemplateId: JsonField<String> = JsonMissing.of()
            private var whitelistedDestinations: JsonField<MutableList<String>>? = null
            private var additionalProperties: MutableMap<String, JsonValue> = mutableMapOf()

            @JvmSynthetic
            internal fun from(sms: Sms) = apply {
                alphaSender = sms.alphaSender
                appName = sms.appName
                codeLength = sms.codeLength
                defaultVerificationTimeoutSecs = sms.defaultVerificationTimeoutSecs
                messagingTemplateId = sms.messagingTemplateId
                whitelistedDestinations = sms.whitelistedDestinations.map { it.toMutableList() }
                additionalProperties = sms.additionalProperties.toMutableMap()
            }

            /**
             * The alphanumeric sender ID to use when sending to destinations that require an
             * alphanumeric sender ID.
             */
            fun alphaSender(alphaSender: String?) = alphaSender(JsonField.ofNullable(alphaSender))

            /** Alias for calling [Builder.alphaSender] with `alphaSender.orElse(null)`. */
            fun alphaSender(alphaSender: Optional<String>) = alphaSender(alphaSender.getOrNull())

            /**
             * Sets [Builder.alphaSender] to an arbitrary JSON value.
             *
             * You should usually call [Builder.alphaSender] with a well-typed [String] value
             * instead. This method is primarily for setting the field to an undocumented or not yet
             * supported value.
             */
            fun alphaSender(alphaSender: JsonField<String>) = apply {
                this.alphaSender = alphaSender
            }

            /**
             * The name that identifies the application requesting 2fa in the verification message.
             */
            fun appName(appName: String) = appName(JsonField.of(appName))

            /**
             * Sets [Builder.appName] to an arbitrary JSON value.
             *
             * You should usually call [Builder.appName] with a well-typed [String] value instead.
             * This method is primarily for setting the field to an undocumented or not yet
             * supported value.
             */
            fun appName(appName: JsonField<String>) = apply { this.appName = appName }

            /** The length of the verify code to generate. */
            fun codeLength(codeLength: Long) = codeLength(JsonField.of(codeLength))

            /**
             * Sets [Builder.codeLength] to an arbitrary JSON value.
             *
             * You should usually call [Builder.codeLength] with a well-typed [Long] value instead.
             * This method is primarily for setting the field to an undocumented or not yet
             * supported value.
             */
            fun codeLength(codeLength: JsonField<Long>) = apply { this.codeLength = codeLength }

            /**
             * For every request that is initiated via this Verify profile, this sets the number of
             * seconds before a verification request code expires. Once the verification request
             * expires, the user cannot use the code to verify their identity.
             */
            fun defaultVerificationTimeoutSecs(defaultVerificationTimeoutSecs: Long) =
                defaultVerificationTimeoutSecs(JsonField.of(defaultVerificationTimeoutSecs))

            /**
             * Sets [Builder.defaultVerificationTimeoutSecs] to an arbitrary JSON value.
             *
             * You should usually call [Builder.defaultVerificationTimeoutSecs] with a well-typed
             * [Long] value instead. This method is primarily for setting the field to an
             * undocumented or not yet supported value.
             */
            fun defaultVerificationTimeoutSecs(defaultVerificationTimeoutSecs: JsonField<Long>) =
                apply {
                    this.defaultVerificationTimeoutSecs = defaultVerificationTimeoutSecs
                }

            /** The message template identifier selected from /verify_profiles/templates */
            fun messagingTemplateId(messagingTemplateId: String) =
                messagingTemplateId(JsonField.of(messagingTemplateId))

            /**
             * Sets [Builder.messagingTemplateId] to an arbitrary JSON value.
             *
             * You should usually call [Builder.messagingTemplateId] with a well-typed [String]
             * value instead. This method is primarily for setting the field to an undocumented or
             * not yet supported value.
             */
            fun messagingTemplateId(messagingTemplateId: JsonField<String>) = apply {
                this.messagingTemplateId = messagingTemplateId
            }

            /**
             * Enabled country destinations to send verification codes. The elements in the list
             * must be valid ISO 3166-1 alpha-2 country codes. If set to `["*"]`, all destinations
             * will be allowed.
             */
            fun whitelistedDestinations(whitelistedDestinations: List<String>) =
                whitelistedDestinations(JsonField.of(whitelistedDestinations))

            /**
             * Sets [Builder.whitelistedDestinations] to an arbitrary JSON value.
             *
             * You should usually call [Builder.whitelistedDestinations] with a well-typed
             * `List<String>` value instead. This method is primarily for setting the field to an
             * undocumented or not yet supported value.
             */
            fun whitelistedDestinations(whitelistedDestinations: JsonField<List<String>>) = apply {
                this.whitelistedDestinations = whitelistedDestinations.map { it.toMutableList() }
            }

            /**
             * Adds a single [String] to [whitelistedDestinations].
             *
             * @throws IllegalStateException if the field was previously set to a non-list.
             */
            fun addWhitelistedDestination(whitelistedDestination: String) = apply {
                whitelistedDestinations =
                    (whitelistedDestinations ?: JsonField.of(mutableListOf())).also {
                        checkKnown("whitelistedDestinations", it).add(whitelistedDestination)
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
             * Returns an immutable instance of [Sms].
             *
             * Further updates to this [Builder] will not mutate the returned instance.
             */
            fun build(): Sms =
                Sms(
                    alphaSender,
                    appName,
                    codeLength,
                    defaultVerificationTimeoutSecs,
                    messagingTemplateId,
                    (whitelistedDestinations ?: JsonMissing.of()).map { it.toImmutable() },
                    additionalProperties.toMutableMap(),
                )
        }

        private var validated: Boolean = false

        fun validate(): Sms = apply {
            if (validated) {
                return@apply
            }

            alphaSender()
            appName()
            codeLength()
            defaultVerificationTimeoutSecs()
            messagingTemplateId()
            whitelistedDestinations()
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
            (if (alphaSender.asKnown().isPresent) 1 else 0) +
                (if (appName.asKnown().isPresent) 1 else 0) +
                (if (codeLength.asKnown().isPresent) 1 else 0) +
                (if (defaultVerificationTimeoutSecs.asKnown().isPresent) 1 else 0) +
                (if (messagingTemplateId.asKnown().isPresent) 1 else 0) +
                (whitelistedDestinations.asKnown().getOrNull()?.size ?: 0)

        override fun equals(other: Any?): Boolean {
            if (this === other) {
                return true
            }

            return other is Sms &&
                alphaSender == other.alphaSender &&
                appName == other.appName &&
                codeLength == other.codeLength &&
                defaultVerificationTimeoutSecs == other.defaultVerificationTimeoutSecs &&
                messagingTemplateId == other.messagingTemplateId &&
                whitelistedDestinations == other.whitelistedDestinations &&
                additionalProperties == other.additionalProperties
        }

        private val hashCode: Int by lazy {
            Objects.hash(
                alphaSender,
                appName,
                codeLength,
                defaultVerificationTimeoutSecs,
                messagingTemplateId,
                whitelistedDestinations,
                additionalProperties,
            )
        }

        override fun hashCode(): Int = hashCode

        override fun toString() =
            "Sms{alphaSender=$alphaSender, appName=$appName, codeLength=$codeLength, defaultVerificationTimeoutSecs=$defaultVerificationTimeoutSecs, messagingTemplateId=$messagingTemplateId, whitelistedDestinations=$whitelistedDestinations, additionalProperties=$additionalProperties}"
    }

    override fun equals(other: Any?): Boolean {
        if (this === other) {
            return true
        }

        return other is VerifyProfile &&
            id == other.id &&
            call == other.call &&
            createdAt == other.createdAt &&
            flashcall == other.flashcall &&
            language == other.language &&
            name == other.name &&
            recordType == other.recordType &&
            sms == other.sms &&
            updatedAt == other.updatedAt &&
            webhookFailoverUrl == other.webhookFailoverUrl &&
            webhookUrl == other.webhookUrl &&
            additionalProperties == other.additionalProperties
    }

    private val hashCode: Int by lazy {
        Objects.hash(
            id,
            call,
            createdAt,
            flashcall,
            language,
            name,
            recordType,
            sms,
            updatedAt,
            webhookFailoverUrl,
            webhookUrl,
            additionalProperties,
        )
    }

    override fun hashCode(): Int = hashCode

    override fun toString() =
        "VerifyProfile{id=$id, call=$call, createdAt=$createdAt, flashcall=$flashcall, language=$language, name=$name, recordType=$recordType, sms=$sms, updatedAt=$updatedAt, webhookFailoverUrl=$webhookFailoverUrl, webhookUrl=$webhookUrl, additionalProperties=$additionalProperties}"
}
