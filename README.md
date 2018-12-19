# CustomRVLibrary

## Gradle
Step 1. Add this in your root build.gradle at the end of repositories:


```
	allprojects {
		repositories {
			...
			maven { url 'https://jitpack.io' }
			maven { url 'http://dl.bintray.com/amulyakhare/maven'}

		}
	}
```

Step 2. Add the dependency

```
	dependencies {
	        implementation 'com.github.nikhil-sachdeva:customRVLibrary:2.0'
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

And get a recycler view with the given string array with a circular image with a random BG color(like GMail).
![screenshot_2018-12-19-19-42-47-247_com example nikhil rvlibrary](https://user-images.githubusercontent.com/34986121/50226325-f2998280-03c8-11e9-8fb6-64667b5af2d0.png)

If you want to include images, you can do so by creating an array list of drawables.
```
      String[] res={"Cupcake","Lollipop","Oreo","Ice-cream Sandwich"};
        ArrayList<Drawable> images = new ArrayList<>();
        images.add(getResources().getDrawable(R.drawable.cupcake));
        images.add(getResources().getDrawable(R.drawable.lollipop));
        images.add(getResources().getDrawable(R.drawable.oreo));
        images.add(getResources().getDrawable(R.drawable.sandwich));
        RVAdapter rvAdapter = new RVAdapter(getApplicationContext(),res,images);
```

![screenshot_2018-12-19-19-42-00-759_com example nikhil rvlibrary](https://user-images.githubusercontent.com/34986121/50226528-6b004380-03c9-11e9-8f48-2dd4cd579ef5.png)


If you want to add a subtextt for each entry in list, just add another string array in the constructor.
```
        String[] res2={"Version 1.5","Version 5.0","Version 8.0", "Version 4.0"};
        RVAdapter rvAdapter = new RVAdapter(getApplicationContext(),res,res2,images);
```
![screenshot_2018-12-19-19-44-56-911_com example nikhil rvlibrary](https://user-images.githubusercontent.com/34986121/50226592-a7cc3a80-03c9-11e9-8c5c-125beec1dd36.png)

<br>
Library under progress, will be updated soon.


## License


```
Copyright 2018 Nikhil Sachdeva

Licensed under the Apache License, Version 2.0 (the "License");
you may not use this file except in compliance with the License.
You may obtain a copy of the License at

    http://www.apache.org/licenses/LICENSE-2.0

Unless required by applicable law or agreed to in writing, software
distributed under the License is distributed on an "AS IS" BASIS,
WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
See the License for the specific language governing permissions and
limitations under the License.
```
