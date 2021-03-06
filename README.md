[![](https://jitpack.io/v/u-barnwal/AndroidCustomInterfacesLibrary.svg)](https://jitpack.io/#u-barnwal/AndroidCustomInterfacesLibrary)
# Android Custom (Interfaces) Library
Collection of improved and easy-to-implement versions of common Android classes.

Custom interface classes with instantiate, initialize, listen, load functions. Works with ViewBinding

## Implementation
**Step 1:** Add to project level build.gradle

    allprojects {
		repositories {
			...
			maven { url 'https://jitpack.io' }
		}
	}

**Step 2:** Add to app level build.gradle

	dependencies {
	    implementation 'com.github.u-barnwal:AndroidCustomInterfacesLibrary:VERSION'
	}

## Available classes

- Activity
- BundleBuilder
- DialogFragment
- Fragment
- JSONBuilder

## Important
**Experimental build for internal usages only!**
