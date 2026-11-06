// File generated from our OpenAPI spec by Stainless.

package com.telnyx.sdk.models.agentgateways.guardrails

import com.fasterxml.jackson.annotation.JsonAnyGetter
import com.fasterxml.jackson.annotation.JsonAnySetter
import com.fasterxml.jackson.annotation.JsonCreator
import com.fasterxml.jackson.annotation.JsonProperty
import com.telnyx.sdk.core.Enum
import com.telnyx.sdk.core.ExcludeMissing
import com.telnyx.sdk.core.JsonField
import com.telnyx.sdk.core.JsonMissing
import com.telnyx.sdk.core.JsonValue
import com.telnyx.sdk.core.Params
import com.telnyx.sdk.core.checkKnown
import com.telnyx.sdk.core.checkRequired
import com.telnyx.sdk.core.http.QueryParams
import com.telnyx.sdk.core.toImmutable
import com.telnyx.sdk.errors.TelnyxInvalidDataException
import java.util.Collections
import java.util.Objects
import java.util.Optional
import kotlin.jvm.optionals.getOrNull

/**
 * Adds a check the instance runs on model and tool requests. It runs on every request when
 * `always_on`, and otherwise on the requests that name it in `guardrails`. The instance must be
 * `ready`; otherwise the request answers `409`.
 */
class GuardrailCreateParams
private constructor(
    private val instanceId: String?,
    private val body: Body,
    private val additionalHeaders: com.telnyx.sdk.core.http.Headers,
    private val additionalQueryParams: QueryParams,
) : Params {

    fun instanceId(): Optional<String> = Optional.ofNullable(instanceId)

    /**
     * When the guardrail runs. Each type runs in some modes only.
     *
     * @throws TelnyxInvalidDataException if the JSON field has an unexpected type or is
     *   unexpectedly missing or null (e.g. if the server responded with an unexpected value).
     */
    fun modes(): List<Mode> = body.modes()

    /**
     * A name, unique on the instance. A request names it in its `guardrails` field.
     *
     * @throws TelnyxInvalidDataException if the JSON field has an unexpected type or is
     *   unexpectedly missing or null (e.g. if the server responded with an unexpected value).
     */
    fun name(): String = body.name()

    /**
     * The kind of check. It cannot change after create.
     *
     * @throws TelnyxInvalidDataException if the JSON field has an unexpected type or is
     *   unexpectedly missing or null (e.g. if the server responded with an unexpected value).
     */
    fun type(): Type = body.type()

    /**
     * `true` runs the guardrail on every request, and a request cannot turn it off. `false` runs it
     * on the requests that name it.
     *
     * @throws TelnyxInvalidDataException if the JSON field has an unexpected type (e.g. if the
     *   server responded with an unexpected value).
     */
    fun alwaysOn(): Optional<Boolean> = body.alwaysOn()

    /**
     * The type's settings. `content_filter`: `patterns` (prebuilt patterns by `name`, such as
     * `us_ssn` or `email`), `regexes` (each a `name`, which tags masked matches, and a `pattern`),
     * `keywords` (each a `keyword`), and `categories` (each a `name`), each entry with an `action`
     * of `block` or `mask`. `tool_permission`: `rules` (`id`, `tool_name`, `tool_type`, `decision`,
     * `argument_patterns`), a `default` decision, and `on_denied` (`block` or `rewrite`).
     * `model_judge`: a `model` on the instance and weighted `criteria` (`name`, `description`,
     * `weight`, the weights summing to 100). `custom_code`: `code` defining
     * `apply_guardrail(inputs, request_data, input_type)`. `lakera`: `api_key`, `project_id`,
     * `api_base`. `presidio`: `analyzer_url`, `anonymizer_url`, `entities` (entity name to `block`
     * or `mask`), `language`. `bedrock`: `guardrail_id`, `version`, `region`, and `access_key_id`
     * with `secret_access_key`, or `role_name`. `azure_content_safety`: `api_key`, `endpoint`,
     * `severity` (0 to 7). Provider secrets are write-only.
     *
     * @throws TelnyxInvalidDataException if the JSON field has an unexpected type (e.g. if the
     *   server responded with an unexpected value).
     */
    fun settings(): Optional<Settings> = body.settings()

    /**
     * Returns the raw JSON value of [modes].
     *
     * Unlike [modes], this method doesn't throw if the JSON field has an unexpected type.
     */
    fun _modes(): JsonField<List<Mode>> = body._modes()

    /**
     * Returns the raw JSON value of [name].
     *
     * Unlike [name], this method doesn't throw if the JSON field has an unexpected type.
     */
    fun _name(): JsonField<String> = body._name()

    /**
     * Returns the raw JSON value of [type].
     *
     * Unlike [type], this method doesn't throw if the JSON field has an unexpected type.
     */
    fun _type(): JsonField<Type> = body._type()

    /**
     * Returns the raw JSON value of [alwaysOn].
     *
     * Unlike [alwaysOn], this method doesn't throw if the JSON field has an unexpected type.
     */
    fun _alwaysOn(): JsonField<Boolean> = body._alwaysOn()

    /**
     * Returns the raw JSON value of [settings].
     *
     * Unlike [settings], this method doesn't throw if the JSON field has an unexpected type.
     */
    fun _settings(): JsonField<Settings> = body._settings()

    fun _additionalBodyProperties(): Map<String, JsonValue> = body._additionalProperties()

    /** Additional headers to send with the request. */
    fun _additionalHeaders(): com.telnyx.sdk.core.http.Headers = additionalHeaders

    /** Additional query param to send with the request. */
    fun _additionalQueryParams(): QueryParams = additionalQueryParams

    fun toBuilder() = Builder().from(this)

    companion object {

        /**
         * Returns a mutable builder for constructing an instance of [GuardrailCreateParams].
         *
         * The following fields are required:
         * ```java
         * .modes()
         * .name()
         * .type()
         * ```
         */
        @JvmStatic fun builder() = Builder()
    }

    /** A builder for [GuardrailCreateParams]. */
    class Builder internal constructor() {

        private var instanceId: String? = null
        private var body: Body.Builder = Body.builder()
        private var additionalHeaders: com.telnyx.sdk.core.http.Headers.Builder =
            com.telnyx.sdk.core.http.Headers.builder()
        private var additionalQueryParams: QueryParams.Builder = QueryParams.builder()

        @JvmSynthetic
        internal fun from(guardrailCreateParams: GuardrailCreateParams) = apply {
            instanceId = guardrailCreateParams.instanceId
            body = guardrailCreateParams.body.toBuilder()
            additionalHeaders = guardrailCreateParams.additionalHeaders.toBuilder()
            additionalQueryParams = guardrailCreateParams.additionalQueryParams.toBuilder()
        }

        fun instanceId(instanceId: String?) = apply { this.instanceId = instanceId }

        /** Alias for calling [Builder.instanceId] with `instanceId.orElse(null)`. */
        fun instanceId(instanceId: Optional<String>) = instanceId(instanceId.getOrNull())

        /**
         * Sets the entire request body.
         *
         * This is generally only useful if you are already constructing the body separately.
         * Otherwise, it's more convenient to use the top-level setters instead:
         * - [modes]
         * - [name]
         * - [type]
         * - [alwaysOn]
         * - [settings]
         * - etc.
         */
        fun body(body: Body) = apply { this.body = body.toBuilder() }

        /** When the guardrail runs. Each type runs in some modes only. */
        fun modes(modes: List<Mode>) = apply { body.modes(modes) }

        /**
         * Sets [Builder.modes] to an arbitrary JSON value.
         *
         * You should usually call [Builder.modes] with a well-typed `List<Mode>` value instead.
         * This method is primarily for setting the field to an undocumented or not yet supported
         * value.
         */
        fun modes(modes: JsonField<List<Mode>>) = apply { body.modes(modes) }

        /**
         * Adds a single [Mode] to [modes].
         *
         * @throws IllegalStateException if the field was previously set to a non-list.
         */
        fun addMode(mode: Mode) = apply { body.addMode(mode) }

        /** A name, unique on the instance. A request names it in its `guardrails` field. */
        fun name(name: String) = apply { body.name(name) }

        /**
         * Sets [Builder.name] to an arbitrary JSON value.
         *
         * You should usually call [Builder.name] with a well-typed [String] value instead. This
         * method is primarily for setting the field to an undocumented or not yet supported value.
         */
        fun name(name: JsonField<String>) = apply { body.name(name) }

        /** The kind of check. It cannot change after create. */
        fun type(type: Type) = apply { body.type(type) }

        /**
         * Sets [Builder.type] to an arbitrary JSON value.
         *
         * You should usually call [Builder.type] with a well-typed [Type] value instead. This
         * method is primarily for setting the field to an undocumented or not yet supported value.
         */
        fun type(type: JsonField<Type>) = apply { body.type(type) }

        /**
         * `true` runs the guardrail on every request, and a request cannot turn it off. `false`
         * runs it on the requests that name it.
         */
        fun alwaysOn(alwaysOn: Boolean) = apply { body.alwaysOn(alwaysOn) }

        /**
         * Sets [Builder.alwaysOn] to an arbitrary JSON value.
         *
         * You should usually call [Builder.alwaysOn] with a well-typed [Boolean] value instead.
         * This method is primarily for setting the field to an undocumented or not yet supported
         * value.
         */
        fun alwaysOn(alwaysOn: JsonField<Boolean>) = apply { body.alwaysOn(alwaysOn) }

        /**
         * The type's settings. `content_filter`: `patterns` (prebuilt patterns by `name`, such as
         * `us_ssn` or `email`), `regexes` (each a `name`, which tags masked matches, and a
         * `pattern`), `keywords` (each a `keyword`), and `categories` (each a `name`), each entry
         * with an `action` of `block` or `mask`. `tool_permission`: `rules` (`id`, `tool_name`,
         * `tool_type`, `decision`, `argument_patterns`), a `default` decision, and `on_denied`
         * (`block` or `rewrite`). `model_judge`: a `model` on the instance and weighted `criteria`
         * (`name`, `description`, `weight`, the weights summing to 100). `custom_code`: `code`
         * defining `apply_guardrail(inputs, request_data, input_type)`. `lakera`: `api_key`,
         * `project_id`, `api_base`. `presidio`: `analyzer_url`, `anonymizer_url`, `entities`
         * (entity name to `block` or `mask`), `language`. `bedrock`: `guardrail_id`, `version`,
         * `region`, and `access_key_id` with `secret_access_key`, or `role_name`.
         * `azure_content_safety`: `api_key`, `endpoint`, `severity` (0 to 7). Provider secrets are
         * write-only.
         */
        fun settings(settings: Settings) = apply { body.settings(settings) }

        /**
         * Sets [Builder.settings] to an arbitrary JSON value.
         *
         * You should usually call [Builder.settings] with a well-typed [Settings] value instead.
         * This method is primarily for setting the field to an undocumented or not yet supported
         * value.
         */
        fun settings(settings: JsonField<Settings>) = apply { body.settings(settings) }

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

        fun additionalHeaders(additionalHeaders: com.telnyx.sdk.core.http.Headers) = apply {
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

        fun putAllAdditionalHeaders(additionalHeaders: com.telnyx.sdk.core.http.Headers) = apply {
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

        fun replaceAllAdditionalHeaders(additionalHeaders: com.telnyx.sdk.core.http.Headers) =
            apply {
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
         * Returns an immutable instance of [GuardrailCreateParams].
         *
         * Further updates to this [Builder] will not mutate the returned instance.
         *
         * The following fields are required:
         * ```java
         * .modes()
         * .name()
         * .type()
         * ```
         *
         * @throws IllegalStateException if any required field is unset.
         */
        fun build(): GuardrailCreateParams =
            GuardrailCreateParams(
                instanceId,
                body.build(),
                additionalHeaders.build(),
                additionalQueryParams.build(),
            )
    }

    fun _body(): Body = body

    fun _pathParam(index: Int): String =
        when (index) {
            0 -> instanceId ?: ""
            else -> ""
        }

    override fun _headers(): com.telnyx.sdk.core.http.Headers = additionalHeaders

    override fun _queryParams(): QueryParams = additionalQueryParams

    class Body
    @JsonCreator(mode = JsonCreator.Mode.DISABLED)
    private constructor(
        private val modes: JsonField<List<Mode>>,
        private val name: JsonField<String>,
        private val type: JsonField<Type>,
        private val alwaysOn: JsonField<Boolean>,
        private val settings: JsonField<Settings>,
        private val additionalProperties: MutableMap<String, JsonValue>,
    ) {

        @JsonCreator
        private constructor(
            @JsonProperty("modes") @ExcludeMissing modes: JsonField<List<Mode>> = JsonMissing.of(),
            @JsonProperty("name") @ExcludeMissing name: JsonField<String> = JsonMissing.of(),
            @JsonProperty("type") @ExcludeMissing type: JsonField<Type> = JsonMissing.of(),
            @JsonProperty("always_on")
            @ExcludeMissing
            alwaysOn: JsonField<Boolean> = JsonMissing.of(),
            @JsonProperty("settings")
            @ExcludeMissing
            settings: JsonField<Settings> = JsonMissing.of(),
        ) : this(modes, name, type, alwaysOn, settings, mutableMapOf())

        /**
         * When the guardrail runs. Each type runs in some modes only.
         *
         * @throws TelnyxInvalidDataException if the JSON field has an unexpected type or is
         *   unexpectedly missing or null (e.g. if the server responded with an unexpected value).
         */
        fun modes(): List<Mode> = modes.getRequired("modes")

        /**
         * A name, unique on the instance. A request names it in its `guardrails` field.
         *
         * @throws TelnyxInvalidDataException if the JSON field has an unexpected type or is
         *   unexpectedly missing or null (e.g. if the server responded with an unexpected value).
         */
        fun name(): String = name.getRequired("name")

        /**
         * The kind of check. It cannot change after create.
         *
         * @throws TelnyxInvalidDataException if the JSON field has an unexpected type or is
         *   unexpectedly missing or null (e.g. if the server responded with an unexpected value).
         */
        fun type(): Type = type.getRequired("type")

        /**
         * `true` runs the guardrail on every request, and a request cannot turn it off. `false`
         * runs it on the requests that name it.
         *
         * @throws TelnyxInvalidDataException if the JSON field has an unexpected type (e.g. if the
         *   server responded with an unexpected value).
         */
        fun alwaysOn(): Optional<Boolean> = alwaysOn.getOptional("always_on")

        /**
         * The type's settings. `content_filter`: `patterns` (prebuilt patterns by `name`, such as
         * `us_ssn` or `email`), `regexes` (each a `name`, which tags masked matches, and a
         * `pattern`), `keywords` (each a `keyword`), and `categories` (each a `name`), each entry
         * with an `action` of `block` or `mask`. `tool_permission`: `rules` (`id`, `tool_name`,
         * `tool_type`, `decision`, `argument_patterns`), a `default` decision, and `on_denied`
         * (`block` or `rewrite`). `model_judge`: a `model` on the instance and weighted `criteria`
         * (`name`, `description`, `weight`, the weights summing to 100). `custom_code`: `code`
         * defining `apply_guardrail(inputs, request_data, input_type)`. `lakera`: `api_key`,
         * `project_id`, `api_base`. `presidio`: `analyzer_url`, `anonymizer_url`, `entities`
         * (entity name to `block` or `mask`), `language`. `bedrock`: `guardrail_id`, `version`,
         * `region`, and `access_key_id` with `secret_access_key`, or `role_name`.
         * `azure_content_safety`: `api_key`, `endpoint`, `severity` (0 to 7). Provider secrets are
         * write-only.
         *
         * @throws TelnyxInvalidDataException if the JSON field has an unexpected type (e.g. if the
         *   server responded with an unexpected value).
         */
        fun settings(): Optional<Settings> = settings.getOptional("settings")

        /**
         * Returns the raw JSON value of [modes].
         *
         * Unlike [modes], this method doesn't throw if the JSON field has an unexpected type.
         */
        @JsonProperty("modes") @ExcludeMissing fun _modes(): JsonField<List<Mode>> = modes

        /**
         * Returns the raw JSON value of [name].
         *
         * Unlike [name], this method doesn't throw if the JSON field has an unexpected type.
         */
        @JsonProperty("name") @ExcludeMissing fun _name(): JsonField<String> = name

        /**
         * Returns the raw JSON value of [type].
         *
         * Unlike [type], this method doesn't throw if the JSON field has an unexpected type.
         */
        @JsonProperty("type") @ExcludeMissing fun _type(): JsonField<Type> = type

        /**
         * Returns the raw JSON value of [alwaysOn].
         *
         * Unlike [alwaysOn], this method doesn't throw if the JSON field has an unexpected type.
         */
        @JsonProperty("always_on") @ExcludeMissing fun _alwaysOn(): JsonField<Boolean> = alwaysOn

        /**
         * Returns the raw JSON value of [settings].
         *
         * Unlike [settings], this method doesn't throw if the JSON field has an unexpected type.
         */
        @JsonProperty("settings") @ExcludeMissing fun _settings(): JsonField<Settings> = settings

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
             * .modes()
             * .name()
             * .type()
             * ```
             */
            @JvmStatic fun builder() = Builder()
        }

        /** A builder for [Body]. */
        class Builder internal constructor() {

            private var modes: JsonField<MutableList<Mode>>? = null
            private var name: JsonField<String>? = null
            private var type: JsonField<Type>? = null
            private var alwaysOn: JsonField<Boolean> = JsonMissing.of()
            private var settings: JsonField<Settings> = JsonMissing.of()
            private var additionalProperties: MutableMap<String, JsonValue> = mutableMapOf()

            @JvmSynthetic
            internal fun from(body: Body) = apply {
                modes = body.modes.map { it.toMutableList() }
                name = body.name
                type = body.type
                alwaysOn = body.alwaysOn
                settings = body.settings
                additionalProperties = body.additionalProperties.toMutableMap()
            }

            /** When the guardrail runs. Each type runs in some modes only. */
            fun modes(modes: List<Mode>) = modes(JsonField.of(modes))

            /**
             * Sets [Builder.modes] to an arbitrary JSON value.
             *
             * You should usually call [Builder.modes] with a well-typed `List<Mode>` value instead.
             * This method is primarily for setting the field to an undocumented or not yet
             * supported value.
             */
            fun modes(modes: JsonField<List<Mode>>) = apply {
                this.modes = modes.map { it.toMutableList() }
            }

            /**
             * Adds a single [Mode] to [modes].
             *
             * @throws IllegalStateException if the field was previously set to a non-list.
             */
            fun addMode(mode: Mode) = apply {
                modes =
                    (modes ?: JsonField.of(mutableListOf())).also {
                        checkKnown("modes", it).add(mode)
                    }
            }

            /** A name, unique on the instance. A request names it in its `guardrails` field. */
            fun name(name: String) = name(JsonField.of(name))

            /**
             * Sets [Builder.name] to an arbitrary JSON value.
             *
             * You should usually call [Builder.name] with a well-typed [String] value instead. This
             * method is primarily for setting the field to an undocumented or not yet supported
             * value.
             */
            fun name(name: JsonField<String>) = apply { this.name = name }

            /** The kind of check. It cannot change after create. */
            fun type(type: Type) = type(JsonField.of(type))

            /**
             * Sets [Builder.type] to an arbitrary JSON value.
             *
             * You should usually call [Builder.type] with a well-typed [Type] value instead. This
             * method is primarily for setting the field to an undocumented or not yet supported
             * value.
             */
            fun type(type: JsonField<Type>) = apply { this.type = type }

            /**
             * `true` runs the guardrail on every request, and a request cannot turn it off. `false`
             * runs it on the requests that name it.
             */
            fun alwaysOn(alwaysOn: Boolean) = alwaysOn(JsonField.of(alwaysOn))

            /**
             * Sets [Builder.alwaysOn] to an arbitrary JSON value.
             *
             * You should usually call [Builder.alwaysOn] with a well-typed [Boolean] value instead.
             * This method is primarily for setting the field to an undocumented or not yet
             * supported value.
             */
            fun alwaysOn(alwaysOn: JsonField<Boolean>) = apply { this.alwaysOn = alwaysOn }

            /**
             * The type's settings. `content_filter`: `patterns` (prebuilt patterns by `name`, such
             * as `us_ssn` or `email`), `regexes` (each a `name`, which tags masked matches, and a
             * `pattern`), `keywords` (each a `keyword`), and `categories` (each a `name`), each
             * entry with an `action` of `block` or `mask`. `tool_permission`: `rules` (`id`,
             * `tool_name`, `tool_type`, `decision`, `argument_patterns`), a `default` decision, and
             * `on_denied` (`block` or `rewrite`). `model_judge`: a `model` on the instance and
             * weighted `criteria` (`name`, `description`, `weight`, the weights summing to 100).
             * `custom_code`: `code` defining `apply_guardrail(inputs, request_data, input_type)`.
             * `lakera`: `api_key`, `project_id`, `api_base`. `presidio`: `analyzer_url`,
             * `anonymizer_url`, `entities` (entity name to `block` or `mask`), `language`.
             * `bedrock`: `guardrail_id`, `version`, `region`, and `access_key_id` with
             * `secret_access_key`, or `role_name`. `azure_content_safety`: `api_key`, `endpoint`,
             * `severity` (0 to 7). Provider secrets are write-only.
             */
            fun settings(settings: Settings) = settings(JsonField.of(settings))

            /**
             * Sets [Builder.settings] to an arbitrary JSON value.
             *
             * You should usually call [Builder.settings] with a well-typed [Settings] value
             * instead. This method is primarily for setting the field to an undocumented or not yet
             * supported value.
             */
            fun settings(settings: JsonField<Settings>) = apply { this.settings = settings }

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
             * .modes()
             * .name()
             * .type()
             * ```
             *
             * @throws IllegalStateException if any required field is unset.
             */
            fun build(): Body =
                Body(
                    checkRequired("modes", modes).map { it.toImmutable() },
                    checkRequired("name", name),
                    checkRequired("type", type),
                    alwaysOn,
                    settings,
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

            modes().forEach { it.validate() }
            name()
            type().validate()
            alwaysOn()
            settings().ifPresent { it.validate() }
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
            (modes.asKnown().getOrNull()?.sumOf { it.validity().toInt() } ?: 0) +
                (if (name.asKnown().isPresent) 1 else 0) +
                (type.asKnown().getOrNull()?.validity() ?: 0) +
                (if (alwaysOn.asKnown().isPresent) 1 else 0) +
                (settings.asKnown().getOrNull()?.validity() ?: 0)

        override fun equals(other: Any?): Boolean {
            if (this === other) {
                return true
            }

            return other is Body &&
                modes == other.modes &&
                name == other.name &&
                type == other.type &&
                alwaysOn == other.alwaysOn &&
                settings == other.settings &&
                additionalProperties == other.additionalProperties
        }

        private val hashCode: Int by lazy {
            Objects.hash(modes, name, type, alwaysOn, settings, additionalProperties)
        }

        override fun hashCode(): Int = hashCode

        override fun toString() =
            "Body{modes=$modes, name=$name, type=$type, alwaysOn=$alwaysOn, settings=$settings, additionalProperties=$additionalProperties}"
    }

    class Mode @JsonCreator private constructor(private val value: JsonField<String>) : Enum {

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

            @JvmField val BEFORE_REQUEST = of("before_request")

            @JvmField val DURING_REQUEST = of("during_request")

            @JvmField val AFTER_REQUEST = of("after_request")

            @JvmField val LOGGING_ONLY = of("logging_only")

            @JvmField val BEFORE_TOOL_REQUEST = of("before_tool_request")

            @JvmField val DURING_TOOL_REQUEST = of("during_tool_request")

            @JvmField val AFTER_TOOL_REQUEST = of("after_tool_request")

            @JvmStatic fun of(value: String) = Mode(JsonField.of(value))
        }

        /** An enum containing [Mode]'s known values. */
        enum class Known {
            BEFORE_REQUEST,
            DURING_REQUEST,
            AFTER_REQUEST,
            LOGGING_ONLY,
            BEFORE_TOOL_REQUEST,
            DURING_TOOL_REQUEST,
            AFTER_TOOL_REQUEST,
        }

        /**
         * An enum containing [Mode]'s known values, as well as an [_UNKNOWN] member.
         *
         * An instance of [Mode] can contain an unknown value in a couple of cases:
         * - It was deserialized from data that doesn't match any known member. For example, if the
         *   SDK is on an older version than the API, then the API may respond with new members that
         *   the SDK is unaware of.
         * - It was constructed with an arbitrary value using the [of] method.
         */
        enum class Value {
            BEFORE_REQUEST,
            DURING_REQUEST,
            AFTER_REQUEST,
            LOGGING_ONLY,
            BEFORE_TOOL_REQUEST,
            DURING_TOOL_REQUEST,
            AFTER_TOOL_REQUEST,
            /** An enum member indicating that [Mode] was instantiated with an unknown value. */
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
                BEFORE_REQUEST -> Value.BEFORE_REQUEST
                DURING_REQUEST -> Value.DURING_REQUEST
                AFTER_REQUEST -> Value.AFTER_REQUEST
                LOGGING_ONLY -> Value.LOGGING_ONLY
                BEFORE_TOOL_REQUEST -> Value.BEFORE_TOOL_REQUEST
                DURING_TOOL_REQUEST -> Value.DURING_TOOL_REQUEST
                AFTER_TOOL_REQUEST -> Value.AFTER_TOOL_REQUEST
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
                BEFORE_REQUEST -> Known.BEFORE_REQUEST
                DURING_REQUEST -> Known.DURING_REQUEST
                AFTER_REQUEST -> Known.AFTER_REQUEST
                LOGGING_ONLY -> Known.LOGGING_ONLY
                BEFORE_TOOL_REQUEST -> Known.BEFORE_TOOL_REQUEST
                DURING_TOOL_REQUEST -> Known.DURING_TOOL_REQUEST
                AFTER_TOOL_REQUEST -> Known.AFTER_TOOL_REQUEST
                else -> throw TelnyxInvalidDataException("Unknown Mode: $value")
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

        /**
         * Validates that the types of all values in this object match their expected types
         * recursively.
         *
         * This method is _not_ forwards compatible with new types from the API for existing fields.
         *
         * @throws TelnyxInvalidDataException if any value type in this object doesn't match its
         *   expected type.
         */
        fun validate(): Mode = apply {
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

            return other is Mode && value == other.value
        }

        override fun hashCode() = value.hashCode()

        override fun toString() = value.toString()
    }

    /** The kind of check. It cannot change after create. */
    class Type @JsonCreator private constructor(private val value: JsonField<String>) : Enum {

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

            @JvmField val CONTENT_FILTER = of("content_filter")

            @JvmField val TOOL_PERMISSION = of("tool_permission")

            @JvmField val MODEL_JUDGE = of("model_judge")

            @JvmField val CUSTOM_CODE = of("custom_code")

            @JvmField val LAKERA = of("lakera")

            @JvmField val PRESIDIO = of("presidio")

            @JvmField val BEDROCK = of("bedrock")

            @JvmField val AZURE_CONTENT_SAFETY = of("azure_content_safety")

            @JvmStatic fun of(value: String) = Type(JsonField.of(value))
        }

        /** An enum containing [Type]'s known values. */
        enum class Known {
            CONTENT_FILTER,
            TOOL_PERMISSION,
            MODEL_JUDGE,
            CUSTOM_CODE,
            LAKERA,
            PRESIDIO,
            BEDROCK,
            AZURE_CONTENT_SAFETY,
        }

        /**
         * An enum containing [Type]'s known values, as well as an [_UNKNOWN] member.
         *
         * An instance of [Type] can contain an unknown value in a couple of cases:
         * - It was deserialized from data that doesn't match any known member. For example, if the
         *   SDK is on an older version than the API, then the API may respond with new members that
         *   the SDK is unaware of.
         * - It was constructed with an arbitrary value using the [of] method.
         */
        enum class Value {
            CONTENT_FILTER,
            TOOL_PERMISSION,
            MODEL_JUDGE,
            CUSTOM_CODE,
            LAKERA,
            PRESIDIO,
            BEDROCK,
            AZURE_CONTENT_SAFETY,
            /** An enum member indicating that [Type] was instantiated with an unknown value. */
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
                CONTENT_FILTER -> Value.CONTENT_FILTER
                TOOL_PERMISSION -> Value.TOOL_PERMISSION
                MODEL_JUDGE -> Value.MODEL_JUDGE
                CUSTOM_CODE -> Value.CUSTOM_CODE
                LAKERA -> Value.LAKERA
                PRESIDIO -> Value.PRESIDIO
                BEDROCK -> Value.BEDROCK
                AZURE_CONTENT_SAFETY -> Value.AZURE_CONTENT_SAFETY
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
                CONTENT_FILTER -> Known.CONTENT_FILTER
                TOOL_PERMISSION -> Known.TOOL_PERMISSION
                MODEL_JUDGE -> Known.MODEL_JUDGE
                CUSTOM_CODE -> Known.CUSTOM_CODE
                LAKERA -> Known.LAKERA
                PRESIDIO -> Known.PRESIDIO
                BEDROCK -> Known.BEDROCK
                AZURE_CONTENT_SAFETY -> Known.AZURE_CONTENT_SAFETY
                else -> throw TelnyxInvalidDataException("Unknown Type: $value")
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

        /**
         * Validates that the types of all values in this object match their expected types
         * recursively.
         *
         * This method is _not_ forwards compatible with new types from the API for existing fields.
         *
         * @throws TelnyxInvalidDataException if any value type in this object doesn't match its
         *   expected type.
         */
        fun validate(): Type = apply {
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

            return other is Type && value == other.value
        }

        override fun hashCode() = value.hashCode()

        override fun toString() = value.toString()
    }

    /**
     * The type's settings. `content_filter`: `patterns` (prebuilt patterns by `name`, such as
     * `us_ssn` or `email`), `regexes` (each a `name`, which tags masked matches, and a `pattern`),
     * `keywords` (each a `keyword`), and `categories` (each a `name`), each entry with an `action`
     * of `block` or `mask`. `tool_permission`: `rules` (`id`, `tool_name`, `tool_type`, `decision`,
     * `argument_patterns`), a `default` decision, and `on_denied` (`block` or `rewrite`).
     * `model_judge`: a `model` on the instance and weighted `criteria` (`name`, `description`,
     * `weight`, the weights summing to 100). `custom_code`: `code` defining
     * `apply_guardrail(inputs, request_data, input_type)`. `lakera`: `api_key`, `project_id`,
     * `api_base`. `presidio`: `analyzer_url`, `anonymizer_url`, `entities` (entity name to `block`
     * or `mask`), `language`. `bedrock`: `guardrail_id`, `version`, `region`, and `access_key_id`
     * with `secret_access_key`, or `role_name`. `azure_content_safety`: `api_key`, `endpoint`,
     * `severity` (0 to 7). Provider secrets are write-only.
     */
    class Settings
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

            /** Returns a mutable builder for constructing an instance of [Settings]. */
            @JvmStatic fun builder() = Builder()
        }

        /** A builder for [Settings]. */
        class Builder internal constructor() {

            private var additionalProperties: MutableMap<String, JsonValue> = mutableMapOf()

            @JvmSynthetic
            internal fun from(settings: Settings) = apply {
                additionalProperties = settings.additionalProperties.toMutableMap()
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
             * Returns an immutable instance of [Settings].
             *
             * Further updates to this [Builder] will not mutate the returned instance.
             */
            fun build(): Settings = Settings(additionalProperties.toImmutable())
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
        fun validate(): Settings = apply {
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
            additionalProperties.count { (_, value) -> !value.isNull() && !value.isMissing() }

        override fun equals(other: Any?): Boolean {
            if (this === other) {
                return true
            }

            return other is Settings && additionalProperties == other.additionalProperties
        }

        private val hashCode: Int by lazy { Objects.hash(additionalProperties) }

        override fun hashCode(): Int = hashCode

        override fun toString() = "Settings{additionalProperties=$additionalProperties}"
    }

    override fun equals(other: Any?): Boolean {
        if (this === other) {
            return true
        }

        return other is GuardrailCreateParams &&
            instanceId == other.instanceId &&
            body == other.body &&
            additionalHeaders == other.additionalHeaders &&
            additionalQueryParams == other.additionalQueryParams
    }

    override fun hashCode(): Int =
        Objects.hash(instanceId, body, additionalHeaders, additionalQueryParams)

    override fun toString() =
        "GuardrailCreateParams{instanceId=$instanceId, body=$body, additionalHeaders=$additionalHeaders, additionalQueryParams=$additionalQueryParams}"
}
