/*
 * Copyright 2002-2024 the original author or authors.
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *      https://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */

package org.springframework.security.oauth2.client.endpoint;

import org.springframework.security.oauth2.core.endpoint.OAuth2AccessTokenResponse;

/**
 * An implementation of {@link OAuth2AccessTokenResponseClient} that &quot;exchanges&quot;
 * a subject token (and optionally an actor token) for an access token at the
 * Authorization Server's Token Endpoint.
 *
 * @author Steve Riesenberg
 * @since 6.4
 * @see OAuth2AccessTokenResponseClient
 * @see TokenExchangeGrantRequest
 * @see OAuth2AccessTokenResponse
 * @see <a target="_blank" href="https://tools.ietf.org/html/rfc8693#section-2.1">Section
 * 2.1 Request</a>
 * @see <a target="_blank" href="https://tools.ietf.org/html/rfc8693#section-2.2">Section
 * 2.2 Response</a>
 */
public final class RestClientTokenExchangeTokenResponseClient
		extends AbstractRestClientOAuth2AccessTokenResponseClient<TokenExchangeGrantRequest> {

}