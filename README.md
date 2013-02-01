# Build or Download
To build this you need to use [Maven](http://maven.apache.org/download.html).

OR add the following remote repository to download the latest snapshot:

```xml
<repositories>
	<repository>
		<id>hardisonbrewing-releases</id>
		<name>hardisonbrewing-releases</name>
		<url>http://repo.hardisonbrewing.org/nexus/content/repositories/releases/</url>
	</repository>
	<repository>
		<id>hardisonbrewing-snapshots</id>
		<name>hardisonbrewing-snapshots</name>
		<url>http://repo.hardisonbrewing.org/nexus/content/repositories/snapshots/</url>
	</repository>
</repositories>
```

Continuous Integration: [Bamboo Status](http://bamboo.hardisonbrewing.org/browse/MVN-CRE)
