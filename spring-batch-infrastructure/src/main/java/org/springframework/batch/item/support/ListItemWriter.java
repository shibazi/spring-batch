/*
 * Copyright 2014 the original author or authors.
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
 */
package org.springframework.batch.item.support;

import org.springframework.batch.item.ItemWriter;

import java.util.ArrayList;
import java.util.List;

/**
 * @author mminella
 */
public class ListItemWriter<T> implements ItemWriter<T> {

	private List<T> writtenItems = new ArrayList<T>();

	@Override
	public void write(List<? extends T> items) throws Exception {
		for (T item : items) {
			writtenItems.add(item);
		}
	}

	public List<? extends T> getWrittenItems() {
		return this.writtenItems;
	}
}