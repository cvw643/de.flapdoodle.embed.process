/**
 * Copyright (C) 2011
 *   Michael Mosmann <michael@mosmann.de>
 *   Martin Jöhren <m.joehren@googlemail.com>
 *
 * with contributions from
 * 	konstantin-ba@github,
	Archimedes Trajano (trajano@github),
	Kevin D. Keck (kdkeck@github),
	Ben McCann (benmccann@github)
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
package de.flapdoodle.embed.process.distribution;

/**
 * Generic version implementation for currently unsupported versions.
 */
public class GenericVersion implements IVersion {

	private String versionInDownloadPath;

	/**
	 * C'tor with version name = specific version
	 * 
	 * @param versionInDownloadPath
	 */
	public GenericVersion(String versionInDownloadPath) {
		this.versionInDownloadPath = versionInDownloadPath;
	}
	
	@Override
	public String asInDownloadPath() {
		return versionInDownloadPath;
	}

	@Override
	public String toString() {
		return "GenericVersion{" + versionInDownloadPath + "}";
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((versionInDownloadPath == null)
				? 0
				: versionInDownloadPath.hashCode());
		return result;
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		GenericVersion other = (GenericVersion) obj;
		if (versionInDownloadPath == null) {
			if (other.versionInDownloadPath != null)
				return false;
		} else if (!versionInDownloadPath.equals(other.versionInDownloadPath))
			return false;
		return true;
	}
	
	
}
