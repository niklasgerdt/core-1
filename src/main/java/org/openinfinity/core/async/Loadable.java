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

/**
 * Represents interface for loading results from asynchronous thread.
 * 
 * @author Ilkka Leinonen
 * @version 1.0.0
 * @since 2.0.0
 */
public interface Loadable {
	
	/**
	 * Loads result from asynchronous thread.
	 * 
	 * @return
	 */
	public Object loadResult();

}
