/*
 * Copyright (c) 2012-2014 the original author or authors.
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
package org.openinfinity.core.async;

import java.util.Collection;
import java.util.concurrent.Callable;

import org.openinfinity.core.integration.CrudService;

/**
 * Represents interface for 'query all' results from asynchronous thread.
 * 
 * @author Ilkka Leinonen
 * @version 1.0.0
 * @since 2.0.0
 *
 * @param <T> Represent the typesafe object.
 * @param <ID> Represents the type safe id.
 */
public class GenericCrudServiceQueryAllByIdCallable<T, ID> implements Callable<Object>, Loadable {

	private CrudService<T, ID> crudService;
	
	private Collection<T> cache;

	private ID id;
	
	public GenericCrudServiceQueryAllByIdCallable(CrudService<T, ID> crudService, ID id) {
		this.crudService = crudService;
		this.id = id;
	}

	@Override
	public Collection<?> call() throws Exception {
		this.cache = crudService.queryAllById(id);
		return cache;
	} 
	
	/**
	 * Returns result of the asynchronous processing.
	 */
	public Collection<T> loadResult() {
		return cache;
	}
	
}
