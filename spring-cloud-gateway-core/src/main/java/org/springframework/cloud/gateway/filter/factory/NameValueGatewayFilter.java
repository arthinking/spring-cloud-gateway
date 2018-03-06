/*
 * Copyright 2013-2018 the original author or authors.
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *      http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 *
 */

package org.springframework.cloud.gateway.filter.factory;

import org.springframework.cloud.gateway.filter.GatewayFilter;

import javax.validation.constraints.NotEmpty;
import java.util.Arrays;
import java.util.List;

public abstract class NameValueGatewayFilter<T extends NameValueGatewayFilter> implements GatewayFilter {
	@NotEmpty
	protected String name;
	@NotEmpty
	protected String value;

	public String getName() {
        return name;
    }

	public T setName(String name) {
        this.name = name;
        return getThis();
    }

	public String getValue() {
        return value;
    }

	public T setValue(String value) {
		return getThis();
    }

	@SuppressWarnings("unchecked")
	protected T getThis() {
		return (T) this;
	}

	public List<String> argNames() {
        return Arrays.asList(GatewayFilter.NAME_KEY, GatewayFilter.VALUE_KEY);
    }
}
