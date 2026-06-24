// File generated from our OpenAPI spec by Stainless.

package com.telnyx.sdk.models.ai.assistants

import com.fasterxml.jackson.annotation.JsonAnyGetter
import com.fasterxml.jackson.annotation.JsonAnySetter
import com.fasterxml.jackson.annotation.JsonCreator
import com.fasterxml.jackson.annotation.JsonProperty
import com.telnyx.sdk.core.ExcludeMissing
import com.telnyx.sdk.core.JsonField
import com.telnyx.sdk.core.JsonMissing
import com.telnyx.sdk.core.JsonValue
import com.telnyx.sdk.errors.TelnyxInvalidDataException
import java.util.Collections
import java.util.Objects
import java.util.Optional
import kotlin.jvm.optionals.getOrNull

class Observability
@JsonCreator(mode = JsonCreator.Mode.DISABLED)
private constructor(
    private val host: JsonField<String>,
    private val promptLabel: JsonField<String>,
    private val promptName: JsonField<String>,
    private val promptSync: JsonField<PromptSyncStatus>,
    private val promptVersion: JsonField<Long>,
    private val publicKeyRef: JsonField<String>,
    private val secretKeyRef: JsonField<String>,
    private val status: JsonField<ObservabilityStatus>,
    private val additionalProperties: MutableMap<String, JsonValue>,
) {

    @JsonCreator
    private constructor(
        @JsonProperty("host") @ExcludeMissing host: JsonField<String> = JsonMissing.of(),
        @JsonProperty("prompt_label")
        @ExcludeMissing
        promptLabel: JsonField<String> = JsonMissing.of(),
        @JsonProperty("prompt_name")
        @ExcludeMissing
        promptName: JsonField<String> = JsonMissing.of(),
        @JsonProperty("prompt_sync")
        @ExcludeMissing
        promptSync: JsonField<PromptSyncStatus> = JsonMissing.of(),
        @JsonProperty("prompt_version")
        @ExcludeMissing
        promptVersion: JsonField<Long> = JsonMissing.of(),
        @JsonProperty("public_key_ref")
        @ExcludeMissing
        publicKeyRef: JsonField<String> = JsonMissing.of(),
        @JsonProperty("secret_key_ref")
        @ExcludeMissing
        secretKeyRef: JsonField<String> = JsonMissing.of(),
        @JsonProperty("status")
        @ExcludeMissing
        status: JsonField<ObservabilityStatus> = JsonMissing.of(),
    ) : this(
        host,
        promptLabel,
        promptName,
        promptSync,
        promptVersion,
        publicKeyRef,
        secretKeyRef,
        status,
        mutableMapOf(),
    )

    /**
     * @throws TelnyxInvalidDataException if the JSON field has an unexpected type (e.g. if the
     *   server responded with an unexpected value).
     */
    fun host(): Optional<String> = host.getOptional("host")

    /**
     * @throws TelnyxInvalidDataException if the JSON field has an unexpected type (e.g. if the
     *   server responded with an unexpected value).
     */
    fun promptLabel(): Optional<String> = promptLabel.getOptional("prompt_label")

    /**
     * @throws TelnyxInvalidDataException if the JSON field has an unexpected type (e.g. if the
     *   server responded with an unexpected value).
     */
    fun promptName(): Optional<String> = promptName.getOptional("prompt_name")

    /**
     * Whether to auto-publish the assistant's instructions as a Langfuse prompt.
     *
     * When ENABLED + prompt_name set, every assistant create/update pushes `instructions` to
     * Langfuse via create_prompt and stores the returned version in prompt_version.
     *
     * @throws TelnyxInvalidDataException if the JSON field has an unexpected type (e.g. if the
     *   server responded with an unexpected value).
     */
    fun promptSync(): Optional<PromptSyncStatus> = promptSync.getOptional("prompt_sync")

    /**
     * @throws TelnyxInvalidDataException if the JSON field has an unexpected type (e.g. if the
     *   server responded with an unexpected value).
     */
    fun promptVersion(): Optional<Long> = promptVersion.getOptional("prompt_version")

    /**
     * @throws TelnyxInvalidDataException if the JSON field has an unexpected type (e.g. if the
     *   server responded with an unexpected value).
     */
    fun publicKeyRef(): Optional<String> = publicKeyRef.getOptional("public_key_ref")

    /**
     * @throws TelnyxInvalidDataException if the JSON field has an unexpected type (e.g. if the
     *   server responded with an unexpected value).
     */
    fun secretKeyRef(): Optional<String> = secretKeyRef.getOptional("secret_key_ref")

    /**
     * @throws TelnyxInvalidDataException if the JSON field has an unexpected type (e.g. if the
     *   server responded with an unexpected value).
     */
    fun status(): Optional<ObservabilityStatus> = status.getOptional("status")

    /**
     * Returns the raw JSON value of [host].
     *
     * Unlike [host], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("host") @ExcludeMissing fun _host(): JsonField<String> = host

    /**
     * Returns the raw JSON value of [promptLabel].
     *
     * Unlike [promptLabel], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("prompt_label")
    @ExcludeMissing
    fun _promptLabel(): JsonField<String> = promptLabel

    /**
     * Returns the raw JSON value of [promptName].
     *
     * Unlike [promptName], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("prompt_name") @ExcludeMissing fun _promptName(): JsonField<String> = promptName

    /**
     * Returns the raw JSON value of [promptSync].
     *
     * Unlike [promptSync], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("prompt_sync")
    @ExcludeMissing
    fun _promptSync(): JsonField<PromptSyncStatus> = promptSync

    /**
     * Returns the raw JSON value of [promptVersion].
     *
     * Unlike [promptVersion], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("prompt_version")
    @ExcludeMissing
    fun _promptVersion(): JsonField<Long> = promptVersion

    /**
     * Returns the raw JSON value of [publicKeyRef].
     *
     * Unlike [publicKeyRef], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("public_key_ref")
    @ExcludeMissing
    fun _publicKeyRef(): JsonField<String> = publicKeyRef

    /**
     * Returns the raw JSON value of [secretKeyRef].
     *
     * Unlike [secretKeyRef], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("secret_key_ref")
    @ExcludeMissing
    fun _secretKeyRef(): JsonField<String> = secretKeyRef

    /**
     * Returns the raw JSON value of [status].
     *
     * Unlike [status], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("status") @ExcludeMissing fun _status(): JsonField<ObservabilityStatus> = status

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

        /** Returns a mutable builder for constructing an instance of [Observability]. */
        @JvmStatic fun builder() = Builder()
    }

    /** A builder for [Observability]. */
    class Builder internal constructor() {

        private var host: JsonField<String> = JsonMissing.of()
        private var promptLabel: JsonField<String> = JsonMissing.of()
        private var promptName: JsonField<String> = JsonMissing.of()
        private var promptSync: JsonField<PromptSyncStatus> = JsonMissing.of()
        private var promptVersion: JsonField<Long> = JsonMissing.of()
        private var publicKeyRef: JsonField<String> = JsonMissing.of()
        private var secretKeyRef: JsonField<String> = JsonMissing.of()
        private var status: JsonField<ObservabilityStatus> = JsonMissing.of()
        private var additionalProperties: MutableMap<String, JsonValue> = mutableMapOf()

        @JvmSynthetic
        internal fun from(observability: Observability) = apply {
            host = observability.host
            promptLabel = observability.promptLabel
            promptName = observability.promptName
            promptSync = observability.promptSync
            promptVersion = observability.promptVersion
            publicKeyRef = observability.publicKeyRef
            secretKeyRef = observability.secretKeyRef
            status = observability.status
            additionalProperties = observability.additionalProperties.toMutableMap()
        }

        fun host(host: String) = host(JsonField.of(host))

        /**
         * Sets [Builder.host] to an arbitrary JSON value.
         *
         * You should usually call [Builder.host] with a well-typed [String] value instead. This
         * method is primarily for setting the field to an undocumented or not yet supported value.
         */
        fun host(host: JsonField<String>) = apply { this.host = host }

        fun promptLabel(promptLabel: String) = promptLabel(JsonField.of(promptLabel))

        /**
         * Sets [Builder.promptLabel] to an arbitrary JSON value.
         *
         * You should usually call [Builder.promptLabel] with a well-typed [String] value instead.
         * This method is primarily for setting the field to an undocumented or not yet supported
         * value.
         */
        fun promptLabel(promptLabel: JsonField<String>) = apply { this.promptLabel = promptLabel }

        fun promptName(promptName: String) = promptName(JsonField.of(promptName))

        /**
         * Sets [Builder.promptName] to an arbitrary JSON value.
         *
         * You should usually call [Builder.promptName] with a well-typed [String] value instead.
         * This method is primarily for setting the field to an undocumented or not yet supported
         * value.
         */
        fun promptName(promptName: JsonField<String>) = apply { this.promptName = promptName }

        /**
         * Whether to auto-publish the assistant's instructions as a Langfuse prompt.
         *
         * When ENABLED + prompt_name set, every assistant create/update pushes `instructions` to
         * Langfuse via create_prompt and stores the returned version in prompt_version.
         */
        fun promptSync(promptSync: PromptSyncStatus) = promptSync(JsonField.of(promptSync))

        /**
         * Sets [Builder.promptSync] to an arbitrary JSON value.
         *
         * You should usually call [Builder.promptSync] with a well-typed [PromptSyncStatus] value
         * instead. This method is primarily for setting the field to an undocumented or not yet
         * supported value.
         */
        fun promptSync(promptSync: JsonField<PromptSyncStatus>) = apply {
            this.promptSync = promptSync
        }

        fun promptVersion(promptVersion: Long) = promptVersion(JsonField.of(promptVersion))

        /**
         * Sets [Builder.promptVersion] to an arbitrary JSON value.
         *
         * You should usually call [Builder.promptVersion] with a well-typed [Long] value instead.
         * This method is primarily for setting the field to an undocumented or not yet supported
         * value.
         */
        fun promptVersion(promptVersion: JsonField<Long>) = apply {
            this.promptVersion = promptVersion
        }

        fun publicKeyRef(publicKeyRef: String) = publicKeyRef(JsonField.of(publicKeyRef))

        /**
         * Sets [Builder.publicKeyRef] to an arbitrary JSON value.
         *
         * You should usually call [Builder.publicKeyRef] with a well-typed [String] value instead.
         * This method is primarily for setting the field to an undocumented or not yet supported
         * value.
         */
        fun publicKeyRef(publicKeyRef: JsonField<String>) = apply {
            this.publicKeyRef = publicKeyRef
        }

        fun secretKeyRef(secretKeyRef: String) = secretKeyRef(JsonField.of(secretKeyRef))

        /**
         * Sets [Builder.secretKeyRef] to an arbitrary JSON value.
         *
         * You should usually call [Builder.secretKeyRef] with a well-typed [String] value instead.
         * This method is primarily for setting the field to an undocumented or not yet supported
         * value.
         */
        fun secretKeyRef(secretKeyRef: JsonField<String>) = apply {
            this.secretKeyRef = secretKeyRef
        }

        fun status(status: ObservabilityStatus) = status(JsonField.of(status))

        /**
         * Sets [Builder.status] to an arbitrary JSON value.
         *
         * You should usually call [Builder.status] with a well-typed [ObservabilityStatus] value
         * instead. This method is primarily for setting the field to an undocumented or not yet
         * supported value.
         */
        fun status(status: JsonField<ObservabilityStatus>) = apply { this.status = status }

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
         * Returns an immutable instance of [Observability].
         *
         * Further updates to this [Builder] will not mutate the returned instance.
         */
        fun build(): Observability =
            Observability(
                host,
                promptLabel,
                promptName,
                promptSync,
                promptVersion,
                publicKeyRef,
                secretKeyRef,
                status,
                additionalProperties.toMutableMap(),
            )
    }

    private var validated: Boolean = false

    /**
     * Validates that the types of all values in this object match their expected types recursively.
     *
     * This method is _not_ forwards compatible with new types from the API for existing fields.
     *
     * @throws TelnyxInvalidDataException if any value type in this object doesn't match its
     *   expected type.
     */
    fun validate(): Observability = apply {
        if (validated) {
            return@apply
        }

        host()
        promptLabel()
        promptName()
        promptSync().ifPresent { it.validate() }
        promptVersion()
        publicKeyRef()
        secretKeyRef()
        status().ifPresent { it.validate() }
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
        (if (host.asKnown().isPresent) 1 else 0) +
            (if (promptLabel.asKnown().isPresent) 1 else 0) +
            (if (promptName.asKnown().isPresent) 1 else 0) +
            (promptSync.asKnown().getOrNull()?.validity() ?: 0) +
            (if (promptVersion.asKnown().isPresent) 1 else 0) +
            (if (publicKeyRef.asKnown().isPresent) 1 else 0) +
            (if (secretKeyRef.asKnown().isPresent) 1 else 0) +
            (status.asKnown().getOrNull()?.validity() ?: 0)

    override fun equals(other: Any?): Boolean {
        if (this === other) {
            return true
        }

        return other is Observability &&
            host == other.host &&
            promptLabel == other.promptLabel &&
            promptName == other.promptName &&
            promptSync == other.promptSync &&
            promptVersion == other.promptVersion &&
            publicKeyRef == other.publicKeyRef &&
            secretKeyRef == other.secretKeyRef &&
            status == other.status &&
            additionalProperties == other.additionalProperties
    }

    private val hashCode: Int by lazy {
        Objects.hash(
            host,
            promptLabel,
            promptName,
            promptSync,
            promptVersion,
            publicKeyRef,
            secretKeyRef,
            status,
            additionalProperties,
        )
    }

    override fun hashCode(): Int = hashCode

    override fun toString() =
        "Observability{host=$host, promptLabel=$promptLabel, promptName=$promptName, promptSync=$promptSync, promptVersion=$promptVersion, publicKeyRef=$publicKeyRef, secretKeyRef=$secretKeyRef, status=$status, additionalProperties=$additionalProperties}"
}
