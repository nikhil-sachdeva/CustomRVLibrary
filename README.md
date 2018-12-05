# CustomRVLibrary

## Gradle
Step 1. Add it in your root build.gradle at the end of repositories:


```
	allprojects {
		repositories {
			...
			maven { url 'https://jitpack.io' }
		}
	}
```

Step 2. Add the dependency

```
	dependencies {
	        implementation 'com.github.nikhil-sachdeva:customRVLibrary:1.1'
	}
```

## Usage
Step 1. Define list as a recycler view in layout xml file and define a string array for the input of recycler view

```
        list=findViewById(R.id.list);
        list.setHasFixedSize(true);
        list.setLayoutManager(new LinearLayoutManager(getApplicationContext()));
        String[] res={"Alpha","Beta","Gamma"};
```
Step 2. Create an object of class RVAdapter with the following constructor and set it as the adapter for list.
```
        RVAdapter rvAdapter = new RVAdapter(getApplicationContext(),res);
        list.setAdapter(rvAdapter);
```

And get a recycler view with the given string array.
<br>
Library under progress, will be updated soon.
