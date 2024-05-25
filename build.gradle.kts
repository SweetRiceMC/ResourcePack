plugins {
    id("java")
    `maven-publish`
}

group = "top.mrxiaom"
version = "1.0-SNAPSHOT"

tasks {
    jar {
        archiveExtension.set("zip")
        from(zipTree("resource.zip"))
    }
}
publishing {
    publications {
        create<MavenPublication>("maven") {
            from(components.getByName("java"))
            groupId = project.group.toString()
            artifactId = project.name
            version = project.version.toString()
        }
    }
}
