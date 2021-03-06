/**
 * Copyright (c) 2011 Martin M Reed
 *
 * This program is free software: you can redistribute it and/or modify
 * it under the terms of the GNU Lesser General Public License as published by
 * the Free Software Foundation, either version 3 of the License, or
 * (at your option) any later version.
 *
 * This program is distributed in the hope that it will be useful,
 * but WITHOUT ANY WARRANTY; without even the implied warranty of
 * MERCHANTABILITY or FITNESS FOR A PARTICULAR PURPOSE. See the
 * GNU Lesser General Public License for more details.
 *
 * You should have received a copy of the GNU Lesser General Public License
 * along with this program. If not, see <http://www.gnu.org/licenses/>.
 */
package org.hardisonbrewing.maven.core.model;

import java.util.Arrays;

public class ProjectConfiguration {

    private Source[] additionalSources;

    public void addSourceDirectory( Source source ) {

        Source[] _additionalSources;

        if ( additionalSources == null ) {
            _additionalSources = new Source[1];
        }
        else {
            int length = additionalSources.length;
            _additionalSources = Arrays.copyOf( additionalSources, length + 1 );
        }

        _additionalSources[_additionalSources.length - 1] = source;
        additionalSources = _additionalSources;
    }

    public Source[] getAdditionalSourceDirectories() {

        return additionalSources;
    }
}
