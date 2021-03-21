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

- [Activity](https://github.com/u-barnwal/AndroidCustomInterfacesLibrary/blob/main/custom/src/main/java/com/isolpro/custom/Activity.java)
- [BundleBuilder](https://github.com/u-barnwal/AndroidCustomInterfacesLibrary/blob/main/custom/src/main/java/com/isolpro/custom/BundleBuilder.java)
- [Callback](https://github.com/u-barnwal/AndroidCustomInterfacesLibrary/blob/main/custom/src/main/java/com/isolpro/custom/Callback.java)
- [DialogFragment](https://github.com/u-barnwal/AndroidCustomInterfacesLibrary/blob/main/custom/src/main/java/com/isolpro/custom/DialogFragment.java)
- [Fragment](https://github.com/u-barnwal/AndroidCustomInterfacesLibrary/blob/main/custom/src/main/java/com/isolpro/custom/Fragment.java)
- [JSONBuilder](https://github.com/u-barnwal/AndroidCustomInterfacesLibrary/blob/main/custom/src/main/java/com/isolpro/custom/JSONBuilder.java)
- [ListFilter](https://github.com/u-barnwal/AndroidCustomInterfacesLibrary/blob/main/custom/src/main/java/com/isolpro/custom/ListFilter.java)

## Information
The code for all the above classes mostly self-explanatory, if you go through them once you'll get the gist.  
If you want to use them and want a proper documentation, feel free to write me at hi@utsavbarnwal.me :)

## Important
**Experimental build for internal usages only!**
