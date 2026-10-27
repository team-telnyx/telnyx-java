// File generated from our OpenAPI spec by Stainless.

package com.telnyx.sdk.models.browsersessions.actions

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
import com.telnyx.sdk.core.allMaxBy
import com.telnyx.sdk.core.checkKnown
import com.telnyx.sdk.core.checkRequired
import com.telnyx.sdk.core.getOrThrow
import com.telnyx.sdk.core.http.QueryParams
import com.telnyx.sdk.core.toImmutable
import com.telnyx.sdk.errors.TelnyxInvalidDataException
import java.util.Collections
import java.util.Objects
import java.util.Optional
import kotlin.jvm.optionals.getOrNull

/**
 * Executes a browser action on the session. Returns 200 if completed within wait_seconds, 202 if
 * still in-flight.
 *
 * Action types: navigate, observe, click, fill, select, press, scroll, wait_for, screenshot, batch.
 */
class ActionCreateParams
private constructor(
    private val id: String?,
    private val waitSeconds: Long?,
    private val body: Body,
    private val additionalHeaders: com.telnyx.sdk.core.http.Headers,
    private val additionalQueryParams: QueryParams,
) : Params {

    fun id(): Optional<String> = Optional.ofNullable(id)

    /**
     * Maximum seconds the submission request waits for completion, not an execution timeout. If
     * still queued or running, returns 202 without cancelling execution; poll the returned action
     * ID.
     */
    fun waitSeconds(): Optional<Long> = Optional.ofNullable(waitSeconds)

    /**
     * Discriminated union on type. Variants are strict: unknown fields are rejected with 400.
     * Reusing an idempotency_key with an identical request replays the original resource; with a
     * different request it returns 409 idempotency_conflict.
     */
    fun body(): Body = body

    /** Additional headers to send with the request. */
    fun _additionalHeaders(): com.telnyx.sdk.core.http.Headers = additionalHeaders

    /** Additional query param to send with the request. */
    fun _additionalQueryParams(): QueryParams = additionalQueryParams

    fun toBuilder() = Builder().from(this)

    companion object {

        /**
         * Returns a mutable builder for constructing an instance of [ActionCreateParams].
         *
         * The following fields are required:
         * ```java
         * .body()
         * ```
         */
        @JvmStatic fun builder() = Builder()
    }

    /** A builder for [ActionCreateParams]. */
    class Builder internal constructor() {

        private var id: String? = null
        private var waitSeconds: Long? = null
        private var body: Body? = null
        private var additionalHeaders: com.telnyx.sdk.core.http.Headers.Builder =
            com.telnyx.sdk.core.http.Headers.builder()
        private var additionalQueryParams: QueryParams.Builder = QueryParams.builder()

        @JvmSynthetic
        internal fun from(actionCreateParams: ActionCreateParams) = apply {
            id = actionCreateParams.id
            waitSeconds = actionCreateParams.waitSeconds
            body = actionCreateParams.body
            additionalHeaders = actionCreateParams.additionalHeaders.toBuilder()
            additionalQueryParams = actionCreateParams.additionalQueryParams.toBuilder()
        }

        fun id(id: String?) = apply { this.id = id }

        /** Alias for calling [Builder.id] with `id.orElse(null)`. */
        fun id(id: Optional<String>) = id(id.getOrNull())

        /**
         * Maximum seconds the submission request waits for completion, not an execution timeout. If
         * still queued or running, returns 202 without cancelling execution; poll the returned
         * action ID.
         */
        fun waitSeconds(waitSeconds: Long?) = apply { this.waitSeconds = waitSeconds }

        /**
         * Alias for [Builder.waitSeconds].
         *
         * This unboxed primitive overload exists for backwards compatibility.
         */
        fun waitSeconds(waitSeconds: Long) = waitSeconds(waitSeconds as Long?)

        /** Alias for calling [Builder.waitSeconds] with `waitSeconds.orElse(null)`. */
        fun waitSeconds(waitSeconds: Optional<Long>) = waitSeconds(waitSeconds.getOrNull())

        /**
         * Discriminated union on type. Variants are strict: unknown fields are rejected with 400.
         * Reusing an idempotency_key with an identical request replays the original resource; with
         * a different request it returns 409 idempotency_conflict.
         */
        fun body(body: Body) = apply { this.body = body }

        /** Alias for calling [body] with `Body.ofNavigateAction(navigateAction)`. */
        fun body(navigateAction: NavigateAction) = body(Body.ofNavigateAction(navigateAction))

        /** Alias for calling [body] with `Body.ofObserveAction(observeAction)`. */
        fun body(observeAction: ObserveAction) = body(Body.ofObserveAction(observeAction))

        /** Alias for calling [body] with `Body.ofClickAction(clickAction)`. */
        fun body(clickAction: ClickAction) = body(Body.ofClickAction(clickAction))

        /** Alias for calling [body] with `Body.ofFillAction(fillAction)`. */
        fun body(fillAction: FillAction) = body(Body.ofFillAction(fillAction))

        /** Alias for calling [body] with `Body.ofSelectAction(selectAction)`. */
        fun body(selectAction: SelectAction) = body(Body.ofSelectAction(selectAction))

        /** Alias for calling [body] with `Body.ofPressAction(pressAction)`. */
        fun body(pressAction: PressAction) = body(Body.ofPressAction(pressAction))

        /** Alias for calling [body] with `Body.ofScrollAction(scrollAction)`. */
        fun body(scrollAction: ScrollAction) = body(Body.ofScrollAction(scrollAction))

        /** Alias for calling [body] with `Body.ofScreenshotAction(screenshotAction)`. */
        fun body(screenshotAction: ScreenshotAction) =
            body(Body.ofScreenshotAction(screenshotAction))

        /** Alias for calling [body] with `Body.ofWaitForAction(waitForAction)`. */
        fun body(waitForAction: WaitForAction) = body(Body.ofWaitForAction(waitForAction))

        /** Alias for calling [body] with `Body.ofBatchAction(batchAction)`. */
        fun body(batchAction: Body.BatchAction) = body(Body.ofBatchAction(batchAction))

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
         * Returns an immutable instance of [ActionCreateParams].
         *
         * Further updates to this [Builder] will not mutate the returned instance.
         *
         * The following fields are required:
         * ```java
         * .body()
         * ```
         *
         * @throws IllegalStateException if any required field is unset.
         */
        fun build(): ActionCreateParams =
            ActionCreateParams(
                id,
                waitSeconds,
                checkRequired("body", body),
                additionalHeaders.build(),
                additionalQueryParams.build(),
            )
    }

    fun _body(): Body = body

    fun _pathParam(index: Int): String =
        when (index) {
            0 -> id ?: ""
            else -> ""
        }

    override fun _headers(): com.telnyx.sdk.core.http.Headers = additionalHeaders

    override fun _queryParams(): QueryParams =
        QueryParams.builder()
            .apply {
                waitSeconds?.let { put("wait_seconds", it.toString()) }
                putAll(additionalQueryParams)
            }
            .build()

    /**
     * Discriminated union on type. Variants are strict: unknown fields are rejected with 400.
     * Reusing an idempotency_key with an identical request replays the original resource; with a
     * different request it returns 409 idempotency_conflict.
     */
    @JsonDeserialize(using = Body.Deserializer::class)
    @JsonSerialize(using = Body.Serializer::class)
    class Body
    private constructor(
        private val navigateAction: NavigateAction? = null,
        private val observeAction: ObserveAction? = null,
        private val clickAction: ClickAction? = null,
        private val fillAction: FillAction? = null,
        private val selectAction: SelectAction? = null,
        private val pressAction: PressAction? = null,
        private val scrollAction: ScrollAction? = null,
        private val screenshotAction: ScreenshotAction? = null,
        private val waitForAction: WaitForAction? = null,
        private val batchAction: BatchAction? = null,
        private val _json: JsonValue? = null,
    ) {

        /** Navigate to a URL. */
        fun navigateAction(): Optional<NavigateAction> = Optional.ofNullable(navigateAction)

        /** Capture an observation (DOM snapshot) of the current page. */
        fun observeAction(): Optional<ObserveAction> = Optional.ofNullable(observeAction)

        /** Click an element identified by observation_id + ref. */
        fun clickAction(): Optional<ClickAction> = Optional.ofNullable(clickAction)

        /** Type text into the element identified by observation_id + ref. */
        fun fillAction(): Optional<FillAction> = Optional.ofNullable(fillAction)

        /** Select an option on the element identified by observation_id + ref. */
        fun selectAction(): Optional<SelectAction> = Optional.ofNullable(selectAction)

        /** Press a keyboard key. */
        fun pressAction(): Optional<PressAction> = Optional.ofNullable(pressAction)

        /** Scroll the page. */
        fun scrollAction(): Optional<ScrollAction> = Optional.ofNullable(scrollAction)

        /** Capture a screenshot of the current page. */
        fun screenshotAction(): Optional<ScreenshotAction> = Optional.ofNullable(screenshotAction)

        /** Wait for a condition before continuing. */
        fun waitForAction(): Optional<WaitForAction> = Optional.ofNullable(waitForAction)

        /**
         * Execute 1-50 sub-actions sequentially. Non-recursive: a batch inside a batch is rejected
         * (400). An empty array is rejected (400). A failed sub-action stops the batch; earlier
         * browser mutations are not rolled back, but partial sub-action results are not returned.
         */
        fun batchAction(): Optional<BatchAction> = Optional.ofNullable(batchAction)

        fun isNavigateAction(): Boolean = navigateAction != null

        fun isObserveAction(): Boolean = observeAction != null

        fun isClickAction(): Boolean = clickAction != null

        fun isFillAction(): Boolean = fillAction != null

        fun isSelectAction(): Boolean = selectAction != null

        fun isPressAction(): Boolean = pressAction != null

        fun isScrollAction(): Boolean = scrollAction != null

        fun isScreenshotAction(): Boolean = screenshotAction != null

        fun isWaitForAction(): Boolean = waitForAction != null

        fun isBatchAction(): Boolean = batchAction != null

        /** Navigate to a URL. */
        fun asNavigateAction(): NavigateAction = navigateAction.getOrThrow("navigateAction")

        /** Capture an observation (DOM snapshot) of the current page. */
        fun asObserveAction(): ObserveAction = observeAction.getOrThrow("observeAction")

        /** Click an element identified by observation_id + ref. */
        fun asClickAction(): ClickAction = clickAction.getOrThrow("clickAction")

        /** Type text into the element identified by observation_id + ref. */
        fun asFillAction(): FillAction = fillAction.getOrThrow("fillAction")

        /** Select an option on the element identified by observation_id + ref. */
        fun asSelectAction(): SelectAction = selectAction.getOrThrow("selectAction")

        /** Press a keyboard key. */
        fun asPressAction(): PressAction = pressAction.getOrThrow("pressAction")

        /** Scroll the page. */
        fun asScrollAction(): ScrollAction = scrollAction.getOrThrow("scrollAction")

        /** Capture a screenshot of the current page. */
        fun asScreenshotAction(): ScreenshotAction = screenshotAction.getOrThrow("screenshotAction")

        /** Wait for a condition before continuing. */
        fun asWaitForAction(): WaitForAction = waitForAction.getOrThrow("waitForAction")

        /**
         * Execute 1-50 sub-actions sequentially. Non-recursive: a batch inside a batch is rejected
         * (400). An empty array is rejected (400). A failed sub-action stops the batch; earlier
         * browser mutations are not rolled back, but partial sub-action results are not returned.
         */
        fun asBatchAction(): BatchAction = batchAction.getOrThrow("batchAction")

        fun _json(): Optional<JsonValue> = Optional.ofNullable(_json)

        /**
         * Maps this instance's current variant to a value of type [T] using the given [visitor].
         *
         * Note that this method is _not_ forwards compatible with new variants from the API, unless
         * [visitor] overrides [Visitor.unknown]. To handle variants not known to this version of
         * the SDK gracefully, consider overriding [Visitor.unknown]:
         * ```java
         * import com.telnyx.sdk.core.JsonValue;
         * import java.util.Optional;
         *
         * Optional<String> result = body.accept(new Body.Visitor<Optional<String>>() {
         *     @Override
         *     public Optional<String> visitNavigateAction(NavigateAction navigateAction) {
         *         return Optional.of(navigateAction.toString());
         *     }
         *
         *     // ...
         *
         *     @Override
         *     public Optional<String> unknown(JsonValue json) {
         *         // Or inspect the `json`.
         *         return Optional.empty();
         *     }
         * });
         * ```
         *
         * @throws TelnyxInvalidDataException if [Visitor.unknown] is not overridden in [visitor]
         *   and the current variant is unknown.
         */
        fun <T> accept(visitor: Visitor<T>): T =
            when {
                navigateAction != null -> visitor.visitNavigateAction(navigateAction)
                observeAction != null -> visitor.visitObserveAction(observeAction)
                clickAction != null -> visitor.visitClickAction(clickAction)
                fillAction != null -> visitor.visitFillAction(fillAction)
                selectAction != null -> visitor.visitSelectAction(selectAction)
                pressAction != null -> visitor.visitPressAction(pressAction)
                scrollAction != null -> visitor.visitScrollAction(scrollAction)
                screenshotAction != null -> visitor.visitScreenshotAction(screenshotAction)
                waitForAction != null -> visitor.visitWaitForAction(waitForAction)
                batchAction != null -> visitor.visitBatchAction(batchAction)
                else -> visitor.unknown(_json)
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

            accept(
                object : Visitor<Unit> {
                    override fun visitNavigateAction(navigateAction: NavigateAction) {
                        navigateAction.validate()
                    }

                    override fun visitObserveAction(observeAction: ObserveAction) {
                        observeAction.validate()
                    }

                    override fun visitClickAction(clickAction: ClickAction) {
                        clickAction.validate()
                    }

                    override fun visitFillAction(fillAction: FillAction) {
                        fillAction.validate()
                    }

                    override fun visitSelectAction(selectAction: SelectAction) {
                        selectAction.validate()
                    }

                    override fun visitPressAction(pressAction: PressAction) {
                        pressAction.validate()
                    }

                    override fun visitScrollAction(scrollAction: ScrollAction) {
                        scrollAction.validate()
                    }

                    override fun visitScreenshotAction(screenshotAction: ScreenshotAction) {
                        screenshotAction.validate()
                    }

                    override fun visitWaitForAction(waitForAction: WaitForAction) {
                        waitForAction.validate()
                    }

                    override fun visitBatchAction(batchAction: BatchAction) {
                        batchAction.validate()
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
                    override fun visitNavigateAction(navigateAction: NavigateAction) =
                        navigateAction.validity()

                    override fun visitObserveAction(observeAction: ObserveAction) =
                        observeAction.validity()

                    override fun visitClickAction(clickAction: ClickAction) = clickAction.validity()

                    override fun visitFillAction(fillAction: FillAction) = fillAction.validity()

                    override fun visitSelectAction(selectAction: SelectAction) =
                        selectAction.validity()

                    override fun visitPressAction(pressAction: PressAction) = pressAction.validity()

                    override fun visitScrollAction(scrollAction: ScrollAction) =
                        scrollAction.validity()

                    override fun visitScreenshotAction(screenshotAction: ScreenshotAction) =
                        screenshotAction.validity()

                    override fun visitWaitForAction(waitForAction: WaitForAction) =
                        waitForAction.validity()

                    override fun visitBatchAction(batchAction: BatchAction) = batchAction.validity()

                    override fun unknown(json: JsonValue?) = 0
                }
            )

        override fun equals(other: Any?): Boolean {
            if (this === other) {
                return true
            }

            return other is Body &&
                navigateAction == other.navigateAction &&
                observeAction == other.observeAction &&
                clickAction == other.clickAction &&
                fillAction == other.fillAction &&
                selectAction == other.selectAction &&
                pressAction == other.pressAction &&
                scrollAction == other.scrollAction &&
                screenshotAction == other.screenshotAction &&
                waitForAction == other.waitForAction &&
                batchAction == other.batchAction
        }

        override fun hashCode(): Int =
            Objects.hash(
                navigateAction,
                observeAction,
                clickAction,
                fillAction,
                selectAction,
                pressAction,
                scrollAction,
                screenshotAction,
                waitForAction,
                batchAction,
            )

        override fun toString(): String =
            when {
                navigateAction != null -> "Body{navigateAction=$navigateAction}"
                observeAction != null -> "Body{observeAction=$observeAction}"
                clickAction != null -> "Body{clickAction=$clickAction}"
                fillAction != null -> "Body{fillAction=$fillAction}"
                selectAction != null -> "Body{selectAction=$selectAction}"
                pressAction != null -> "Body{pressAction=$pressAction}"
                scrollAction != null -> "Body{scrollAction=$scrollAction}"
                screenshotAction != null -> "Body{screenshotAction=$screenshotAction}"
                waitForAction != null -> "Body{waitForAction=$waitForAction}"
                batchAction != null -> "Body{batchAction=$batchAction}"
                _json != null -> "Body{_unknown=$_json}"
                else -> throw IllegalStateException("Invalid Body")
            }

        companion object {

            /** Navigate to a URL. */
            @JvmStatic
            fun ofNavigateAction(navigateAction: NavigateAction) =
                Body(navigateAction = navigateAction)

            /** Capture an observation (DOM snapshot) of the current page. */
            @JvmStatic
            fun ofObserveAction(observeAction: ObserveAction) = Body(observeAction = observeAction)

            /** Click an element identified by observation_id + ref. */
            @JvmStatic fun ofClickAction(clickAction: ClickAction) = Body(clickAction = clickAction)

            /** Type text into the element identified by observation_id + ref. */
            @JvmStatic fun ofFillAction(fillAction: FillAction) = Body(fillAction = fillAction)

            /** Select an option on the element identified by observation_id + ref. */
            @JvmStatic
            fun ofSelectAction(selectAction: SelectAction) = Body(selectAction = selectAction)

            /** Press a keyboard key. */
            @JvmStatic fun ofPressAction(pressAction: PressAction) = Body(pressAction = pressAction)

            /** Scroll the page. */
            @JvmStatic
            fun ofScrollAction(scrollAction: ScrollAction) = Body(scrollAction = scrollAction)

            /** Capture a screenshot of the current page. */
            @JvmStatic
            fun ofScreenshotAction(screenshotAction: ScreenshotAction) =
                Body(screenshotAction = screenshotAction)

            /** Wait for a condition before continuing. */
            @JvmStatic
            fun ofWaitForAction(waitForAction: WaitForAction) = Body(waitForAction = waitForAction)

            /**
             * Execute 1-50 sub-actions sequentially. Non-recursive: a batch inside a batch is
             * rejected (400). An empty array is rejected (400). A failed sub-action stops the
             * batch; earlier browser mutations are not rolled back, but partial sub-action results
             * are not returned.
             */
            @JvmStatic fun ofBatchAction(batchAction: BatchAction) = Body(batchAction = batchAction)
        }

        /** An interface that defines how to map each variant of [Body] to a value of type [T]. */
        interface Visitor<out T> {

            /** Navigate to a URL. */
            fun visitNavigateAction(navigateAction: NavigateAction): T

            /** Capture an observation (DOM snapshot) of the current page. */
            fun visitObserveAction(observeAction: ObserveAction): T

            /** Click an element identified by observation_id + ref. */
            fun visitClickAction(clickAction: ClickAction): T

            /** Type text into the element identified by observation_id + ref. */
            fun visitFillAction(fillAction: FillAction): T

            /** Select an option on the element identified by observation_id + ref. */
            fun visitSelectAction(selectAction: SelectAction): T

            /** Press a keyboard key. */
            fun visitPressAction(pressAction: PressAction): T

            /** Scroll the page. */
            fun visitScrollAction(scrollAction: ScrollAction): T

            /** Capture a screenshot of the current page. */
            fun visitScreenshotAction(screenshotAction: ScreenshotAction): T

            /** Wait for a condition before continuing. */
            fun visitWaitForAction(waitForAction: WaitForAction): T

            /**
             * Execute 1-50 sub-actions sequentially. Non-recursive: a batch inside a batch is
             * rejected (400). An empty array is rejected (400). A failed sub-action stops the
             * batch; earlier browser mutations are not rolled back, but partial sub-action results
             * are not returned.
             */
            fun visitBatchAction(batchAction: BatchAction): T

            /**
             * Maps an unknown variant of [Body] to a value of type [T].
             *
             * An instance of [Body] can contain an unknown variant if it was deserialized from data
             * that doesn't match any known variant. For example, if the SDK is on an older version
             * than the API, then the API may respond with new variants that the SDK is unaware of.
             *
             * @throws TelnyxInvalidDataException in the default implementation.
             */
            fun unknown(json: JsonValue?): T {
                throw TelnyxInvalidDataException("Unknown Body: $json")
            }
        }

        internal class Deserializer : BaseDeserializer<Body>(Body::class) {

            override fun ObjectCodec.deserialize(node: JsonNode): Body {
                val json = JsonValue.fromJsonNode(node)

                val bestMatches =
                    sequenceOf(
                            tryDeserialize(node, jacksonTypeRef<NavigateAction>())?.let {
                                Body(navigateAction = it, _json = json)
                            },
                            tryDeserialize(node, jacksonTypeRef<ObserveAction>())?.let {
                                Body(observeAction = it, _json = json)
                            },
                            tryDeserialize(node, jacksonTypeRef<ClickAction>())?.let {
                                Body(clickAction = it, _json = json)
                            },
                            tryDeserialize(node, jacksonTypeRef<FillAction>())?.let {
                                Body(fillAction = it, _json = json)
                            },
                            tryDeserialize(node, jacksonTypeRef<SelectAction>())?.let {
                                Body(selectAction = it, _json = json)
                            },
                            tryDeserialize(node, jacksonTypeRef<PressAction>())?.let {
                                Body(pressAction = it, _json = json)
                            },
                            tryDeserialize(node, jacksonTypeRef<ScrollAction>())?.let {
                                Body(scrollAction = it, _json = json)
                            },
                            tryDeserialize(node, jacksonTypeRef<ScreenshotAction>())?.let {
                                Body(screenshotAction = it, _json = json)
                            },
                            tryDeserialize(node, jacksonTypeRef<WaitForAction>())?.let {
                                Body(waitForAction = it, _json = json)
                            },
                            tryDeserialize(node, jacksonTypeRef<BatchAction>())?.let {
                                Body(batchAction = it, _json = json)
                            },
                        )
                        .filterNotNull()
                        .allMaxBy { it.validity() }
                        .toList()
                return when (bestMatches.size) {
                    // This can happen if what we're deserializing is completely incompatible with
                    // all the possible variants (e.g. deserializing from boolean).
                    0 -> Body(_json = json)
                    1 -> bestMatches.single()
                    // If there's more than one match with the highest validity, then use the first
                    // completely valid match, or simply the first match if none are completely
                    // valid.
                    else -> bestMatches.firstOrNull { it.isValid() } ?: bestMatches.first()
                }
            }
        }

        internal class Serializer : BaseSerializer<Body>(Body::class) {

            override fun serialize(
                value: Body,
                generator: JsonGenerator,
                provider: SerializerProvider,
            ) {
                when {
                    value.navigateAction != null -> generator.writeObject(value.navigateAction)
                    value.observeAction != null -> generator.writeObject(value.observeAction)
                    value.clickAction != null -> generator.writeObject(value.clickAction)
                    value.fillAction != null -> generator.writeObject(value.fillAction)
                    value.selectAction != null -> generator.writeObject(value.selectAction)
                    value.pressAction != null -> generator.writeObject(value.pressAction)
                    value.scrollAction != null -> generator.writeObject(value.scrollAction)
                    value.screenshotAction != null -> generator.writeObject(value.screenshotAction)
                    value.waitForAction != null -> generator.writeObject(value.waitForAction)
                    value.batchAction != null -> generator.writeObject(value.batchAction)
                    value._json != null -> generator.writeObject(value._json)
                    else -> throw IllegalStateException("Invalid Body")
                }
            }
        }

        /**
         * Execute 1-50 sub-actions sequentially. Non-recursive: a batch inside a batch is rejected
         * (400). An empty array is rejected (400). A failed sub-action stops the batch; earlier
         * browser mutations are not rolled back, but partial sub-action results are not returned.
         */
        class BatchAction
        @JsonCreator(mode = JsonCreator.Mode.DISABLED)
        private constructor(
            private val actions: JsonField<List<Action>>,
            private val type: JsonValue,
            private val idempotencyKey: JsonField<String>,
            private val includeObservation: JsonField<Boolean>,
            private val additionalProperties: MutableMap<String, JsonValue>,
        ) {

            @JsonCreator
            private constructor(
                @JsonProperty("actions")
                @ExcludeMissing
                actions: JsonField<List<Action>> = JsonMissing.of(),
                @JsonProperty("type") @ExcludeMissing type: JsonValue = JsonMissing.of(),
                @JsonProperty("idempotency_key")
                @ExcludeMissing
                idempotencyKey: JsonField<String> = JsonMissing.of(),
                @JsonProperty("include_observation")
                @ExcludeMissing
                includeObservation: JsonField<Boolean> = JsonMissing.of(),
            ) : this(actions, type, idempotencyKey, includeObservation, mutableMapOf())

            /**
             * @throws TelnyxInvalidDataException if the JSON field has an unexpected type or is
             *   unexpectedly missing or null (e.g. if the server responded with an unexpected
             *   value).
             */
            fun actions(): List<Action> = actions.getRequired("actions")

            /**
             * Expected to always return the following:
             * ```java
             * JsonValue.from("batch")
             * ```
             *
             * However, this method can be useful for debugging and logging (e.g. if the server
             * responded with an unexpected value).
             */
            @JsonProperty("type") @ExcludeMissing fun _type(): JsonValue = type

            /**
             * @throws TelnyxInvalidDataException if the JSON field has an unexpected type (e.g. if
             *   the server responded with an unexpected value).
             */
            fun idempotencyKey(): Optional<String> = idempotencyKey.getOptional("idempotency_key")

            /**
             * @throws TelnyxInvalidDataException if the JSON field has an unexpected type (e.g. if
             *   the server responded with an unexpected value).
             */
            fun includeObservation(): Optional<Boolean> =
                includeObservation.getOptional("include_observation")

            /**
             * Returns the raw JSON value of [actions].
             *
             * Unlike [actions], this method doesn't throw if the JSON field has an unexpected type.
             */
            @JsonProperty("actions")
            @ExcludeMissing
            fun _actions(): JsonField<List<Action>> = actions

            /**
             * Returns the raw JSON value of [idempotencyKey].
             *
             * Unlike [idempotencyKey], this method doesn't throw if the JSON field has an
             * unexpected type.
             */
            @JsonProperty("idempotency_key")
            @ExcludeMissing
            fun _idempotencyKey(): JsonField<String> = idempotencyKey

            /**
             * Returns the raw JSON value of [includeObservation].
             *
             * Unlike [includeObservation], this method doesn't throw if the JSON field has an
             * unexpected type.
             */
            @JsonProperty("include_observation")
            @ExcludeMissing
            fun _includeObservation(): JsonField<Boolean> = includeObservation

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
                 * Returns a mutable builder for constructing an instance of [BatchAction].
                 *
                 * The following fields are required:
                 * ```java
                 * .actions()
                 * ```
                 */
                @JvmStatic fun builder() = Builder()
            }

            /** A builder for [BatchAction]. */
            class Builder internal constructor() {

                private var actions: JsonField<MutableList<Action>>? = null
                private var type: JsonValue = JsonValue.from("batch")
                private var idempotencyKey: JsonField<String> = JsonMissing.of()
                private var includeObservation: JsonField<Boolean> = JsonMissing.of()
                private var additionalProperties: MutableMap<String, JsonValue> = mutableMapOf()

                @JvmSynthetic
                internal fun from(batchAction: BatchAction) = apply {
                    actions = batchAction.actions.map { it.toMutableList() }
                    type = batchAction.type
                    idempotencyKey = batchAction.idempotencyKey
                    includeObservation = batchAction.includeObservation
                    additionalProperties = batchAction.additionalProperties.toMutableMap()
                }

                fun actions(actions: List<Action>) = actions(JsonField.of(actions))

                /**
                 * Sets [Builder.actions] to an arbitrary JSON value.
                 *
                 * You should usually call [Builder.actions] with a well-typed `List<Action>` value
                 * instead. This method is primarily for setting the field to an undocumented or not
                 * yet supported value.
                 */
                fun actions(actions: JsonField<List<Action>>) = apply {
                    this.actions = actions.map { it.toMutableList() }
                }

                /**
                 * Adds a single [Action] to [actions].
                 *
                 * @throws IllegalStateException if the field was previously set to a non-list.
                 */
                fun addAction(action: Action) = apply {
                    actions =
                        (actions ?: JsonField.of(mutableListOf())).also {
                            checkKnown("actions", it).add(action)
                        }
                }

                /** Alias for calling [addAction] with `Action.ofNavigate(navigate)`. */
                fun addAction(navigate: NavigateAction) = addAction(Action.ofNavigate(navigate))

                /** Alias for calling [addAction] with `Action.ofObserve(observe)`. */
                fun addAction(observe: ObserveAction) = addAction(Action.ofObserve(observe))

                /** Alias for calling [addAction] with `Action.ofClick(click)`. */
                fun addAction(click: ClickAction) = addAction(Action.ofClick(click))

                /** Alias for calling [addAction] with `Action.ofFill(fill)`. */
                fun addAction(fill: FillAction) = addAction(Action.ofFill(fill))

                /** Alias for calling [addAction] with `Action.ofSelect(select)`. */
                fun addAction(select: SelectAction) = addAction(Action.ofSelect(select))

                /** Alias for calling [addAction] with `Action.ofPress(press)`. */
                fun addAction(press: PressAction) = addAction(Action.ofPress(press))

                /** Alias for calling [addAction] with `Action.ofScroll(scroll)`. */
                fun addAction(scroll: ScrollAction) = addAction(Action.ofScroll(scroll))

                /** Alias for calling [addAction] with `Action.ofScreenshot(screenshot)`. */
                fun addAction(screenshot: ScreenshotAction) =
                    addAction(Action.ofScreenshot(screenshot))

                /** Alias for calling [addAction] with `Action.ofWaitFor(waitFor)`. */
                fun addAction(waitFor: WaitForAction) = addAction(Action.ofWaitFor(waitFor))

                /**
                 * Sets the field to an arbitrary JSON value.
                 *
                 * It is usually unnecessary to call this method because the field defaults to the
                 * following:
                 * ```java
                 * JsonValue.from("batch")
                 * ```
                 *
                 * This method is primarily for setting the field to an undocumented or not yet
                 * supported value.
                 */
                fun type(type: JsonValue) = apply { this.type = type }

                fun idempotencyKey(idempotencyKey: String) =
                    idempotencyKey(JsonField.of(idempotencyKey))

                /**
                 * Sets [Builder.idempotencyKey] to an arbitrary JSON value.
                 *
                 * You should usually call [Builder.idempotencyKey] with a well-typed [String] value
                 * instead. This method is primarily for setting the field to an undocumented or not
                 * yet supported value.
                 */
                fun idempotencyKey(idempotencyKey: JsonField<String>) = apply {
                    this.idempotencyKey = idempotencyKey
                }

                fun includeObservation(includeObservation: Boolean) =
                    includeObservation(JsonField.of(includeObservation))

                /**
                 * Sets [Builder.includeObservation] to an arbitrary JSON value.
                 *
                 * You should usually call [Builder.includeObservation] with a well-typed [Boolean]
                 * value instead. This method is primarily for setting the field to an undocumented
                 * or not yet supported value.
                 */
                fun includeObservation(includeObservation: JsonField<Boolean>) = apply {
                    this.includeObservation = includeObservation
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
                 * Returns an immutable instance of [BatchAction].
                 *
                 * Further updates to this [Builder] will not mutate the returned instance.
                 *
                 * The following fields are required:
                 * ```java
                 * .actions()
                 * ```
                 *
                 * @throws IllegalStateException if any required field is unset.
                 */
                fun build(): BatchAction =
                    BatchAction(
                        checkRequired("actions", actions).map { it.toImmutable() },
                        type,
                        idempotencyKey,
                        includeObservation,
                        additionalProperties.toMutableMap(),
                    )
            }

            private var validated: Boolean = false

            /**
             * Validates that the types of all values in this object match their expected types
             * recursively.
             *
             * This method is _not_ forwards compatible with new types from the API for existing
             * fields.
             *
             * @throws TelnyxInvalidDataException if any value type in this object doesn't match its
             *   expected type.
             */
            fun validate(): BatchAction = apply {
                if (validated) {
                    return@apply
                }

                actions().forEach { it.validate() }
                _type().let {
                    if (it != JsonValue.from("batch")) {
                        throw TelnyxInvalidDataException("'type' is invalid, received $it")
                    }
                }
                idempotencyKey()
                includeObservation()
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
                (actions.asKnown().getOrNull()?.sumOf { it.validity().toInt() } ?: 0) +
                    type.let { if (it == JsonValue.from("batch")) 1 else 0 } +
                    (if (idempotencyKey.asKnown().isPresent) 1 else 0) +
                    (if (includeObservation.asKnown().isPresent) 1 else 0)

            /** Navigate to a URL. */
            @JsonDeserialize(using = Action.Deserializer::class)
            @JsonSerialize(using = Action.Serializer::class)
            class Action
            private constructor(
                private val navigate: NavigateAction? = null,
                private val observe: ObserveAction? = null,
                private val click: ClickAction? = null,
                private val fill: FillAction? = null,
                private val select: SelectAction? = null,
                private val press: PressAction? = null,
                private val scroll: ScrollAction? = null,
                private val screenshot: ScreenshotAction? = null,
                private val waitFor: WaitForAction? = null,
                private val _json: JsonValue? = null,
            ) {

                /** Navigate to a URL. */
                fun navigate(): Optional<NavigateAction> = Optional.ofNullable(navigate)

                /** Capture an observation (DOM snapshot) of the current page. */
                fun observe(): Optional<ObserveAction> = Optional.ofNullable(observe)

                /** Click an element identified by observation_id + ref. */
                fun click(): Optional<ClickAction> = Optional.ofNullable(click)

                /** Type text into the element identified by observation_id + ref. */
                fun fill(): Optional<FillAction> = Optional.ofNullable(fill)

                /** Select an option on the element identified by observation_id + ref. */
                fun select(): Optional<SelectAction> = Optional.ofNullable(select)

                /** Press a keyboard key. */
                fun press(): Optional<PressAction> = Optional.ofNullable(press)

                /** Scroll the page. */
                fun scroll(): Optional<ScrollAction> = Optional.ofNullable(scroll)

                /** Capture a screenshot of the current page. */
                fun screenshot(): Optional<ScreenshotAction> = Optional.ofNullable(screenshot)

                /** Wait for a condition before continuing. */
                fun waitFor(): Optional<WaitForAction> = Optional.ofNullable(waitFor)

                fun isNavigate(): Boolean = navigate != null

                fun isObserve(): Boolean = observe != null

                fun isClick(): Boolean = click != null

                fun isFill(): Boolean = fill != null

                fun isSelect(): Boolean = select != null

                fun isPress(): Boolean = press != null

                fun isScroll(): Boolean = scroll != null

                fun isScreenshot(): Boolean = screenshot != null

                fun isWaitFor(): Boolean = waitFor != null

                /** Navigate to a URL. */
                fun asNavigate(): NavigateAction = navigate.getOrThrow("navigate")

                /** Capture an observation (DOM snapshot) of the current page. */
                fun asObserve(): ObserveAction = observe.getOrThrow("observe")

                /** Click an element identified by observation_id + ref. */
                fun asClick(): ClickAction = click.getOrThrow("click")

                /** Type text into the element identified by observation_id + ref. */
                fun asFill(): FillAction = fill.getOrThrow("fill")

                /** Select an option on the element identified by observation_id + ref. */
                fun asSelect(): SelectAction = select.getOrThrow("select")

                /** Press a keyboard key. */
                fun asPress(): PressAction = press.getOrThrow("press")

                /** Scroll the page. */
                fun asScroll(): ScrollAction = scroll.getOrThrow("scroll")

                /** Capture a screenshot of the current page. */
                fun asScreenshot(): ScreenshotAction = screenshot.getOrThrow("screenshot")

                /** Wait for a condition before continuing. */
                fun asWaitFor(): WaitForAction = waitFor.getOrThrow("waitFor")

                fun _json(): Optional<JsonValue> = Optional.ofNullable(_json)

                /**
                 * Maps this instance's current variant to a value of type [T] using the given
                 * [visitor].
                 *
                 * Note that this method is _not_ forwards compatible with new variants from the
                 * API, unless [visitor] overrides [Visitor.unknown]. To handle variants not known
                 * to this version of the SDK gracefully, consider overriding [Visitor.unknown]:
                 * ```java
                 * import com.telnyx.sdk.core.JsonValue;
                 * import java.util.Optional;
                 *
                 * Optional<String> result = action.accept(new Action.Visitor<Optional<String>>() {
                 *     @Override
                 *     public Optional<String> visitNavigate(NavigateAction navigate) {
                 *         return Optional.of(navigate.toString());
                 *     }
                 *
                 *     // ...
                 *
                 *     @Override
                 *     public Optional<String> unknown(JsonValue json) {
                 *         // Or inspect the `json`.
                 *         return Optional.empty();
                 *     }
                 * });
                 * ```
                 *
                 * @throws TelnyxInvalidDataException if [Visitor.unknown] is not overridden in
                 *   [visitor] and the current variant is unknown.
                 */
                fun <T> accept(visitor: Visitor<T>): T =
                    when {
                        navigate != null -> visitor.visitNavigate(navigate)
                        observe != null -> visitor.visitObserve(observe)
                        click != null -> visitor.visitClick(click)
                        fill != null -> visitor.visitFill(fill)
                        select != null -> visitor.visitSelect(select)
                        press != null -> visitor.visitPress(press)
                        scroll != null -> visitor.visitScroll(scroll)
                        screenshot != null -> visitor.visitScreenshot(screenshot)
                        waitFor != null -> visitor.visitWaitFor(waitFor)
                        else -> visitor.unknown(_json)
                    }

                private var validated: Boolean = false

                /**
                 * Validates that the types of all values in this object match their expected types
                 * recursively.
                 *
                 * This method is _not_ forwards compatible with new types from the API for existing
                 * fields.
                 *
                 * @throws TelnyxInvalidDataException if any value type in this object doesn't match
                 *   its expected type.
                 */
                fun validate(): Action = apply {
                    if (validated) {
                        return@apply
                    }

                    accept(
                        object : Visitor<Unit> {
                            override fun visitNavigate(navigate: NavigateAction) {
                                navigate.validate()
                            }

                            override fun visitObserve(observe: ObserveAction) {
                                observe.validate()
                            }

                            override fun visitClick(click: ClickAction) {
                                click.validate()
                            }

                            override fun visitFill(fill: FillAction) {
                                fill.validate()
                            }

                            override fun visitSelect(select: SelectAction) {
                                select.validate()
                            }

                            override fun visitPress(press: PressAction) {
                                press.validate()
                            }

                            override fun visitScroll(scroll: ScrollAction) {
                                scroll.validate()
                            }

                            override fun visitScreenshot(screenshot: ScreenshotAction) {
                                screenshot.validate()
                            }

                            override fun visitWaitFor(waitFor: WaitForAction) {
                                waitFor.validate()
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
                            override fun visitNavigate(navigate: NavigateAction) =
                                navigate.validity()

                            override fun visitObserve(observe: ObserveAction) = observe.validity()

                            override fun visitClick(click: ClickAction) = click.validity()

                            override fun visitFill(fill: FillAction) = fill.validity()

                            override fun visitSelect(select: SelectAction) = select.validity()

                            override fun visitPress(press: PressAction) = press.validity()

                            override fun visitScroll(scroll: ScrollAction) = scroll.validity()

                            override fun visitScreenshot(screenshot: ScreenshotAction) =
                                screenshot.validity()

                            override fun visitWaitFor(waitFor: WaitForAction) = waitFor.validity()

                            override fun unknown(json: JsonValue?) = 0
                        }
                    )

                override fun equals(other: Any?): Boolean {
                    if (this === other) {
                        return true
                    }

                    return other is Action &&
                        navigate == other.navigate &&
                        observe == other.observe &&
                        click == other.click &&
                        fill == other.fill &&
                        select == other.select &&
                        press == other.press &&
                        scroll == other.scroll &&
                        screenshot == other.screenshot &&
                        waitFor == other.waitFor
                }

                override fun hashCode(): Int =
                    Objects.hash(
                        navigate,
                        observe,
                        click,
                        fill,
                        select,
                        press,
                        scroll,
                        screenshot,
                        waitFor,
                    )

                override fun toString(): String =
                    when {
                        navigate != null -> "Action{navigate=$navigate}"
                        observe != null -> "Action{observe=$observe}"
                        click != null -> "Action{click=$click}"
                        fill != null -> "Action{fill=$fill}"
                        select != null -> "Action{select=$select}"
                        press != null -> "Action{press=$press}"
                        scroll != null -> "Action{scroll=$scroll}"
                        screenshot != null -> "Action{screenshot=$screenshot}"
                        waitFor != null -> "Action{waitFor=$waitFor}"
                        _json != null -> "Action{_unknown=$_json}"
                        else -> throw IllegalStateException("Invalid Action")
                    }

                companion object {

                    /** Navigate to a URL. */
                    @JvmStatic
                    fun ofNavigate(navigate: NavigateAction) = Action(navigate = navigate)

                    /** Capture an observation (DOM snapshot) of the current page. */
                    @JvmStatic fun ofObserve(observe: ObserveAction) = Action(observe = observe)

                    /** Click an element identified by observation_id + ref. */
                    @JvmStatic fun ofClick(click: ClickAction) = Action(click = click)

                    /** Type text into the element identified by observation_id + ref. */
                    @JvmStatic fun ofFill(fill: FillAction) = Action(fill = fill)

                    /** Select an option on the element identified by observation_id + ref. */
                    @JvmStatic fun ofSelect(select: SelectAction) = Action(select = select)

                    /** Press a keyboard key. */
                    @JvmStatic fun ofPress(press: PressAction) = Action(press = press)

                    /** Scroll the page. */
                    @JvmStatic fun ofScroll(scroll: ScrollAction) = Action(scroll = scroll)

                    /** Capture a screenshot of the current page. */
                    @JvmStatic
                    fun ofScreenshot(screenshot: ScreenshotAction) = Action(screenshot = screenshot)

                    /** Wait for a condition before continuing. */
                    @JvmStatic fun ofWaitFor(waitFor: WaitForAction) = Action(waitFor = waitFor)
                }

                /**
                 * An interface that defines how to map each variant of [Action] to a value of type
                 * [T].
                 */
                interface Visitor<out T> {

                    /** Navigate to a URL. */
                    fun visitNavigate(navigate: NavigateAction): T

                    /** Capture an observation (DOM snapshot) of the current page. */
                    fun visitObserve(observe: ObserveAction): T

                    /** Click an element identified by observation_id + ref. */
                    fun visitClick(click: ClickAction): T

                    /** Type text into the element identified by observation_id + ref. */
                    fun visitFill(fill: FillAction): T

                    /** Select an option on the element identified by observation_id + ref. */
                    fun visitSelect(select: SelectAction): T

                    /** Press a keyboard key. */
                    fun visitPress(press: PressAction): T

                    /** Scroll the page. */
                    fun visitScroll(scroll: ScrollAction): T

                    /** Capture a screenshot of the current page. */
                    fun visitScreenshot(screenshot: ScreenshotAction): T

                    /** Wait for a condition before continuing. */
                    fun visitWaitFor(waitFor: WaitForAction): T

                    /**
                     * Maps an unknown variant of [Action] to a value of type [T].
                     *
                     * An instance of [Action] can contain an unknown variant if it was deserialized
                     * from data that doesn't match any known variant. For example, if the SDK is on
                     * an older version than the API, then the API may respond with new variants
                     * that the SDK is unaware of.
                     *
                     * @throws TelnyxInvalidDataException in the default implementation.
                     */
                    fun unknown(json: JsonValue?): T {
                        throw TelnyxInvalidDataException("Unknown Action: $json")
                    }
                }

                internal class Deserializer : BaseDeserializer<Action>(Action::class) {

                    override fun ObjectCodec.deserialize(node: JsonNode): Action {
                        val json = JsonValue.fromJsonNode(node)

                        val bestMatches =
                            sequenceOf(
                                    tryDeserialize(node, jacksonTypeRef<NavigateAction>())?.let {
                                        Action(navigate = it, _json = json)
                                    },
                                    tryDeserialize(node, jacksonTypeRef<ObserveAction>())?.let {
                                        Action(observe = it, _json = json)
                                    },
                                    tryDeserialize(node, jacksonTypeRef<ClickAction>())?.let {
                                        Action(click = it, _json = json)
                                    },
                                    tryDeserialize(node, jacksonTypeRef<FillAction>())?.let {
                                        Action(fill = it, _json = json)
                                    },
                                    tryDeserialize(node, jacksonTypeRef<SelectAction>())?.let {
                                        Action(select = it, _json = json)
                                    },
                                    tryDeserialize(node, jacksonTypeRef<PressAction>())?.let {
                                        Action(press = it, _json = json)
                                    },
                                    tryDeserialize(node, jacksonTypeRef<ScrollAction>())?.let {
                                        Action(scroll = it, _json = json)
                                    },
                                    tryDeserialize(node, jacksonTypeRef<ScreenshotAction>())?.let {
                                        Action(screenshot = it, _json = json)
                                    },
                                    tryDeserialize(node, jacksonTypeRef<WaitForAction>())?.let {
                                        Action(waitFor = it, _json = json)
                                    },
                                )
                                .filterNotNull()
                                .allMaxBy { it.validity() }
                                .toList()
                        return when (bestMatches.size) {
                            // This can happen if what we're deserializing is completely
                            // incompatible with all the possible variants (e.g. deserializing from
                            // boolean).
                            0 -> Action(_json = json)
                            1 -> bestMatches.single()
                            // If there's more than one match with the highest validity, then use
                            // the first completely valid match, or simply the first match if none
                            // are completely valid.
                            else -> bestMatches.firstOrNull { it.isValid() } ?: bestMatches.first()
                        }
                    }
                }

                internal class Serializer : BaseSerializer<Action>(Action::class) {

                    override fun serialize(
                        value: Action,
                        generator: JsonGenerator,
                        provider: SerializerProvider,
                    ) {
                        when {
                            value.navigate != null -> generator.writeObject(value.navigate)
                            value.observe != null -> generator.writeObject(value.observe)
                            value.click != null -> generator.writeObject(value.click)
                            value.fill != null -> generator.writeObject(value.fill)
                            value.select != null -> generator.writeObject(value.select)
                            value.press != null -> generator.writeObject(value.press)
                            value.scroll != null -> generator.writeObject(value.scroll)
                            value.screenshot != null -> generator.writeObject(value.screenshot)
                            value.waitFor != null -> generator.writeObject(value.waitFor)
                            value._json != null -> generator.writeObject(value._json)
                            else -> throw IllegalStateException("Invalid Action")
                        }
                    }
                }
            }

            override fun equals(other: Any?): Boolean {
                if (this === other) {
                    return true
                }

                return other is BatchAction &&
                    actions == other.actions &&
                    type == other.type &&
                    idempotencyKey == other.idempotencyKey &&
                    includeObservation == other.includeObservation &&
                    additionalProperties == other.additionalProperties
            }

            private val hashCode: Int by lazy {
                Objects.hash(
                    actions,
                    type,
                    idempotencyKey,
                    includeObservation,
                    additionalProperties,
                )
            }

            override fun hashCode(): Int = hashCode

            override fun toString() =
                "BatchAction{actions=$actions, type=$type, idempotencyKey=$idempotencyKey, includeObservation=$includeObservation, additionalProperties=$additionalProperties}"
        }
    }

    override fun equals(other: Any?): Boolean {
        if (this === other) {
            return true
        }

        return other is ActionCreateParams &&
            id == other.id &&
            waitSeconds == other.waitSeconds &&
            body == other.body &&
            additionalHeaders == other.additionalHeaders &&
            additionalQueryParams == other.additionalQueryParams
    }

    override fun hashCode(): Int =
        Objects.hash(id, waitSeconds, body, additionalHeaders, additionalQueryParams)

    override fun toString() =
        "ActionCreateParams{id=$id, waitSeconds=$waitSeconds, body=$body, additionalHeaders=$additionalHeaders, additionalQueryParams=$additionalQueryParams}"
}
