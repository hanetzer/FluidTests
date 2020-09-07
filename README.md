Simple mod for testing fluid stuff. Adds three fluids (red, green, and blue) and their
buckets.

Add it as a dependency like this:

```gradle
    ...
repositories() {
    mavenLocal()
    ...
    maven {
        name 'DVS1 Maven FS'
        url 'https://dvs1.progwml6.com/files/maven'
    }
    ...
}

dependencies {
    ...
    runtimeOnly fg.deobf("dev.hanetzer:FluidTests:${minecraft_version}-${fluidtests_version}")
    ...
}
```