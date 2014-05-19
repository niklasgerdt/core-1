/*
 * Copyright (c) 2011-2014 the original author or authors.
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *     http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */
package org.openinfinity.core.security.principal;

import java.io.Serializable;
import java.security.Principal;

import lombok.Data;
import lombok.EqualsAndHashCode;

/**
 * Class for maintaining the state of the federated identity roles.
 * 
 * @author Ilkka Leinonen
 * @version 1.0.0
 * @since 1.4.0
 */
@Data
@EqualsAndHashCode
public class RolePrincipal implements Principal, Serializable {

	/**
	 * Represents the role's name.
	 */
	private String name;
	
	public RolePrincipal(String name) {
		this.name = name;
	}

	/**
	 * Getter for the role.
	 */
	public String getName() {
		return this.name;	
	}
	
	/**
	 * Clears the name.
	 */
	protected void clear() {
		this.name = null;
	}

	@Override
	public String toString() {
		return "RolePrincipal [name=" + name + "]";
	}

}