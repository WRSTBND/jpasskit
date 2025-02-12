/*
 * Copyright (C) 2022 Patrice Brend'amour <patrice@brendamour.net>
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *         http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */
package de.brendamour.jpasskit.server;

import org.restlet.Request;
import org.restlet.Response;
import org.restlet.resource.Finder;
import org.restlet.resource.ServerResource;

public final class PKDeviceResourceFactory extends Finder {

	private IPKRestletServerResourceFactory pkRestletServerResourceFactory;

	public PKDeviceResourceFactory(final IPKRestletServerResourceFactory pkRestletServerResourceFactory) {
		this.pkRestletServerResourceFactory = pkRestletServerResourceFactory;
	}

	@Override
	public ServerResource create(final Request request, final Response response) {
		return pkRestletServerResourceFactory.getPKDeviceResource();
	}

}
